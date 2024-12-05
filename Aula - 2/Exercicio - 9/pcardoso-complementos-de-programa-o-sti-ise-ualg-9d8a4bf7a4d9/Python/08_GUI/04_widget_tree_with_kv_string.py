from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.lang.builder import Builder

Builder.load_string('''
<Login>:
    cols: 3
    Label:
        text: "Nome"
    TextInput:
        multiline: False
    BoxLayout:
        orientation: "vertical"
        Button:
            text: "ok"
        Button:
            text:
                "Cancelar"
    '''
                    )



class Login(GridLayout):
    pass

class MyOtherLoginApp(App):
    def build(self):
        return Login()

MyOtherLoginApp().run()