from abc import ABC, abstractmethod
import random


class Jogo(ABC):
    """ implementa uma classe para um jogo com 2 humanos"""

    def __init__(self):
        """ metodo que inicializa o jogo. Para um exemplo básico não necessita ser reimplementado
        """
        print('bom jogo...')
        self.inicializa_tabuleiro()

    @abstractmethod
    def joga_humano(self, jogador):
        """ metodo abstrato que solicita ao humano :jogador: a proxima jogada e coloca-a no tabuleiro
        :param jogador: numero do jogador (0 ou 1). Tem que ser implementado por subclasses"""
        pass

    @abstractmethod
    def terminou(self):
        """ Método abstrato que devolve `True` se foi verificada a condicao de paragem, i.e., um jogador ganhou.
        devolve `False` caso contrario. Tem que ser implementado por subclasses."""
        pass

    @abstractmethod
    def mostra_tabuleiro(self):
        """Método abstrato que desenha o tabuleiro. Tem que ser implementado por subclasses."""
        pass

    @abstractmethod
    def inicializa_tabuleiro(self):
        """ Metodo abstrato que inicializa o tabuleiro de jogo. Tem que ser implementado por subclasses."""
        pass

    @abstractmethod
    def ha_jogadas_possiveis(self):
        """ Método abstrato que verifica se ainda ha jogadas possiveis ou se o jogo esta empatado. Tem que ser implementado por subclasses."""
        pass

    def jogar(self):
        """ Método que corre o jogo... NÃO TEM QUE SER IMPLEMENTADO, NA REALIDADE PARA O EXERCÍCIO DA AULA NÃO DEVE SER ALTERADO"""

        # escolhe quem joga em primeiro
        jogador = random.randint(0, 1)

        while True:
            self.mostra_tabuleiro()
            self.joga_humano(jogador)
            if self.terminou():
                self.mostra_tabuleiro()
                print(f'o jogador {jogador} ganhou!!')
                return
            elif not self.ha_jogadas_possiveis():
                print(f'Empataram!!!')
                return
            # passa ao outro jogador
            jogador = (jogador + 1) % 2


if __name__ == '__main__':
    print("""
    Este módulo não deve ser executado de forma independente. Na verdade, ele apenas implementa a classe Jogo, que é uma classe abstrata.
    Portanto, não pode executá-lo diretamente, mas pode importá-lo. Veja galo.py para um exemplo."
    """)