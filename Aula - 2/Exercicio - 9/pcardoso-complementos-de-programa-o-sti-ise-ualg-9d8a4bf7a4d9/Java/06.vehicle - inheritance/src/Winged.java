
// TODO: Auto-generated Javadoc
/**
 * The Class Winged.
 */
public class Winged extends AirVehicle {
  
  /** The number of wings. */
  private int numberOfWings;
  
  /**
   * Instantiates a new winged.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param airVelocity the air velocity
   * @param numberOfWings the number of wings
   */
  public Winged(Person owner, String brand, String model, int numberOfPassengers, float airVelocity,
      int numberOfWings) {
    super(owner, brand, model, numberOfPassengers, airVelocity);
    this.numberOfWings = numberOfWings;
  }
  
  /**
   * Gets the number of wings.
   *
   * @return the number of wings
   */
  public int getNumberOfWings() {
    return numberOfWings;
  }
  
  /**
   * Sets the number of wings.
   *
   * @param numberOfWings the new number of wings
   */
  public void setNumberOfWings(int numberOfWings) {
    this.numberOfWings = numberOfWings;
  }
  
}
