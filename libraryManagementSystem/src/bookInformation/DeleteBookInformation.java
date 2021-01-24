package bookInformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseConnection.DatabaseConnection;
import deleteManagement.Deletebookinformation;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DeleteBookInformation extends JFrame {

	private JPanel contentPane;
	private JTextField searchbooknumber;
	private JTextField bookname;
	private JTextField bookauthor;
	private JTextField department;
	private JTextField booknumber;
	private JLabel requireddeletebooknumber;
	private JLabel requireddeletebooknumber_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteBookInformation frame = new DeleteBookInformation();
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
	public DeleteBookInformation() {
		setResizable(false);
		setTitle("Delete book information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(350, 90, 869, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(23, 46, 161, 33);
		contentPane.add(lblNewLabel);
		
		searchbooknumber = new JTextField();
		searchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requireddeletebooknumber.setText(null);
				requireddeletebooknumber_1.setText(null);
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					if(searchbooknumber.getText().isEmpty()) {
						requireddeletebooknumber.setText("Required");
						return;
					}
					try {
						Integer.parseInt(searchbooknumber.getText());
					} catch (NumberFormatException e2) {
						requireddeletebooknumber.setText("Integer Only");
						return;
					}
					 
					deletebook();
				}	
			}
		});
		searchbooknumber.setBorder(null);
		searchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchbooknumber.setBounds(215, 46, 253, 33);
		contentPane.add(searchbooknumber);
		searchbooknumber.setColumns(10);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookName.setBounds(355, 196, 161, 33);
		contentPane.add(lblBookName);
		
		bookname = new JTextField();
		bookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bookname.setColumns(10);
		bookname.setBorder(null);
		bookname.setBounds(547, 196, 253, 33);
		contentPane.add(bookname);
		
		bookauthor = new JTextField();
		bookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bookauthor.setColumns(10);
		bookauthor.setBorder(null);
		bookauthor.setBounds(547, 247, 253, 33);
		contentPane.add(bookauthor);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAuthor.setBounds(355, 247, 161, 33);
		contentPane.add(lblAuthor);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(355, 289, 161, 33);
		contentPane.add(lblDepartment);
		
		department = new JTextField();
		department.setFont(new Font("Tahoma", Font.PLAIN, 18));
		department.setColumns(10);
		department.setBorder(null);
		department.setBounds(547, 289, 253, 33);
		contentPane.add(department);
		
		JLabel lblNewLabel_1 = new JLabel("Delete");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deletebookinformation();
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(631, 350, 108, 33);
		contentPane.add(lblNewLabel_1);
		
		booknumber = new JTextField();
		booknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		booknumber.setColumns(10);
		booknumber.setBorder(null);
		booknumber.setBounds(547, 153, 253, 33);
		contentPane.add(booknumber);
		
		JLabel lblNewLabel_2 = new JLabel("Book Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(355, 153, 161, 33);
		contentPane.add(lblNewLabel_2);
		
		requireddeletebooknumber = new JLabel("");
		requireddeletebooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletebooknumber.setBounds(478, 46, 229, 33);
		contentPane.add(requireddeletebooknumber);
		
		requireddeletebooknumber_1 = new JLabel("");
		requireddeletebooknumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletebooknumber_1.setBounds(10, 153, 306, 33);
		contentPane.add(requireddeletebooknumber_1);
	}
	public boolean deletebook() {
 		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = " select * from bookinformation where book_number = "+searchbooknumber.getText()+"";
			st        = connection.createStatement();
			rs = st.executeQuery(sql);
			rs.next();
			booknumber.setText(rs.getString(1));
		    bookname.setText(rs.getString(2));
			bookauthor.setText(rs.getString(3));
		    department.setText(rs.getString(4));
		    connection.close();
		    return true;
		} catch (Exception e) {
			requireddeletebooknumber_1.setText("No data found");
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2.toString());
			}
		}
		return false;
 	}
	void deletebookinformation() {
		
		if(bookname.getText().isEmpty()) {
			requireddeletebooknumber_1.setText("See details of book before delete");
			return;
		}
		
		BookInformation bookinfo = new BookInformation();
		bookinfo.setBooknumber(Integer.parseInt(searchbooknumber.getText()));
		Deletebookinformation deletebook = new Deletebookinformation();
		try {
			if (deletebook.deletebookinformation(bookinfo)) {
				JOptionPane.showConfirmDialog(null, "Delete is successfull.");
			}else {
				JOptionPane.showConfirmDialog(null, "Delete is not successfull.");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		searchbooknumber.setText(null);
		booknumber.setText(null);
		bookname.setText(null);
		bookauthor.setText(null);
		department.setText(null);
	}
}
