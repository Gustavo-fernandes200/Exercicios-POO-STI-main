
// TODO: Auto-generated Javadoc
/**
 * The Class SaillingBoat.
 */
public class SaillingBoat extends WaterVehicle {
  
  /** The engine. */
  private Engine engine = null;
                        
  /** The number of sails. */
  private int    numberOfSails;
                 
  /**
   * Instantiates a new sailling boat.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param waterVelocity the water velocity
   * @param size the size
   * @param numberOfSails the number of sails
   * @param engine the engine
   */
  public SaillingBoat(Person owner, String brand, String model, int numberOfPassengers, float waterVelocity, int size,
      int numberOfSails, Engine engine) {
    super(owner, brand, model, numberOfPassengers, waterVelocity, size);
    this.numberOfSails = numberOfSails;
    this.engine = engine;
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
   * Gets the number of sails.
   *
   * @return the number of sails
   */
  public int getNumberOfSails() {
    return numberOfSails;
  }
  
  /**
   * Sets the engine.
   *
   * @param engine the new engine
   */
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
  /**
   * Sets the number of sails.
   *
   * @param numberOfSails the new number of sails
   */
  public void setNumberOfSails(int numberOfSails) {
    this.numberOfSails = numberOfSails;
  }
}
