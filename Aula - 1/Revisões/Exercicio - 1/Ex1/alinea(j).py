"""
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
80 euros. Informe ao utilizador da quantidades de latas de tinta a serem compradas e o
preço total.
"""

import math

area_pintada = float(input("Digite a medida de tamanho em metros, no qual vai querer pintar: "))

litros_por_metro_quadrado = 1 / 3  # Como se fosse 0.33 litros por metro quadrado

litros_lata = 18

cobertura_tinta = area_pintada / litros_lata

quantidade_litros_precisos = area_pintada * litros_por_metro_quadrado

quantidade_latas = math.ceil(quantidade_litros_precisos / litros_lata)

preco_total = quantidade_latas * 80  # Se quantidade_latas for igual a 9 e preco_lata for igual a 80 euros, o preco_total será de 720 euros.

print(f"Serão necessárias pelo menos {quantidade_latas} latas de tinta, totalizando {preco_total} euros.")
print(f"A cobertura da tinta é de aproximadamente {cobertura_tinta} litros por metro quadrado.")



