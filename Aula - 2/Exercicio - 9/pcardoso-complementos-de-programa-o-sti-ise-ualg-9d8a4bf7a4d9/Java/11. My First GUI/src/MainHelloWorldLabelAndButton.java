import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MainHelloWorldLabelAndButton {

  private JFrame frame;
  private JLabel lblHelloWorld;
  private JButton btnShift;
  private JPasswordField passwordField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainHelloWorldLabelAndButton window = new MainHelloWorldLabelAndButton();
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
  public MainHelloWorldLabelAndButton() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new MigLayout("", "[82px][67px,grow]", "[15px][25px][][]"));
    
    lblHelloWorld = new JLabel("hello world");
    frame.getContentPane().add(lblHelloWorld, "cell 0 0,alignx left,aligny top");
    
    btnShift = new JButton("TO UPPER");
    btnShift.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnShift.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (getBtnShift().getText() == "TO UPPER"){
          getLblHelloWorld().setText(getLblHelloWorld().getText().toUpperCase());
          getBtnShift().setText("to lower");          
        }else{
          getLblHelloWorld().setText(getLblHelloWorld().getText().toLowerCase());
          getBtnShift().setText("TO UPPER");          
          
        }
      }
    });
    frame.getContentPane().add(btnShift, "cell 1 1,alignx left,aligny top");
    
  }

  public JLabel getLblHelloWorld() {
    return lblHelloWorld;
  }
  public JButton getBtnShift() {
    return btnShift;
  }
}
