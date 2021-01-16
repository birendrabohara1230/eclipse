package informationOfStudents;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;

import dao.StudentInformation;
import database.AddStudentInformationIntoDatabase;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddInformationOfStudentsIntoDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField fathername;
	private JTextField mothername;
	private JTextField address;
	private JTextField studentid;
	private JComboBox<String> comboBox;
	private JDateChooser dateofbirth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddInformationOfStudentsIntoDatabase frame = new AddInformationOfStudentsIntoDatabase();
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
	public AddInformationOfStudentsIntoDatabase() {
		setAlwaysOnTop(true);
		setTitle("add student information");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(257, 120, 132, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(257, 157, 132, 27);
		contentPane.add(lblLastName);
		
		JLabel lblFathersName = new JLabel("Father's name");
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFathersName.setBounds(257, 194, 132, 27);
		contentPane.add(lblFathersName);
		
		JLabel lblMothersName = new JLabel("Mother's name");
		lblMothersName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMothersName.setBounds(257, 231, 132, 27);
		contentPane.add(lblMothersName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(257, 268, 132, 27);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDob.setBounds(257, 305, 132, 27);
		contentPane.add(lblDob);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDepartment.setBounds(257, 342, 132, 27);
		contentPane.add(lblDepartment);
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		firstname.setBorder(null);
		firstname.setBounds(406, 121, 198, 27);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lastname.setColumns(10);
		lastname.setBorder(null);
		lastname.setBounds(406, 157, 198, 27);
		contentPane.add(lastname);
		
		fathername = new JTextField();
		fathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fathername.setColumns(10);
		fathername.setBorder(null);
		fathername.setBounds(406, 194, 198, 27);
		contentPane.add(fathername);
		
		mothername = new JTextField();
		mothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mothername.setColumns(10);
		mothername.setBorder(null);
		mothername.setBounds(406, 231, 198, 27);
		contentPane.add(mothername);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		address.setColumns(10);
		address.setBorder(null);
		address.setBounds(406, 268, 198, 27);
		contentPane.add(address);
		
	    dateofbirth = new JDateChooser();
		dateofbirth.setBounds(406, 305, 198, 19);
		contentPane.add(dateofbirth);
		
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addstudentinformationintodatabase();
			}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add.setBounds(447, 391, 85, 27);
		contentPane.add(add);
		
		JLabel lblStudentId = new JLabel("Student id");
		lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentId.setBounds(257, 81, 132, 27);
		contentPane.add(lblStudentId);
		
		studentid = new JTextField();
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		studentid.setColumns(10);
		studentid.setBorder(null);
		studentid.setBounds(406, 82, 198, 27);
		contentPane.add(studentid);
		
		comboBox = new JComboBox<String>();
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					addstudentinformationintodatabase();
				}
				
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.addItem("Humanities and Social Science");
		comboBox.addItem("Management");
		comboBox.addItem("Education");
		comboBox.addItem("Science and Technology");
		comboBox.addItem("Engineering");
		comboBox.addItem("Agriculture Science");
		comboBox.setBounds(406, 342, 198, 27);
		contentPane.add(comboBox);
	}
	
	/*
	 *  Create a method to add the student information into the database
	 */
	
	public void addstudentinformationintodatabase() {
		
		StudentInformation student = new StudentInformation();
		student.setStudentid(Integer.parseInt(studentid.getText()));
		student.setFirstname(firstname.getText());
		student.setLastname(lastname.getText());
		student.setFathername(fathername.getText());
		student.setMothername(mothername.getText());
		student.setAddress(address.getText());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateofbirth.getDate());
		student.setDob(date);
		student.setDepartment((String) comboBox.getSelectedItem());
		AddStudentInformationIntoDatabase st = new AddStudentInformationIntoDatabase();
		boolean flag = st.add(student);
		if ( flag )
		{
			JOptionPane.showConfirmDialog(null, "Added successfully");
		}else
		{
			JOptionPane.showConfirmDialog(null, "Added not successfully");
		}
		
		studentid.setText(null);
		firstname.setText(null);
		lastname.setText(null);
		fathername.setText(null);
		mothername.setText(null);
		address.setText(null);
		dateofbirth.setDate(null);		
	}	
}
