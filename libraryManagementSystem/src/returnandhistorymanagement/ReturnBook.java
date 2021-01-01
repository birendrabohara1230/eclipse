package returnandhistorymanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookInformation.BookInformation;
import dao.StudentInformation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField returnbookstudentid;
	private JTextField returnbookbooknumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(490 , 200, 596, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(94, 65, 119, 23);
		contentPane.add(lblNewLabel);
		
		JLabel booknumber = new JLabel("Book number");
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setBounds(94, 105, 119, 23);
		contentPane.add(booknumber);
		
		returnbookstudentid = new JTextField();
		returnbookstudentid.setFont(new Font("Tahoma", Font.PLAIN, 17));
		returnbookstudentid.setBounds(242, 68, 158, 23);
		contentPane.add(returnbookstudentid);
		returnbookstudentid.setColumns(10);
		
		returnbookbooknumber = new JTextField();
		returnbookbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					bookreturned();
				}
			}
		});
		returnbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		returnbookbooknumber.setColumns(10);
		returnbookbooknumber.setBounds(242, 108, 158, 23);
		contentPane.add(returnbookbooknumber);
		
		JLabel lblNewLabel_1 = new JLabel("Return book");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bookreturned();
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(262, 155, 119, 23);
		contentPane.add(lblNewLabel_1);
	}
	public void showingstudentid(StudentInformation show) {
		returnbookstudentid.setText(Integer.toString(show.getStudentid()));
	}
	
	public void bookreturned() {
		BookInformation book = new BookInformation();
		StudentInformation student = new StudentInformation();
		book.setBooknumber(Integer.parseInt(returnbookbooknumber.getText()));
		student.setStudentid(Integer.parseInt(returnbookstudentid.getText()));
		Historyofstudentandbookinformation historyofstudent = new Historyofstudentandbookinformation();
		historyofstudent.historyofstudent(student, book);
		Returnbookbystudent returnbook = new Returnbookbystudent();
		if (returnbook.returnbook(book)) {
			JOptionPane.showConfirmDialog(null,"Returned successfully.");
		}else {
			JOptionPane.showConfirmDialog(null, "Book not returned.");
		}
	}
}
