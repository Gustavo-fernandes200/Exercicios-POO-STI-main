

package my;

/**
 * The Class MainProgramDate.
 */
public class mainProgramArray {

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


    for(int i = 0; i <=  15; ++i){
      try {
        numbers[i] = i;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
      }
      System.out.println("hello CP!"); //  now, it gets here!
    }
  }


}

