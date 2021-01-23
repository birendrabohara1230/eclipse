package informationOfStudents;

import java.awt.BorderLayout;
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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShowAllStudentInformation extends JFrame {

	private JPanel contentPane;
	private JTextField search;
	private JTable table;
	private JComboBox searchby;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAllStudentInformation frame = new ShowAllStudentInformation();
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
	public ShowAllStudentInformation() {
		setTitle("Show all student");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(150, 90, 1211, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(561, 35, 109, 28);
		contentPane.add(lblNewLabel);
		
		searchby = new JComboBox();
		searchby.setModel(new DefaultComboBoxModel(new String[] {"Student id", "First name", "Last name", "Address", "Father name", "Mother name"}));
		searchby.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchby.setBounds(734, 35, 208, 28);
		contentPane.add(searchby);
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				showAllStudent();
			}
		});
		search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		search.setBorder(null);
		search.setBounds(250, 35, 237, 28);
		contentPane.add(search);
		search.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 1177, 534);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		showAllStudent();
	}
	
	void showAllStudent() {
		Statement st = null;
		ResultSet rs = null;
		String sql = null;
		String select = (String) searchby.getSelectedItem();
		try {
			Connection connection = DatabaseConnection.getConnection();
			if (select.equalsIgnoreCase("student id")) {
				sql = "select * from studentinformation where studentid like '%"+search.getText()+"%'";
			}else if(select.equalsIgnoreCase("first name")) {
				sql = "select * from studentinformation where first_name like '%"+search.getText()+"%'";
			}else if(select.equalsIgnoreCase("last name")) {
				sql = "select * from studentinformation where last_name like '%"+search.getText()+"%'";
			}else if(select.equalsIgnoreCase("father name")) {
				sql = "select * from studentinformation where father_name like '%"+search.getText()+"%'";
			}else if(select.equalsIgnoreCase("mother name")) {
				sql = "select * from studentinformation where mother_name like '%"+search.getText()+"%'";
			}else if(select.equalsIgnoreCase("address")) {
				sql = "select * from studentinformation where address like '%"+search.getText()+"%'";
			}else {
				sql = "select * from studentinformation";
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
	
	int getSelectRow() {
		return table.getSelectedRow();
	}	
}
  