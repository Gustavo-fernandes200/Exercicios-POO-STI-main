from jogo import Jogo


class Galo(Jogo):

    def inicializa_tabuleiro(self):
        """ inicializa o tabuleiro de jogo. O tabuleiro e representado por um dicionario onde as chaves sao as posicoes"""
        self.numero_de_jogadas_realizadas = 0  # conta as jogadas, serve para saber se ainda ha jogadas validas
        self.tabuleiro = {(l, c): ' ' for l in range(3) for c in range(3)}  # o tabuleiro e um dicionario!
        # print(self.tabuleiro)

    def _le_linha_coluna_valida(self, s):
        """ metodo auxiliar para ler uma posicao que seja 0, 1 ou 2"""
        while True:
            x = input(s)
            if x in ['0', '1', '2']:
                return int(x)

    def joga_humano(self, jogador):
        """ metodo que solicita ao humano :jogador: a proxima jogada e coloca-a no tabuleiro.
        Essa jogada é valida se a posicao estiver vazia."""
        print(f'jogador {jogador} insira a sua jogada')
        while True:
            linha = self._le_linha_coluna_valida('Linha?')
            coluna = self._le_linha_coluna_valida('Coluna?')

            # verifica se a posicao nao esta preenchida, i.e., e valida
            if self.tabuleiro[(linha, coluna)] == ' ':
                self.tabuleiro[(linha, coluna)] = ['X', 'O'][jogador]
                self.numero_de_jogadas_realizadas += 1
                return
            else:
                print('Jogada invalida. Tente de novo')

    def terminou(self):
        """ devolve `True` se foi verificada a condicao de paragem, i.e., um jogador ganhou."""
        lista_posicaoes_ganhadoras = (
            ((0, 0), (0, 1), (0, 2)),  # linha 0
            ((1, 0), (1, 1), (1, 2)),  # linha 1
            ((2, 0), (2, 1), (2, 2)),  # linha 2
            ((0, 0), (1, 0), (2, 0)),  # coluna 0
            ((0, 1), (1, 1), (2, 1)),  # coluna 1
            ((0, 2), (1, 2), (2, 2)),  # coluna 2
            ((0, 0), (1, 1), (2, 2)),  # diagonal
            ((0, 2), (1, 1), (2, 0)),  # anti-diagonal
        )

        for teste in lista_posicaoes_ganhadoras:
            if self.tabuleiro[teste[0]] == self.tabuleiro[teste[1]] == self.tabuleiro[teste[2]] \
                    and self.tabuleiro[teste[0]] != ' ':
                return True  # encontrou posicao ganhadora
        return False

    def mostra_tabuleiro(self):
        """ desenha o tabuleiro do galo"""
        print(13 * '-')
        for l in range(3):
            for c in range(3):
                print(f'| {self.tabuleiro[(l, c)]} ', end='')
            print('|\n' + 13 * '-')

    def ha_jogadas_possiveis(self):
        """ verifica se ainda ha jogadas possiveis ou se o jogo esta empatado"""
        return self.numero_de_jogadas_realizadas < 9

if __name__ == '__main__':
    galo = Galo()
    galo.jogar()


