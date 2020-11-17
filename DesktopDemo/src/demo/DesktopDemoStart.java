package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DesktopDemoStart extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel namemessage;
	private JLabel gendermessage;
	private JLabel collagemessage;
	private JLabel agemessage;
	private JLabel lblNewLabel;
	private JLabel lblGender;
	private JLabel lblCollage;
	private JLabel lblAge;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesktopDemoStart frame = new DesktopDemoStart();
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
	public DesktopDemoStart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    namemessage = new JLabel("");
		namemessage.setBounds(370, 66, 324, 74);
		contentPane.add(namemessage);
		
		gendermessage = new JLabel("");
		gendermessage.setBounds(370, 171, 324, 74);
		contentPane.add(gendermessage);
		
		collagemessage = new JLabel("");
		collagemessage.setBounds(370, 295, 324, 74);
		contentPane.add(collagemessage);
		
		agemessage = new JLabel("");
		agemessage.setBounds(370, 399, 324, 74);
		contentPane.add(agemessage);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(57, 66, 140, 74);
		contentPane.add(lblNewLabel);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(57, 171, 140, 74);
		contentPane.add(lblGender);
		
		lblCollage = new JLabel("Collage");
		lblCollage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCollage.setBounds(57, 295, 140, 74);
		contentPane.add(lblCollage);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(57, 399, 140, 74);
		contentPane.add(lblAge);
		
		btnNewButton = new JButton("Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				namemessage.setText("Birendra Bohara.");
				gendermessage.setText("Male");
				collagemessage.setText("Far Western University.");
				agemessage.setText("22");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(532, 526, 162, 74);
		contentPane.add(btnNewButton);
	}
}
