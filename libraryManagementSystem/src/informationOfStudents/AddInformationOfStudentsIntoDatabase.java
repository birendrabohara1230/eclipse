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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JLabel requiredaddstudentid;
	private JLabel requiredaddstudentfirstname;
	private JLabel requiredaddstudentlastname;
	private JLabel requiredaddstudentfathername;
	private JLabel requiredaddstudentmothername;
	private JLabel requiredaddstudentaddress;
	private JLabel requiredaddstudentdob;

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
		firstname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		firstname.setBorder(null);
		firstname.setBounds(406, 121, 198, 27);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lastname.setColumns(10);
		lastname.setBorder(null);
		lastname.setBounds(406, 157, 198, 27);
		contentPane.add(lastname);
		
		fathername = new JTextField();
		fathername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		fathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fathername.setColumns(10);
		fathername.setBorder(null);
		fathername.setBounds(406, 194, 198, 27);
		contentPane.add(fathername);
		
		mothername = new JTextField();
		mothername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		mothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mothername.setColumns(10);
		mothername.setBorder(null);
		mothername.setBounds(406, 231, 198, 27);
		contentPane.add(mothername);
		
		address = new JTextField();
		address.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		address.setColumns(10);
		address.setBorder(null);
		address.setBounds(406, 268, 198, 27);
		contentPane.add(address);
		
	    dateofbirth = new JDateChooser();
	    dateofbirth.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		setRequiredLabelNull();
	    	}
	    });
	    dateofbirth.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyPressed(KeyEvent e) {
	    		setRequiredLabelNull();
	    	}
	    });
		dateofbirth.setBounds(406, 305, 198, 27);
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
		studentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
			}
		});
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		studentid.setColumns(10);
		studentid.setBorder(null);
		studentid.setBounds(406, 82, 198, 27);
		contentPane.add(studentid);
		
		comboBox = new JComboBox<String>();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Science and Technology", "Education", "Engineering", "Humanity"}));
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setRequiredLabelNull();
				
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
		comboBox.setBounds(406, 342, 235, 27);
		contentPane.add(comboBox);
		
		requiredaddstudentid = new JLabel("");
		requiredaddstudentid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentid.setBounds(614, 81, 158, 27);
		contentPane.add(requiredaddstudentid);
		
		requiredaddstudentfirstname = new JLabel("");
		requiredaddstudentfirstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentfirstname.setBounds(614, 120, 158, 27);
		contentPane.add(requiredaddstudentfirstname);
		
		requiredaddstudentlastname = new JLabel("");
		requiredaddstudentlastname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentlastname.setBounds(614, 157, 158, 27);
		contentPane.add(requiredaddstudentlastname);
		
		requiredaddstudentfathername = new JLabel("");
		requiredaddstudentfathername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentfathername.setBounds(614, 194, 158, 27);
		contentPane.add(requiredaddstudentfathername);
		
		requiredaddstudentmothername = new JLabel("");
		requiredaddstudentmothername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentmothername.setBounds(614, 231, 158, 27);
		contentPane.add(requiredaddstudentmothername);
		
		requiredaddstudentaddress = new JLabel("");
		requiredaddstudentaddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentaddress.setBounds(614, 268, 158, 27);
		contentPane.add(requiredaddstudentaddress);
		
		requiredaddstudentdob = new JLabel("");
		requiredaddstudentdob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requiredaddstudentdob.setBounds(614, 305, 158, 27);
		contentPane.add(requiredaddstudentdob);
	}
	
	/*
	 *  Create a method to add the student information into the database
	 */
	
	public void addstudentinformationintodatabase() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = null;
		
		if(studentid.getText().isEmpty()) {
			requiredaddstudentid.setText("Required");
			return;
		}
		try {
			Integer.parseInt(studentid.getText());
		} catch (NumberFormatException e) {
			requiredaddstudentid.setText("Integer Only");
			return;
		}
		if(firstname.getText().isEmpty()) {
			requiredaddstudentfirstname.setText("Required");
			return;
		}
		if(lastname.getText().isEmpty()) {
			requiredaddstudentlastname.setText("Required");
			return;
		}
		if(fathername.getText().isEmpty()) {
			requiredaddstudentfathername.setText("Required");
			return;
		}
		if(mothername.getText().isEmpty()) {
			requiredaddstudentmothername.setText("Required");
			return;
		}
		
		if(address.getText().isEmpty()) {
			requiredaddstudentaddress.setText("Required");
			return;
		}
		try {
		 date = sdf.format(dateofbirth.getDate());
		} catch (Exception e) {
			requiredaddstudentdob.setText("Required");
			return;
		}		
		StudentInformation student = new StudentInformation();
		student.setStudentid(Integer.parseInt(studentid.getText()));
		student.setFirstname(firstname.getText());
		student.setLastname(lastname.getText());
		student.setFathername(fathername.getText());
		student.setMothername(mothername.getText());
		student.setAddress(address.getText());
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
	
	void setRequiredLabelNull() {
		requiredaddstudentid.setText(null);
		requiredaddstudentfirstname.setText(null);
		requiredaddstudentlastname.setText(null);
		requiredaddstudentfathername.setText(null);
		requiredaddstudentmothername.setText(null);
		requiredaddstudentaddress.setText(null);
		requiredaddstudentdob.setText(null);
	}
}
