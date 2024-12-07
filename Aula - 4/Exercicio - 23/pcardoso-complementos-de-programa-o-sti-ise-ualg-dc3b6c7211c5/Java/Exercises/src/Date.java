
// TODO: Auto-generated Javadoc
/**
 * The Class Data.
 */
public class Date {
  
  /** The day. */
  int day;
      
  /** The mes. */
  int month;
      
  /** The ano. */
  int year;
      
  /**
   * Gets the dia.
   *
   * @return the dia
   */
  public int getDay() {
    return day;
  }
  
  /**
   * Sets the dia. Basic validation (1 <= dia <= 31)
   *
   * @param day the day
   * @return true, if successful
   */
  public boolean setDay(int day) {
    if (day > 31 || day < 1) {
      return false;
    }
    this.day = day;
    return true;
  }
  
  /**
   * Gets the month.
   *
   * @return the month
   */
  public int getMonth() {
    return month;
  }
  
  /**
   * Sets the month.
   *
   * @param month the new month
   */
  public boolean setMonth(int month) {
    if (month > 12) {
      return false;
    }
    this.month = month;
    return true;
  }
  
  /**
   * Gets the year.
   *
   * @return the year
   */
  public int getYear() {
    return year;
  }
  
  /**
   * Sets the year. (>= 2000)
   *
   * @param year the new year
   */
  public boolean setYear(int year) {
    if (year < 2000)
      return false;
    this.year = year;
    return true;
  }
  
  /**
   * Sets the date.
   *
   * @param day the day
   * @param month the month
   * @param year the year
   * @return true, if successful
   */
  public boolean setDate(int day, int month, int year) {
    if (this.setDay(day) && this.setMonth(month) && this.setYear(year))
      return true;
    return false;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return day + "/" + month + "/" + year;
  }
  
}
