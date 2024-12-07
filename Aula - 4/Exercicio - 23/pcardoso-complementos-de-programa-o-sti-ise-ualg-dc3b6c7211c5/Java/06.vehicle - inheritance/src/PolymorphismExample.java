
public class PolymorphismExample {
  
  public static void main(String[] args) {
    Person owner = new Person("Pedro", "1992/10/12");

    Vehicle vehicles[] = new Vehicle[3];
    
    vehicles[0] = new Car(owner, "Renault", "Espace", 7, 186f, new Wheel("R", 55, 95, 65, "V", 215), 4, new Engine("Diesel", 90f, 4), 5);
    vehicles[1] = new MotorBoat(owner, "Riamar", "430LX", 5, 45f, 424, new Engine("Gasolina", 50f, 1));
    vehicles[2] = new Copter(owner, "EUROCOPTER", "AS350 B3 ESQUILO", 6, 200, 1, new Engine("gasolina", 300, 4));
    
    for (Vehicle vehicle : vehicles) {
        System.out.println(vehicle.vehicleInfo());    
    }
  }
  
}
