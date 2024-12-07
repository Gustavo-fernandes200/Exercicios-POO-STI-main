from Pessoa import Pessoa
from Fornecedor import Fornecedor
from Empregado import Empregado
from Operario import Operario

pessoa1 = Pessoa("Alice", "Rua 123", "123456789")
print(pessoa1)

anonimo = Pessoa.cria_anonimo()
print(anonimo)

fornecedor1 = Fornecedor("Bob", "Rua 456", "987654321", 10000, 2000)
print(fornecedor1)
print(f"Saldo do fornecedor: {fornecedor1.obter_saldo()}")

empregado1 = Empregado("Carol", "Rua 789", "111222333", 10, 3000, 15)
print(empregado1)
print(f"Salário líquido do empregado: {empregado1.calcular_salario_liquido()}")

operario1 = Operario("Carlos", "Rua C, 789", "555-7890", 3, 4000, 15, 50000, 10)
print(operario1)

salario = operario1.calcular_salario()
print(f"Salário do operário: {salario}")

produtividade = operario1.calcular_produtividade()
print(f"Produtividade do operário: {produtividade}")

