package my;

/**
 * The Class Date.
 */
// TODO: Auto-generated Javadoc
public class Date {
  
  /**
   * Checks if is valid.
   *
   * @param day the day
   * @param month the month
   * @param year the year
   * @return true, if is valid
   */
  public static boolean isValid(int day, int month, int year) {
    return true;
    // ....
    // return false;
  }
  
  /** The dia. */
  private int day;
  
  /** The mes. */
  private int month;
  
  /** The ano. */
  private int year;
  
  /**
   * Instantiates a new date.
   *
   * @param day the day
   * @param month the month
   * @param year the year
   */
  public Date(int day, int month, int year) {
    super();
    //keep this order to check data validity according with the year (leap or not)  
    setYear(year);
    setMonth(month);
    setDay(day);
  }
  
  /**
   * Gets the dia.
   *
   * @return the dia
   */
  public int getDay() {
    return day;
  }
  
  /**
   * Gets the mes.
   *
   * @return the mes
   */
  public int getMonth() {
    return month;
  }
  
  /**
   * Gets the ano.
   *
   * @return the ano
   */
  public int getYear() {
    return year;
  }
  
  /**
   * next day.
   */
  public void nextDay() {
    this.day++;
    
    // 31 days month
    if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 
        || this.month == 10 || this.month == 12) {
      if (this.day > 31) {
        if (this.month == 12) {
          this.month = 1;
          this.year++;
        } else {
          this.month++;
        }
        this.day = 1;
      }
      return;
    }
    // 30 days month
    if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
      if (day > 30) {
        this.day = 1;
        this.month++;
      }
      return;
    }
    
    // if I get here, the month must be feb (2)
    // is it leap year?
    if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))) {
      if (day > 29) {
        this.day = 1;
        this.month++;
        return;
      }
    } else {
      if (day > 28) {
        this.day = 1;
        this.month++;
        return;
      }
    }
  }
  
  /**
   * Sets the dia.
   *
   * @param day
   *          the new dia
   */
  public void setDay(int day) {
    this.day = day;
    
    if (day < 1) {
      System.out.println("dia inválido: definido como 1");
      this.day = 1;
      return;
    }
    
    // mes com 31 dias
    if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10
        || this.month == 12) {
      if (day > 31) {
        System.out.println("dia inválido: definido como 31");
        this.day = 31;
      }
      return;
    }
    // mes com 30 dias
    if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
      if (day > 30) {
        System.out.println("dia inválido: definido como 30");
        this.day = 30;
      }
      return;
    }
    
    if (this.month == 2) { // verificação desnecessária!
      // ano bissexto?
      if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))) {
        if (day > 29) {
          System.out.println("dia inválido: definido como 29");
          this.day = 29;
          return;
        }
      } else {
        if (day > 28) {
          System.out.println("dia inválido: definido como 28");
          this.day = 28;
          return;
        }
      }
    }
    
  }
  
  /**
   * Sets the mes.
   *
   * @param month
   *          the new mes
   */
  public void setMonth(int month) {
    if (month < 1) {
      System.out.println("mês inválido: definido como 1");
      this.month = 1;
      return;
    }
    
    if (month > 12) {
      System.out.println("mês inválido: definido como 12");
      this.month = 12;
      return;
    }
    
    this.month = month;
  }
  
  /**
   * Sets the ano.
   *
   * @param year
   *          the new ano
   */
  public void setYear(int year) {
    this.year = year;
    // TODO: check if day is valid (leap year)
  }
  
  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return this.year + "/" + this.month + "/" + this.day;
  }
  
}
