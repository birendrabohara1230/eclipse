package informationOfStudents;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import databaseConnection.DatabaseConnection;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowAllStudentInformation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JLabel getselectedrowindex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAllStudentInformation frame = new ShowAllStudentInformation();
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
	public ShowAllStudentInformation() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1211, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search by");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(561, 35, 109, 28);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student id", "First name", "Last name", "Address", "Father name", "Mother name"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(734, 35, 208, 28);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBorder(null);
		textField.setBounds(250, 35, 237, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 152, 1177, 487);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Delete");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(getSelectRow());
			}
		});
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(785, 113, 157, 28);
		contentPane.add(lblNewLabel_1);
		
		getselectedrowindex = new JLabel("");
		getselectedrowindex.setForeground(Color.RED);
		getselectedrowindex.setFont(new Font("Tahoma", Font.PLAIN, 18));
		getselectedrowindex.setBounds(561, 113, 157, 28);
		contentPane.add(getselectedrowindex);
		showAllStudent();
	}
	
	void showAllStudent() {
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = " select * from studentinformation ";
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	int getSelectRow() {
		return table.getSelectedRow();
	}
}
  