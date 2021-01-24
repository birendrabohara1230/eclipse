package bookInformation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseConnection.DatabaseConnection;
import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowAllBook extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField searchbook;
	private JComboBox searchby;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAllBook frame = new ShowAllBook();
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
	public ShowAllBook() {
		setTitle("Show all book");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1222, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 99, 1188, 521);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Search by");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(537, 24, 130, 35);
		contentPane.add(lblNewLabel);
		
		searchby = new JComboBox();
		searchby.setModel(new DefaultComboBoxModel(new String[] {"book number", "book name", "book author", "department"}));
		searchby.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchby.setBounds(704, 24, 272, 35);
		contentPane.add(searchby);
		
		searchbook = new JTextField();
		searchbook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchbook.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				showAllBook();
			}
		});
		searchbook.setBounds(213, 21, 284, 38);
		contentPane.add(searchbook);
		searchbook.setColumns(10);
		
		// showing all book
		showAllBook();
	}
	
	void showAllBook() {
		Statement st = null;
		ResultSet rs = null;
		String query = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String select = (String) searchby.getSelectedItem();
			if (select.equalsIgnoreCase("book number")) {
				 query = "select * from bookinformation where book_number like  '%"+searchbook.getText()+"%'";
			}else if (select.equalsIgnoreCase("book name")) {
				 query = "select * from bookinformation where book_name like  '%"+searchbook.getText()+"%'";
			}else if(select.equalsIgnoreCase("author")) {
				 query = "select * from bookinformation where author like  '%"+searchbook.getText()+"%'";
			}else if(select.equalsIgnoreCase("department")){
				 query = "select * from bookinformation where department like  '%"+searchbook.getText()+"%'";
			}else {
				query = "select * from bookinformation";
			} 			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.toString());
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
