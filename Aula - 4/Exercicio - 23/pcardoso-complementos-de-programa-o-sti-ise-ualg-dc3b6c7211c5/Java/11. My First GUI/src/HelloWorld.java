import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {

  private JFrame frame;
  private JTextPane textPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          HelloWorld window = new HelloWorld();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public HelloWorld() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.getContentPane().setBackground(Color.blue);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);
    
    JLabel lblHelloWorldApp = new JLabel("Hello World app");
    GridBagConstraints gbc_lblHelloWorldApp = new GridBagConstraints();
    gbc_lblHelloWorldApp.gridwidth = 5;
    gbc_lblHelloWorldApp.insets = new Insets(0, 0, 5, 5);
    gbc_lblHelloWorldApp.gridx = 2;
    gbc_lblHelloWorldApp.gridy = 1;
    frame.getContentPane().add(lblHelloWorldApp, gbc_lblHelloWorldApp);
    
    JButton btnHelloWorld = new JButton("Hello world");
    btnHelloWorld.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.print("mouse clicked");
        textPane.setText(textPane.getText() + " Hello World");
      }
    });
    GridBagConstraints gbc_btnHelloWorld = new GridBagConstraints();
    gbc_btnHelloWorld.insets = new Insets(0, 0, 5, 5);
    gbc_btnHelloWorld.gridx = 1;
    gbc_btnHelloWorld.gridy = 2;
    frame.getContentPane().add(btnHelloWorld, gbc_btnHelloWorld);
    
    JButton btnClear = new JButton("Clear");
    btnClear.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        textPane.setText("");
      }
    });
    GridBagConstraints gbc_btnClear = new GridBagConstraints();
    gbc_btnClear.insets = new Insets(0, 0, 5, 5);
    gbc_btnClear.gridx = 7;
    gbc_btnClear.gridy = 2;
    frame.getContentPane().add(btnClear, gbc_btnClear);
    
    textPane = new JTextPane();
    GridBagConstraints gbc_textPane = new GridBagConstraints();
    gbc_textPane.insets = new Insets(0, 0, 0, 5);
    gbc_textPane.gridwidth = 7;
    gbc_textPane.fill = GridBagConstraints.BOTH;
    gbc_textPane.gridx = 1;
    gbc_textPane.gridy = 3;
    frame.getContentPane().add(textPane, gbc_textPane);
  }

  
}
