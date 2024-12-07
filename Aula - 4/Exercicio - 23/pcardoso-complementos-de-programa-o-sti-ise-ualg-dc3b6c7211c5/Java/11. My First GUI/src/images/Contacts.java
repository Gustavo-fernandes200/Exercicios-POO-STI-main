package images;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Contacts {

  private JFrame frame;
  private JTextField textField;
  private JTextField textField_1;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Contacts window = new Contacts();
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
  public Contacts() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 618, 303);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
    gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);
    
    JLabel lblName = new JLabel("Name");
    GridBagConstraints gbc_lblName = new GridBagConstraints();
    gbc_lblName.anchor = GridBagConstraints.EAST;
    gbc_lblName.insets = new Insets(0, 0, 5, 5);
    gbc_lblName.gridx = 0;
    gbc_lblName.gridy = 1;
    frame.getContentPane().add(lblName, gbc_lblName);
    
    textField = new JTextField();
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.weightx = 110.0;
    gbc_textField.insets = new Insets(0, 0, 5, 5);
    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField.gridx = 1;
    gbc_textField.gridy = 1;
    frame.getContentPane().add(textField, gbc_textField);
    textField.setColumns(100);
    
    JButton btnNew = new JButton("New");
    GridBagConstraints gbc_btnNew = new GridBagConstraints();
    gbc_btnNew.insets = new Insets(0, 0, 5, 0);
    gbc_btnNew.gridx = 2;
    gbc_btnNew.gridy = 1;
    frame.getContentPane().add(btnNew, gbc_btnNew);
    
    JLabel lblEmail = new JLabel("email");
    GridBagConstraints gbc_lblEmail = new GridBagConstraints();
    gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
    gbc_lblEmail.gridx = 0;
    gbc_lblEmail.gridy = 2;
    frame.getContentPane().add(lblEmail, gbc_lblEmail);
    
    textField_1 = new JTextField();
    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
    gbc_textField_1.insets = new Insets(0, 0, 5, 5);
    gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_1.gridx = 1;
    gbc_textField_1.gridy = 2;
    frame.getContentPane().add(textField_1, gbc_textField_1);
    textField_1.setColumns(100);
    
    JButton btnDelete = new JButton("Delete");
    GridBagConstraints gbc_btnDelete = new GridBagConstraints();
    gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
    gbc_btnDelete.gridx = 2;
    gbc_btnDelete.gridy = 2;
    frame.getContentPane().add(btnDelete, gbc_btnDelete);
    
    JButton btnPrevious = new JButton("Previous");
    GridBagConstraints gbc_btnPrevious = new GridBagConstraints();
    gbc_btnPrevious.insets = new Insets(0, 0, 5, 0);
    gbc_btnPrevious.gridx = 2;
    gbc_btnPrevious.gridy = 4;
    frame.getContentPane().add(btnPrevious, gbc_btnPrevious);
    
    JButton btnNext = new JButton("Next");
    GridBagConstraints gbc_btnNext = new GridBagConstraints();
    gbc_btnNext.gridx = 2;
    gbc_btnNext.gridy = 5;
    frame.getContentPane().add(btnNext, gbc_btnNext);
  }

}
