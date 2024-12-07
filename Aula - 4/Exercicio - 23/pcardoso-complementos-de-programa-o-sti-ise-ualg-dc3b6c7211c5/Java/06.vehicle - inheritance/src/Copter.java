
// TODO: Auto-generated Javadoc
/**
 * The Class Multicopter.
 */
public class Copter extends AirVehicle {
  
  /** The number of rotors. */
  private int numberOfRotors;
  private Engine engine; 
  
  /**
   * Instantiates a new multicopter.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param airVelocity the air velocity
   * @param numberOfRotors the number of rotors
   */
  public Copter(Person owner, String brand, String model, int numberOfPassengers, float airVelocity,
      int numberOfRotors, Engine engine) {
    super(owner, brand, model, numberOfPassengers, airVelocity);
    this.numberOfRotors = numberOfRotors;
    this.engine = engine;
  }
  
  /**
   * Gets the number of rotors.
   *
   * @return the number of rotors
   */
  public int getNumberOfRotors() {
    return numberOfRotors;
  }
  
  /**
   * Sets the number of rotors.
   *
   * @param numberOfRotors the new number of rotors
   */
  public void setNumberOfRotors(int numberOfRotors) {
    this.numberOfRotors = numberOfRotors;
  }
  

  /* (non-Javadoc)
   * @see Vehicle#vehicleInfo()
   */
  @Override
  public String vehicleInfo(){
    return "This vehicle is a " + this.getBrand() + " " + this.getModel() 
    + " has "+ this.getNumberOfRotors() + " rotors, an engine with "
    + this.getEngine().getNumberCylinders() + " cylinders and is owned by " + this.getOwner().getName();
  }

  /**
   * Gets the engine.
   *
   * @return the engine
   */
  public Engine getEngine() {
    return engine;
  }

  /**
   * @param engine the engine to set
   */
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
}
