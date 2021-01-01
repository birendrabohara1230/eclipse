package bookInformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddBookInformationIntoDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField booknumber;
	private JTextField bookname;
	private JTextField author;
	private JComboBox department;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBookInformationIntoDatabase frame = new AddBookInformationIntoDatabase();
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
	public AddBookInformationIntoDatabase() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 846, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(210, 42, 126, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookName.setBounds(210, 77, 126, 25);
		contentPane.add(lblBookName);
		
		JLabel lblAutho = new JLabel("Author");
		lblAutho.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAutho.setBounds(210, 112, 126, 25);
		contentPane.add(lblAutho);
		
		booknumber = new JTextField();
		booknumber.setBorder(null);
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setBounds(345, 42, 233, 25);
		contentPane.add(booknumber);
		booknumber.setColumns(10);
		
		bookname = new JTextField();
		bookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bookname.setColumns(10);
		bookname.setBorder(null);
		bookname.setBounds(346, 77, 232, 25);
		contentPane.add(bookname);
		
		author = new JTextField();
		author.setFont(new Font("Tahoma", Font.PLAIN, 18));
		author.setColumns(10);
		author.setBorder(null);
		author.setBounds(345, 112, 233, 25);
		contentPane.add(author);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addbookinformation();			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(392, 195, 65, 30);
		contentPane.add(btnNewButton);
		
	    department = new JComboBox();
	    department.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyPressed(KeyEvent e) { 		
	    		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	    			addbookinformation();
	    		}
	    	}
	    });
	    department.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
		department.setFont(new Font("Tahoma", Font.PLAIN, 18));
		department.setModel(new DefaultComboBoxModel(new String[] {" Science and technology", "Management", "Education", "Engineering"}));
		department.setBounds(345, 147, 233, 25);
		contentPane.add(department);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(210, 147, 126, 25);
		contentPane.add(lblDepartment);
	}
	
	public void addbookinformation() {
		BookInformation book = new BookInformation();
		book.setBooknumber(Integer.parseInt(booknumber.getText()));
		book.setBookname(bookname.getText());
		book.setBookauthor(author.getText());
		book.setDepartment((String) department.getSelectedItem());
		AddBookInformationIntoDatabaseCode add = new AddBookInformationIntoDatabaseCode();
		if(add.addbookinformation(book)) {
			JOptionPane.showConfirmDialog(null, "Book added successfully");
		}else {
			JOptionPane.showConfirmDialog(null, "Book not added");
		}		
	}
	
}
