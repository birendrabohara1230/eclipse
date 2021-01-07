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

public class StudentandBookNumber extends JFrame {

	private JPanel contentPane;
	private JTextField studentid;
	private JTextField booknumber;

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
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentandBookNumber() {
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
		
		studentid = new JTextField();
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		studentid.setBorder(null);
		studentid.setBounds(217, 52, 191, 26);
		contentPane.add(studentid);
		studentid.setColumns(10);
		
		JLabel lblBookNumber = new JLabel("Book number");
		lblBookNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookNumber.setBounds(70, 102, 112, 26);
		contentPane.add(lblBookNumber);
		
		booknumber = new JTextField();
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setColumns(10);
		booknumber.setBorder(null);
		booknumber.setBounds(217, 102, 191, 26);
		contentPane.add(booknumber);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addbook();
			}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 19));
		add.setBounds(261, 158, 102, 34);
		contentPane.add(add);
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
		}else {
			JOptionPane.showConfirmDialog(null, "Book Not added!!");
		}
	}
	
}
