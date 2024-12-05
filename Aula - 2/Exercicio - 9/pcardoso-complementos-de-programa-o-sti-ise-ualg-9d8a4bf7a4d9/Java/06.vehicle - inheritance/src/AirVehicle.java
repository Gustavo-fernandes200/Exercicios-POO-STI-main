
// TODO: Auto-generated Javadoc
/**
 * The Class AirVehicle.
 */
public class AirVehicle extends Vehicle {
  
  /** The air velocity. */
  private float airVelocity;
  
  /**
   * Instantiates a new air vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param airVelocity the air velocity
   */
  public AirVehicle(Person owner, String brand, String model, int numberOfPassengers, float airVelocity) {
    super(owner, brand, model, numberOfPassengers);
    this.airVelocity = airVelocity;
  }
  
  /**
   * Gets the air velocity.
   *
   * @return the air velocity
   */
  public float getAirVelocity() {
    return airVelocity;
  }
  
  /**
   * Sets the air velocity.
   *
   * @param airVelocity the new air velocity
   */
  public void setAirVelocity(float airVelocity) {
    this.airVelocity = airVelocity;
  }
}
