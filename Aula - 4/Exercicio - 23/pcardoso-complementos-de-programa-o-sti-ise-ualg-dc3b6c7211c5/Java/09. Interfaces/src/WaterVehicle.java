
public abstract class WaterVehicle extends Vehicle {
  private float waterVelocity;
  
  /**
   * @param brand
   * @param model
   * @param price
   * @param waterVelocity
   */
  public WaterVehicle(String brand, String model, float price, float waterVelocity) {
    super(brand, model, price);
    this.waterVelocity = waterVelocity;
  }
  
  /**
   * @return the waterVelocity
   */
  public float getWaterVelocity() {
    return waterVelocity;
  }
  
  /**
   * @param waterVelocity the waterVelocity to set
   */
  public void setWaterVelocity(float waterVelocity) {
    this.waterVelocity = waterVelocity;
  }
}
