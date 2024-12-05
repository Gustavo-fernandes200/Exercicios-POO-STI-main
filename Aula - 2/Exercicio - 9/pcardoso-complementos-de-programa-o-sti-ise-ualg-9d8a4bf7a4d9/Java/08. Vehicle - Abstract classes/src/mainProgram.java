
public class mainProgram {
  
  public static void main(String[] args) {
    Person owner = new Person("Margarida", "1998/12/12");
    
    Vehicle v;
    LandVehicle lv;
    Car c;
    
    // v = new Vehicle(owner, "Audi", "A4", 5); //ERROR: Cannot instantiate the type Vehicle
    // lv = new LandVehicle(owner, "Audi", "A4", 5, 200, 4); // ERRO: Cannot instantiate the type LandVehicle
    
    c = new Car(owner, "Audi", "A4", 5, 200, 4, 5);
    v = new Car(owner, "Audi", "A4", 5, 200, 4, 5);
    lv = new Car(owner, "Audi", "A4", 5, 200, 4, 5);
    
    System.out.println(v.vehicleInfo());
    System.out.println(lv.vehicleInfo());
    System.out.println(c.vehicleInfo());
  }
}