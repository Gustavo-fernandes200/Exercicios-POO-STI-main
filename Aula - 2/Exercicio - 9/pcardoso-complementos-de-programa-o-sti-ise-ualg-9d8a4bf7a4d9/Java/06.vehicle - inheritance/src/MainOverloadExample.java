
public class MainOverloadExample {

	public static void main(String[] args) {
	    Person owner = new Person("Pedro", "1992/10/12");
	    Engine engine = new Engine("Diesel", 90f, 4);
	    Wheel wheel = new Wheel("R", 55, 95, 65, "V", 215);

	    
	    Car car = new Car(owner, "Renault", "Espace", 7, 186f, wheel, 4, engine, 5);
	    car.setKms(1000);
	    car.setFilledFuel(62);;
	    System.out.println("Car mean consumption: "+ car.consumption());
	    System.out.println("Car expected consumption for 200 km: "+ car.consumption(200));
	    System.out.println("Car expected consumption for 200 km given a 1.3 load factor: "+ car.consumption(200, 1.3));
	}

}
