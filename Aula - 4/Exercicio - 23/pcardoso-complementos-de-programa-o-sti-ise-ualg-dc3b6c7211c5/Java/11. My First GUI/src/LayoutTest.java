import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LayoutTest {

  private JFrame frame;
  private JTextField textField;
  private JLabel lblNewLabel;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          LayoutTest window = new LayoutTest();
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
  public LayoutTest() {
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
    gridBagLayout.rowHeights = new int[]{0, 0, 0};
    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);
    
    Component verticalStrut = Box.createVerticalStrut(20);
    GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
    gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
    gbc_verticalStrut.gridx = 1;
    gbc_verticalStrut.gridy = 0;
    frame.getContentPane().add(verticalStrut, gbc_verticalStrut);
    
    lblNewLabel = new JLabel("New label");
    lblNewLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseReleased(MouseEvent e) {
        lblNewLabel.setText("nome");
      }
      @Override
      public void mousePressed(MouseEvent e) {
        lblNewLabel.setText("juizo");
      }
    });
    GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
    gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
    gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
    gbc_lblNewLabel.gridx = 1;
    gbc_lblNewLabel.gridy = 1;
    frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
    
    textField = new JTextField();
    textField.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseReleased(MouseEvent e) {
        lblNewLabel.setText("nome");
      }
      @Override
      public void mousePressed(MouseEvent e) {
        lblNewLabel.setText("juizo");
      }
    });
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField.gridx = 2;
    gbc_textField.gridy = 1;
    frame.getContentPane().add(textField, gbc_textField);
    textField.setColumns(10);
  }

  protected JLabel getLblNewLabel() {
    return lblNewLabel;
  }
}
