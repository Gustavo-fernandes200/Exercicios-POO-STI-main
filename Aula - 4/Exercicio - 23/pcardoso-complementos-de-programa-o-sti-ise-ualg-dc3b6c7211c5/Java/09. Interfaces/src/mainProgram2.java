
public class mainProgram2 {
  
  public static void main(String[] args) {
    Car c = new Car("Audi", "A4", 25000.0f, 200, 4, 4);
    Car clone = c.clone();
    
    c.setPrice(30000.0f);
    
    c.vehicleInfo();
    clone.vehicleInfo();
    
  }
  
}
