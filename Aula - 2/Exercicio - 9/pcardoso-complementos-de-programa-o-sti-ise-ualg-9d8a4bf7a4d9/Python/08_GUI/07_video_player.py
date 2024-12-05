from kivy.app import App
from kivy.uix.boxlayout import BoxLayout

class Player(BoxLayout):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)

        with open("lista_de_canais.txt", "r") as f:
            values = f.read().splitlines()

        self.ids.lista_de_canais.values = values
        self.ids.lista_de_canais.text = values[0]

    def muda_canal(self, *args):
        self.ids.player.source = self.ids.lista_de_canais.text

class VideoPlayerApp(App):
    def build(self):
        return Player()

#on error try to install : pip install ffpyplayer
VideoPlayerApp().run()