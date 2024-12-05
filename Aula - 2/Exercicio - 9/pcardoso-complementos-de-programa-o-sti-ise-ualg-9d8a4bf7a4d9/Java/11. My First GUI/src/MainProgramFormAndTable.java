import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainProgramFormAndTable {

  private JFrame frame;
  private JTextField Name;
  private JTextField Surname;
  private JButton btnAdd;
  private JTable table;
  private JLabel lblAge;
  private JTextField age;
  private JScrollPane scrollPane;
  private JButton btnDelete;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainProgramFormAndTable window = new MainProgramFormAndTable();
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
  public MainProgramFormAndTable() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[][][][][]"));
    
    JLabel lbl1stname = new JLabel("First name");
    frame.getContentPane().add(lbl1stname, "cell 0 0,alignx trailing");
    
    Name = new JTextField();
    frame.getContentPane().add(Name, "cell 1 0,growx");
    Name.setColumns(10);
    
    JLabel lblSurname = new JLabel("Surname");
    frame.getContentPane().add(lblSurname, "cell 0 1,alignx trailing");
    
    Surname = new JTextField();
    frame.getContentPane().add(Surname, "cell 1 1,growx");
    Surname.setColumns(10);
    
    lblAge = new JLabel("Age");
    frame.getContentPane().add(lblAge, "cell 0 2,alignx right");
    
    age = new JTextField();
    frame.getContentPane().add(age, "cell 1 2,growx");
    age.setColumns(10);
    
    btnAdd = new JButton("Add");
    btnAdd.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        frame.setTitle(getName().getText() + " " + getSurname().getText());
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = {getName().getText(), getSurname().getText(), getAge().getText()};
        model.addRow(row);        
      }
    });
    frame.getContentPane().add(btnAdd, "flowx,cell 1 3");
    
    String[] columnNames = {"Name", "Surname", "age"};
    Object[][] data = {
        };
    
    
    DefaultTableModel model = new DefaultTableModel(data, columnNames);  
    table = new JTable(model);

    scrollPane = new JScrollPane();
    frame.getContentPane().add(scrollPane, "cell 0 4 2 1,grow");
    scrollPane.setViewportView(table);
    
    btnDelete = new JButton("Delete");
    btnDelete.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        System.out.println("selected:" + table.getSelectedRow());
        if (table.getSelectedRow() != -1){
          model.removeRow(table.getSelectedRow());         
        }
      }
    });
    btnDelete.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    frame.getContentPane().add(btnDelete, "cell 1 3");
  }

  public JTextField getName() {
    return Name;
  }
  public JTextField getSurname() {
    return Surname;
  }
  public JTextField getAge() {
    return age;
  }
}
