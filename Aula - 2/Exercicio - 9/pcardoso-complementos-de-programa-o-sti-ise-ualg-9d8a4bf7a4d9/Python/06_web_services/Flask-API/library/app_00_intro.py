# primeiro temos de importar a class Flask.
# Uma instancia desta classe sera a aplicacao WSGI (Web Server Gateway Interface).
from flask import Flask

# Em seguida, criamos uma instância dessa classe. O primeiro argumento é o nome do módulo ou pacote do aplicativo.
# Se estiver a usar um único módulo (como neste exemplo) use __name__ porque, dependendo de se for iniciado como
# aplicativo ou importado como módulo, o nome será diferente ('__main__' versus o nome da importação real).
# Isso é necessário para que o Flask saiba onde procurar modelos, arquivos estáticos e assim por diante.
app = Flask(__name__)


# route() -  decorador que diz ao Flask qual URI deve acionar o método
@app.route('/iot/api/v1.0/')
def index():
    return "Olá Mundo!!"


if __name__ == '__main__':
    # Se habilitar o suporte de depuração, o servidor recarrega com alterações de código 
    # e fornecerá um debuger mais avançado.
    app.run(debug=True)

