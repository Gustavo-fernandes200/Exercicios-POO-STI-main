package my;

public class AccessErrorException extends RuntimeException {
    public AccessErrorException(String message) {
        super(message);
    }
    
    // implement other methods
    public void sendEmail(){
      // ...
      // code to send a warning email!
      System.out.println("Email... sent! \n" + this.getMessage());
    }
}
