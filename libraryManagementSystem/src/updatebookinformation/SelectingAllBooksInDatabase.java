package updatebookinformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseConnection.DatabaseConnection;
import net.proteanit.sql.DbUtils;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SelectingAllBooksInDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField search;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectingAllBooksInDatabase frame = new SelectingAllBooksInDatabase();
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
	public SelectingAllBooksInDatabase() {
		setTitle("show all books");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setBounds(100, 100, 973, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(82, 70, 109, 25);
		contentPane.add(lblNewLabel);
		
		search = new JTextField();
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchbook();		
			}
		});
		search.setBorder(null);
		search.setBounds(213, 70, 155, 25);
		contentPane.add(search);
		search.setColumns(10);
		
		JComboBox searchbookby = new JComboBox();
		searchbookby.setBorder(null);
		searchbookby.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchbookby.setModel(new DefaultComboBoxModel(new String[] {"BookNumber", "BookName", "Author"}));
		searchbookby.setBounds(584, 72, 184, 26);
		contentPane.add(searchbookby);
		
		JLabel lblSearchBookBy = new JLabel("Search book by ");
		lblSearchBookBy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSearchBookBy.setBounds(431, 70, 143, 25);
		contentPane.add(lblSearchBookBy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 155, 939, 467);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		/*
		 * Calling the a method to all books
		 */
		
		searchbook();
		
	}
	
	/*
	 * Create a method to all books available in database
	 *
	 */
	
	public void searchbook() {
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "select * from bookinformation";
			st = connection.createStatement();
			rs = st.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e);
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2);
			}
		}
		
	}
}
