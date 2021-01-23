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
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
    private JLabel usernameandpasswordinvalid;
    private JLabel requiredusername;
    private JLabel requiredpassword;
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
					JOptionPane.showConfirmDialog(null, e.toString());
				}			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setVisible(true);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		setTitle("login");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(176, 196, 222)));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(108, 95, 144, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(108, 141, 121, 36);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		username = new JTextField();
		username.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {	
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					login();
				}
			}
		});
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 requiredusername.setText(null);
			 requiredpassword.setText(null);
			 usernameandpasswordinvalid.setText(null);
			}
		});
		username.setBounds(274, 101, 294, 32);
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		username.setColumns(10);
		
		password = new JPasswordField();
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requiredusername.setText(null);
				requiredpassword.setText(null);
				usernameandpasswordinvalid.setText(null);
			}
		});
		password.setBounds(274, 143, 294, 35);
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
		password.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(273, 244, 98, 36);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JCheckBox showpassword = new JCheckBox("Show password");
		showpassword.setBounds(274, 206, 164, 28);
		showpassword.setBackground(Color.WHITE);
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
		btnNewButton_1.setBounds(446, 244, 121, 36);
		btnNewButton_1.setBackground(Color.WHITE);
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
		
	    usernameandpasswordinvalid = new JLabel("");
	    usernameandpasswordinvalid.setBounds(271, 177, 316, 24);
		usernameandpasswordinvalid.setForeground(Color.RED);
		usernameandpasswordinvalid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(usernameandpasswordinvalid);
		contentPane.add(lblPassword);
		contentPane.add(lblNewLabel);
		contentPane.add(showpassword);
		contentPane.add(username);
		contentPane.add(password);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		
		requiredusername = new JLabel("");
		requiredusername.setForeground(Color.RED);
		requiredusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredusername.setBounds(595, 99, 201, 36);
		contentPane.add(requiredusername);
		
		requiredpassword = new JLabel("");
		requiredpassword.setForeground(Color.RED);
		requiredpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredpassword.setBounds(595, 141, 201, 36);
		contentPane.add(requiredpassword);
	}
	
	public void login() {
		
		if(username.getText().isEmpty()) {
			requiredusername.setText("Required");
			return;
		}
		
		if (password.getText().isEmpty()) {
			requiredpassword.setText("Required");
			return;
		}
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
			usernameandpasswordinvalid.setText("invalid username or password");
		}
	}
}
