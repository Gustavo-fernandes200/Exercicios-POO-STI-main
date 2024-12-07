"""
from jogo import Jogo
import random
from abc import ABC, abstractmethod


class QuatroEmLinha(Jogo):

    def inicializa_tabuleiro(self):
        self.numero_de_jogadas_realizadas = 0
        self.linhas = 6
        self.colunas = 7
        self.tabuleiro = {(l, c): ' ' for l in range(self.linhas) for c in range(self.colunas)}

    def _le_linha_coluna_valida(self, s):
        while True:
            x = input(s)
            if x in ['0', '1', '2', '3', '4', '5', '6']:
                return int(x)

    def terminou(self):

        lista_posicoes_ganhadoras = (
            # Linhas
            ((0, 0), (0, 1), (0, 2), (0, 3)),
            ((1, 0), (1, 1), (1, 2), (1, 3)),
            ((2, 0), (2, 1), (2, 2), (2, 3)),
            ((3, 0), (3, 1), (3, 2), (3, 3)),
            ((4, 0), (4, 1), (4, 2), (4, 3)),
            ((5, 0), (5, 1), (5, 2), (5, 3)),

            # Colunas
            ((0, 0), (1, 0), (2, 0), (3, 0)),
            ((0, 1), (1, 1), (2, 1), (3, 1)),
            ((0, 2), (1, 2), (2, 2), (3, 2)),
            ((0, 3), (1, 3), (2, 3), (3, 3)),
            ((0, 4), (1, 4), (2, 4), (3, 4)),
            ((0, 5), (1, 5), (2, 5), (3, 5)),
            ((0, 6), (1, 6), (2, 6), (3, 6)),

            # Diagonais
            ((0, 0), (1, 1), (2, 2), (3, 3)),
            ((0, 3), (1, 2), (2, 1), (3, 0))
        )

        for teste in lista_posicoes_ganhadoras:
            if self.tabuleiro[teste[0]] == self.tabuleiro[teste[1]] == self.tabuleiro[teste[2]] \
                    == self.tabuleiro[teste[3]] != ' ':
                return True  # encontrou posicao ganhadora
        return False

"""

from abc import ABC, abstractmethod
import random


class Jogo(ABC):
    """Implementa uma classe para um jogo com 2 humanos"""

    def __init__(self):
        """Método que inicializa o jogo. Para um exemplo básico não necessita ser reimplementado"""
        print('Bom jogo...')
        self.inicializa_tabuleiro()

    @abstractmethod
    def joga_humano(self, jogador):
        """Método abstrato que solicita ao humano :jogador: a próxima jogada e coloca-a no tabuleiro
        :param jogador: número do jogador (0 ou 1). Tem que ser implementado por subclasses"""
        pass

    @abstractmethod
    def terminou(self):
        """Devolve `True` se foi verificada a condição de paragem, i.e., um jogador ganhou."""
        pass

    @abstractmethod
    def mostra_tabuleiro(self):
        """Método abstrato que desenha o tabuleiro. Tem que ser implementado por subclasses."""
        pass

    @abstractmethod
    def inicializa_tabuleiro(self):
        """Método abstrato que inicializa o tabuleiro de jogo. Tem que ser implementado por subclasses."""
        pass

    @abstractmethod
    def ha_jogadas_possiveis(self):
        """Método abstrato que verifica se ainda há jogadas possíveis ou se o jogo está empatado. Tem que ser implementado por subclasses."""
        pass

    def jogar(self):
        """Método que corre o jogo... NÃO TEM QUE SER IMPLEMENTADO, NA REALIDADE PARA O EXERCÍCIO DA AULA NÃO DEVE SER ALTERADO"""

        # Escolhe quem joga em primeiro
        jogador = random.randint(0, 1)

        while True:
            self.mostra_tabuleiro()
            self.joga_humano(jogador)
            if self.terminou():
                self.mostra_tabuleiro()
                print(f'O jogador {jogador} ganhou!!')
                return
            elif not self.ha_jogadas_possiveis():
                print('Empataram!!!')
                return
            # Passa ao outro jogador
            jogador = (jogador + 1) % 2


class Tabuleiro:
    def __init__(self):
        self.tabuleiro = [[0 for _ in range(7)] for _ in range(6)]

    def imprimir(self):
        print(" 0 1 2 3 4 5 6")
        for linha in self.tabuleiro:
            print("|", end="")
            print("|".join('-' if x == 0 else str(x) for x in linha), end="")
            print("|")
        print("---------------")


class JogoQuatroEmLinha(Jogo):
    def __init__(self):
        self.tabuleiro = None  # Inicializa o tabuleiro como None
        super().__init__()
        self.simbolos = ['X', 'O']
        self.jogador1 = ''
        self.jogador2 = ''
        self.jogador_atual = 0

    def inicializa_tabuleiro(self):
        self.tabuleiro = Tabuleiro()

    def _le_linha_coluna_valida(self, s):
        coluna = input(s)
        if not coluna.isdigit():
            print("Por favor, insira um número válido.")
            return self._le_linha_coluna_valida(s)
        coluna = int(coluna)
        if coluna < 0 or coluna > 6:
            print("Escolha uma coluna válida (0-6).")
            return self._le_linha_coluna_valida(s)
        # Verificar se a coluna está cheia
        coluna_cheia = True
        for linha in self.tabuleiro.tabuleiro:
            if linha[coluna] == 0:
                coluna_cheia = False
                break
        if coluna_cheia:
            print("Essa coluna está cheia. Escolha outra.")
            return self._le_linha_coluna_valida(s)
        return coluna

    def escolher_simbolos(self):
        self.jogador1 = input("Jogador 1, escolha seu símbolo (X ou O): ").upper()
        while self.jogador1 not in ['X', 'O']:
            print("Símbolo inválido. Escolha entre 'X' e 'O'.")
            self.jogador1 = input("Jogador 1, escolha seu símbolo (X ou O): ").upper()
        self.jogador2 = 'O' if self.jogador1 == 'X' else 'X'
        print(f"Jogador 2, seu símbolo é: {self.jogador2}")

    def joga_humano(self, jogador):
        simbolo = self.jogador1 if jogador == 0 else self.jogador2
        coluna = self._le_linha_coluna_valida(f"Jogador {jogador + 1} ({simbolo}), escolha uma coluna (0-6): ")
        # Inserir na primeira posição livre de baixo para cima
        for linha in reversed(self.tabuleiro.tabuleiro):
            if linha[coluna] == 0:
                linha[coluna] = simbolo
                break

    def terminou(self):
        """Devolve `True` se foi verificada a condição de paragem, i.e., um jogador ganhou."""
        lista_posicoes_ganhadoras = (
            # Linhas
            *[((i, j), (i, j+1), (i, j+2), (i, j+3)) for i in range(6) for j in range(4)],
            # Colunas
            *[((i, j), (i+1, j), (i+2, j), (i+3, j)) for i in range(3) for j in range(7)],
            # Diagonais (cima-esquerda para baixo-direita)
            *[((i, j), (i+1, j+1), (i+2, j+2), (i+3, j+3)) for i in range(3) for j in range(4)],
            # Diagonais (baixo-esquerda para cima-direita)
            *[((i+3, j), (i+2, j+1), (i+1, j+2), (i, j+3)) for i in range(3) for j in range(4)],
        )

        for teste in lista_posicoes_ganhadoras:
            p1, p2, p3, p4 = teste
            if self.tabuleiro.tabuleiro[p1[0]][p1[1]] == self.tabuleiro.tabuleiro[p2[0]][p2[1]] == self.tabuleiro.tabuleiro[p3[0]][p3[1]] == self.tabuleiro.tabuleiro[p4[0]][p4[1]] != 0:
                return True  # encontrou posição ganhadora
        return False

    def mostra_tabuleiro(self):
        self.tabuleiro.imprimir()

    def ha_jogadas_possiveis(self):
        for linha in self.tabuleiro.tabuleiro:
            for valor in linha:
                if valor == 0:
                    return True
        return False


if __name__ == "__main__":
    print("Bem-vindo ao Quatro em Linha!\n")
    jogo = JogoQuatroEmLinha()
    jogo.escolher_simbolos()
    jogo.jogar()




