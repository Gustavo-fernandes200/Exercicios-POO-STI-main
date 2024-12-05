def comparar_as_strings(str1, str2):

    if str1 == str2:
        print("As duas strings têm o mesmo comprimento e conteúdo.")
    else:
        print("As duas strings têm tamanhos diferentes ou conteúdo diferente.")


def main():

    string1 = input("Digite a primeira string: ")
    string2 = input("Digite a segunda string: ")

    comparar_as_strings(string1, string2)


if __name__ == "__main__":
    main()

