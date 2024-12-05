
// TODO: Auto-generated Javadoc
/**
 * The Class Color.
 */
public class Color {
  
  /** The color name. */
  String colorName;
         
  /** The r. */
  int    r;
         
  /** The g. */
  int    g;
         
  /** The b. */
  int    b;
         
  /**
   * Gets the color name.
   *
   * @return the color name
   */
  public String getColorName() {
    return colorName;
  }
  
  /**
   * Sets the color name.
   *
   * @param colorName the new color name
   */
  public void setColorName(String colorName) {
    this.colorName = colorName;
  }
  
  /**
   * Gets the RGB of color.
   *
   * @return the [r,g,b]
   */
  public int[] getRGB() {
    int[] rgb = { r, g, b };
    return rgb;
  }
  
  /**
   * Sets the rgb.
   *
   * @param r the r
   * @param g the g
   * @param b the b
   */
  public void setRGB(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }
  
}
