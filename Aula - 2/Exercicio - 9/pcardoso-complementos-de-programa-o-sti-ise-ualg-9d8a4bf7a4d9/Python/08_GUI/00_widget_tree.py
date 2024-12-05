from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.gridlayout import GridLayout
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.label import Label


class LoginScreen(GridLayout):
    """ classe que define a tela de login"""

    def __init__(self, **kargs):
        """ override do metodo __init__() para adicionar widgets e definir seu comportamento"""

        # chama o metodo __init__() da classe base para implementar a funcionalidade da classe original
        super().__init__(**kargs)

        # GridLayout de modo a gerir os filhos em duas colunas e adicionar um Label e um TextInput
        # para o nome de usuário e senha.
        self.cols = 2

        # adiciona um widget do tipo Label com o texto 'Nome:'
        self.add_widget(Label(text='Nome:'))
        # adiciona um widget do tipo TextInput para inserir o nome de usuário
        self.add_widget(TextInput(multiline=False))

        # adiciona um widget do tipo Label com o texto 'Palavra-chave:'
        self.add_widget(Label(text='Palavra-chave:'))
        # adiciona um widget do tipo TextInput para inserir a senha
        self.add_widget(TextInput(multiline=False, password=True))


class LoginScreen2(GridLayout):
    """ Classe que define a tela de login - versão 2
        Esta classe é uma versão da classe LoginScreen que utiliza o GridLayout
        com 3 colunas e adiciona um BoxLayout com 2 botões
    """
    def __init__(self, **kargs):
        super().__init__(**kargs)

        self.cols = 3

        # adiciona um widget do tipo Label na coluna 1
        self.add_widget(Label(text='Nome:'))

        # adiciona um widget do tipo TextInput na coluna 2
        self.add_widget(TextInput(multiline=False))

        # Cria um BoxLayout para os botões e adiciona-a à coluna 3
        box_layout = BoxLayout()
        box_layout.orientation = 'vertical'
        box_layout.add_widget(Button(text='ok'))
        box_layout.add_widget(Button(text='Cancelar'))
        self.add_widget(box_layout)


class MyApp(App):
    """ Classe principal da aplicação"""
    def build(self):
        # return LoginScreen()
        return LoginScreen2()


MyApp().run()
