import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class AnimalsGUI {

  private JFrame frame;
  
  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "org.sqlite.JDBC";  
  static final String DB_URL = "jdbc:sqlite:test.sqlite";
  Connection conn = null;
  private JComboBox ownersCombo;
  private JButton btnLoad;
  private JList<String> animalList;


  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AnimalsGUI window = new AnimalsGUI();
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
  public AnimalsGUI() {
    initialize();
  }

  private void connectDB(){
    try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER); 

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL);

    }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
    }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
    }//end try

  }
  
  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[]{0, 0};
    gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
    gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
    frame.getContentPane().setLayout(gridBagLayout);
    

    
    connectDB();
    DefaultComboBoxModel<String> ownerCbModel = new DefaultComboBoxModel<String>();
    try{
      
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM Owners");
  
      while(rs.next()){
//        System.out.println(rs.getString("ownerName"));
        ownerCbModel.addElement(rs.getString("ownerName"));
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    
    ownersCombo = new JComboBox(ownerCbModel);
    GridBagConstraints gbc_ownersCombo = new GridBagConstraints();
    gbc_ownersCombo.insets = new Insets(0, 0, 5, 0);
    gbc_ownersCombo.fill = GridBagConstraints.HORIZONTAL;
    gbc_ownersCombo.gridx = 0;
    gbc_ownersCombo.gridy = 0;
    frame.getContentPane().add(ownersCombo, gbc_ownersCombo);
    
    btnLoad = new JButton("load");
    btnLoad.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        
        DefaultListModel<String> model = (DefaultListModel<String>) animalList.getModel();
        model.clear();
        
        String s = ownersCombo.getSelectedItem().toString();
        System.out.println(s);
        try{
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM Animals INNER JOIN Owners ON Animals.ownerId = Owners.ownerId WHERE ownerName = '" + s + "'");
          while(rs.next()){
            System.out.println(rs.getString("animalName"));
            model.addElement(rs.getString("animalName"));
            
          }
          
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }
        
      }
    });
    GridBagConstraints gbc_btnLoad = new GridBagConstraints();
    gbc_btnLoad.insets = new Insets(0, 0, 5, 0);
    gbc_btnLoad.gridx = 0;
    gbc_btnLoad.gridy = 1;
    frame.getContentPane().add(btnLoad, gbc_btnLoad);
    
    
    DefaultListModel<String> listmodel = new DefaultListModel<String>();
    animalList = new JList(listmodel);
    GridBagConstraints gbc_animalList = new GridBagConstraints();
    gbc_animalList.fill = GridBagConstraints.BOTH;
    gbc_animalList.gridx = 0;
    gbc_animalList.gridy = 2;
    frame.getContentPane().add(animalList, gbc_animalList);
    
  }

  public JComboBox getOwnersCombo() {
    return ownersCombo;
  }
  public JList getAnimalList() {
    return animalList;
  }
}
