
public class RowBoat extends WaterVehicle {
  private int numberOfRows;
  
  /**
   * @param brand
   * @param model
   * @param price
   * @param waterVelocity
   * @param numberOfRows
   */
  public RowBoat(String brand, String model, float price, float waterVelocity, int numberOfRows) {
    super(brand, model, price, waterVelocity);
    this.numberOfRows = numberOfRows;
  }
  
  @Override
  void vehicleInfo() {
    System.out
        .println("Row boat: " + this.getBrand() + " " + this.getModel() + " with " + this.numberOfRows + " row(s)");
  }
}
