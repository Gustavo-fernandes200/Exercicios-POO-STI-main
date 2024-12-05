
// TODO: Auto-generated Javadoc
/**
 * The Class LandVehicle.
 */
public class LandVehicle extends Vehicle {
  
  /** The land velocity. */
  private float landVelocity;
                
  /** The number of wheels. */
  private int   numberOfWheels;
                
  /** The wheels. */
  private Wheel wheels;
                
  /**
   * Instantiates a new land vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param landVelocity the land velocity
   * @param wheels the wheels
   * @param numberOfWheels the number of wheels
   */
  public LandVehicle(Person owner, String brand, String model, int numberOfPassengers, float landVelocity, Wheel wheels,
      int numberOfWheels) {
    super(owner, brand, model, numberOfPassengers);
    this.landVelocity = landVelocity;
    this.wheels = wheels;
    this.numberOfWheels = numberOfWheels;
  }
  
  /**
   * Instantiates a new land vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param wheels the wheels
   * @param numberOfWheels the number of wheels
   */
  public LandVehicle(Person owner, String brand, String model, int numberOfPassengers, Wheel wheels,
      int numberOfWheels) {
    super(owner, brand, model, numberOfPassengers);
    this.wheels = wheels;
    this.numberOfWheels = numberOfWheels;
  }
  
  /**
   * Gets the land velocity.
   *
   * @return the land velocity
   */
  public float getLandVelocity() {
    return landVelocity;
  }
  
  /**
   * Gets the number of wheels.
   *
   * @return the number of wheels
   */
  public int getNumberOfWheels() {
    return numberOfWheels;
  }
  
  /**
   * Gets the wheels.
   *
   * @return the wheels
   */
  public Wheel getWheels() {
    return wheels;
  }
  
  /**
   * Sets the land velocity.
   *
   * @param landVelocity the new land velocity
   */
  public void setLandVelocity(float landVelocity) {
    this.landVelocity = landVelocity;
  }
  
  /**
   * Sets the number of wheels.
   *
   * @param numberOfWheels the new number of wheels
   */
  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }
  
  /**
   * Sets the wheels.
   *
   * @param wheels the new wheels
   */
  public void setWheels(Wheel wheels) {
    this.wheels = wheels;
  }
  
  @Override 
  public String vehicleInfo(){
	  return "This vehicle is a " + this.getBrand() + " " + this.getModel() 
	  	+ " has "+ this.getNumberOfWheels() + " wheels and is "
	  	+ "owned by " + this.getOwner().getName();
  }

}
