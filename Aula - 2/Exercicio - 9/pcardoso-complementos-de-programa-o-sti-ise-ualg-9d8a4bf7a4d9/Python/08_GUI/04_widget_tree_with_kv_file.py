from kivy.app import App
from kivy.uix.gridlayout import GridLayout

class Login(GridLayout):
    pass

class MyLoginApp(App):
    def build(self):
        return Login()

MyLoginApp().run()