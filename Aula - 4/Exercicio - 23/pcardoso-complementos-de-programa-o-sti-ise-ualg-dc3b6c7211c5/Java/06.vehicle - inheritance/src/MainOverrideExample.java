
public class MainOverrideExample {

	public static void main(String[] args) {
	    Person seller = new Person("Pedro", "1992/10/12");
	    Engine engine = new Engine("Diesel", 90f, 4);
	    Wheel wheel = new Wheel("R", 55, 95, 65, "V", 215);

	    Vehicle v = new Vehicle(seller, "Renault", "Espace", 7);
	    System.out.println(v.vehicleInfo());  //This vehicle is a Renault Espace owned by Pedro
	    
	    LandVehicle lv = new LandVehicle(seller, "Renault", "Espace", 7, 186f, wheel, 4);
	    System.out.println(lv.vehicleInfo());  //This vehicle is a Renault Espace has 4 wheels and is owned by Pedro
	    
	    Car car = new Car(seller, "Renault", "Espace", 7, 186f, wheel, 4, engine, 5);
	    System.out.println(car.vehicleInfo());  //This vehicle is a Renault Espace has 4 wheels, an engine with 4 cylinders and is owned by Pedro
	}
}



