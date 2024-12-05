from Empregado import Empregado


class Operario(Empregado):
    def __init__(self, nome, endereco, telefone, codigo_setor, salario_base, imposto, valor_producao, comissao):
        super().__init__(nome, endereco, telefone, codigo_setor, salario_base, imposto)
        self.valor_producao = valor_producao
        self.comissao = comissao

    def calcular_salario(self):
        return super().calcular_salario_liquido() + (self.valor_producao * self.comissao / 100)

    def calcular_produtividade(self):
        return self.valor_producao - self.calcular_salario()

    def __repr__(self):
        return (f"Operario(nome={self.nome}, endereco={self.endereco}, telefone={self.telefone}, "
                f"codigo_setor={self.codigo_setor}, salario_base={self.salario_base}, imposto={self.imposto}, "
                f"valor_producao={self.valor_producao}, comissao={self.comissao})")
