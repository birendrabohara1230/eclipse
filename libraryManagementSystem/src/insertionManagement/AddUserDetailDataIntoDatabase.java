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
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddUserDetailDataIntoDatabase() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("add user information");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 1089, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Userid\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(290, 120, 107, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsernam = new JLabel("Username");
		lblUsernam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsernam.setBounds(290, 300, 118, 34);
		contentPane.add(lblUsernam);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(290, 332, 118, 34);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Phone");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(290, 362, 70, 34);
		contentPane.add(lblEmail);
		
		userid = new JTextField();
		userid.setBorder(null);
		userid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userid.setBounds(444, 118, 257, 22);
		contentPane.add(userid);
		userid.setColumns(10);
		
		username = new JTextField();
		username.setBorder(null);
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setColumns(10);
		username.setBounds(444, 307, 257, 22);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.setBorder(null);
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setBounds(444, 339, 257, 22);
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
		btnNewButton.setBounds(517, 401, 80, 25);
		contentPane.add(btnNewButton);
		
		invalidphonenumber = new JLabel("");
		invalidphonenumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		invalidphonenumber.setForeground(Color.RED);
		invalidphonenumber.setBounds(444, 438, 257, 25);
		contentPane.add(invalidphonenumber);
		
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(290, 145, 107, 33);
		contentPane.add(lblFirstName);
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		firstname.setColumns(10);
		firstname.setBorder(null);
		firstname.setBounds(444, 150, 257, 22);
		contentPane.add(firstname);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(290, 177, 107, 34);
		contentPane.add(lblLastName);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lastname.setColumns(10);
		lastname.setBorder(null);
		lastname.setBounds(444, 182, 257, 22);
		contentPane.add(lastname);
		
		JLabel lblFatherName = new JLabel("Father name");
		lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFatherName.setBounds(290, 207, 129, 34);
		contentPane.add(lblFatherName);
		
		JLabel lblMotherName = new JLabel("Mother name");
		lblMotherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotherName.setBounds(290, 237, 129, 34);
		contentPane.add(lblMotherName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(290, 267, 107, 34);
		contentPane.add(lblAddress);
		
		fathername = new JTextField();
		fathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fathername.setColumns(10);
		fathername.setBorder(null);
		fathername.setBounds(444, 214, 257, 22);
		contentPane.add(fathername);
		
		mothername = new JTextField();
		mothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mothername.setColumns(10);
		mothername.setBorder(null);
		mothername.setBounds(444, 244, 257, 22);
		contentPane.add(mothername);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		address.setColumns(10);
		address.setBorder(null);
		address.setBounds(444, 274, 257, 22);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		phone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					adduserinfomationintodatabase();
				}
			}
		});
		phone.setBounds(444, 369, 257, 22);
		contentPane.add(phone);
		phone.setColumns(10);
	}

	/*
	 *  Create a method to add the student information into the database
	 */
	
	private void adduserinfomationintodatabase() {
		
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
			JOptionPane.showConfirmDialog(null, "Insertion is Successfull.");
		}else
		{
			JOptionPane.showConfirmDialog(null, "Insertion is not Successfull.");
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
}
