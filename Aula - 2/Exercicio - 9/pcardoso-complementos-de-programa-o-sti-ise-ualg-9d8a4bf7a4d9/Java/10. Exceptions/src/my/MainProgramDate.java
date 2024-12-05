package my;

 /**
 * The Class MainProgramDate.
 */
public class MainProgramDate {
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(final String[] args) {
    int numbers[] = new int[10];

    try {
      numbers[1] = 1;
      numbers[10] = 10;
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("hello CP!"); // doesn't get here!
    //    System.out.println(1/0);
    //    System.out.println("hello CP!"); // doesn't get here!
    //      Date d = new Date(1,4,2016);
    //      Date d2 = new Date(30, 2, 2016) ; //!!!
  }
}
