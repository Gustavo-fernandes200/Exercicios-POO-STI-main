import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JScrollPane;

public class MainProgramSeveralComponents {

  private JFrame frame;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  private JTextField txtName;
  private JTextField txtEmail;
  private JPasswordField pwdPassword;
  private JPasswordField pwdPasswordagain;
  private JComboBox Title;
  private JRadioButton rdbtnMale;
  private JRadioButton rdbtnFemale;
  private JCheckBox chckbxReceiveNotifications;
  private JList list;
  private JSpinner spinner;
  private JTextArea textObservations;
  private JButton btnLoad;
  private JTextField txtHobbie;
  private JButton btnAdd;
  private JScrollPane scrollPane;

  

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainProgramSeveralComponents window = new MainProgramSeveralComponents();
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
  public MainProgramSeveralComponents() {
    initialize();
  }

  private void checkPasswords(){
    String pass = new String(getPwdPassword().getPassword());
    String passAgain = new String(getPwdPasswordagain().getPassword());
    if(pass.length() == 0 || !pass.equals(passAgain)){
      getPwdPassword().setBackground(new Color(255, 0, 0));
      getPwdPasswordagain().setBackground(new Color(255, 0, 0));
    }else{
      getPwdPassword().setBackground(new Color(0, 255, 0));
      getPwdPasswordagain().setBackground(new Color(0, 255, 0));
    }

  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 517);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new MigLayout("", "[][grow][]", "[][][][][][][][grow][][][grow][][]"));

    JLabel lblName = new JLabel("Name");
    frame.getContentPane().add(lblName, "cell 0 0,alignx trailing");

    txtName = new JTextField();
    frame.getContentPane().add(txtName, "cell 1 0,growx");
    txtName.setColumns(10);

    JLabel lblEmail = new JLabel("Email");
    frame.getContentPane().add(lblEmail, "cell 0 1,alignx trailing");

    txtEmail = new JTextField();
    frame.getContentPane().add(txtEmail, "cell 1 1,growx");
    txtEmail.setColumns(10);

    JLabel lblTitle = new JLabel("Title");
    frame.getContentPane().add(lblTitle, "cell 0 2,alignx trailing");

    Title = new JComboBox();
    frame.getContentPane().add(Title, "cell 1 2,growx");
    Title.addItem("");
    Title.addItem("Mr.");
    Title.addItem("Mrs.");
    Title.addItem("Miss");


    rdbtnMale = new JRadioButton("Male");
    rdbtnMale.setSelected(true);
    buttonGroup.add(rdbtnMale);
    frame.getContentPane().add(rdbtnMale, "cell 1 3");

    rdbtnFemale = new JRadioButton("Female");
    buttonGroup.add(rdbtnFemale);
    frame.getContentPane().add(rdbtnFemale, "cell 2 3");

    chckbxReceiveNotifications = new JCheckBox("Receive notifications?");
    frame.getContentPane().add(chckbxReceiveNotifications, "cell 1 4");

    JLabel lblPassword = new JLabel("Password");
    frame.getContentPane().add(lblPassword, "cell 0 5,alignx trailing");

    pwdPassword = new JPasswordField();
    pwdPassword.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        checkPasswords();
      }
    });
    frame.getContentPane().add(pwdPassword, "cell 1 5,growx");

    JLabel lblAgain = new JLabel("Again");
    frame.getContentPane().add(lblAgain, "cell 0 6,alignx trailing");

    pwdPasswordagain = new JPasswordField();
    pwdPasswordagain.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {
        checkPasswords();
      }
    });
    frame.getContentPane().add(pwdPasswordagain, "cell 1 6,growx");
    checkPasswords();

    JLabel lblListOfHobbies = new JLabel("List of hobbies");
    frame.getContentPane().add(lblListOfHobbies, "cell 0 7");

    DefaultListModel<String> listModel = new DefaultListModel<String>();
    
    scrollPane = new JScrollPane();
    frame.getContentPane().add(scrollPane, "cell 1 7,grow");
    
    list = new JList(listModel);
    scrollPane.setViewportView(list);

    
    JButton btnDelete = new JButton("Delete");
    btnDelete.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		int idx = list.getSelectedIndex();
    		if ( idx != -1){
    				try{
    					((DefaultListModel<String>)list.getModel()).remove(idx);
    				}finally{
    					
    				}
    				
    		}
    	}
    });
    frame.getContentPane().add(btnDelete, "cell 2 7");
    
    txtHobbie = new JTextField();
    frame.getContentPane().add(txtHobbie, "cell 1 8,growx");
    txtHobbie.setColumns(10);
    
    btnAdd = new JButton("Add");
    btnAdd.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	}
    });
    btnAdd.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		if(! txtHobbie.getText().trim().equals("")){
				DefaultListModel<String> defaultListModel = (DefaultListModel<String>) list.getModel();
				defaultListModel.addElement(txtHobbie.getText().trim());       		    			
    		}
    	}
    });
    frame.getContentPane().add(btnAdd, "cell 2 8,aligny baseline");




    JLabel lblAge = new JLabel("Age");
    frame.getContentPane().add(lblAge, "cell 0 9");

    spinner = new JSpinner();
    frame.getContentPane().add(spinner, "cell 1 9");

    JLabel lblObservations = new JLabel("Observations");
    frame.getContentPane().add(lblObservations, "cell 0 10");

    textObservations = new JTextArea();
    frame.getContentPane().add(textObservations, "cell 1 10,grow");

    JProgressBar progressBar = new JProgressBar();
    frame.getContentPane().add(progressBar, "cell 1 11");

    JButton btnSave = new JButton("Save");
    btnSave.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnSave.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        try{
          FileOutputStream f = new FileOutputStream("data.bin");
          ObjectOutputStream out = new ObjectOutputStream(f);

          Vector<String> hobbies = new Vector<String>(); 
          ListModel<String > model = getList().getModel();

          for (int i = 0; i< model.getSize(); i++){
            hobbies.addElement(model.getElementAt(i));
          }
          
          System.out.println(getSpinner().getValue());

          PersonalData data = new PersonalData (
              getTxtName().getText(),
              getTitle().getSelectedItem().toString(),
              getChckbxReceiveNotifications().isSelected(),
              new String(getPwdPassword().getPassword()),
              hobbies,
              (int) getSpinner().getValue(),
              getTextObservations().getText(),
              getRdbtnMale().isSelected()                
              );  
          out.writeObject(data);
          out.close();
          f.close();
        }catch(Exception ex){
          System.out.println(ex.getMessage());
          // TODO          
        }finally{
          // TODO
        }
      }
    });

    btnLoad = new JButton("Load");
    btnLoad.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        try{
          FileInputStream f = new FileInputStream("data.bin");
          ObjectInputStream in = new ObjectInputStream(f);
          
          PersonalData data = (PersonalData) in.readObject();
          
          getTxtName().setText(data.name);
          getChckbxReceiveNotifications().setSelected(data.notification);
          getPwdPassword().setText(data.password);
          getPwdPasswordagain().setText(data.password);
          getRdbtnMale().setSelected(data.male);
          getRdbtnFemale().setSelected(!data.male);
          getSpinner().setValue(data.age);
                      
          Vector<String> hobbies = new Vector<String>(); 
          ListModel<String > model = getList().getModel();

          for (int i = 0; i< model.getSize(); i++){
            hobbies.addElement(model.getElementAt(i));
          }

//          Data data = new Data (
//              getTxtName().getText(),
//              getTitle().getSelectedItem().toString(),
//              getChckbxReceiveNotifications().isSelected(),
//              new String(getPwdPassword().getPassword()),
//              hobbies,
//              (int) getSpinner().getValue(),
//              getTextObservations().getText()                
//              );  
//          out.writeObject(data);
          in.close();
          f.close();
        }catch(Exception ex){
          System.out.println("ex: " + ex.getMessage());          
          // TODO          
        }finally{
          // TODO
        }

      }
    });
    frame.getContentPane().add(btnLoad, "cell 0 12");
    frame.getContentPane().add(btnSave, "cell 2 12");
  }
  public JPasswordField getPwdPassword() {
    return pwdPassword;
  }
  public JPasswordField getPwdPasswordagain() {
    return pwdPasswordagain;
  }
  public JTextField getTxtName() {
    return txtName;
  }
  public JTextField getTxtEmail() {
    return txtEmail;
  }
  public JComboBox getTitle() {
    return Title;
  }
  public JRadioButton getRdbtnMale() {
    return rdbtnMale;
  }
  public JRadioButton getRdbtnFemale() {
    return rdbtnFemale;
  }
  public JCheckBox getChckbxReceiveNotifications() {
    return chckbxReceiveNotifications;
  }
  public JList getList() {
    return list;
  }
  public JSpinner getSpinner() {
    return spinner;
  }
  public JTextArea getTextObservations() {
    return textObservations;
  }
	protected JTextField getTxtHobbie() {
		return txtHobbie;
	}
}
