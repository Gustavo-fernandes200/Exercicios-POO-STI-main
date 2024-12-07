
// TODO: Auto-generated Javadoc
/**
 * The Class MotorBoat.
 */
public class MotorBoat extends WaterVehicle {
  
  /** The engine. */
  private Engine engine;
  
  /**
   * Instantiates a new motor boat.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param waterVelocity the water velocity
   * @param size the size
   * @param engine the engine
   */
  public MotorBoat(Person owner, String brand, String model, int numberOfPassengers, float waterVelocity, int size,
      Engine engine) {
    super(owner, brand, model, numberOfPassengers, waterVelocity, size);
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
   * Sets the engine.
   *
   * @param engine the new engine
   */
  public void setEngine(Engine engine) {
    this.engine = engine;
  }
  
}
