
// TODO: Auto-generated Javadoc
/**
 * The Class Program2.
 */
public class Program2 {
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setForename("Margarida");
    p1.setSurname("Herdeiro");
    p1.setAddress("Rua das flores, lote 1, Faro");
    p1.setCC("238921739");
    p1.setPhoneNumber("289800100");
    Car car = new Car();
    car.setOwner(p1);
    System.out.println("The owner of the car is " + car.getOwner().getSurname() + ", " + car.getOwner().getForename());
    
    if (car.setCarKms(-100)) {
      System.out.println("kms setted");
    } else {
      System.out.println("Error while setting kms");
    }
  }
}
