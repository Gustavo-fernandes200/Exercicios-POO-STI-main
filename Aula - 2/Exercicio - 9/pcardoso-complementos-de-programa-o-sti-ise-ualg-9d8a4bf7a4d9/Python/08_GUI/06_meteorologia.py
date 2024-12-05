
# open weather
# https://openweathermap.org/

# icons
# https://openweathermap.org/weather-conditions

lista_cidades = ['Faro', 'Coimbra', 'Lisboa', 'Porto']
api_key = "5cf2941d6605f025b9752b91ecbb1680"

from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.clock import Clock
import requests

class MeteorologiaWidget(BoxLayout):
    idx = 0
    data = dict()
    def update_dados(self, dt):
        for cidade in lista_cidades:
            url = f"https://api.openweathermap.org/data/2.5/weather?q={cidade}&appid={api_key}&units=metric"
            self.data[cidade] = requests.get(url).json()
        print(self.data)

    def update_gui(self, dt):
        self.idx = (self.idx + 1) % len(lista_cidades)

        cidade = lista_cidades[self.idx]

        self.ids.nome_da_cidade.text = cidade
        self.ids.valor_temperatura.text = str(self.data[cidade]["main"]["temp"]) + "º"
        self.ids.velocidade_do_vento.text = str(self.data[cidade]["wind"]["speed"]) + " m/s"

        icon = self.data[cidade]["weather"][0]["icon"]
        url_icon = f"http://openweathermap.org/img/wn/{icon}@2x.png"
        self.ids.icon_meteorologico.source = url_icon


class MeteorologiaApp(App):
    def build(self):
        root = MeteorologiaWidget()
        Clock.schedule_once(root.update_dados)
        Clock.schedule_interval(root.update_dados, 60)
        Clock.schedule_interval(root.update_gui, 3)
        return root

MeteorologiaApp().run()