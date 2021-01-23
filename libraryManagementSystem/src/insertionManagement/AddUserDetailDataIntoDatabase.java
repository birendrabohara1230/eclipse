package insertionManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import dao.AddUserDetailDataDeclaration;
import database.AddUserDetailDataIntoDatabaseCode;
import databaseConnection.DatabaseConnection;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddUserDetailDataIntoDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JTextField username;
	private JPasswordField password;
	private JLabel invalidphonenumber;
	private JLabel lblJoinDate;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField fathername;
	private JTextField mothername;
	private JTextField address;
	private JTextField phone;
	private JLabel requireduserid;
	private JLabel requiredfirstname;
	private JLabel requiredlastname;
	private JLabel requiredfathername;
	private JLabel requiredmothername;
	private JLabel requiredaddress;
	private JLabel requiredusername;
	private JLabel requiredpassword;
	private JLabel requiredphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUserDetailDataIntoDatabase frame = new AddUserDetailDataIntoDatabase();
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
	public AddUserDetailDataIntoDatabase() {
		setResizable(false);
		setTitle("add user information");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Userid\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(215, 54, 107, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsernam = new JLabel("Username");
		lblUsernam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsernam.setBounds(215, 234, 118, 29);
		contentPane.add(lblUsernam);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(215, 266, 118, 29);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Phone");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(215, 296, 70, 29);
		contentPane.add(lblEmail);
		
		userid = new JTextField();
		userid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		userid.setBorder(null);
		userid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userid.setBounds(369, 52, 257, 22);
		contentPane.add(userid);
		userid.setColumns(10);
		
		username = new JTextField();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		username.setBorder(null);
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setColumns(10);
		username.setBounds(369, 241, 257, 22);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		password.setBorder(null);
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setBounds(369, 273, 257, 22);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				adduserinfomationintodatabase();
			}		
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(442, 335, 80, 25);
		contentPane.add(btnNewButton);
		
		invalidphonenumber = new JLabel("");
		invalidphonenumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		invalidphonenumber.setForeground(Color.RED);
		invalidphonenumber.setBounds(444, 438, 257, 25);
		contentPane.add(invalidphonenumber);
		
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(215, 79, 107, 27);
		contentPane.add(lblFirstName);
		
		firstname = new JTextField();
		firstname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		firstname.setColumns(10);
		firstname.setBorder(null);
		firstname.setBounds(369, 84, 257, 22);
		contentPane.add(firstname);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(215, 111, 107, 27);
		contentPane.add(lblLastName);
		
		lastname = new JTextField();
		lastname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lastname.setColumns(10);
		lastname.setBorder(null);
		lastname.setBounds(369, 116, 257, 22);
		contentPane.add(lastname);
		
		JLabel lblFatherName = new JLabel("Father name");
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFatherName.setBounds(215, 141, 129, 29);
		contentPane.add(lblFatherName);
		
		JLabel lblMotherName = new JLabel("Mother name");
		lblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotherName.setBounds(215, 171, 129, 29);
		contentPane.add(lblMotherName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(215, 201, 107, 29);
		contentPane.add(lblAddress);
		
		fathername = new JTextField();
		fathername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		fathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fathername.setColumns(10);
		fathername.setBorder(null);
		fathername.setBounds(369, 148, 257, 22);
		contentPane.add(fathername);
		
		mothername = new JTextField();
		mothername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		mothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mothername.setColumns(10);
		mothername.setBorder(null);
		mothername.setBounds(369, 178, 257, 22);
		contentPane.add(mothername);
		
		address = new JTextField();
		address.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		address.setColumns(10);
		address.setBorder(null);
		address.setBounds(369, 208, 257, 22);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyTextField();
			}
		});
		phone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		phone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					adduserinfomationintodatabase();
				}
			}
		});
		phone.setBounds(369, 303, 257, 22);
		contentPane.add(phone);
		phone.setColumns(10);
		
		requireduserid = new JLabel("");
		requireduserid.setForeground(Color.RED);
		requireduserid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireduserid.setBounds(636, 54, 209, 22);
		contentPane.add(requireduserid);
		
		requiredfirstname = new JLabel("");
		requiredfirstname.setForeground(Color.RED);
		requiredfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredfirstname.setBounds(636, 86, 209, 22);
		contentPane.add(requiredfirstname);
		
		requiredlastname = new JLabel("");
		requiredlastname.setForeground(Color.RED);
		requiredlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredlastname.setBounds(636, 116, 209, 22);
		contentPane.add(requiredlastname);
		
		requiredfathername = new JLabel("");
		requiredfathername.setForeground(Color.RED);
		requiredfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredfathername.setBounds(636, 148, 209, 22);
		contentPane.add(requiredfathername);
		
		requiredmothername = new JLabel("");
		requiredmothername.setForeground(Color.RED);
		requiredmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredmothername.setBounds(636, 175, 209, 25);
		contentPane.add(requiredmothername);
		
		requiredaddress = new JLabel("");
		requiredaddress.setForeground(Color.RED);
		requiredaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredaddress.setBounds(636, 208, 209, 22);
		contentPane.add(requiredaddress);
		
		requiredusername = new JLabel("");
		requiredusername.setForeground(Color.RED);
		requiredusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredusername.setBounds(636, 241, 209, 22);
		contentPane.add(requiredusername);
		
		requiredpassword = new JLabel("");
		requiredpassword.setForeground(Color.RED);
		requiredpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredpassword.setBounds(636, 273, 209, 22);
		contentPane.add(requiredpassword);
		
		requiredphone = new JLabel("");
		requiredphone.setForeground(Color.RED);
		requiredphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredphone.setBounds(636, 303, 209, 22);
		contentPane.add(requiredphone);
	}

	/*
	 *  Create a method to add the student information into the database
	 */
	
	private void adduserinfomationintodatabase() {
		
		if(userid.getText().isBlank()) {
			requireduserid.setText("Required");
			return;
		}
		
		try {
			Integer.parseInt(userid.getText());
		} catch (NumberFormatException e) {
			requireduserid.setText("Integer only");
			return;
		}
			
		if(firstname.getText().isEmpty()) {
			requiredfirstname.setText("Required");
			return;
		}
		if(lastname.getText().isEmpty()) {
			requiredlastname.setText("Required");
			return;
		}
		if(fathername.getText().isEmpty()) {
			requiredfathername.setText("Required");
			return;
		}
		if(mothername.getText().isEmpty()) {
			requiredmothername.setText("Required");
			return;
		}
		if(address.getText().isEmpty()) {
			requiredaddress.setText("Required");
			return;
		}
		
		if (username.getText().isEmpty()) {
			requireduserid.setText("Required");
			return;
		}
		if (password.getText().isEmpty()) {
			requiredpassword.setText("Required");
			return;
		}
		
		if(phone.getText().isEmpty()) {
			requiredphone.setText("Required");
			return;
		}
		
		AddUserDetailDataDeclaration object = new AddUserDetailDataDeclaration();
		object.setUserid(Integer.parseInt(userid.getText()));
		object.setUsername(username.getText());
		object.setPassword(password.getText());
		object.setPhone(phone.getText());
		object.setFirstname(firstname.getText());
		object.setLastname(lastname.getText());
		object.setFathername(fathername.getText());
		object.setMothername(mothername.getText());
		object.setAddress(address.getText());
		AddUserDetailDataIntoDatabaseCode insert = new AddUserDetailDataIntoDatabaseCode();
		if (insert.insertDetailDataIntoDatabase(object))
		{
			JOptionPane.showConfirmDialog(null, "User added Successfully.");
		}else
		{
			JOptionPane.showConfirmDialog(null, "User not added.");
		}	
		userid.setText(null);
		username.setText(null);
		password.setText(null);
		phone.setText(null);
		fathername.setText(null);
		mothername.setText(null);
		firstname.setText(null);
		lastname.setText(null);
		address.setText(null);	
	}
	
	void emptyTextField() {
		requireduserid.setText(null);
		requiredfirstname.setText(null);
		requiredlastname.setText(null);
		requiredfathername.setText(null);
		requiredmothername.setText(null);
		requiredaddress.setText(null);
		requiredusername.setText(null);
		requiredpassword.setText(null);
		requiredphone.setText(null);
	}
}
