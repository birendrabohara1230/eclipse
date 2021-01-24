package updatebookinformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookInformation.BookInformation;
import databaseConnection.DatabaseConnection;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditBookInformation extends JFrame {

	private JPanel contentPane;
	private JTextField booknumberchange;
	private JTextField bookname;
	private JTextField author;
	private JTextField searchbooknumber;
	private JComboBox department;
	private JLabel requiredbooknumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditBookInformation frame = new EditBookInformation();
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
	public EditBookInformation() {
		setResizable(false);
		setTitle("edit book information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(160, 143, 116, 27);
		contentPane.add(lblNewLabel);
		
		booknumberchange = new JTextField();
		booknumberchange.setBorder(null);
		booknumberchange.setFont(new Font("Tahoma", Font.PLAIN, 17));
		booknumberchange.setBounds(319, 146, 200, 27);
		contentPane.add(booknumberchange);
		booknumberchange.setColumns(10);
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookName.setBounds(160, 180, 116, 27);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAuthor.setBounds(160, 217, 116, 27);
		contentPane.add(lblAuthor);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(160, 254, 116, 27);
		contentPane.add(lblDepartment);
		
		bookname = new JTextField();
		bookname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bookname.setColumns(10);
		bookname.setBorder(null);
		bookname.setBounds(319, 183, 200, 27);
		contentPane.add(bookname);
		
		author = new JTextField();
		author.setFont(new Font("Tahoma", Font.PLAIN, 17));
		author.setColumns(10);
		author.setBorder(null);
		author.setBounds(319, 217, 200, 27);
		contentPane.add(author);
		
		department = new JComboBox();
		department.setFont(new Font("Tahoma", Font.PLAIN, 18));
		department.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Management"}));
		department.setBounds(319, 257, 270, 27);
		contentPane.add(department);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editbookinformation();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(367, 310, 78, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblSearchByBook = new JLabel("Search by book number");
		lblSearchByBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchByBook.setBounds(76, 40, 200, 27);
		contentPane.add(lblSearchByBook);
		
		searchbooknumber = new JTextField();
		searchbooknumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearJField();
			}
		});
		searchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				requiredbooknumber.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {	
					
					if( searchbooknumber.getText().isEmpty()) {
						requiredbooknumber.setText("Required");
						return;
					}
					try {
						Integer.parseInt(searchbooknumber.getText());
					} catch (NumberFormatException e2) {
						requiredbooknumber.setText("Integer Only");
						return;
					}
					searchbookbynumber();			
				}
			}
		});
		searchbooknumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				clearJField();
			}
		});
		searchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		searchbooknumber.setColumns(10);
		searchbooknumber.setBorder(null);
		searchbooknumber.setBounds(319, 40, 200, 27);
		contentPane.add(searchbooknumber);
		
		requiredbooknumber = new JLabel("");
		requiredbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredbooknumber.setForeground(Color.RED);
		requiredbooknumber.setBounds(565, 40, 257, 27);
		contentPane.add(requiredbooknumber);
	}
	
	public void searchbookbynumber() {
		
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = " select * from bookinformation where book_number = "+searchbooknumber.getText()+"";
			st    = connection.createStatement();
			rs = st.executeQuery(sql);
			booknumberchange.setText(rs.getString(1));
			bookname.setText(rs.getString(2));
			author.setText(rs.getString(3));
			connection.close();
		} catch (Exception e) {
			requiredbooknumber.setText("No data found");
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
	
	public void editbookinformation() {
		
		if(booknumberchange.getText().isEmpty()) {
			requiredbooknumber.setText("See details of book before edit");
			return;
		}
		
		BookInformation books = new BookInformation();
		books.setBooknumber(Integer.parseInt(searchbooknumber.getText()));
		books.setBooknumberchange(Integer.parseInt(booknumberchange.getText()));
		books.setBookname(bookname.getText());
		books.setBookauthor(author.getText());
		books.setDepartment((String) department.getSelectedItem());
		EditBookInformationCode edit = new EditBookInformationCode();
		boolean flag = edit.editbookinformation(books);
		if (flag) {
			JOptionPane.showConfirmDialog(null, "update successfully");
		}else {
			JOptionPane.showConfirmDialog(null, "Update not successfull");
		}
		clearJField();
	}
	
	void clearJField() {
		searchbooknumber.setText(null);
		booknumberchange.setText(null);
		bookname.setText(null);
		author.setText(null);
		requiredbooknumber.setText(null);
	}
}
