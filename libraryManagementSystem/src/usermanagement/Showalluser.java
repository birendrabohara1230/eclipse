package usermanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseConnection.DatabaseConnection;
import net.proteanit.sql.DbUtils;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Window.Type;

public class Showalluser extends JFrame {

	private JPanel contentPane;
	private JTextField searchuser;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Showalluser frame = new Showalluser();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showConfirmDialog(null, e.toString());
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Showalluser() {
		setResizable(false);
		setTitle("show all user");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(240, 90, 1015, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(402, 10, 104, 32);
		contentPane.add(lblNewLabel);
		
		searchuser = new JTextField();
		searchuser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				showalluser();
			}
		});
		searchuser.setBounds(135, 10, 177, 32);
		contentPane.add(searchuser);
		searchuser.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"User id", "First name", "Last name", "Father name", "Mother name", "Address", "Username", "Phone"}));
		comboBox.setBounds(572, 10, 177, 32);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 89, 991, 396);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		showalluserinformation();
	}
	public void showalluser() {
		Statement st = null;
		ResultSet rs = null;
		String searchby = null, sql = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			searchby = (String) comboBox.getSelectedItem();
			if(searchby.equalsIgnoreCase("user id")) {
				sql = "select * from userinformation where user_id like  '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("first name")){
				sql = "select * from userinformation where first_name like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("last name")) {
				sql = "select * from userinformation where last_name like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("father name")) {
				sql = "select * from userinformation where father_name like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("mother name")) {
				sql = "select * from userinformation where mother_name like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("address")) {
				sql = "select * from userinformation where address like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("username")) {
				sql = "select * from userinformation where username like '%"+searchuser.getText()+"%'";
			}else if(searchby.equalsIgnoreCase("phone")) {
				sql = "select * from userinformation where phone like '%"+searchuser.getText()+"%'";
			}else {
				sql = "select * from userinformation where user_id like '%"+searchuser.getText()+"%'";
			}
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.toString());
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2.toString());
			}
		}
	}
	
	public void showalluserinformation() {
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "select * from userinformation";
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.toString());
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
			JOptionPane.showConfirmDialog(null, e2.toString());
			}
		}
	}
	
}
