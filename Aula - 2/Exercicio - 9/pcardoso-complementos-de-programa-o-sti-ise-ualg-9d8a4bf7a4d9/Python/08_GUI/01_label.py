from kivy.app import App
from kivy.uix.label import Label


class MyApp(App):
    """ This is the class where you will define your GUI"""
    def build(self):
        """ The build() method is called when the App is initialized and is responsible for returning
        the Root Widget of this App."""
        # This Label will be the Root Widget of this App.
        return Label(text='Olá CP/STI!')


if __name__ == '__main__':
    # class MyApp is initialized and its run() method called.
    # This initializes and starts our Kivy application.
    MyApp().run()
