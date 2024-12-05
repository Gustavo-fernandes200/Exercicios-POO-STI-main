
def soma_media(n):
    soma = 0

    for i in range(n):
        numero = float(input("Digite um número: "))
        soma += numero

    media = soma / n
    return soma, media


n = int(input("Digite a quantidade de números: "))
soma, media = soma_media(n)
print(f"Soma: {soma}")
print(f"Média: {media}")


