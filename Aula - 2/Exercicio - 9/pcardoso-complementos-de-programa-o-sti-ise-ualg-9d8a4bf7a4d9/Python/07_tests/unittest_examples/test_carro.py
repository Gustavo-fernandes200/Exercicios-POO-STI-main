"""
basedo no exemplo apresendado em
https://www.jetbrains.com/help/pycharm/testing-your-first-python-application.html#write-test
"""

import unittest

from carro import Carro


# Instancias da classe TestCase representam unidades logicas de teste no universo do unittest_examples.
class TestCarro(unittest.TestCase):
    def setUp(self):
        self.carro = Carro()


class TestInicio(TestCarro):
    def test_velocidade_inicial(self):
        """ garante que a velocidade inicial é 0"""
        self.assertEqual(self.carro.velocidade, 0)

    def test_odometro_inicial(self):
        """ garante que o valor inicial do odometro é 0"""
        self.assertEqual(self.carro.odometro, 0)

    def test_tempo_inicial(self):
        """ verigfica que o tempo inicial é 0"""
        self.assertEqual(self.carro.tempo, 0)


class TestAcelerar(TestCarro):
    def test_acelerar_desde_zero(self):
        self.carro.acelerar()
        self.assertEqual(self.carro.velocidade, 5)

    def test_acelerar_multiplas_vezes(self):
        for _ in range(3):
            self.carro.acelerar()
        self.assertEqual(self.carro.velocidade, 15)


class TestTravar(TestCarro):
    def test_travar_1_vez(self):
        self.carro.acelerar()
        self.carro.travar()
        self.assertEqual(self.carro.velocidade, 0)

    def test_travar_multiplas_vezes(self):
        for _ in range(5):
            self.carro.acelerar()
        for _ in range(3):
            self.carro.travar()
        self.assertEqual(self.carro.velocidade, 10)

    def test_velocidade_nao_pode_ser_negativa(self):
        """ garante que a velocidade não é negativa se acelerar e travar"""
        self.assertGreaterEqual(self.carro.velocidade, 0)
        self.carro.travar()
        self.assertGreaterEqual(self.carro.velocidade, 0)

    def test_velocidade_nao_passa_dos_40(self):
        """ garante que a velocidade não passa dos 40"""
        for _ in range(10):
            self.carro.acelerar()
        self.assertLessEqual(self.carro.velocidade, 40)

    def test_travar_multiplas_vezes_a_zero(self):
        """ garante que se travar multiplas vezes fica 0"""
        for _ in range(10):
            self.carro.travar()
        self.assertGreaterEqual(self.carro.velocidade, 0)

if __name__ == '__main__':
    unittest.main()