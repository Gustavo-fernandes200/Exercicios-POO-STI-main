
// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public class Employee {
  
  /** The name. */
  String name;
         
  /** The departament. */
  String departament;
         
  /** The salary. */
  double salary;
         
  /** The entrance date. */
  Date   entranceDate;
         
  /** The cc number. */
  String ccNumber;
         
  /** The phone number. */
  String phoneNumber;
         
  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * Gets the departament.
   *
   * @return the departament
   */
  public String getDepartament() {
    return departament;
  }
  
  /**
   * Sets the departament.
   *
   * @param departament the new departament
   */
  public void setDepartament(String departament) {
    this.departament = departament;
  }
  
  /**
   * Gets the salary.
   *
   * @return the salary
   */
  public double getSalary() {
    return salary;
  }
  
  /**
   * Sets the salary.
   *
   * @param salary the new salary
   */
  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  /**
   * Gets the entrance date.
   *
   * @return the entrance date
   */
  public Date getEntranceDate() {
    return entranceDate;
  }
  
  /**
   * Sets the entrance date.
   *
   * @param entranceDate the new entrance date
   */
  public void setEntranceDate(Date entranceDate) {
    this.entranceDate = entranceDate;
  }
  
  /**
   * Gets the cc number.
   *
   * @return the cc number
   */
  public String getCcNumber() {
    return ccNumber;
  }
  
  /**
   * Sets the cc number.
   *
   * @param ccNumber the new cc number
   */
  public void setCcNumber(String ccNumber) {
    this.ccNumber = ccNumber;
  }
  
  /**
   * Gets the phone number.
   *
   * @return the phone number
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /**
   * Sets the phone number.
   *
   * @param phoneNumber the new phone number
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public void print() {
    System.out.println("Name: " + this.getName());
    System.out.println("CC: " + this.getCcNumber());
    System.out.println("Department: " + this.getDepartament());
    System.out.println("Phone number: " + this.getPhoneNumber());
    System.out.println("Salary: " + this.getSalary());
    System.out.println("Entrance date: " + this.getEntranceDate().toString());
  }
  
}
