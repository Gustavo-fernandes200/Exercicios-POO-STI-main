
def main():
    pessoas = []

    for i in range(5):
        nome1 = input("Introduza o primeiro nome: ")
        nome2 = input("Introduza o segundo nome: ")
        idade = int(input("Introduza a idade da pessoa: "))
        altura = float(input("Introduza a altura da pessoa em metros: "))

        pessoa = (nome1, nome2, idade, altura)
        pessoas.append(pessoa)  # Adiciona a tupla com os dados da pessoa à lista de pessoas

    print("\nDetalhes das pessoas:")
    for pessoa in pessoas:
        print(f"Primeiro Nome: {pessoa[0]}, Segundo Nome: {pessoa[1]}, Idade: {pessoa[2]}, Altura: {pessoa[3]} metros")


if __name__ == "__main__":
    main()
