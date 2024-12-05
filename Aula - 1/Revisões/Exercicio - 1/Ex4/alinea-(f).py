
v = list(range(50))

print("Primeiros 10 elementos:", v[:10])

print("Últimos 10 elementos:", v[-10:])

print("Valores entre a posição 10 e 20:", v[10:21])

del v[5]
print("Vetor após apagar o número na posição 5:", v)

if 20 in v:
    v.remove(20)
print("Vetor após apagar o número 20:", v)

print("Números por ordem inversa:", list(reversed(v)))

conjunto = ['a', 'b', 'c']
uniao = v + conjunto
print("União com o conjunto ['a', 'b', 'c']:", uniao)

