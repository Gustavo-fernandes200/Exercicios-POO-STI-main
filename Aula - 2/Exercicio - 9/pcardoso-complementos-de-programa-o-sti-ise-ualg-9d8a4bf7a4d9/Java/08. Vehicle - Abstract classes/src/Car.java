
// TODO: Auto-generated Javadoc
/**
 * The Class Car.
 */
public class Car extends LandVehicle {
  
  /**  The total filled fuel. */
  private double filledFuel;
                 
  /** The total car kms. */
  private double kms;
                 
  /** The number of doors. */
  private int    numberOfDoors;
                 
  /**
   * Instantiates a new car.
   *
   * @param owner the owner
   * @param brand the brand
   * @param model the model
   * @param numberOfPassengers the number of passengers
   * @param landVelocity the land velocity
   * @param numberOfWheels the number of wheels
   * @param numberOfDoors the number of doors
   */
  public Car(Person owner, String brand, String model, int numberOfPassengers, float landVelocity, int numberOfWheels,
      int numberOfDoors) {
    super(owner, brand, model, numberOfPassengers, landVelocity, numberOfWheels);
    
    this.numberOfDoors = numberOfDoors;
  }
  
  /**
   * the average consumption (l/100km) of the vehicle in its life.
   *
   * @return the double
   */
  public double consumption() {
    return this.filledFuel / this.kms * 100;
  }
  
  /**
   * Estimated consumption when doing kms kilometers.
   *
   * @param kms the kms
   * @return the double
   */
  public double consumption(double kms) {
    return this.filledFuel / this.kms * kms;
  }
  
  /**
   * Expected consumption when doing kms kilometers applied a given load factor.
   *
   * @param kms the kms
   * @param loadFactor the load factor
   * @return the double
   */
  public double consumption(double kms, double loadFactor) {
    return this.filledFuel / this.kms * kms * loadFactor;
  }
  
  /**
   * Gets the car consumption.
   *
   * @return the car consumption
   */
  public double getFilledFuel() {
    return filledFuel;
  }
  
  /**
   * Gets the car kms.
   *
   * @return the car kms
   */
  public double getKms() {
    return kms;
  }
  
  /**
   * Gets the number of doors.
   *
   * @return the number of doors
   */
  public int getNumberOfDoors() {
    return numberOfDoors;
  }
  
  /**
   * Sets the car consumption.
   *
   * @param carConsumption the new car consumption
   */
  public void setFilledFuel(double carConsumption) {
    this.filledFuel = carConsumption;
  }
  
  /**
   * Sets the car kms.
   *
   * @param carKms the new car kms
   */
  public void setKms(double carKms) {
    this.kms = carKms;
  }
  
  /**
   * Sets the number of doors.
   *
   * @param numberOfDoors the new number of doors
   */
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }
  
  /* (non-Javadoc)
   * @see LandVehicle#vehicleInfo()
   */
  public String vehicleInfo() {
    return "This vehicle is a " + this.getBrand() + " " + this.getModel() + " has " + this.getNumberOfWheels()
        + " wheels and is owned by " + this.getOwner().getName();
  }
  
}
