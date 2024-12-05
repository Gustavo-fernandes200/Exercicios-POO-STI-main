from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.lang.builder import Builder

Builder.load_file("mylogin.kv")

class Login(GridLayout):
    pass

class MyOtherLoginApp(App):
    def build(self):
        return Login()

MyOtherLoginApp().run()