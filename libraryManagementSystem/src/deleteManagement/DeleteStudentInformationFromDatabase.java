package deleteManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.StudentInformation;
import database.DeleteStudentInformation;
import searchManagement.StudentInformationAndBookDetails;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DeleteStudentInformationFromDatabase extends JFrame {

	private JPanel contentPane;
	private JTextField studentid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudentInformationFromDatabase frame = new DeleteStudentInformationFromDatabase();
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
	public DeleteStudentInformationFromDatabase() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(350, 90, 900, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(298, 118, 106, 32);
		contentPane.add(lblNewLabel);
		
		studentid = new JTextField();
		studentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					deletestudentinformationfromdatabase();
				}	
			}
		});
		studentid.setBorder(null);
		studentid.setBounds(439, 118, 168, 32);
		contentPane.add(studentid);
		studentid.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletestudentinformationfromdatabase();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(473, 171, 106, 32);
		contentPane.add(btnNewButton);
	}
	/*
	 * create a method deleting the information of student from database studentinformation.db
	 */
	
	
	public void deletestudentinformationfromdatabase() {
		
		StudentInformation information = new StudentInformation();
		DeleteStudentInformation del = new DeleteStudentInformation();
		information.setStudentid(Integer.parseInt(studentid.getText()));
		if (del.delete(information)) {
			JOptionPane.showConfirmDialog(null, "Delete  successfull");
		}else {
			JOptionPane.showConfirmDialog(null, "Delete not successfull");
		}
		
	}
	
}
