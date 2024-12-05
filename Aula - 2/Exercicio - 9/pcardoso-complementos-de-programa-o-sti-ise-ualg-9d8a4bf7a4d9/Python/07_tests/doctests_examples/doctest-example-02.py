import math

def converte_temperatura(t, da_unidade, para_unidade):
    """
    Converte e devolve a temperatura da unidade de_unidade para para_unidade (2 casas de decimais de precisao).
    :param t: temperatura
    :param da_unidade: unidada de entrada (elemento de 'K', 'F', 'C')
    :param para_unidade: unidada de saida (elemento de 'K', 'F', 'C')
    :return: valor da temperatura na unidade de saida

    >>> converte_temperatura(273.16, 'K', 'C')
    0.01

    >>> converte_temperatura(-40, 'C', 'F')
    -40.0

    >>> converte_temperatura(450, 'F', 'K')
    505.37222

    >>> converte_temperatura(450, 'f', 'K')
    Traceback (most recent call last):
    ...
    AssertionError: Unidade de temperatura nao conhecida: f

    >>> converte_temperatura(-450, 'C', 'K')
    Traceback (most recent call last):
    ...
    AssertionError: Temperatura inválida: -450 C é inferior a 0 K (zero absoluto)

    >>> converte_temperatura("450", 'f', 'K')
    Traceback (most recent call last):
    ...
    AssertionError: primeiro argumento deve ser um número

    """

    # dicionario com as funcoes de conversao das diferentes unidades para K (Kelvin)
    para_K = {'K': lambda val: val,
           'C': lambda val: val + 273.15,
           'F': lambda val: (val + 459.67)*5/9,
           }

    # Dicionario com a conversão de K para as diferentes unidades
    de_K = {'K': lambda val: val,
             'C': lambda val: val - 273.15,
             'F': lambda val: val*9/5 - 459.67,
             }

    assert isinstance(t, (int, float)), "primeiro argumento deve ser um número"
    assert da_unidade in de_K.keys(),  f'Unidade de temperatura nao conhecida: {da_unidade}'
    assert para_unidade in para_K.keys(),  f'Unidade de temperatura nao conhecida: {para_unidade}'

    # verifica se e necessario converter
    if da_unidade == para_unidade:
        return t

    T = para_K[da_unidade](t)
    assert T > 0, f'Temperatura inválida: {t} {da_unidade} é inferior a 0 K (zero absoluto)'
    T = round(de_K[para_unidade](T), 5)

    return T


if __name__ == "__main__":
    import doctest
    (failure_count, test_count) = doctest.testmod(verbose=True)
    if failure_count > 0:
        exit()

    print(50*"#")
    casos_para_teste = [
        ((273.16, 'K'), (0.010000000000047748, 'C')),
        ((-40, 'C'), (-40, 'F')),
        ((450, 'F'), (505.3722222222222, 'K')),
        (("450", 'F'), (505.3722222222222, 'K'))
    ]

    for caso in casos_para_teste:
        ((de_val, de_unid), (para_val, para_unidade)) = caso
        try:
            T = converte_temperatura(de_val, de_unid, para_unidade)
            print(f"{de_val} {de_unid} = {T} {para_unidade}")
        except AssertionError as e:
            print(e)
