from kivy.app import App
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.gridlayout import GridLayout


class LoginScreen(GridLayout):
    """ This class is used as a Base for our RootWidget (LoginScreen)"""

    def __init__(self, **kargs):
        """ override the method __init__() so as to add widgets and to define their behavior"""

        # call super in order to implement the functionality of the original class being overloaded.
        super().__init__(**kargs)

        # GridLayout to manage its children in 2 columns and add a Label and a TextInput for
        # the username and password.
        self.cols = 2

        # 1, 1
        self.add_widget(Label(text='Nome:'))

        # 1, 2
        # create a TextInput and store it in a variable so that we can access it later.
        self.txt_input_nome = TextInput(multiline=False)
        # When the text changes, the callback will be called, sending the textinput instance and the new text as parameters.
        self.txt_input_nome.bind(text=self.muda_cor)
        # add the TextInput to the GridLayout
        self.add_widget(self.txt_input_nome)

        # 2, 1
        self.add_widget(Label(text='Palavra-chave:'))

        # 2, 2 - works like the previous one
        self.txt_input_pw = TextInput(multiline=False, password=True)
        self.txt_input_pw.bind(text=self.muda_cor)
        self.add_widget(self.txt_input_pw)

        # 3, 1
        # create a Button and store it in a variable so that we can access it later.
        bt_verifica = Button(text='Verifica')
        #
        bt_verifica.bind(on_release=self.bt_release)
        # add the Button to the GridLayout
        self.add_widget(bt_verifica)

        # 3, 3
        self.lb_verifica = Label(text='')
        self.add_widget(self.lb_verifica)

    def bt_release(self, instance):
        """ This method is called when the button is released (mouse button released)
        :param instance: instance of the button
        """
        # print(instance)
        # pprint(self.txt_input_nome.__dict__)
        self.lb_verifica.text = 'ok' if self.txt_input_nome.text == self.txt_input_pw.text else 'not ok!'

    def muda_cor(self, instance, value):
        """ This method is called when the text changes.
        The callback will be called, sending the textinput instance and the new text as parameters.
        :param instance: instance of the textinput
        :param value: new text
        """

        self.lb_verifica.text = 'clique no botão verificar'
        self.lb_verifica.color = [0, 1, 0, 1] if self.txt_input_nome.text == self.txt_input_pw.text else [1, 0, 0, 1]

class MyApp(App):
    def build(self):
        return LoginScreen()

if __name__ == '__main__':
    MyApp().run()