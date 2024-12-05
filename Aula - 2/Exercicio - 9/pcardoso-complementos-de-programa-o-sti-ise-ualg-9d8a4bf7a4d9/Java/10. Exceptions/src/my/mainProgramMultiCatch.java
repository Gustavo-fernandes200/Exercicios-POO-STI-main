package my;

import java.util.Random;

public class mainProgramMultiCatch {
  
  public static void doThings() throws ArrayIndexOutOfBoundsException, ArithmeticException{
    int x;
    if ((new Random()).nextDouble() < 0.5){
      x = 1 / 0;
    }else{
      int l[] = new int[2];
      x = l[10];
    }    
    System.out.println(x);
  }
  
  public static void main(String[] args) {
      try{
        doThings();
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("you tried to acess an invalid index");
      }catch(ArithmeticException e){
        System.out.println("you tried a division by zero");        
      }
      System.out.println("over and out!");
  }
  
}
