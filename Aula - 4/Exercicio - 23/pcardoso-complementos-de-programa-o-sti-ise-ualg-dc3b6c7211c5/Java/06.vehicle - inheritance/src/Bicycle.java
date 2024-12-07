
// TODO: Auto-generated Javadoc
/**
 * The Class Bicycle.
 */
public class Bicycle extends LandVehicle {
  
  /** The number of gears. */
  private int numberOfGears;
  
  /**
   * Instantiates a new bicycle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param landVelocity the land velocity
   * @param wheels the wheels
   * @param numberOfWheels the number of wheels
   * @param numberOfGears the number of gears
   */
  public Bicycle(Person owner, String brand, String model, int numberOfPassengers, float landVelocity, Wheel wheels,
      int numberOfWheels, int numberOfGears) {
    super(owner, brand, model, numberOfPassengers, landVelocity, wheels, numberOfWheels);
    this.numberOfGears = numberOfGears;
  }
  
  /**
   * Gets the number of gears.
   *
   * @return the number of gears
   */
  public int getNumberOfGears() {
    return numberOfGears;
  }
  
  /**
   * Sets the number of gears.
   *
   * @param numberOfGears the new number of gears
   */
  public void setNumberOfGears(int numberOfGears) {
    this.numberOfGears = numberOfGears;
  }
  
}
