package bookandstudentinformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookInformation.BookInformation;
import dao.StudentInformation;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentandBookNumber extends JFrame {

	private JPanel contentPane;
	private JTextField booknumber;
	private JLabel studentid;
	private JLabel requiredaddbookbooknumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentandBookNumber frame = new StudentandBookNumber();
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
	public StudentandBookNumber() {
		setResizable(false);
		setTitle("add book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(490, 200, 598, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(70, 52, 112, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblBookNumber = new JLabel("Book number");
		lblBookNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookNumber.setBounds(70, 102, 112, 26);
		contentPane.add(lblBookNumber);
		
		booknumber = new JTextField();
		booknumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requiredaddbookbooknumber.setText(null);
			}
		});
		booknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requiredaddbookbooknumber.setText(null);
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(booknumber.getText().isEmpty()) {
						requiredaddbookbooknumber.setText("Required");
						return;
					}
					addbook();
				}
				
			}
		});
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setColumns(10);
		booknumber.setBorder(null);
		booknumber.setBounds(217, 102, 191, 26);
		contentPane.add(booknumber);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(booknumber.getText().isEmpty()) {
					requiredaddbookbooknumber.setText("Required");
					return;
				}	
				addbook();
			}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 19));
		add.setBounds(261, 158, 102, 34);
		contentPane.add(add);
		
		studentid = new JLabel("");
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		studentid.setBounds(217, 52, 191, 26);
		contentPane.add(studentid);
		
		requiredaddbookbooknumber = new JLabel("");
		requiredaddbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredaddbookbooknumber.setBounds(414, 102, 160, 26);
		contentPane.add(requiredaddbookbooknumber);
	}
	public void showingstudentid(StudentInformation show) {
		studentid.setText(Integer.toString(show.getStudentid()));
	}
	
	public void addbook() {
		
		BookInformation book = new BookInformation();
		StudentInformation student = new StudentInformation();
		book.setBooknumber(Integer.parseInt(booknumber.getText()));	
		student.setStudentid(Integer.parseInt(studentid.getText()));
		AddBookIntoStudentRecord add = new AddBookIntoStudentRecord();
		if ( add.addbookintostudentrecord(book, student)) {
			JOptionPane.showConfirmDialog(null, "Book added successfully");
			booknumber.setText(null);
		}else {
			JOptionPane.showConfirmDialog(null, "Book Not added!!");
			requiredaddbookbooknumber.setText(null);
		}
	}
	
}
