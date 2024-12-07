
public class Bicycle extends LandVehicle {
  private boolean hasBasket;
  private boolean hasBell;
                  
  /**
   * @param brand
   * @param model
   * @param price
   * @param landVelocity
   * @param numberOfWheels
   * @param hasBasket
   * @param hasBell
   */
  public Bicycle(String brand, String model, float price, float landVelocity, int numberOfWheels, boolean hasBasket,
      boolean hasBell) {
    super(brand, model, price, landVelocity, numberOfWheels);
    this.hasBasket = hasBasket;
    this.hasBell = hasBell;
  }
  
  /**
   * @return the hasBaskets
   */
  public boolean isHasBasket() {
    return hasBasket;
  }
  
  /**
   * @param hasBasket the hasBasket to set
   */
  public void setHasBasket(boolean hasBasket) {
    this.hasBasket = hasBasket;
  }
  
  /**
   * @return the hasBell
   */
  public boolean isHasBell() {
    return hasBell;
  }
  
  /**
   * @param hasBell the hasBell to set
   */
  public void setHasBell(boolean hasBell) {
    this.hasBell = hasBell;
  }
  
  @Override
  void vehicleInfo() {
    String str = "Bicycle: " + this.getBrand() + " " + this.getModel();
    if (this.hasBasket) {
      str += "with a basket";
    }
    if (this.hasBell) {
      str += " and a bell";
    }
    System.out.println(str);
  }
  
}
