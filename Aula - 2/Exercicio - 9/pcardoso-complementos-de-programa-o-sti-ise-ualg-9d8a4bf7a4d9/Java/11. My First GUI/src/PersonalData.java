import java.io.Serializable;
import java.util.Vector;

public class PersonalData implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  public int age;
  public Vector<String> hobbies;
  public String name;
  public Boolean notification;
  public String observations;
  public String password;
  public String title;
  public Boolean male; 
  
  public PersonalData(String name, String title, Boolean notification, String password,  Vector<String> hobbies, int age,
      String observations, boolean male) {
    super();
    this.name = name;
    this.title = title;
    this.notification = notification;
    this.password = password;
    this.hobbies = (Vector<String>) hobbies.clone();
    this.age = age;
    this.observations = observations;
    this.male = male;
  }
  

}
