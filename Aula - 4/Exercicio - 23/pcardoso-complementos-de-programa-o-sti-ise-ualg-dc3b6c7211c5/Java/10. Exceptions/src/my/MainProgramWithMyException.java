package my;

import java.util.Scanner;

public class MainProgramWithMyException {
  
  public static void access(){
    System.out.println("Insert PIN:");
    Scanner scanner = new Scanner(System.in);
    int pin = scanner.nextInt();
    scanner.close();
    if (pin != 1234){
      throw new AccessErrorException("Someone typed a wrong PIN 3 times");
    }
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    try{
      access();
      System.out.println("you are in!");
    }catch(AccessErrorException e){
      e.sendEmail();
      System.out.println("PIN error! you can run but you can't hide!");
    }    
  }  
}
