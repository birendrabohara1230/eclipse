package loginManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.UserLoginDeclaration;
import database.AddUserIntoDatabase;
import informationOfStudents.AddInformationOfStudentsIntoDatabase;
import insertionManagement.AddUserDetailDataIntoDatabase;
import searchManagement.StudentInformationAndBookDetails;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
    private JLabel usernameempty;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(490 , 200, 596, 298);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(49, 41, 144, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(49, 87, 121, 36);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		username = new JTextField();
		username.setBounds(203, 44, 294, 32);
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBorder(null);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(203, 88, 294, 35);
		password.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					login();
				}
			}
		});
		password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		password.setBorder(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(203, 198, 98, 36);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JCheckBox showpassword = new JCheckBox("Show password");
		showpassword.setBounds(203, 160, 164, 28);
		showpassword.setBackground(new Color(255, 248, 220));
		showpassword.setBorder(null);
		showpassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (showpassword.isSelected())
				{
					password.setEchoChar((char)0);
				}else
				{
					password.setEchoChar('*');
				}
			}
		});
		showpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setBounds(326, 198, 121, 36);
		btnNewButton_1.setBackground(new Color(240, 255, 255));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUserDetailDataIntoDatabase object = new AddUserDetailDataIntoDatabase();
				object.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    contentPane.setLayout(null);
		
	    usernameempty = new JLabel("");
	    usernameempty.setBounds(203, 126, 316, 24);
		usernameempty.setForeground(Color.RED);
		usernameempty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(usernameempty);
		contentPane.add(lblPassword);
		contentPane.add(lblNewLabel);
		contentPane.add(showpassword);
		contentPane.add(username);
		contentPane.add(password);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
	}
	
	public void login() {
		UserLoginDeclaration object = new UserLoginDeclaration();
		object.setUserName(username.getText());
		object.setPassword(password.getText());
		AddUserIntoDatabase obj = new AddUserIntoDatabase();
		if (obj.conform(object))
		{
			StudentInformationAndBookDetails studentbook = new StudentInformationAndBookDetails();
			studentbook.setVisible(true);
			dispose();
		}
		else
		{
			usernameempty.setText("invalid username or password");
		}
	}
}
