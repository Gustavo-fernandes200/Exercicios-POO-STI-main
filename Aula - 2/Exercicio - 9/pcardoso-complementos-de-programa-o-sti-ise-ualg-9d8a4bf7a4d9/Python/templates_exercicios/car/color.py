#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Mar  8 10:11:25 2022

@author: pcardoso
"""


class Color:
    def __init__(self, name, r, g, b):
        self._name = name
        self._r = r
        self._g = g
        self._b = b

    def __repr__(self):
        return f"Color {self._name}  R:{self._r} G:{self._g} B:{self._b}"

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name

    @property
    def r(self):
        return self._r

    @r.setter
    def r(self, r):
        self._r = r

    @property
    def g(self):
        return self._g

    @g.setter
    def g(self, g):
        self._g = g

    @property
    def b(self):
        return self._b

    @b.setter
    def b(self, b):
        self._b = b

    @property
    def rgb(self):
        return self._r, self._g, self._b

    @rgb.setter
    def rgb(self, r, g, b):
        self._r = r
        self._g = g
        self._b = b


if __name__ == "__main__":
    # Teste da classe
    red = Color("red", 255, 0, 0)
    print(red)


