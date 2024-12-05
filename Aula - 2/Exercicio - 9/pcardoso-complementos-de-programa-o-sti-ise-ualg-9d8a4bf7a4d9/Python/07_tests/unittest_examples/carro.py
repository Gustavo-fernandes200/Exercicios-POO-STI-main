"""
basedo no exemplo apresendado em
https://www.jetbrains.com/help/pycharm/testing-your-first-python-application.html#write-test
"""


class Carro:

    def __init__(self, velocidade=0):
        self.velocidade = velocidade
        self.odometro = 0
        self.tempo = 0

    def mostrar_estado(self):
        print("Vou a {} km/h!".format(self.velocidade))

    def acelerar(self):
        """ acrescenta 5 (km/h) a velocidade. 0 <= velocidade <= 40 """
        self.velocidade = min(self.velocidade + 5, 40)

    def travar(self):
        """ diminui 5 (km/h) a velocidade. 0 <= velocidade <= 40 """
        self.velocidade = max(self.velocidade - 5, 0)

    def step(self):
        self.odometro += self.velocidade
        self.tempo += 1

    def calcular_velocidade_media(self):
        if self.tempo != 0:
            return self.odometro / self.tempo
        else:
            pass


if __name__ == '__main__':

    carro = Carro()
    print("Bruuuum!!")
    while True:
        action = input("O que faco? [a]celero, [t]ravo, mostro [o]dometro, ou mostro [v]elocidade media?").upper()
        if action not in "VOTA" or len(action) != 1:
            print("Nao sei o que fazer")
            continue
        if action == 'A':
            carro.acelerar()
        elif action == 'T':
            carro.travar()
        elif action == 'O':
            print("andei {} kms".format(carro.odometro))
        elif action == 'S':
            print("A velocidade media e {} km/h".format(carro.calcular_velocidade_media()))
        elif action == 'X':
            print("Desligado")
        carro.step()
        carro.mostrar_estado()
