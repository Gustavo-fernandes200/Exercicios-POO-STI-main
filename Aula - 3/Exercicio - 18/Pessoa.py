class Pessoa:
    def __init__(self, nome, endereco, telefone):
        self.nome = nome
        self.endereco = endereco
        self.telefone = telefone

    @classmethod
    def cria_anonimo(cls):
        return cls(nome="John Doe", endereco="Unknown", telefone="Unknown")

    def __repr__(self):
        return f"Pessoa(nome={self.nome}, endereco={self.endereco}, telefone={self.telefone})"
