def calcular_peso_ideal(altura, sexo):
    if sexo.lower() == 'masculino':  # Está verifica, que a string sexo se tiver em minúsculas, juntamente iguais
        # a string masculino ira lhe como fosse verdadeiro
        peso_ideal = 72.7 * altura - 58
    elif sexo.lower() == 'feminino':
        peso_ideal = 62.1 * altura - 44.7
    else:
        print("Sexo não reconhecido. Por favor, insira 'masculino' ou 'feminino'.")
        return None
    return peso_ideal


def main():
    altura = float(input("Digite sua altura em metros: "))
    sexo = input("Digite seu sexo (masculino/feminino): ")

    peso_ideal = calcular_peso_ideal(altura, sexo)
    if peso_ideal is not None:
        print(f"Seu peso ideal é {peso_ideal:.2f} kg.")


if __name__ == "__main__":
    main()
