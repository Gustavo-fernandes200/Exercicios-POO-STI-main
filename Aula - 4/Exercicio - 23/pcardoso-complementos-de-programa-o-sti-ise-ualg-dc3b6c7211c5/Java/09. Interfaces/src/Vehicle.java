
public abstract class Vehicle {
  private String brand;
  private String model;
  private float  price;
                 
  public Vehicle(String brand, String model, float price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }
  
  /**
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }
  
  /**
   * @return the model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * @return the price
   */
  public float getPrice() {
    return price;
  }
  
  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  /**
   * @param model the model to set
   */
  public void setModel(String model) {
    this.model = model;
  }
  
  /**
   * @param price the price to set
   */
  public void setPrice(float price) {
    this.price = price;
  }
  
  abstract void vehicleInfo();
  
}
