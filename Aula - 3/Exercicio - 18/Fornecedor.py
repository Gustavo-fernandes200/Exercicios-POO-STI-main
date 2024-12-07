from Pessoa import Pessoa


class Fornecedor(Pessoa):
    def __init__(self, nome, endereco, telefone, valor_credito, valor_divida):
        super().__init__(nome, endereco, telefone)
        self.valor_credito = valor_credito
        self.valor_divida = valor_divida

    def obter_saldo(self):
        return self.valor_credito - self.valor_divida

    def __repr__(self):
        return (f"Fornecedor(nome={self.nome}, endereco={self.endereco}, telefone={self.telefone}, "
                f"valor_credito={self.valor_credito}, valor_divida={self.valor_divida})")
