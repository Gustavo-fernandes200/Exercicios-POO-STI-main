def criacao_tabuada(numero):
    tabuada = []  # Está a iniciar um tipo de lista vazia, aonde armazena tipos de resultados numa tabulada a pedido.
    for i in range(1, 21):  # Inicia um loop entre 1 a 20 (inclusive) para gerar a tabuada até ao 20
        tabuada.append(
            (numero, i, numero * i))  # Acontece-se que adiciona uma tupla tendo ser um número base, onde o seu
        # multiplicador atual é o resultado da multiplicação na lista `tabuada`.
    return tabuada


def imprimir_tabuada(
        tabuada):  # Acontece-se que aceita um tipo paramentro ´tabuada´ da Criacao_tabuada. Onde será servir imprime a função
    print("Tabuada:")  # Imprime uma mensagem a dizer que será apresentada a tabuada.
    for multiplicacao in tabuada:  # Cria um loop em cada elemento de (tupla) na lista `tabuada`.
        print(
            f"{multiplicacao[0]} x {multiplicacao[1]} = {multiplicacao[2]}")  # Imprime uma multiplicacao entre a (tupla[0]) e (tupla[1])
        # Ex: {número[0]} x {multiplicador[1]} = {Resultado[2]}


def obter_numero():
    while True:
        entrada = input("Digite um número inteiro entre 1 e 20 para ver a tabuada: ")
        if entrada.isdigit():  # Verifica se a entrada é um número inteiro positivo
            numero = int(entrada)
            if 1 <= numero <= 20:
                return numero
        print("Por favor, digite um número inteiro válido entre 1 e 20.")


def main():
    numero = obter_numero()  # Chama a função `obter_numero` para que o utilizador insira um número válido.
    tabuada = criacao_tabuada(numero)
    imprimir_tabuada(tabuada)


if __name__ == "__main__":
    main()
