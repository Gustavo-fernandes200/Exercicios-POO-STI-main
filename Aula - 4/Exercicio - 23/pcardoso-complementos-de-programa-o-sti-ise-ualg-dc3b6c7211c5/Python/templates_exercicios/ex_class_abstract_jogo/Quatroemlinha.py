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
        self.tabuleiro = [['-' for _ in range(7)] for _ in range(6)]

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





















"""
from abc import ABC


class Tabuleiro(ABC):

    def __init__(self):
        self.tabuleiro = [[0 for _ in range(7)] for _ in range(6)]

    def imprimir(self):
        print(" 0 1 2 3 4 5 6")
        for linha in self.tabuleiro:
            print("|", end="")
            print("|".join(map(str, linha)), end="")
            print("|")
        print("---------------")


class JogoQuatroEmLinha:

    def __init__(self):
        self.tabuleiro = Tabuleiro()
        self.jogador1 = ''
        self.jogador2 = ''
        self.simbolos = ['X', 'O']
        self.jogador_atual = 0

    def _le_linha_coluna_valida(self, s):

        coluna = input(s)

        if not coluna.isdigit():
            print("Por favor, insira um número válido.")
            return self._le_linha_coluna_valida(s)

        coluna = int(coluna)

        if coluna < 0 or coluna > 6:
            print("Escolha uma coluna válida (0-6).")
            return self._le_linha_coluna_valida(s)

        if 0 not in [linha[coluna] for linha in self.tabuleiro.tabuleiro]:
            print("Essa coluna está cheia. Escolha outra.")
            return self._le_linha_coluna_valida(s)

        return coluna

    def escolher_simbolos(self):

        self.jogador1 = input("Jogador 1, escolha seu símbolo (X ou O): ").upper()

        while self.jogador1 not in self.simbolos:
            print("Símbolo inválido. Escolha entre 'X' e 'O'.")
            self.jogador1 = input("Jogador 1, escolha seu símbolo (X ou O): ").upper()
        self.simbolos.remove(self.jogador1)

        self.jogador2 = input("Jogador 2, escolha seu símbolo (X ou O): ").upper()

        while self.jogador2 not in self.simbolos:
            print("Símbolo inválido. Escolha entre 'X' e 'O' e diferente do jogador 1.")
            self.jogador2 = input("Jogador 2, escolha seu símbolo (X ou O): ").upper()

    def verificar_vitoria(self):

        tabuleiro = self.tabuleiro.tabuleiro
        jogador = self.jogador_atual + 1

        # Verificação de vitória na horizontal
        for linha in range(6):
            for coluna in range(4):
                if (
                        tabuleiro[linha][coluna] == jogador and
                        tabuleiro[linha][coluna + 1] == jogador and
                        tabuleiro[linha][coluna + 2] == jogador and
                        tabuleiro[linha][coluna + 3] == jogador
                ):
                    return True

        # Verificação de vitória na vertical
        for coluna in range(7):
            for linha in range(3):
                if (
                        tabuleiro[linha][coluna] == jogador and
                        tabuleiro[linha + 1][coluna] == jogador and
                        tabuleiro[linha + 2][coluna] == jogador and
                        tabuleiro[linha + 3][coluna] == jogador
                ):
                    return True

        # Verificação de vitória na diagonal ascendente
        for linha in range(3, 6):
            for coluna in range(4):
                if (
                        tabuleiro[linha][coluna] == jogador and
                        tabuleiro[linha - 1][coluna + 1] == jogador and
                        tabuleiro[linha - 2][coluna + 2] == jogador and
                        tabuleiro[linha - 3][coluna + 3] == jogador
                ):
                    return True

        # Verificação de vitória na diagonal descendente
        for linha in range(3):
            for coluna in range(4):
                if (
                        tabuleiro[linha][coluna] == jogador and
                        tabuleiro[linha + 1][coluna + 1] == jogador and
                        tabuleiro[linha + 2][coluna + 2] == jogador and
                        tabuleiro[linha + 3][coluna + 3] == jogador
                ):
                    return True

        return False

    def verificar_empate(self):
        tabuleiro = self.tabuleiro.tabuleiro
        tabuleiro_cheio = True

        for linha in tabuleiro:
            for valor in linha:
                if valor == 0:
                    tabuleiro_cheio = False
                    break
            if not tabuleiro_cheio:
                break

        return tabuleiro_cheio

    def jogar(self):
        while True:
            coluna = self._le_linha_coluna_valida(f"Jogador {self.jogador_atual + 1}, escolha uma coluna (0-6): ")
            linha = 5
            while linha >= 0:
                if self.tabuleiro.tabuleiro[linha][coluna] == 0:
                    self.tabuleiro.tabuleiro[linha][coluna] = self.jogador_atual + 1
                    break
                linha -= 1
            self.tabuleiro.imprimir()
            if self.verificar_vitoria():
                print(f"O jogador {self.jogador_atual + 1} ganhou!")
                break
            if self.verificar_empate():
                print("O jogo empatou!")
                break
            self.jogador_atual = 1 - self.jogador_atual


if __name__ == "__main__":
    print("Bem-vindo ao Quatro em Linha!\n")
    jogo = JogoQuatroEmLinha()
    jogo.escolher_simbolos()
    jogo.jogar()
"""


