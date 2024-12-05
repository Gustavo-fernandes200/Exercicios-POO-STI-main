package my;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * The Class mainProgramMultiLevel.
 */
public class MainProgramMultiLevel {

  /**
   * Cat.
   *
   * @param file the file
   */
  public final static void cat(final File file) {
    RandomAccessFile input = null;
    String line = null;
    try {
      try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
          System.out.println(line);
        }
        return;
      } catch (FileNotFoundException fnf) {
        System.out.println(fnf.getMessage());
      } finally {
        if (input != null) {
          input.close();
        }
      }
    } catch (IOException io)    { 
      System.out.println(io.getMessage());
    }
  }

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    cat(new File("file.txt"));
  }

}
