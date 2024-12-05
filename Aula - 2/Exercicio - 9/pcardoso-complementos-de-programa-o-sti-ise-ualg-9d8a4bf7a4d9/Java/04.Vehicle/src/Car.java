// TODO: Auto-generated Javadoc
/**
 * The Class Car.
 *
 * @author pcardoso
 */
public class Car {
  
  Engine engine = new Engine();
                
  /** The car color. */
  Color  carColor;
         
  /** The car brand. */
  String carBrand;
         
  /** The car model. */
  String carModel;
         
  /** The car owner. */
  Person carOwner;
         
  /** The Liters per hundred km. */
  double carConsumption;
         
  /** The car kms. */
  double carKms;
         
  /**
   * Gets the car color.
   *
   * @return the car color
   */
  public Color getCarColor() {
    return carColor;
  }
  
  /**
   * Sets the car color.
   *
   * @param carColor the new car color
   */
  public void setCarColor(Color carColor) {
    this.carColor = carColor;
  }
  
  /**
   * Gets the car brand.
   *
   * @return the car brand
   */
  public String getCarBrand() {
    return carBrand;
  }
  
  /**
   * Sets the car brand.
   *
   * @param carBrand the new car brand
   */
  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }
  
  /**
   * Gets the car model.
   *
   * @return the car model
   */
  public String getCarModel() {
    return carModel;
  }
  
  /**
   * Sets the car model.
   *
   * @param carModel the new car model
   */
  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }
  
  /**
   * Gets the car owner.
   *
   * @return the car owner
   */
  public Person getCarOwner() {
    return carOwner;
  }
  
  /**
   * Sets the car owner.
   *
   * @param carOwner the new car owner
   */
  public void setCarOwner(Person carOwner) {
    this.carOwner = carOwner;
  }
  
  /**
   * Gets the car consumption.
   *
   * @return the car consumption
   */
  public double getCarConsumption() {
    return carConsumption;
  }
  
  /**
   * Sets the car consumption.
   *
   * @param carConsumption the new car consumption
   */
  public void setCarConsumption(double carConsumption) {
    this.carConsumption = carConsumption;
  }
  
  /**
   * Gets the car kms.
   *
   * @return the car kms
   */
  public double getCarKms() {
    return carKms;
  }
  
  /**
   * Sets the car kms.
   *
   * @param carKms the new car kms
   * @return true, if successful
   */
  public boolean setCarKms(double carKms) {
    if (carKms < 0) {
      return false;
    }
    this.carKms = carKms;
    return true;
  }
  
  /**
   * Prints the owner.
   */
  void printOwner() {
    System.out.println(carOwner.getForename() + " " + carOwner.getSurname());
  }
  
  /**
   * Gets the owner.
   *
   * @return the owner
   */
  Person getOwner() {
    return carOwner;
  }
  
  /**
   * Sets the owner.
   *
   * @param carOwnerIn the new owner
   */
  void setOwner(Person carOwnerIn) {
    carOwner = carOwnerIn;
  }
  
  /**
   * Adds kmsIn to the carKms.
   *
   * @param carKms the car kms
   */
  void addKms(double carKms) {
    //The most common reason for using the 'this' keyword is because a 
    //field is shadowed by a method/constructor argument.
    this.carKms += carKms;
  }
  
}
