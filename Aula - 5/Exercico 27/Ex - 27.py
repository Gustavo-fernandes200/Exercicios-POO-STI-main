"""
Ex 27. Imagine que está a desenvolver um programa para uma biblioteca que gere empréstimos de livros. Nesse contexto,
é responsável por escrever a classe Livro que representa um livro na biblioteca. Cada livro tem um título, um autor,
um número de páginas e a nacionalidade do autor.

Agora, é necessário escrever o setter para o número de páginas do livro. No entanto, este método deve lançar uma exceção
se o número de páginas for menor ou igual a zero, pois um livro não pode ter zero ou menos páginas.

Além disso, a classe Livro deve validar que a nacionalidade do autor pertence a uma
lista de países, por exemplo, os países da União Europeia. Assim:

(a) Crie uma classe chamada Livro com os as propriedades titulo, autor, numero_de_paginas
e nacionalidade_do_autor.

(b) Escreva um inicializador para a classe Livro que inicialize todas as suas propriedades.

(c) Escreva os setters das propriedades fazendo com que método lance uma exceção se o valor introduzido não for válido.

(d) Adicione uma validação na classe Livro para verificar se a nacionalidade do autor pertence a uma lista de países,
por exemplo, os países da União Europeia.

(e) No método principal (main), crie instâncias da classe Livro e teste os métodos (setters),capturando e tratando
as exceções que ocorram.
"""


class Livro:
    PAISES_UE = [
        'Alemanha', 'Áustria', 'Bélgica', 'Bulgária', 'Chipre', 'Croácia', 'Dinamarca',
        'Eslováquia', 'Eslovénia', 'Espanha', 'Estónia', 'Finlândia', 'França', 'Grécia',
        'Hungria', 'Irlanda', 'Itália', 'Letónia', 'Lituânia', 'Luxemburgo', 'Malta',
        'Países Baixos', 'Polónia', 'Portugal', 'Roménia', 'Chéquia', 'Suécia'
    ]

    def __init__(self, titulo, autor, numero_de_paginas, nacionalidade_do_autor):
        self.titulo = titulo
        self.autor = autor
        self.numero_de_paginas = numero_de_paginas
        self.nacionalidade_do_autor = nacionalidade_do_autor

    @property
    def titulo(self):
        return self._titulo

    @titulo.setter
    def titulo(self, valor):
        self._titulo = valor

    @property
    def autor(self):
        return self._autor

    @autor.setter
    def autor(self, valor):
        self._autor = valor

    @property
    def numero_de_paginas(self):
        return self._numero_de_paginas

    @numero_de_paginas.setter
    def numero_de_paginas(self, valor):
        if valor <= 0:
            raise ValueError("O número de páginas deve ser maior que zero.")
        self._numero_de_paginas = valor

    @property
    def nacionalidade_do_autor(self):
        return self._nacionalidade_do_autor

    @nacionalidade_do_autor.setter
    def nacionalidade_do_autor(self, valor):
        if valor not in self.PAISES_UE:
            raise ValueError("A nacionalidade do autor deve ser de um país da União Europeia.")
        self._nacionalidade_do_autor = valor

    def __str__(self):
        return f"'{self.titulo}' por {self.autor}, {self.numero_de_paginas} páginas, Nacionalidade: {self.nacionalidade_do_autor}"


def criar_livro():
    try:
        titulo = input("Digite o título do livro: ")
        autor = input("Digite o nome do autor: ")
        numero_de_paginas = int(input("Digite o número de páginas: "))
        nacionalidade_do_autor = input("Digite a nacionalidade do autor: ")
        livro = Livro(titulo, autor, numero_de_paginas, nacionalidade_do_autor)
        print(f"Livro criado: {livro}")
    except ValueError as e:
        print(f"Erro ao criar o livro: {e}")


def main():
    global livro1
    criar_livro()

    try:
        livro1 = Livro("O Alquimista", "Paulo Coelho", 208, "Portugal")
        print(f"Livro 1: {livro1}")

        livro1.numero_de_paginas = -100  # Deve lançar exceção
    except ValueError as e:
        print(f"Erro ao atualizar livro 1: {e}")

    try:
        livro1.nacionalidade_do_autor = "Brasil"  # Deve lançar exceção
    except ValueError as e:
        print(f"Erro ao atualizar livro 1: {e}")

    try:
        livro2 = Livro("1984", "George Orwell", -328, "Reino Unido")  # Deve lançar exceção
        print(f"Livro 2: {livro2}")
    except ValueError as e:
        print(f"Erro ao criar livro 2: {e}")

    try:
        livro3 = Livro("Don Quixote", "Miguel de Cervantes", 863, "Brasil")  # Deve lançar exceção
        print(f"Livro 3: {livro3}")
    except ValueError as e:
        print(f"Erro ao criar livro 3: {e}")


if __name__ == "__main__":
    main()
