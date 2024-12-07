package my;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class mainProgramFile {
  public static void main(String[] args) throws FileNotFoundException, IOException  {
    FileInputStream fis = new FileInputStream("file.txt");
    
    System.out.println(fis.read());
  }
}