

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class selected2Title {

  private JFrame frame;
  private JTextField textField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          selected2Title window = new selected2Title();
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
  public selected2Title() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    textField = new JTextField();
    textField.addFocusListener(new FocusAdapter() {
      @Override
      public void focusLost(FocusEvent e) {
        if(textField.getSelectedText() != null){
          frame.setTitle(textField.getText());
        }
      }
    });
    textField.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseReleased(MouseEvent e) {
        if(textField.getSelectedText() != null){
          System.out.println(textField.getSelectedText());
        }
      }
    });
    frame.getContentPane().add(textField, BorderLayout.CENTER);
    textField.setColumns(10);
  }

  protected JTextField getTextField() {
    return textField;
  }
}
