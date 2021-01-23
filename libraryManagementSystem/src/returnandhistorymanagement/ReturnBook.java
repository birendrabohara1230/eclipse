package returnandhistorymanagement;

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

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField returnbookbooknumber;
	private JLabel requiredreturnbookbooknumber;
	private JLabel returnbookstudentid;

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
					JOptionPane.showConfirmDialog(null, e.toString());
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReturnBook() {
		setResizable(false);
		setTitle("return book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(490, 200, 598, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(126, 40, 119, 23);
		contentPane.add(lblNewLabel);
		
		JLabel booknumber = new JLabel("Book number");
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setBounds(126, 80, 119, 23);
		contentPane.add(booknumber);
		
		returnbookbooknumber = new JTextField();
		returnbookbooknumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requiredreturnbookbooknumber.setText(null);
			}
		});
		returnbookbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				requiredreturnbookbooknumber.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(returnbookbooknumber.getText().isEmpty()) {
						requiredreturnbookbooknumber.setText("Required");
						return;
					}	
					bookreturned();
				}
			}
		});
		returnbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		returnbookbooknumber.setColumns(10);
		returnbookbooknumber.setBounds(276, 79, 158, 23);
		contentPane.add(returnbookbooknumber);
		
		JLabel lblNewLabel_1 = new JLabel("Return book");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bookreturned();
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(296, 126, 119, 23);
		contentPane.add(lblNewLabel_1);
		
		requiredreturnbookbooknumber = new JLabel("");
		requiredreturnbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredreturnbookbooknumber.setBounds(444, 80, 119, 23);
		contentPane.add(requiredreturnbookbooknumber);
		
		returnbookstudentid = new JLabel("");
		returnbookstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		returnbookstudentid.setBounds(276, 40, 158, 23);
		contentPane.add(returnbookstudentid);
	}
	public void showingstudentid(StudentInformation show) {
		returnbookstudentid.setText(Integer.toString(show.getStudentid()));
	}
	
	
	public void bookreturned() {
		
		
		if(returnbookbooknumber.getText().isEmpty()) {
			requiredreturnbookbooknumber.setText("Required");
			return;
		}
		BookInformation book = new BookInformation();
		StudentInformation student = new StudentInformation();
		book.setBooknumber(Integer.parseInt(returnbookbooknumber.getText()));
		student.setStudentid(Integer.parseInt(returnbookstudentid.getText()));
		Historyofstudentandbookinformation historyofstudent = new Historyofstudentandbookinformation();
		historyofstudent.historyofstudent(student, book);
		Returnbookbystudent returnbook = new Returnbookbystudent();
		if (returnbook.returnbook(book)) {
			JOptionPane.showConfirmDialog(null,"Returned successfully.");
			returnbookbooknumber.setText(null);
		}else {
			JOptionPane.showConfirmDialog(null, "Book not returned.");
		}
	}
}
