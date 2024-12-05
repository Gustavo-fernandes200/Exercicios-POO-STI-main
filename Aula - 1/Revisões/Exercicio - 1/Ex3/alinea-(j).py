def main():
    numeros_pares = 0
    numeros_impares = 0

    for i in range(10):
        entrada_valida = False
        while not entrada_valida:
            entrada = input("Digite um número inteiro: ")
            if entrada.isdigit():  # Verifica se a entrada é composta apenas por dígitos
                numero = int(entrada)
                entrada_valida = True
            else:
                print("Erro: Por favor, digite um número inteiro válido.")

        if numero // 2 * 2 == numero:  # Verifica se o número é par
            numeros_pares += 1
        else:
            numeros_impares += 1

    print(f"Quantidade de números pares: {numeros_pares}")
    print(f"Quantidade de números ímpares: {numeros_impares}")


if __name__ == "__main__":
    main()



