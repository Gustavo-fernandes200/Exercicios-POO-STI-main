package my;

import java.util.Random;

public class mainProgramMultiCatchMyThrow {
  
  public static void main(String[] args) {
        try{
          myLog(0);
        }catch(IllegalArgumentException e){
          System.out.println(e);
        }
  }
  
  public static void myLog(double x) {
    if ( x < 0.0)   throw new IllegalArgumentException("argument is a negative value");
    if (x == 0.0)   throw new IllegalArgumentException("argument is zero");
    System.out.println(Math.log(x));    
  }  
}
