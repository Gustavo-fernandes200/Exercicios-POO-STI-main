def contar_espacos_vogais(frase):
    espacos = frase.count(' ')
    vogais = 'aeiou'
    contagem_vogais = {vogal: frase.lower().count(vogal) for vogal in vogais}
    return espacos, contagem_vogais


def main():
    frase = input("Digite uma frase: ")
    espacos, contagem_vogais = contar_espacos_vogais(frase)
    print(f"Espaços em branco: {espacos}")
    print("Contagem de vogais:")
    for vogal, contagem in contagem_vogais.items():
        print(f"{vogal}: {contagem}")


if __name__ == "__main__":
    main()
