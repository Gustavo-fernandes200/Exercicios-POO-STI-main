import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class DB_GUI.
 */
public class DB_GUI {

  /** The frame. */
  private JFrame frame;
  
  /** The animals. */
  private JTable animalsTable;
  
  /** The owners. */
  private JTable ownersTable;

  /**
   * Launch the application.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DB_GUI window = new DB_GUI();
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
  public DB_GUI() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 572);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().setLayout(new MigLayout("", "[213px][213px]", "[][][532px]"));

    animalsTable = new JTable(getAnimalsDataModel());
    animalsTable.removeColumn(animalsTable.getColumnModel().getColumn(0));    // hide id column 
    ownersTable = new JTable(getOwnerDataModel());
    ownersTable.removeColumn(ownersTable.getColumnModel().getColumn(0));     // hide id column
    
    ownersTable.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseReleased(MouseEvent e) {
        updateAnimals();
      }
    });
    frame.getContentPane().add(ownersTable, "cell 0 1 1 2,grow");
    frame.getContentPane().add(animalsTable, "cell 1 2,grow");
   
  }

  /**
   * Gets the owner data model.
   *
   * @return the owner data model
   */
  private DefaultTableModel getOwnerDataModel() {
    String[] columnNames = {"Id", "Name"};
    String[][] data = {}; 

    DefaultTableModel ownerDataModel = new DefaultTableModel(data, columnNames);
    Connection c = null;
    try{
      String sDriverName = "org.sqlite.JDBC";
      Class.forName(sDriverName);

      c = DriverManager.getConnection("jdbc:sqlite:test.sqlite");  

      Statement stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM Owners");
      while(rs.next()){
        String[] ownerData = {rs.getString("ownerId"), rs.getString("ownerName")};
        ownerDataModel.addRow(ownerData);
      }

    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    return ownerDataModel;
  }
  
  
  
  /**
   * Gets the animals data model.
   *
   * @return the animals data model
   */
  private DefaultTableModel getAnimalsDataModel() {
    String[] columnNames = {"Id", "Name"};
    String[][] data = {}; 
    
    DefaultTableModel ownerDataModel = new DefaultTableModel(data, columnNames);
    return ownerDataModel;
  }

  

  /**
   * Update animals.
   */
  private void updateAnimals() {
    
    DefaultTableModel animalModel = (DefaultTableModel) animalsTable.getModel();
    DefaultTableModel ownersModel = (DefaultTableModel) ownersTable.getModel();
    String ownerId = (String) ownersModel.getValueAt(ownersTable.getSelectedRow(), 0); 
    
    if (animalModel.getRowCount() > 0){
      animalModel.removeRow(0);
    }
        
    Connection c = null;
    try{
      String sDriverName = "org.sqlite.JDBC";
      Class.forName(sDriverName);

      c = DriverManager.getConnection("jdbc:sqlite:test.sqlite");  

      Statement stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM Animals WHERE ownerId = " + ownerId);
      while(rs.next()){
        String[] animalData = {rs.getString("animalId"), rs.getString("animalName")};
        animalModel.addRow(animalData);
      }

    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

  
}
