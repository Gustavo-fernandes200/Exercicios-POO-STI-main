
// TODO: Auto-generated Javadoc
/**
 * The Class LandVehicle.
 */
abstract class LandVehicle extends Vehicle {
  
  /** The land velocity. */
  private float landVelocity;
                
  /** The number of wheels. */
  private int   numberOfWheels;
                
  /**
   * Instantiates a new land vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param landVelocity the land velocity
   * @param numberOfWheels the number of wheels
   */
  public LandVehicle(Person owner, String brand, String model, int numberOfPassengers, float landVelocity,
      int numberOfWheels) {
    super(owner, brand, model, numberOfPassengers);
    this.landVelocity = landVelocity;
    this.numberOfWheels = numberOfWheels;
  }
  
  /**
   * Instantiates a new land vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param numberOfWheels the number of wheels
   */
  public LandVehicle(Person owner, String brand, String model, int numberOfPassengers, int numberOfWheels) {
    super(owner, brand, model, numberOfPassengers);
    
    this.numberOfWheels = numberOfWheels;
  }
  
  public float getLandVelocity() {
    return landVelocity;
  }
  
  public int getNumberOfWheels() {
    return numberOfWheels;
  }
  
  public void setLandVelocity(float landVelocity) {
    this.landVelocity = landVelocity;
  }
  
  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }
  
  /* (non-Javadoc)
   * @see Vehicle#vehicleInfo()
   */
  abstract String vehicleInfo();
}
