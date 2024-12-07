#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Mar  8 10:12:45 2022

@author: pcardoso
"""


# TODO: see UML

class Person:
    def __init__(self, forename, age, identification_number, surname, address, cc, phonenumber):
        self.forename = forename
        self.age = age
        self.identification_number = identification_number
        self.surname = surname
        self.address = address
        self.cc = cc
        self.phonenumber = phonenumber

    @property
    def forename(self):
        return self.__forename

    @forename.setter
    def forename(self, forename):
        self.__forename = forename.title()

    @property
    def age(self):
        return self.__age

    @age.setter
    def age(self, age):
        self.__age = age

    @property
    def identification_number(self):
        return self.__identification_number

    @identification_number.setter
    def identification_number(self, identification_number):
        self.__identification_number = identification_number

    @property
    def surname(self):
        return self.__surname

    @surname.setter
    def surname(self, surname):
        self.__surname = surname.title()

    @property
    def address(self):
        return self.__address

    @address.setter
    def address(self, address):
        self.__address = address

    @property
    def cc(self):
        return self.__cc

    @cc.setter
    def cc(self, cc):
        self.__cc = cc

    @property
    def phonenumber(self):
        return self.__phonenumber

    @phonenumber.setter
    def phonenumber(self, phonenumber):
        self.__phonenumber = phonenumber.title()

    def __str__(self):
        return (f"{self.forename} {self.surname}, Age: {self.age}, ID: {self.identification_number}, "
                f"Address: {self.address}, CC: {self.cc}, Phone: {self.phonenumber}")


if __name__ == "__main__":
    # test the class
    ze = Person(forename="Gustavo", age=21, identification_number="ZYCT-2969-ZY3", surname="Fernandes",
                address="Rua, 0 1 de janeiro, 8700 - 512, Olhão", cc="5652", phonenumber="964265777")
    print(ze)
