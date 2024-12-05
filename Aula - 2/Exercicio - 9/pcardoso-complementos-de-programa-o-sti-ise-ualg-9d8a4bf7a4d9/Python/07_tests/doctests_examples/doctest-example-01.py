"""
Exemplo de modulo usando doctest's

O modulo fornece a funcao factorial(). Exemplo:

>>> factorial(5)
120

>>> factorial2(5)
120
"""

def factorial(n):
    """
    Devolve o fatorial de um inteiro >= 0.
    Devolve um int um long dependendo do resultado

    >>> [factorial(n) for n in range(6)]
    [1, 1, 2, 6, 24, 120]

    >>> factorial(30)
    265252859812191058636308480000000

    >>> factorial(-1)
    Traceback (most recent call last):
    ...
    ValueError: n tem de ser >= 0

    o fatorial de float pode ser calculado deste que seja tambem um inteiro
    >>> factorial(30.1)
    Traceback (most recent call last):
    ...
    ValueError: n tem de ser inteiro

    E não pode ser "ridiculamente" grande
    >>> factorial(1e100)
    Traceback (most recent call last):
    ...
    OverflowError: n demasiado grande
    """
    import math
    if not n >= 0:
        raise ValueError("n tem de ser >= 0")

    if math.floor(n) != n:
        raise ValueError("n tem de ser inteiro")

    if n+1 == n: # catch a value like 1e100
        raise OverflowError("n demasiado grande")

    result = 1
    for factor in range(1, n+1):
        result *= factor

    return result

def factorial2(n):
    """
    Devolve o fatorial de um inteiro >= 0.
    Devolve um int um long dependendo do resultado

    >>> [factorial2(n) for n in range(6)]
    [1, 1, 2, 6, 24, 120]

    >>> factorial2(30)
    265252859812191058636308480000000

    >>> factorial2(-1)
    Traceback (most recent call last):
    ...
    AssertionError: n tem de ser >= 0

    o fatorial de float pode ser calculado deste que seja tambem um inteiro
    >>> factorial2(30.1)
    Traceback (most recent call last):
    ...
    AssertionError: n tem de ser inteiro

    E não pode ser "ridiculamente" grande
    >>> factorial2(1e100)
    Traceback (most recent call last):
    ...
    AssertionError: n demasiado grande
    """
    import math
    assert n >= 0, "n tem de ser >= 0"
    assert math.floor(n) == n, "n tem de ser inteiro"
    assert n+1 != n, "n demasiado grande"

    result = 1
    for factor in range(1, n+1):
        result *= factor

    return result

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
