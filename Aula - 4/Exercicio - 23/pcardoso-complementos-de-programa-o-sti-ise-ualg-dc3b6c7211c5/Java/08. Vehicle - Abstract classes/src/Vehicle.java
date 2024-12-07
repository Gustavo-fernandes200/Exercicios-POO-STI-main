// TODO: Auto-generated Javadoc
/**
 * The Class Vehicle.
 */
abstract class Vehicle {
  
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
  
  public String getBrand() {
    return brand;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getNumberOfPassengers() {
    return numberOfPassengers;
  }
  
  public Person getOwner() {
    return owner;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
  public void setNumberOfPassengers(int numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }
  
  public void setOwner(Person owner) {
    this.owner = owner;
  }
  
  /**
   * Vehicle info.
   *
   * @return the string
   */
  abstract String vehicleInfo();
  
}
