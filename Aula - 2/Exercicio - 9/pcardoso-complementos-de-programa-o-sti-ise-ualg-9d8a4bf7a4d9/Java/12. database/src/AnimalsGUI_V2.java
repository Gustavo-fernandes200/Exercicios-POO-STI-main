import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import javafx.scene.control.ComboBox;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnimalsGUI_V2 extends JFrame {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.sqlite.JDBC";  
	static final String DB_URL = "jdbc:sqlite:test.sqlite";
	Connection conn = null;

	private DefaultComboBoxModel<Owner> comboBoxModel;
	private DefaultListModel<Animal> listModel;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI_V2 frame = new AnimalsGUI_V2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnimalsGUI_V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		comboBoxModel = new DefaultComboBoxModel<Owner>();
		JComboBox comboBox = new JComboBox(comboBoxModel);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 0;
		contentPane.add(comboBox, gbc_comboBox);

		JButton btnLoad = new JButton("Load");
		btnLoad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fillAnimals();
			}
		});

		GridBagConstraints gbc_btnLoad = new GridBagConstraints();
		gbc_btnLoad.insets = new Insets(0, 0, 5, 0);
		gbc_btnLoad.gridx = 0;
		gbc_btnLoad.gridy = 1;
		contentPane.add(btnLoad, gbc_btnLoad);

		listModel = new DefaultListModel<Animal>();
		JList<Animal> list = new JList(listModel);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 2;
		contentPane.add(list, gbc_list);

		connectToDB();
		fillOwnerCombo();

	}

	private void connectToDB() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private void fillOwnerCombo() {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT ownerName, ownerId FROM Owners");
			comboBoxModel.removeAllElements();
			while(rs.next()){
				Owner o = new Owner(rs.getString("ownerName"), rs.getInt("ownerId"));
				comboBoxModel.addElement(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void fillAnimals() {
		Statement stmt;
		try {
			int oId = ((Owner) comboBoxModel.getSelectedItem()).getOwnerId();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT animalName, animalId, ownerId FROM Animals WHERE ownerId = " + oId);
			
			listModel.removeAllElements();
			
			while(rs.next()){
				Animal a = new Animal(rs.getString("animalName"), rs.getInt("animalId"), rs.getInt("ownerId"));
				listModel.addElement(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
