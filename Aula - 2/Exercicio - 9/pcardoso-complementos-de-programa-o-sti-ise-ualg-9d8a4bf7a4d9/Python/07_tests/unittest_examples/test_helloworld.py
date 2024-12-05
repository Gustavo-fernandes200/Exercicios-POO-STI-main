from unittest import TestCase
from helloworld import get_greetings


class Test(TestCase):
    def test_get_greetings(self):
        self.assertEqual(get_greetings(), 'Hello World!')
