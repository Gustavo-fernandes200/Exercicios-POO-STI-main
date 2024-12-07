package my;
public class mainProgramDivisionByZero {
  public static void main(String[] args) {
    
//    try {
//      System.out.println(1/0);
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    System.out.println("hello CP!"); //  now, it gets here!

    
    try {
      System.out.println(1/0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
    System.out.println("hello CP!"); //  now, it gets here!
  }
}
