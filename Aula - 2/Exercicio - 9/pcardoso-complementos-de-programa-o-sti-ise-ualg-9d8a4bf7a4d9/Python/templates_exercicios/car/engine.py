#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Mar  8 10:12:14 2022

@author: pcardoso
"""


class Engine:
    def __init__(self, horsepower, car_brand, type_fuel, cylinder, manufacturing_date, engine_torque):
        self.horsepower = horsepower
        self.type_fuel = type_fuel
        self.cylinder = cylinder
        self.manufacturing_date = manufacturing_date
        self.engine_torque = engine_torque
        self.car_brand = car_brand

    @property
    def horsepower(self):
        return self.__horsepower

    @horsepower.setter
    def horsepower(self, value):
        self.__horsepower = value

    @property
    def type_fuel(self):
        return self.__type_fuel

    @type_fuel.setter
    def type_fuel(self, name):
        self.__type_fuel = name.title()

    @property
    def cylinder(self):
        return self.__cylinder

    @cylinder.setter
    def cylinder(self, cylinder):
        self.__cylinder = cylinder

    @property
    def manufacturing_date(self):
        return self.__manufacturing_date

    @manufacturing_date.setter
    def manufacturing_date(self, manufacturing_date):
        self.__manufacturing_date = manufacturing_date

    @property
    def engine_torque(self):
        return self.__engine_torque

    @engine_torque.setter
    def engine_torque(self, engine_torque):
        self.__engine_torque = engine_torque

    @property
    def car_brand(self):
        return self.__car_brand

    @car_brand.setter
    def car_brand(self, car_brand):
        self.__car_brand = car_brand

    def __str__(self):
        return (f"Marca do Carro: {self.car_brand}, Potência: {self.horsepower}, Tipo de Combustível: {self.type_fuel}, "
                f"Cilindro: {self.cylinder}, Data de Fabricação: {self.manufacturing_date}, "
                f"Torque do Motor: {self.engine_torque}")


if __name__ == "__main__":

    v8 = Engine("CV", "Citroen", "Diesel", 4, "2014/05/21", "320 Nm")
    print(v8)
