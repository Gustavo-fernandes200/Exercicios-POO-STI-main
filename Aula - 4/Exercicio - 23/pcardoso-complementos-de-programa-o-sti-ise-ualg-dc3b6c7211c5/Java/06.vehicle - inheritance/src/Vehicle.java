
// TODO: Auto-generated Javadoc
/**
 * The Class Vehicle.
 */
public class Vehicle {
  
  /** The brand. */
  private String brand;
                 
  /** The model. */
  private String model;
                 
  /** The number of passengers. */
  private int    numberOfPassengers;
                 
  /** The owner. */
  private Person owner;
                 
  /**
   * Instantiates a new vehicle.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   */
  public Vehicle(Person owner, String brand, String model, int numberOfPassengers) {
    super();
    this.owner = owner;
    this.brand = brand;
    this.model = model;
    this.numberOfPassengers = numberOfPassengers;
  }
  
  /**
   * Instantiates a new vehicle.
   *
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   */
  public Vehicle(String brand, String model, int numberOfPassengers) {
    super();
    this.brand = brand;
    this.model = model;
    this.numberOfPassengers = numberOfPassengers;
  }
  
  /**
   * Gets the brand.
   *
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }
  
  /**
   * Gets the model.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * Gets the number of passengers.
   *
   * @return the number of passengers
   */
  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }
  
  /**
   * Gets the owner.
   *
   * @return the owner
   */
  public Person getOwner() {
    return owner;
  }
  
  /**
   * Sets the brand.
   *
   * @param brand the new brand
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  /**
   * Sets the model.
   *
   * @param model the new model
   */
  public void setModel(String model) {
    this.model = model;
  }
  
  /**
   * Sets the number of passengers.
   *
   * @param numberOfPassengers the new number of passengers
   */
  public void setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }
  
  /**
   * Sets the owner.
   *
   * @param owner the new owner
   */
  public void setOwner(Person owner) {
    this.owner = owner;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return "This " + this.getBrand() + " " + this.getModel() + " is owned by " + this.getOwner().getName();
  }
  
  public String vehicleInfo(){
	  return "This vehicle is a " + this.getBrand() + " " + this.getModel() + " owned by " + this.getOwner().getName();
  }
  
}
