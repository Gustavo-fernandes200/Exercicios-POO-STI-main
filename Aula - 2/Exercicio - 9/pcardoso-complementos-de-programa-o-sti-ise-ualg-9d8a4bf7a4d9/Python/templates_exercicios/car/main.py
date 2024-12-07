from car import Car
from person import Person
from color import Color
from engine import Engine
import pickle

list_of_persons = []
list_of_engines = []
list_of_colors = []
list_of_cars = []


def main():
    global list_of_colors, list_of_cars, list_of_engines, list_of_persons
    while True:
        print("Menu")
        print("p1 - New Person")
        print("p2 - List Persons")
        print("e1 - New Engine")
        print("e2 - List Engines")
        print("c1 - New Color")
        print("c2 - List Colors")
        print("v1 - New Car")
        print("v2 - List Cars")
        print("s - Save lists")
        print("l - Load lists")

        op = input("op? ")

        if op == "p1":
            forename = input("Enter forename: ")
            age = int(input("Enter age: "))
            identification_number = input("Enter identification number: ")
            surname = input("Enter surname: ")
            address = input("Enter address: ")
            cc = input("Enter cc: ")
            phonenumber = input("Enter phone number: ")
            new_person = Person(forename, age, identification_number, surname, address, cc, phonenumber)
            list_of_persons.append(new_person)
        elif op == "p2":
            print_list(list_of_persons)
        elif op == "e1":
            horsepower = int(input("Enter horsepower: "))
            car_brand = input("Enter car brand: ")
            type_fuel = input("Enter type of fuel: ")
            cylinder = int(input("Enter number of cylinders: "))
            manufacturing_date = input("Enter manufacturing date: ")
            engine_torque = input("Enter engine torque: ")
            new_engine = Engine(horsepower, car_brand, type_fuel, cylinder, manufacturing_date, engine_torque)
            list_of_engines.append(new_engine)
        elif op == "e2":
            print_list(list_of_engines)
        elif op == "c1":
            new_color = Color()
            list_of_colors.append(new_color)
        elif op == "c2":
            print_list(list_of_colors)
        elif op == "v1":
            new_vehicle()
        elif op == "v2":
            print_list(list_of_cars)
        elif op == "s":
            save_lists()
        elif op == "l":
            load_lists()
        else:
            print("Invalid option.")


def save_lists():
    with open("persons_list.pkl", "wb") as f:
        pickle.dump(list_of_persons, f)
    with open("engines_list.pkl", "wb") as f:
        pickle.dump(list_of_engines, f)
    with open("colors_list.pkl", "wb") as f:
        pickle.dump(list_of_colors, f)
    with open("cars_list.pkl", "wb") as f:
        pickle.dump(list_of_cars, f)
    print("Lists saved successfully.")


def load_lists():
    global list_of_persons, list_of_engines, list_of_colors, list_of_cars
    with open("persons_list.pkl", "rb") as f:
        list_of_persons = pickle.load(f)
    with open("engines_list.pkl", "rb") as f:
        list_of_engines = pickle.load(f)
    with open("colors_list.pkl", "rb") as f:
        list_of_colors = pickle.load(f)
    with open("cars_list.pkl", "rb") as f:
        list_of_cars = pickle.load(f)
    print("Lists loaded successfully.")


def print_list(list_of):
    if not list_of:
        print("List is empty.")
        return

    print("Listing items:")
    for i, item in enumerate(list_of, 1):
        print(f"{i}. {item}")


def ask_id(msg, input_list):
    while True:
        print_list(input_list)
        id_input = input(msg)
        try:
            id_input = int(id_input)
            if id_input < 0 or id_input >= len(input_list):
                print("Invalid ID. Please try again.")
            else:
                return id_input
        except ValueError:
            print("Invalid input. Please enter a valid ID.")


def new_vehicle():
    person_id = ask_id("Person's id? ", list_of_persons)
    color_id = ask_id("Color's id? ", list_of_colors)
    engine_id = ask_id("Engine's id? ", list_of_engines)

    brand = input("Enter brand: ")
    model = input("Enter model: ")
    consumption = float(input("Enter consumption (L/100km): "))
    kms = float(input("Enter kilometers: "))

    new_car = Car(
        owner=list_of_persons[person_id],
        color=list_of_colors[color_id],
        engine=list_of_engines[engine_id],
        brand=brand,
        model=model,
        consumption=consumption,
        kms=kms
    )

    list_of_cars.append(new_car)


if __name__ == "__main__":
    main()


