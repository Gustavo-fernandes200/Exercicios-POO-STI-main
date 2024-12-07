import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.List;
import java.io.File;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;

public class HelloWorldLabel {

  private JFrame frmHelloWorld;
  private JLabel lblHelloWorld;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          HelloWorldLabel window = new HelloWorldLabel();
          window.frmHelloWorld.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public HelloWorldLabel() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmHelloWorld = new JFrame();
    frmHelloWorld.setTitle("Hello World");
    frmHelloWorld.setBounds(100, 100, 110, 57);
    frmHelloWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    try{
      frmHelloWorld.setIconImage(ImageIO.read(new File("./src/images/helloWorld.png")));

      GridBagLayout gridBagLayout = new GridBagLayout();
      gridBagLayout.columnWidths = new int[]{0, 0};
      gridBagLayout.rowHeights = new int[]{0, 0};
      gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
      gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
      frmHelloWorld.getContentPane().setLayout(gridBagLayout);

      lblHelloWorld = new JLabel("Hello World");
      GridBagConstraints gbc_lblHelloWorld = new GridBagConstraints();
      gbc_lblHelloWorld.gridx = 0;
      gbc_lblHelloWorld.gridy = 0;
      frmHelloWorld.getContentPane().add(lblHelloWorld, gbc_lblHelloWorld);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

  protected JLabel getLblHelloWorld() {
    return lblHelloWorld;
  }
}
