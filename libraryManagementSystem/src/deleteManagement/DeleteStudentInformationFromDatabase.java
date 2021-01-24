package deleteManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.StudentInformation;
import database.DeleteStudentInformation;
import databaseConnection.DatabaseConnection;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteStudentInformationFromDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField deletestudentid;
	private JTextField deletestudentfirstname;
	private JTextField deletestudentlastname;
	private JTextField deletestudentfathername;
	private JTextField deletestudentmothername;
	private JTextField deletestudentdob;
	private JTextField deletestudentdepartment;
	private JTextField deletestudentaddress;
	private JLabel requireddeletestudentid;
	private JLabel notdeleted;
	private JLabel requireddeletestudentid_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudentInformationFromDatabase frame = new DeleteStudentInformationFromDatabase();
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
	public DeleteStudentInformationFromDatabase() {
		setBackground(Color.WHITE);
		setTitle("delete student information");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(24, 1, 106, 32);
		contentPane.add(lblNewLabel);
		
		deletestudentid = new JTextField();
		deletestudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requireddeletestudentid.setText(null);
				requireddeletestudentid_1.setText(null);
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					if(deletestudentid.getText().isEmpty()) {
						requireddeletestudentid.setText("*Required");
						return;
					}
					try {
						Integer.parseInt(deletestudentid.getText());
					}catch(NumberFormatException ee) {
						requireddeletestudentid.setText("Integer Only");
						return;
					}
					
					showstudentinformation();
				}	
			}
		});
		deletestudentid.setBorder(null);
		deletestudentid.setBounds(177, 5, 201, 32);
		contentPane.add(deletestudentid);
		deletestudentid.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( deletestudentid.getText().isEmpty()) {
					requireddeletestudentid.setText("Required");
					return;
				}
				if(deletestudentfirstname.getText().isEmpty()) {
					requireddeletestudentid_1.setText("See student information before delete");
					return;
				}
				if(deletestudentinformationfromdatabase()) {
					JOptionPane.showConfirmDialog(null, "Successfully deleted.");
				}else {
					JOptionPane.showConfirmDialog(null, "Not deleted");
				}
				setEmptyJField();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(606, 400, 121, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setBounds(406, 85, 106, 32);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(406, 127, 106, 32);
		contentPane.add(lblLastName);
		
		JLabel lblFatherName = new JLabel("Father name");
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFatherName.setBounds(406, 168, 106, 32);
		contentPane.add(lblFatherName);
		
		JLabel lblMotherName = new JLabel("Mother name");
		lblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMotherName.setBounds(406, 210, 121, 32);
		contentPane.add(lblMotherName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(406, 257, 106, 32);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDob.setBounds(406, 301, 106, 32);
		contentPane.add(lblDob);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(406, 344, 106, 32);
		contentPane.add(lblDepartment);
		
		deletestudentfirstname = new JTextField();
		deletestudentfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentfirstname.setColumns(10);
		deletestudentfirstname.setBorder(null);
		deletestudentfirstname.setBounds(559, 85, 201, 32);
		contentPane.add(deletestudentfirstname);
		
		deletestudentlastname = new JTextField();
		deletestudentlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentlastname.setColumns(10);
		deletestudentlastname.setBorder(null);
		deletestudentlastname.setBounds(559, 127, 201, 32);
		contentPane.add(deletestudentlastname);
		
		deletestudentfathername = new JTextField();
		deletestudentfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentfathername.setColumns(10);
		deletestudentfathername.setBorder(null);
		deletestudentfathername.setBounds(559, 168, 201, 32);
		contentPane.add(deletestudentfathername);
		
		deletestudentmothername = new JTextField();
		deletestudentmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentmothername.setColumns(10);
		deletestudentmothername.setBorder(null);
		deletestudentmothername.setBounds(559, 214, 201, 32);
		contentPane.add(deletestudentmothername);
		
		deletestudentaddress = new JTextField();
		deletestudentaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentaddress.setColumns(10);
		deletestudentaddress.setBorder(null);
		deletestudentaddress.setBounds(559, 257, 201, 32);
		contentPane.add(deletestudentaddress);
		
		deletestudentdob = new JTextField();
		deletestudentdob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentdob.setColumns(10);
		deletestudentdob.setBorder(null);
		deletestudentdob.setBounds(559, 301, 201, 32);
		contentPane.add(deletestudentdob);
		
		deletestudentdepartment = new JTextField();
		deletestudentdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentdepartment.setColumns(10);
		deletestudentdepartment.setBorder(null);
		deletestudentdepartment.setBounds(559, 344, 201, 32);
		contentPane.add(deletestudentdepartment);
		
		requireddeletestudentid = new JLabel("");
		requireddeletestudentid.setForeground(Color.RED);
		requireddeletestudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletestudentid.setBounds(406, 5, 221, 32);
		contentPane.add(requireddeletestudentid);
		
		notdeleted = new JLabel("");
		notdeleted.setForeground(Color.RED);
		notdeleted.setFont(new Font("Tahoma", Font.PLAIN, 18));
		notdeleted.setBounds(541, 85, 276, 32);
		contentPane.add(notdeleted);
		
		requireddeletestudentid_1 = new JLabel("");
		requireddeletestudentid_1.setForeground(Color.RED);
		requireddeletestudentid_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletestudentid_1.setBounds(24, 85, 354, 32);
		contentPane.add(requireddeletestudentid_1);
	}
	/*
	 * create a method deleting the information of student from database studentinformation.db
	 */
	
	
	public boolean deletestudentinformationfromdatabase() {
		
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "delete from studentinformation where studentid = "+deletestudentid.getText()+"";
			st = connection.createStatement();
			st.execute(sql);
			return true;
		}catch(Exception e) {
			notdeleted.setText("Deletion is not successfull");
			return false;
		}
		finally {
			try {
				st.close();
			}catch(Exception e) {
				notdeleted.setText("Deletion is not successfull");
				return false;
			}
		}
	}
	
	public void showstudentinformation() {
		Statement st = null;
		ResultSet rs = null;
		 try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "select * from  studentinformation where studentid = "+deletestudentid.getText()+" ";
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			deletestudentfirstname.setText(rs.getString(1));
			deletestudentlastname.setText(rs.getString(2));
			deletestudentfathername.setText(rs.getString(3));
			deletestudentmothername.setText(rs.getString(4));
			deletestudentaddress.setText(rs.getString(5));
			deletestudentdob.setText(rs.getString(6));
			deletestudentdepartment.setText(rs.getString(7));
			connection.close();
			} catch (Exception e2) {
				requireddeletestudentid_1.setText("No data found");
				return;
			}
			finally {
				try {
					rs.close();
					st.close();
				} catch (Exception e3) {
					JOptionPane.showConfirmDialog(null, e3.toString());
				}
			}
	}
	
	void setEmptyJField() {
		deletestudentid.setText(null);
		deletestudentfirstname.setText(null);
		deletestudentlastname.setText(null);
		deletestudentfathername.setText(null);
		deletestudentmothername.setText(null);
		deletestudentaddress.setText(null);
		deletestudentdob.setText(null);
		deletestudentdepartment.setText(null);
	}
}
