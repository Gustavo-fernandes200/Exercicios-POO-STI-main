
public class MainProgram {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Person seller = new Person("Pedro", "1992/10/12");
    Engine engine = new Engine("Diesel", 90f, 4);
    Wheel wheel = new Wheel("R", 55, 95, 65, "V", 215);
    Car car = new Car(seller, "Renault", "Espace", 7, 187f, wheel, 4, engine, 5);
    Person buyer = new Person("Margarida","1998/12/12");
    
    System.out.println(car);
    
    car.setOwner(buyer);
    System.out.println(car);
    
    SaillingBoat sb = new SaillingBoat(seller, "Faro Yachts" , "Adventure", 5, 30f, 15, 1, null);
    
  }
  
}
