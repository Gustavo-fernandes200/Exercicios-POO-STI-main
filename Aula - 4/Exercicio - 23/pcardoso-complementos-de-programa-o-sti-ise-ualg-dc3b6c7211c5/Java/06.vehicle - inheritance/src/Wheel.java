
// TODO: Auto-generated Javadoc
public class Wheel {
  
  /** The construction. */
  private String construction; //e.g., R -radial, B -Bias 
                 
  /** The height. */
  private int    height;
                 
  /** The load index. */
  private int    loadIndex;
                 
  /**
   * Instantiates a new wheel.
   *
   * @param construction the construction
   * @param height the height
   * @param loadIndex the load index
   * @param rimDiameter the rim diameter
   * @param speedRating the speed rating
   * @param width the width
   */
  public Wheel(String construction, int height, int loadIndex, int rimDiameter, String speedRating, int width) {
    super();
    this.construction = construction;
    this.height = height;
    this.loadIndex = loadIndex;
    this.rimDiameter = rimDiameter;
    this.speedRating = speedRating;
    this.width = width;
  }
  
  /** The rim diameter. */
  private int    rimDiameter;
                 
  /** The speed rating. */
  private String speedRating; //e.g., V	
                 
  /** The width. */
  private int    width;
                 
  /**
   * Gets the construction.
   *
   * @return the construction
   */
  public String getConstruction() {
    return construction;
  }
  
  /**
   * Gets the height.
   *
   * @return the height
   */
  public int getHeight() {
    return height;
  }
  
  /**
   * Gets the load index.
   *
   * @return the load index
   */
  public int getLoadIndex() {
    return loadIndex;
  }
  
  /**
   * Gets the rim diameter.
   *
   * @return the rim diameter
   */
  public int getRimDiameter() {
    return rimDiameter;
  }
  
  /**
   * Gets the speed rating.
   *
   * @return the speed rating
   */
  public String getSpeedRating() {
    return speedRating;
  }
  
  /**
   * Gets the width.
   *
   * @return the width
   */
  public int getWidth() {
    return width;
  }
  
  /**
   * Sets the construction.
   *
   * @param construction the new construction
   */
  public void setConstruction(String construction) {
    this.construction = construction;
  }
  
  /**
   * Sets the height.
   *
   * @param height the new height
   */
  public void setHeight(int height) {
    this.height = height;
  }
  
  /**
   * Sets the load index.
   *
   * @param loadIndex the new load index
   */
  public void setLoadIndex(int loadIndex) {
    this.loadIndex = loadIndex;
  }
  
  /**
   * Sets the rim diameter.
   *
   * @param rimDiameter the new rim diameter
   */
  public void setRimDiameter(int rimDiameter) {
    this.rimDiameter = rimDiameter;
  }
  
  /**
   * Sets the speed rating.
   *
   * @param speedRating the new speed rating
   */
  public void setSpeedRating(String speedRating) {
    this.speedRating = speedRating;
  }
  
  /**
   * Sets the width.
   *
   * @param width the new width
   */
  public void setWidth(int width) {
    this.width = width;
  }
  
}
