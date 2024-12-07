
// TODO: Auto-generated Javadoc
/**
 * The Class Engine.
 */
public class Engine {
  /** The fuel. */
  private String fuel;
                 
  /** The horsepower. */
  private float  horsepower;
                 
  /** The number cylinders. */
  private int    numberCylinders;
                 
  /**
   * Instantiates a new engine.
   *
   * @param fuel the fuel
   * @param horsepower the horsepower
   * @param numberCylinders the number cylinders
   */
  public Engine(String fuel, float horsepower, int numberCylinders) {
    super();
    this.setFuel(fuel);
    this.setHorsepower(horsepower);
    this.setNumberCylinders(numberCylinders);
  }
  
  int getNumberCylinders() {
    return numberCylinders;
  }
  
  void setNumberCylinders(int numberCylinders) {
    this.numberCylinders = numberCylinders;
  }
  
  float getHorsepower() {
    return horsepower;
  }
  
  void setHorsepower(float horsepower) {
    this.horsepower = horsepower;
  }
  
  String getFuel() {
    return fuel;
  }
  
  void setFuel(String fuel) {
    this.fuel = fuel;
  }
  
}
