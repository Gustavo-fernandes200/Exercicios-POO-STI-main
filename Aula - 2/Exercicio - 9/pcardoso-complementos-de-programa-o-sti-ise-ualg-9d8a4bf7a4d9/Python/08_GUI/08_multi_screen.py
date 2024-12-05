from kivy.app import App
from kivy.uix.screenmanager import ScreenManager, Screen

utilizadores = {
    "Jose": {
        "pw": "!!!",
        "email": "ze@ualg.pt",
        "idade": 18
    },
    "Joaquim": {
        "pw": "###",
        "email": "quim@ualg.pt",
        "idade": 19
    }
}

class LoginScreen(Screen):
    """ Classe que representa o ecrã de login"""
    def login(self):
        """ Método que verifica se o utilizador existe e se a password está correta
        -> muda para o ecrã principal se estiver tudo correto
        """
        try:
            user = self.ids.ti_user.text

            # Verifica se a password está correta
            if utilizadores[user]["pw"] == self.ids.ti_pw.text:
                # Muda para o ecrã principal
                self.manager.current = "main"

                # Atualiza os labels do ecrã principal
                self.manager.get_screen("main").ids.lb_user.text = f"Olá {self.ids.ti_user.text}"
                self.manager.get_screen("main").ids.lb_email.text = f"Email: {utilizadores[user]['email']}"
                self.manager.get_screen("main").ids.lb_idade.text = f"Idade: {utilizadores[user]['idade']}"
            else:
                print('Falhou: password errada!')
        except Exception as e:
            print(e)
            print('Falhou: utilizador não existe')


class MainScreen(Screen):
    """ Classe que representa o ecrã principal """
    def logout(self):
        """ Método que muda para o ecrã de login """
            self.manager.current = 'login'

class Multi_ScreenApp(App):
    """ Classe principal da aplicação - herda da classe App """
    def build(self):
        """ Método que constroi a aplicação"""

        # Cria um ScreenManager
        sm = ScreenManager()

        # Adiciona os ecrãs à aplicação - 1 ecrã para cada classe
        sm.add_widget(LoginScreen())
        sm.add_widget(MainScreen())

        # Retorna o ScreenManager
        return sm

# Instancia a aplicação e corre-a
Multi_ScreenApp().run()