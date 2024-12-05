from kivy.app import App
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.uix.gridlayout import GridLayout


class LoginScreen(GridLayout):
    """ This class is used as a Base for our RootWidget (LoginScreen)"""

    def __init__(self, **kargs):
        """  override the method __init__() so as to add widgets and to define their behavior"""
        # call super in order to implement the functionality of the original class being overloaded.
        super().__init__(**kargs)

        # GridLayout to manage its children in 2 columns and
        # add a Label and a TextInput for the username and password.
        self.cols = 2

        # 1, 1
        self.add_widget(Label(text='Nome:'))

        # 1, 2
        self.add_widget(TextInput(multiline=False))

        # 2, 1
        self.add_widget(Label(text='Palavra-chave:'))

        # 2, 2
        self.add_widget(TextInput(multiline=False, password=True))


class MyApp(App):
    """ This is the class where you will define your GUI"""
    def build(self):
        """ The build() method is called when the App is initialized
        and is responsible for returning the Root Widget of this App. """
        return LoginScreen()

if __name__ == '__main__':
    MyApp().run()