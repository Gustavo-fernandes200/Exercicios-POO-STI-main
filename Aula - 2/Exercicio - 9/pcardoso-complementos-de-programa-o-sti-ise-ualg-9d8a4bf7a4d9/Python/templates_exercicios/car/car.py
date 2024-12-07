#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Mar  8 10:11:25 2022

@author: pcardoso
"""

from person import Person
from color import Color
from engine import Engine


class Car:

    def __init__(self, owner: Person, color: Color, engine: Engine, brand, model, consumption, kms):

        self.owner = owner
        self.color = color
        self.engine = engine
        self.brand = brand
        self.model = model
        self.consumption = consumption
        self.kms = kms

    @property
    def brand(self):
        return self.__brand

    @brand.setter
    def brand(self, brand):
        self.__brand = brand

    @property
    def model(self):
        return self.__model

    @model.setter
    def model(self, model):
        self.__model = model

    @property
    def consumption(self):
        return self.__consumption

    @consumption.setter
    def consumption(self, consumption):
        self.__consumption = consumption

    @property
    def kms(self):
        return self.__kms

    @kms.setter
    def kms(self, kms):
        self.__kms = kms

    def add_kms(self, kms_to_add):
        self.__kms += kms_to_add

    @property
    def owner(self):
        return self.__owner

    @owner.setter
    def owner(self, owner: Person):
        self.__owner = owner

    @property
    def color(self):
        return self.__color

    @color.setter
    def color(self, color: Color):
        self.__color = color

    @property
    def engine(self):
        return self.__engine

    @engine.setter
    def engine(self, engine: Engine):
        self.__engine = engine


if __name__ == "__main__":
    # Test the class

    ze = Person()
    v8 = Engine(570, "Mercedes", "Gasoline", 8, "2022-01-01",
                600)
    red = Color("red", 255, 0, 0)

    car = Car(
        owner=ze,
        color=red,
        engine=v8,
        brand="Citroen",
        model="C4",
        consumption=8,
        kms=100000
    )
    print(f"Brand: {car.brand}")
    print(f"Model: {car.model}")
    print(f"Consumption: {car.consumption} L/100km")
    print(f"KMs: {car.kms}")



