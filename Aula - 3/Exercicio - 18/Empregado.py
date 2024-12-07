from Pessoa import Pessoa


class Empregado(Pessoa):
    def __init__(self, nome, endereco, telefone, codigo_setor, salario_base, imposto):
        super().__init__(nome, endereco, telefone)
        self.codigo_setor = codigo_setor
        self.salario_base = salario_base
        self.imposto = imposto

    def calcular_salario_liquido(self):
        return self.salario_base * (1 - self.imposto / 100)

    def __repr__(self):
        return (f"Empregado(nome={self.nome}, endereco={self.endereco}, telefone={self.telefone}, "
                f"codigo_setor={self.codigo_setor}, salario_base={self.salario_base}, imposto={self.imposto})")
