
public class Person {
  private String birthdate;
  private String name;
                 
  /**
   * @param name
   * @param birthdate
   */
  public Person(String name, String birthdate) {
    super();
    this.name = name;
    this.birthdate = birthdate;
  }
  
  /**
   * @return the birthdate
   */
  public String getBirthdate() {
    return birthdate;
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  
  /**
   * @param birthdate the birthdate to set
   */
  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }
  
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
}
