
public abstract class LandVehicle extends Vehicle {
  private float landVelocity;
  private int   numberOfWheels;
                
  public LandVehicle(String brand, String model, float price, float landVelocity, int numberOfWheels) {
    super(brand, model, price);
    this.landVelocity = landVelocity;
    this.numberOfWheels = numberOfWheels;
  }
  
  /**
   * @return the landVelocity
   */
  public float getLandVelocity() {
    return landVelocity;
  }
  
  /**
   * @return the numberOfWheels
   */
  public int getNumberOfWheels() {
    return numberOfWheels;
  }
  
  /**
   * @param landVelocity the landVelocity to set
   */
  public void setLandVelocity(float landVelocity) {
    this.landVelocity = landVelocity;
  }
  
  /**
   * @param numberOfWheels the numberOfWheels to set
   */
  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }
  
}
