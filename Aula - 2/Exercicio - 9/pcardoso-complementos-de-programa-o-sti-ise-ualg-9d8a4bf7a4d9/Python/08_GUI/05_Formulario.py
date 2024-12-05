from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.core.audio import SoundLoader

from kivy.core.window import Window
Window.size = (2000, 600)

class Pessoa:
    def __init__(self, nome, email, tem_carro, genero, pais):
        self.nome = nome
        self.email = email
        self.tem_carro = tem_carro
        self.genero = genero
        self.pais = pais



class FormularioWidget(BoxLayout):

    def __init__(self, **kwargs):
        super().__init__(**kwargs)

        self.lista_pessoas = [
            Pessoa("ze", "ze@ualg.pt", True, "Masculino", "Portugal"),
            Pessoa("quim", "quim@ualg.pt", False, "Masculino", "Espanha"),
            Pessoa("guida", "guida@ualg.pt", True, "Feminino", "França"),
        ]
        self.idx = 0

        self.preenche_formulario()

    def proximo(self):
        self.idx = (self.idx + 1) % len(self.lista_pessoas)
        self.preenche_formulario()


    def anterior(self):
        self.idx -= 1
        if self.idx < 0:
            self.idx = len(self.lista_pessoas) - 1
        self.preenche_formulario()

    def novo(self):
        # To-do
        print("To-do")

    def apaga(self):
        # To do
        print("To-do")

    def grava(self):
        # To do
        print("To-do")

    def preenche_formulario(self):
        pessoa = self.lista_pessoas[self.idx]
        self.ids.nome.text = pessoa.nome
        self.ids.email.text = pessoa.email
        self.ids.tem_carro.active = pessoa.tem_carro
        self.ids.genero_masculino.active = (pessoa.genero == "Masculino")
        self.ids.genero_feminino.active = (pessoa.genero == "Feminino")
        self.ids.pais.text = pessoa.pais
        self.ids.progress_bar.value = (self.idx + 1) / len(self.lista_pessoas) * 100


class FormularioApp(App):
    def build(self):
        return FormularioWidget()

FormularioApp().run()