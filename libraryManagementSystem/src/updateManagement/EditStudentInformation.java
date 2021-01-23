package updateManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import dao.StudentInformation;
import database.EditStudentInformations;
import databaseConnection.DatabaseConnection;
import searchManagement.StudentInformationAndBookDetails;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditStudentInformation extends JFrame {

	private JPanel contentPane;
	private JTextField fathername;
	private JTextField lastname;
	private JTextField firstname;
	private JTextField mothername;
	private JTextField address;
	private JTextField studentid;
	private JTextField studentidfirst;
	private JDateChooser dateofbirth;
	private JLabel requiredstudentid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudentInformation frame = new EditStudentInformation();
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
	public EditStudentInformation() {
		setTitle("edit student information");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First_name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(264, 130, 106, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastname = new JLabel("Last_name");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastname.setBounds(264, 162, 106, 22);
		contentPane.add(lblLastname);
		
		JLabel lblFathersname = new JLabel("Father's_name");
		lblFathersname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFathersname.setBounds(264, 191, 119, 22);
		contentPane.add(lblFathersname);
		
		JLabel lblMothername = new JLabel("Mother_name");
		lblMothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMothername.setBounds(264, 223, 119, 22);
		contentPane.add(lblMothername);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(264, 255, 106, 22);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDob.setBounds(264, 287, 106, 22);
		contentPane.add(lblDob);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(264, 319, 106, 22);
		contentPane.add(lblDepartment);
		
		fathername = new JTextField();
		fathername.setBorder(null);
		fathername.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fathername.setBounds(393, 196, 176, 19);
		contentPane.add(fathername);
		fathername.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBorder(null);
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lastname.setColumns(10);
		lastname.setBounds(393, 164, 176, 19);
		contentPane.add(lastname);
		
		firstname = new JTextField();
		firstname.setBorder(null);
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		firstname.setColumns(10);
		firstname.setBounds(393, 132, 176, 19);
		contentPane.add(firstname);
		
		mothername = new JTextField();
		mothername.setBorder(null);
		mothername.setFont(new Font("Tahoma", Font.PLAIN, 17));
		mothername.setColumns(10);
		mothername.setBounds(393, 228, 176, 19);
		contentPane.add(mothername);
		
		address = new JTextField();
		address.setBorder(null);
		address.setFont(new Font("Tahoma", Font.PLAIN, 17));
		address.setColumns(10);
		address.setBounds(393, 260, 176, 19);
		contentPane.add(address);
		
	    dateofbirth = new JDateChooser();
		dateofbirth.setBounds(393, 287, 176, 22);
		contentPane.add(dateofbirth);
		
		JComboBox department = new JComboBox();
		department.setFont(new Font("Tahoma", Font.PLAIN, 16));
		department.addItem("Computer Science");
		department.addItem("Education");
		department.addItem("Humanities and Social Science");
		department.setBounds(393, 323, 176, 22);
		contentPane.add(department);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (studentid.getText().isEmpty()) {
				 		requiredstudentid.setText("Required");
				 		return;
				 	} 	
				 	try {
				 		Integer.parseInt(studentid.getText());
				 	}catch(NumberFormatException e1) {
				 		requiredstudentid.setText("Integer only");
				 		return;
				 	}
				 		 
				 EditStudentInformations editstudent = new EditStudentInformations();
				 StudentInformation student = new StudentInformation();
				 student.setStudentid(Integer.parseInt(studentid.getText()));
				 student.setStudentidfirst(Integer.parseInt(studentidfirst.getText()));
				 student.setFirstname(firstname.getText());
				 student.setLastname(lastname.getText());
				 student.setFathername(fathername.getText());
				 student.setMothername(mothername.getText());
				 student.setAddress(address.getText());
				 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				 String date = sdf.format(dateofbirth.getDate());
				 student.setDob(date);
				 student.setDepartment((String) department.getSelectedItem());
				 if (editstudent.update(student)) {
					 JOptionPane.showConfirmDialog(null, "Update successfully");
				 }else {
					 JOptionPane.showConfirmDialog(null, "Update not successfull");
				 }
				 studentid.setText(null);
				 studentidfirst.setText(null);
				 firstname.setText(null);
				 lastname.setText(null);
				 fathername.setText(null);
				 mothername.setText(null);
				 address.setText(null);
				 dateofbirth.setDate(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(424, 373, 78, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblSearchStudentId = new JLabel("Search student id");
		lblSearchStudentId.setForeground(Color.BLUE);
		lblSearchStudentId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchStudentId.setBounds(234, 34, 149, 22);
		contentPane.add(lblSearchStudentId);
		
		studentid = new JTextField();
		studentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					editstudentinformationintodatabase();
				}
			}
		});
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 17));
		studentid.setColumns(10);
		studentid.setBorder(null);
		studentid.setBounds(393, 36, 176, 19);
		contentPane.add(studentid);
		
		JLabel lblStudentid = new JLabel("Student_id");
		lblStudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentid.setBounds(264, 99, 106, 22);
		contentPane.add(lblStudentid);
		
		studentidfirst = new JTextField();
		studentidfirst.setFont(new Font("Tahoma", Font.PLAIN, 17));
		studentidfirst.setColumns(10);
		studentidfirst.setBorder(null);
		studentidfirst.setBounds(393, 99, 176, 19);
		contentPane.add(studentidfirst);
		
		requiredstudentid = new JLabel("");
		requiredstudentid.setForeground(Color.RED);
		requiredstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredstudentid.setBounds(610, 37, 219, 22);
		contentPane.add(requiredstudentid);
		Image a = new ImageIcon(this.getClass().getResource("/cancel.png")).getImage();
	}
	
	/*
	 * create a method to edit the student information into the database
	 */
	
	 public void editstudentinformationintodatabase() {
		  	
		 if (studentid.getText().isEmpty()) {
		 		requiredstudentid.setText("Required");
		 		return;
		 	} 	
		 	try {
		 		Integer.parseInt(studentid.getText());
		 	}catch(NumberFormatException e) {
		 		requiredstudentid.setText("Integer only");
		 		return;
		 	}
		 
		    Statement st = null;
			ResultSet rs = null;
		 try {
				Connection con = DatabaseConnection.getConnection();
				String query = "select * from studentinformation where studentid = "+Integer.parseInt(studentid.getText())+"";
			    st = con.createStatement();
			    rs = st.executeQuery(query);
				if (rs.next()) {
					studentidfirst.setText(rs.getString("Studentid"));
					firstname.setText(rs.getString("First_name"));
					lastname.setText(rs.getString("Last_name"));
					fathername.setText(rs.getString("Father_name"));
					mothername.setText(rs.getString("Mother_name"));
					address.setText(rs.getString("Address"));
					dateofbirth.setDate(rs.getDate("Date_of_birth"));
				}else {
					requiredstudentid.setText("No data found");
					return;
				}
				
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2);
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
}
