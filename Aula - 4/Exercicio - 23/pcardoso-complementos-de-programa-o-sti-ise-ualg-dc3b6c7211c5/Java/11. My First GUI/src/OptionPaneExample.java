

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class OptionPaneExample {

  private JFrame frame;
  private JTextField textField;
  private JButton btnOk;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          OptionPaneExample window = new OptionPaneExample();
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
  public OptionPaneExample() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
    gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);

    JLabel lblTypestiAnd = new JLabel("");
    GridBagConstraints gbc_lblTypestiAnd = new GridBagConstraints();
    gbc_lblTypestiAnd.insets = new Insets(0, 0, 5, 0);
    gbc_lblTypestiAnd.gridx = 2;
    gbc_lblTypestiAnd.gridy = 1;
    frame.getContentPane().add(lblTypestiAnd, gbc_lblTypestiAnd);

    textField = new JTextField();
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.insets = new Insets(0, 0, 5, 0);
    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField.gridx = 2;
    gbc_textField.gridy = 2;
    frame.getContentPane().add(textField, gbc_textField);
    textField.setColumns(10);

    String name = JOptionPane.showInputDialog("Hello! What's your name?");
    if(name.equals("")){
      name = "John Doe";
    }
    lblTypestiAnd.setText("Hello " + name + ". Please type \"STI\" and click OK");

    btnOk = new JButton("OK");
    btnOk.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println(textField.getText());
        if (textField.getText().equals("STI")){
          JOptionPane.showMessageDialog(frame, "Nice! You got it!");
//          JOptionPane.showMessageDialog(frame, "Nice! You got it!", "Correct answer!", JOptionPane.INFORMATION_MESSAGE);
//          JOptionPane.showMessageDialog(frame, "Nice! You got it!", "Correct answer!", JOptionPane.WARNING_MESSAGE);
//          JOptionPane.showMessageDialog(frame, "Nice! You got it!", "Correct answer!", JOptionPane.QUESTION_MESSAGE);
//          JOptionPane.showMessageDialog(frame, "Nice! You got it!", "Correct answer!", JOptionPane.PLAIN_MESSAGE);
//          JOptionPane.showMessageDialog(frame, "Nice! You got it!", "Correct answer!", JOptionPane.ERROR_MESSAGE);
          // ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE

        }else{
          int answer = JOptionPane.showConfirmDialog(frame, "Do you want to try again?");
          if(answer ==  JOptionPane.CANCEL_OPTION){
            answer = JOptionPane.showOptionDialog(frame, "Make up your mind?", "It's a hard decision!", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
          
          }
          switch (answer){
          case JOptionPane.YES_OPTION:
            break;
          case JOptionPane.NO_OPTION:
            System.exit(0);
            break;
          }

        }
      }
    });
    GridBagConstraints gbc_btnOk = new GridBagConstraints();
    gbc_btnOk.gridx = 2;
    gbc_btnOk.gridy = 3;
    frame.getContentPane().add(btnOk, gbc_btnOk);
  }

  protected JTextField getTextField() {
    return textField;
  }
  protected JButton getBtnOk() {
    return btnOk;
  }
}
