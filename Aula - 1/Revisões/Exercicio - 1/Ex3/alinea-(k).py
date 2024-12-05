def fibonacci(n):
    fibonacci_series = [1] * n

    for i in range(2, n):
        fibonacci_series[i] = fibonacci_series[i - 1] + fibonacci_series[i - 2]

    return fibonacci_series


def main():
    n = int(input("Digite o número de termos da série de Fibonacci que deseja gerar: "))

    if n <= 0:
        print("Por favor, digite um número inteiro positivo.")
    else:
        series = fibonacci(n)
        print(f"Série de Fibonacci até o {n}-ésimo termo:")
        print(series)


if __name__ == "__main__":
    main()

