package usermanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.AddUserDetailDataDeclaration;
import databaseConnection.DatabaseConnection;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Deleteuserinformation extends JFrame {

	private JPanel contentPane;
	private JTextField editusersearchuserid;
	private JLabel lblUserId;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField edituseruserid;
	private JTextField edituserfirstname;
	private JTextField edituserlastname;
	private JTextField edituserfathername;
	private JTextField editusermothername;
	private JTextField edituseraddress;
	private JTextField edituserusername;
	private JTextField edituserpassword;
	private JTextField edituserphone;
	private JLabel requireddeleteuserid;
	private JLabel requireddeleteuserid_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edituserinformation frame = new Edituserinformation();
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
	public Deleteuserinformation() {
		setResizable(false);
		setTitle("delete user information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by user id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 23, 148, 26);
		contentPane.add(lblNewLabel);
		
		editusersearchuserid = new JTextField();
		editusersearchuserid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requireddeleteuserid.setText(null);
			}
		});
		editusersearchuserid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {	
				requireddeleteuserid.setText(null);
				requireddeleteuserid_1.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(editusersearchuserid.getText().isEmpty()) {
						requireddeleteuserid.setText("*Required");
						return;
					}
					try {
						Integer.parseInt(editusersearchuserid.getText());
					} catch (NumberFormatException e2) {
						requireddeleteuserid.setText("Integer Only");
						return;
					}
					showuserinformationinjfield();
				}
			}
		});
		editusersearchuserid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editusersearchuserid.setBounds(168, 23, 190, 26);
		contentPane.add(editusersearchuserid);
		editusersearchuserid.setColumns(10);
		
		lblUserId = new JLabel("User id");
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUserId.setBounds(316, 76, 148, 26);
		contentPane.add(lblUserId);
		
		lblNewLabel_2 = new JLabel("First name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(316, 112, 148, 26);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Last name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(316, 148, 148, 26);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Father name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(316, 184, 148, 26);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Mother name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(316, 224, 148, 26);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_1 = new JLabel("Address\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(316, 260, 148, 26);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_6 = new JLabel("Username");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(316, 296, 148, 26);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(316, 332, 148, 26);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(316, 368, 148, 26);
		contentPane.add(lblNewLabel_8);
		
		edituseruserid = new JTextField();
		edituseruserid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituseruserid.setColumns(10);
		edituseruserid.setBounds(474, 76, 190, 26);
		contentPane.add(edituseruserid);
		
		edituserfirstname = new JTextField();
		edituserfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserfirstname.setColumns(10);
		edituserfirstname.setBounds(474, 112, 190, 26);
		contentPane.add(edituserfirstname);
		
		edituserlastname = new JTextField();
		edituserlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserlastname.setColumns(10);
		edituserlastname.setBounds(474, 148, 190, 26);
		contentPane.add(edituserlastname);
		
		edituserfathername = new JTextField();
		edituserfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserfathername.setColumns(10);
		edituserfathername.setBounds(474, 184, 190, 26);
		contentPane.add(edituserfathername);
		
		editusermothername = new JTextField();
		editusermothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editusermothername.setColumns(10);
		editusermothername.setBounds(474, 224, 190, 26);
		contentPane.add(editusermothername);
		
		edituseraddress = new JTextField();
		edituseraddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituseraddress.setColumns(10);
		edituseraddress.setBounds(474, 260, 190, 26);
		contentPane.add(edituseraddress);
		
		edituserusername = new JTextField();
		edituserusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserusername.setColumns(10);
		edituserusername.setBounds(474, 296, 190, 26);
		contentPane.add(edituserusername);
		
		edituserpassword = new JTextField();
		edituserpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserpassword.setColumns(10);
		edituserpassword.setBounds(474, 332, 190, 26);
		contentPane.add(edituserpassword);
		
		edituserphone = new JTextField();
		edituserphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edituserphone.setColumns(10);
		edituserphone.setBounds(474, 368, 190, 26);
		contentPane.add(edituserphone);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(edituseruserid.getText().isEmpty()) {
					requireddeleteuserid_1.setText("See user details before delete!");
					return;
				}
				
				
				AddUserDetailDataDeclaration user = new AddUserDetailDataDeclaration();
				Deleteuserinformationdatabasecode delete = new Deleteuserinformationdatabasecode();
				user.setUserid(Integer.parseInt(editusersearchuserid.getText()));
				if (delete.deleteuserinformation(user)) {
					JOptionPane.showConfirmDialog(null, "User deleted successfully.");
					editusersearchuserid.setText(null);
					edituseruserid.setText(null);
					edituserfirstname.setText(null);
					edituserlastname.setText(null);
					edituserfathername.setText(null);
					editusermothername.setText(null);
					edituseraddress.setText(null);
					edituserusername.setText(null);
					edituserpassword.setText(null);
					edituserphone.setText(null);
				}else {
					JOptionPane.showConfirmDialog(null, "deletion not successfull.");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(520, 404, 102, 26);
		contentPane.add(btnNewButton);
		
		requireddeleteuserid = new JLabel("");
		requireddeleteuserid.setForeground(Color.RED);
		requireddeleteuserid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeleteuserid.setBounds(382, 23, 190, 26);
		contentPane.add(requireddeleteuserid);
		
		requireddeleteuserid_1 = new JLabel("");
		requireddeleteuserid_1.setForeground(Color.RED);
		requireddeleteuserid_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeleteuserid_1.setBounds(10, 76, 258, 26);
		contentPane.add(requireddeleteuserid_1);
	}
	public void showuserinformationinjfield() {
		
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "select * from userinformation where user_id = "+editusersearchuserid.getText()+"";
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			edituseruserid.setText(rs.getString(1));
			edituserfirstname.setText(rs.getString(2));
			edituserlastname.setText(rs.getString(3));
			edituserfathername.setText(rs.getString(4));
			editusermothername.setText(rs.getString(5));
			edituseraddress.setText(rs.getString(6));
			edituserusername.setText(rs.getString(7));
			edituserpassword.setText(rs.getString(8));
			edituserphone.setText(rs.getString(10));		
		} catch (Exception e) {
			requireddeleteuserid_1.setText("No data found");
			return;
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
