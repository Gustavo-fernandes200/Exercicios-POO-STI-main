
// TODO: Auto-generated Javadoc
/**
 * The Class WaterVehicle.
 */
public class WaterVehicle extends Vehicle {
  
  /** The water velocity. */
  private float waterVelocity;
                
  /** The size. */
  private int   size;
                
  /**
   * Instantiates a new water vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param waterVelocity the water velocity
   * @param size the size
   */
  public WaterVehicle(Person owner, String brand, String model, int numberOfPassengers, float waterVelocity, int size) {
    super(owner, brand, model, numberOfPassengers);
    this.waterVelocity = waterVelocity;
    this.size = size;
  }
  
  /**
   * Gets the water velocity.
   *
   * @return the water velocity
   */
  public float getWaterVelocity() {
    return waterVelocity;
  }
  
  /**
   * Sets the water velocity.
   *
   * @param waterVelocity the new water velocity
   */
  public void setWaterVelocity(float waterVelocity) {
    this.waterVelocity = waterVelocity;
  }
  
  /**
   * Gets the size.
   *
   * @return the size
   */
  public int getSize() {
    return size;
  }
  
  /**
   * Sets the size.
   *
   * @param size the new size
   */
  public void setSize(int size) {
    this.size = size;
  }
}
