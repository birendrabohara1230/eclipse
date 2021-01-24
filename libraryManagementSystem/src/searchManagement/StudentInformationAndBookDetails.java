package searchManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookInformation.AddBookInformationIntoDatabase;
import bookInformation.AddBookInformationIntoDatabaseCode;
import bookInformation.BookInformation;
import bookInformation.DeleteBookInformation;
import bookInformation.ShowAllBook;
import bookandstudentinformation.AddBookIntoStudentRecord;
import bookandstudentinformation.StudentandBookNumber;
import dao.StudentInformation;
import database.AddStudentInformationIntoDatabase;
import database.DeleteStudentInformation;
import database.EditStudentInformations;
import databaseConnection.DatabaseConnection;
import deleteManagement.DeleteStudentInformationFromDatabase;
import deleteManagement.Deletebookinformation;
import informationOfStudents.AddInformationOfStudentsIntoDatabase;
import informationOfStudents.ShowAllStudentInformation;
import insertionManagement.AddUserDetailDataIntoDatabase;
import net.proteanit.sql.DbUtils;
import returnandhistorymanagement.Historyofstudentandbookinformation;
import returnandhistorymanagement.ReturnBook;
import returnandhistorymanagement.Returnbookbystudent;
import updateManagement.EditStudentInformation;
import updatebookinformation.EditBookInformation;
import updatebookinformation.EditBookInformationCode;
import updatebookinformation.SelectingAllBooksInDatabase;
import usermanagement.Deleteuserinformation;
import usermanagement.Edituserinformation;
import usermanagement.Showalluser;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JToolBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseMotionAdapter;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentInformationAndBookDetails extends JFrame {

	private JPanel contentPane;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_11;
	private JMenuItem mntmNewMenuItem_12;
	private JMenuItem mntmNewMenuItem_13;
	private JPanel panel;
	private JTextField studentid;
	private JTable table;
	private JTextField addstudentid;
	private JTextField addfirstname;
	private JTextField addlastname;
	private JTextField addfathername;
	private JTextField addmothername;
	private JTextField addaddress;
	private JLayeredPane layeredPane;
	private JPanel addstudentinformation;
	private JPanel studentandbookinformation;
	private JPanel editstudentinformation;
	private JPanel deletestudentinformation;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField editsearchstudentid;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField editstudentid;
	private JTextField editfirstname;
	private JTextField editlastname;
	private JTextField editfathername;
	private JTextField editmothername;
	private JTextField editaddress;
	private JTextField deletesearchstudentid;
	private JTextField deletestudentid;
	private JTextField deletefirstname;
	private JTextField deletelastname;
	private JTextField deletefathername;
	private JTextField deletemothername;
	private JTextField deleteaddress;
	private JDateChooser adddob;
	private JComboBox adddepartment;
	private JPanel panel_3;
	private JLabel lblOme;
	private JComboBox editdepartment;
	private JDateChooser editdob;
	private JDateChooser deletedob;
	private JTextField deletedepartment;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLayeredPane layeredPane_1;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JButton addbook;
	private JLabel lblNewLabel_21;
	private JPanel editbookinformation;
	private JPanel deletebookinformation ;
	private JPanel showallbook;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JTextField editbookbookname;
	private JButton btnNewButton;
	private JLabel lblNewLabel_27;
	private JTextField deletebooksearchbooknumber;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JTextField deletebookbooknumber;
	private JTextField deletebookbookname;
	private JTextField deletebookauthor;
	private JTextField deletebookdepartment;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_32;
	private JTextField showallbookbooknumber;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JTextField addbooknumber;
	private JTextField addbookname;
	private JTextField addbookauthor;
	private JComboBox addbookdepartment;
	private JComboBox editbookdepartment;
	private JTextField editbookauthor;
	private JTextField editbooksearchbooknumber;
	private JTextField editbookbooknumber;
	private JPanel addbookinformation;
	private JLabel showallbooknobook;
	private JLabel lblNewLabel_33;
	private JLabel studentname;
	private JLabel studentfullname;
	private JLabel requiredstudentid;
	private JComboBox showallbookselect;
	private JLabel requiredaddbooknumber;
	private JLabel requiredaddbookname;
	private JLabel requiredaddbookauthor;
	private JLabel requiredaddstudentid;
	private JLabel requiredaddstudentfirstname;
	private JLabel requiredaddstudentlastname;
	private JLabel requiredaddstudentfathername;
	private JLabel requiredaddstudentmothername;
	private JLabel requiredaddstudentaddress;
	private JLabel requiredaddstudentdob;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel lblNewLabel_42;
	private JLabel requirededitbookbooknumber;
	private JTextField addbookbooknumber;
	private JTextField returnbookbooknumber;
	private JLabel requirededitstudentid;
	private JLabel requirededitstudentid_1;
	private JLabel requireddeletestudentid;
	private JLabel requireddeletestudentid_1;
	private JLabel requirededitbookbooknumber_1;
	private JLabel requireddeletebooknumber;
	private JLabel requireddeletebooknumber_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInformationAndBookDetails frame = new StudentInformationAndBookDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showConfirmDialog(null, e.toString());
				}
			}
		});
	}
	
	
	
	/*
	 *   Create a method for layered panel
	 */
	
	public void switchpanel(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	
	public void switchpanel1(JPanel panel) {
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public StudentInformationAndBookDetails() {
		setTitle("student and book information");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/*
		 * it fits the opening Jframe just to fit the screen of the given device.
		 */
		setDefaultLookAndFeelDecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);	
		setBounds(128, 50, 1230, 720);
	
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Student");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Add  student information");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.setArmed(true);
		mntmNewMenuItem.setBackground(new Color(240, 240, 240));
		mntmNewMenuItem.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNewMenuItem.setAlignmentY(Component.TOP_ALIGNMENT);
		Image aa = new ImageIcon(this.getClass().getResource("/addes.png")).getImage();
		mntmNewMenuItem.setIcon(new ImageIcon(aa));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInformationOfStudentsIntoDatabase student = new AddInformationOfStudentsIntoDatabase();
				student.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_10 = new JMenuItem("Edit student information");
		mntmNewMenuItem_10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		Image edits = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		mntmNewMenuItem_10.setIcon(new ImageIcon(edits));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EditStudentInformation editstudent = new EditStudentInformation();
				editstudent.setVisible(true);
			}
		});
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_10);
		
		mntmNewMenuItem_11 = new JMenuItem("Delete student information");
		mntmNewMenuItem_11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		Image deletes = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		mntmNewMenuItem_11.setIcon(new ImageIcon(deletes));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentInformationFromDatabase deletestudent = new DeleteStudentInformationFromDatabase();
				deletestudent.setVisible(true);
			}
		});
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_11);
		
		mntmNewMenuItem_12 = new JMenuItem("Show all student");
		mntmNewMenuItem_12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		Image all = new ImageIcon(this.getClass().getResource("/all.png")).getImage();
		mntmNewMenuItem_12.setIcon(new ImageIcon(all));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowAllStudentInformation information = new ShowAllStudentInformation();
				information.setVisible(true);
				
			}
		});
		mntmNewMenuItem_12.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_12);
		
		mnNewMenu_3 = new JMenu("User");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Add User Information   ");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmNewMenuItem_4.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_4.setArmed(true);
		mntmNewMenuItem_4.setBackground(new Color(240, 240, 240));
		mntmNewMenuItem_4.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNewMenuItem_4.setAlignmentY(Component.TOP_ALIGNMENT);
		Image addusericon = new ImageIcon(this.getClass().getResource("/addes.png")).getImage();
		mntmNewMenuItem_4.setIcon(new ImageIcon(addusericon));
		mntmNewMenuItem_4.setArmed(true);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUserDetailDataIntoDatabase user = new AddUserDetailDataIntoDatabase();
				user.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_7 = new JMenuItem("Edit user information");
		mntmNewMenuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		Image editusericon = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		mntmNewMenuItem_7.setIcon(new ImageIcon(editusericon));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edituserinformation edituser = new Edituserinformation();
				edituser.setVisible(true);
			}
		});
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Delete user information");
		mntmNewMenuItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		Image deleteusericon = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		mntmNewMenuItem_8.setIcon(new ImageIcon(deleteusericon));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deleteuserinformation deleteuser = new Deleteuserinformation();
				deleteuser.setVisible(true);
			}
		});
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Show all user");
		mntmNewMenuItem_9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		Image showallusericon = new ImageIcon(this.getClass().getResource("/all.png")).getImage();
		mntmNewMenuItem_9.setIcon(new ImageIcon(showallusericon));
		mntmNewMenuItem_9.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Showalluser alluser = new Showalluser();
				alluser.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mnNewMenu_4 = new JMenu("Book");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_3 = new JMenuItem("Add book information");
		mntmNewMenuItem_3.setSize(new Dimension(3, 0));
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_3.setArmed(true);
		mntmNewMenuItem_3.setBackground(new Color(240, 240, 240));
		mntmNewMenuItem_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmNewMenuItem_3.setAlignmentY(Component.TOP_ALIGNMENT);
		Image addbookicon = new ImageIcon(this.getClass().getResource("/addes.png")).getImage();
		mntmNewMenuItem_3.setIcon(new ImageIcon(addbookicon));
		mntmNewMenuItem_3.setArmed(true);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBookInformationIntoDatabase book = new AddBookInformationIntoDatabase();
				book.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_4.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_5 = new JMenuItem("Edit book information");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		Image editbookicon = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		mntmNewMenuItem_5.setIcon(new ImageIcon(editbookicon));
		mntmNewMenuItem_5.setArmed(true);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditBookInformation book = new EditBookInformation();
				book.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_6 = new JMenuItem("Show all book");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		Image showallbookicon = new ImageIcon(this.getClass().getResource("/all.png")).getImage();
		mntmNewMenuItem_6.setIcon(new ImageIcon(showallbookicon));
		mntmNewMenuItem_6.setArmed(true);
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowAllBook allbook = new ShowAllBook();
				allbook.setVisible(true);
			}
		});
		
		mntmNewMenuItem_13 = new JMenuItem("Delete book information");
		mntmNewMenuItem_13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		Image deletebookicon = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		mntmNewMenuItem_13.setIcon(new ImageIcon(deletebookicon));
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteBookInformation deletebook = new DeleteBookInformation();
				deletebook.setVisible(true);
			}
		});
		mntmNewMenuItem_13.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_4.add(mntmNewMenuItem_13);
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_4.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Image photo = new ImageIcon(this.getClass().getResource("/delete.png")).getImage();
		Image a = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		Image ee = new ImageIcon(this.getClass().getResource("/edit.png")).getImage();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("Student", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(addstudentinformation);
			}
		});
		panel_2.setBounds(10, 79, 301, 59);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add student information");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(addstudentinformation);
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(44, 10, 220, 28);
		panel_2.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(editstudentinformation);
			}
		});
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 148, 301, 59);
		panel_1.add(panel_2_1);
		
		JLabel lblEditStudentInformation = new JLabel("Edit student information");
		lblEditStudentInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(editstudentinformation);
			}
		});
		lblEditStudentInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEditStudentInformation.setBounds(44, 10, 220, 28);
		panel_2_1.add(lblEditStudentInformation);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(deletestudentinformation);
			}
		});
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(10, 217, 301, 59);
		panel_1.add(panel_2_2);
		
		JLabel lblDeleteStudentInformation = new JLabel("Delete student information");
		lblDeleteStudentInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(deletestudentinformation);
			}
		});
		lblDeleteStudentInformation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDeleteStudentInformation.setBounds(44, 10, 220, 28);
		panel_2_2.add(lblDeleteStudentInformation);
		
		panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(studentandbookinformation);
			}
		});
		panel_3.setLayout(null);
		panel_3.setBounds(10, 10, 301, 59);
		panel_1.add(panel_3);
		
		lblOme = new JLabel("Home");
		lblOme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel(studentandbookinformation);
			}
		});
		lblOme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOme.setBounds(116, 10, 73, 39);
		panel_3.add(lblOme);
		
		layeredPane = new JLayeredPane();
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		studentandbookinformation = new JPanel();
		studentandbookinformation.setBackground(new Color(95, 158, 160));
		layeredPane.add(studentandbookinformation, "name_3439732117100");
		
		JLabel lblNewLabel_1 = new JLabel("Student id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		studentid = new JTextField();
		studentid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requiredstudentid.setText(null);
				requiredstudentid.setText(null);
			}
		});
		studentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 
				requiredstudentid.setText(null);
				studentname.setText(null);
				studentfullname.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					showStudentAndBookInformation();
				}
				
			}
		});
		studentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		studentid.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblNewLabel_33 = new JLabel("Add book");
		lblNewLabel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				if (studentid.getText().isEmpty() ) {
//					requiredstudentid.setText("Please check student information before adding book!");
//					return;
//				}else {
//					StudentandBookNumber sts = new StudentandBookNumber();
//					sts.setVisible(true);
//					StudentInformation students = new StudentInformation();
//					students.setStudentid(Integer.parseInt(studentid.getText()));
//					sts.showingstudentid(students);		
//				}
			}
		});
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		studentname = new JLabel("");
		studentname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		studentfullname = new JLabel("");
		studentfullname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredstudentid = new JLabel("");
		requiredstudentid.setForeground(Color.BLACK);
		requiredstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_33_1 = new JLabel("Return book");
		lblNewLabel_33_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				if (studentid.getText().isEmpty()) {
//					requiredstudentid.setText("Please check student information before adding book!");
//					return;
//				}else {
//					ReturnBook returnbookbystudent = new ReturnBook();
//					returnbookbystudent.setVisible(true);
//					StudentInformation students = new StudentInformation();
//					students.setStudentid(Integer.parseInt(studentid.getText()));
//					returnbookbystudent.showingstudentid(students);
//				}
			}
		});
		lblNewLabel_33_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		addbookbooknumber = new JTextField();
		addbookbooknumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requiredstudentid.setText(null);
			}
		});
		addbookbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				requiredstudentid.setText(null);
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(studentid.getText().isEmpty()) {
						requiredstudentid.setText("Please check student information before adding book!");
						return;
					}
					if(addbookbooknumber.getText().isEmpty()) {
						requiredstudentid.setText("Required book number");
						return;
					}
					AddBookIntoStudentRecord add = new AddBookIntoStudentRecord();
					BookInformation bookinformation = new BookInformation();
					StudentInformation studentinformation = new StudentInformation();
					bookinformation.setBooknumber(Integer.parseInt(addbookbooknumber.getText()));
					studentinformation.setStudentid(Integer.parseInt(studentid.getText()));
					if ( add.addbookintostudentrecord(bookinformation, studentinformation)) {
						JOptionPane.showConfirmDialog(null, "Book added successfully");
						showStudentAndBookInformation();
						addbookbooknumber.setText(null);
					}else {
						JOptionPane.showConfirmDialog(null, "Book Not added!!");
						addbookbooknumber.setText(null);
					}
				}	
			}
			@Override
			public void keyTyped(KeyEvent e) {
//				requiredstudentid.setText(null);
			}
			@Override
			public void keyReleased(KeyEvent e) {
//				requiredstudentid.setText(null);
			}
		});
		addbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbookbooknumber.setColumns(10);
		
		returnbookbooknumber = new JTextField();
		returnbookbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requiredstudentid.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					if(studentid.getText().isEmpty()) {
						requiredstudentid.setText("Please check student information before adding book!");
						return;
					}
					
					if(returnbookbooknumber.getText().isEmpty()) {
						requiredstudentid.setText("Required book number");
						return;
					}
					BookInformation book = new BookInformation();
					StudentInformation student = new StudentInformation();
					book.setBooknumber(Integer.parseInt(returnbookbooknumber.getText()));
					student.setStudentid(Integer.parseInt(studentid.getText()));
					Historyofstudentandbookinformation historyofstudent = new Historyofstudentandbookinformation();
					historyofstudent.historyofstudent(student, book);
					Returnbookbystudent returnbook = new Returnbookbystudent();
					if (returnbook.returnbook(book)) {
						JOptionPane.showConfirmDialog(null,"Returned successfully.");
						showStudentAndBookInformation();
						returnbookbooknumber.setText(null);
					}else {
						JOptionPane.showConfirmDialog(null, "Book not returned.");
					}
				}
				
			}
		});
		returnbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		returnbookbooknumber.setColumns(10);
		GroupLayout gl_studentandbookinformation = new GroupLayout(studentandbookinformation);
		gl_studentandbookinformation.setHorizontalGroup(
			gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentandbookinformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addGap(167)
							.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(87)
							.addComponent(lblNewLabel_33_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(studentfullname, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addComponent(addbookbooknumber, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(returnbookbooknumber, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addComponent(requiredstudentid, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)))
		);
		gl_studentandbookinformation.setVerticalGroup(
			gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentandbookinformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_33_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGap(5)
							.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGap(5)
							.addComponent(studentfullname, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGap(2)
							.addComponent(addbookbooknumber, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(returnbookbooknumber, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(requiredstudentid, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
					.addGap(10))
		);
		studentandbookinformation.setLayout(gl_studentandbookinformation);
		
		deletestudentinformation = new JPanel();
		layeredPane.add(deletestudentinformation, "name_3428113795200");
		deletestudentinformation.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Search by student id");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 54, 184, 35);
		deletestudentinformation.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Search by student id");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(389, 114, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("First name");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(389, 159, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Last name");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(389, 204, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Father name");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(389, 249, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Mother name");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_5.setBounds(389, 294, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Address");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_6.setBounds(389, 340, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Date of birth");
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_7.setBounds(389, 388, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("Department");
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_8.setBounds(389, 433, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_8);
		
		deletesearchstudentid = new JTextField();
		deletesearchstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requireddeletestudentid.setText(null);
				requireddeletestudentid_1.setText(null);
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(deletesearchstudentid.getText().isEmpty()) {
						requireddeletestudentid.setText("Required");
						return;
					}
					
					try {
						Integer.parseInt(deletesearchstudentid.getText());
					}catch(NumberFormatException ee) {
						requireddeletestudentid.setText("Integer Only");
						return;
					}	
					deletestudentinformation();
				}
			}
		});
		deletesearchstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletesearchstudentid.setBorder(null);
		deletesearchstudentid.setBounds(242, 54, 206, 35);
		deletestudentinformation.add(deletesearchstudentid);
		deletesearchstudentid.setColumns(10);
		
		deletestudentid = new JTextField();
		deletestudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentid.setColumns(10);
		deletestudentid.setBorder(null);
		deletestudentid.setBounds(606, 114, 257, 35);
		deletestudentinformation.add(deletestudentid);
		
		deletefirstname = new JTextField();
		deletefirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletefirstname.setColumns(10);
		deletefirstname.setBorder(null);
		deletefirstname.setBounds(606, 159, 257, 35);
		deletestudentinformation.add(deletefirstname);
		
		deletelastname = new JTextField();
		deletelastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletelastname.setColumns(10);
		deletelastname.setBorder(null);
		deletelastname.setBounds(606, 204, 257, 35);
		deletestudentinformation.add(deletelastname);
		
		deletefathername = new JTextField();
		deletefathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletefathername.setColumns(10);
		deletefathername.setBorder(null);
		deletefathername.setBounds(606, 249, 257, 35);
		deletestudentinformation.add(deletefathername);
		
		deletemothername = new JTextField();
		deletemothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletemothername.setColumns(10);
		deletemothername.setBorder(null);
		deletemothername.setBounds(606, 294, 257, 35);
		deletestudentinformation.add(deletemothername);
		
		deleteaddress = new JTextField();
		deleteaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deleteaddress.setColumns(10);
		deleteaddress.setBorder(null);
		deleteaddress.setBounds(606, 340, 257, 35);
		deletestudentinformation.add(deleteaddress);
		
		deletedob = new JDateChooser();
		deletedob.setBounds(606, 388, 257, 35);
		deletestudentinformation.add(deletedob);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletestudentinformationfromdatabase();
			}
		});
		delete.setForeground(new Color(255, 0, 0));
		delete.setBorder(null);
		delete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		delete.setBounds(679, 478, 106, 27);
		deletestudentinformation.add(delete);
		
		deletedepartment = new JTextField();
		deletedepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletedepartment.setColumns(10);
		deletedepartment.setBorder(null);
		deletedepartment.setBounds(606, 433, 257, 35);
		deletestudentinformation.add(deletedepartment);
		
		lblNewLabel_36 = new JLabel("Delete student information");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_36.setBounds(10, 10, 222, 35);
		deletestudentinformation.add(lblNewLabel_36);
		
		lblNewLabel_37 = new JLabel("Detail of the student");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_37.setBounds(606, 41, 257, 35);
		deletestudentinformation.add(lblNewLabel_37);
		
		requireddeletestudentid = new JLabel("");
		requireddeletestudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletestudentid.setBounds(242, 10, 222, 35);
		deletestudentinformation.add(requireddeletestudentid);
		
		requireddeletestudentid_1 = new JLabel("");
		requireddeletestudentid_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletestudentid_1.setBounds(10, 114, 369, 35);
		deletestudentinformation.add(requireddeletestudentid_1);
		
		editstudentinformation = new JPanel();
		layeredPane.add(editstudentinformation, "name_3433140303000");
		editstudentinformation.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Search by student id");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 45, 205, 32);
		editstudentinformation.add(lblNewLabel_5);
		
		editsearchstudentid = new JTextField();
		editsearchstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				requirededitstudentid.setText(null);
				requirededitstudentid_1.setText(null);
				
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(editsearchstudentid.getText().isEmpty()) {
						requirededitstudentid.setText("Required");
						return;
					}
					try {
						Integer.parseInt(editsearchstudentid.getText());
					}catch(NumberFormatException ee) {
						requirededitstudentid.setText("Integer only");
						return;
					}	
					edidstudentinformation();
				}
			}
		});
		editsearchstudentid.setBorder(null);
		editsearchstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editsearchstudentid.setBounds(225, 45, 237, 32);
		editstudentinformation.add(editsearchstudentid);
		editsearchstudentid.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Student id");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(382, 117, 181, 32);
		editstudentinformation.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("First name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(382, 159, 181, 32);
		editstudentinformation.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Last name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(382, 201, 181, 32);
		editstudentinformation.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Father name");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(382, 243, 181, 32);
		editstudentinformation.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Mother name");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(382, 285, 181, 32);
		editstudentinformation.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Address");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(382, 327, 181, 32);
		editstudentinformation.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("DOB");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(382, 369, 181, 32);
		editstudentinformation.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Department");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(382, 411, 181, 32);
		editstudentinformation.add(lblNewLabel_13);
		
		editstudentid = new JTextField();
		editstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editstudentid.setColumns(10);
		editstudentid.setBorder(null);
		editstudentid.setBounds(573, 117, 281, 32);
		editstudentinformation.add(editstudentid);
		
		editfirstname = new JTextField();
		editfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editfirstname.setColumns(10);
		editfirstname.setBorder(null);
		editfirstname.setBounds(573, 159, 281, 32);
		editstudentinformation.add(editfirstname);
		
		editlastname = new JTextField();
		editlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editlastname.setColumns(10);
		editlastname.setBorder(null);
		editlastname.setBounds(573, 201, 281, 27);
		editstudentinformation.add(editlastname);
		
		editfathername = new JTextField();
		editfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editfathername.setColumns(10);
		editfathername.setBorder(null);
		editfathername.setBounds(573, 243, 281, 32);
		editstudentinformation.add(editfathername);
		
		editmothername = new JTextField();
		editmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editmothername.setColumns(10);
		editmothername.setBorder(null);
		editmothername.setBounds(573, 285, 281, 27);
		editstudentinformation.add(editmothername);
		
		editaddress = new JTextField();
		editaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editaddress.setColumns(10);
		editaddress.setBorder(null);
		editaddress.setBounds(573, 327, 281, 27);
		editstudentinformation.add(editaddress);
		
		editdob = new JDateChooser();
		editdob.setBounds(573, 369, 281, 32);
		editstudentinformation.add(editdob);
		
		editdepartment = new JComboBox();
		editdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		editdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editdepartment.setBounds(573, 414, 281, 32);
		editstudentinformation.add(editdepartment);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editstudentinformationintodatabase();
			}
		});
		edit.setBorder(null);
		edit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edit.setBounds(670, 456, 91, 32);
		editstudentinformation.add(edit);
		
		lblNewLabel_35 = new JLabel("Edit student information");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_35.setBounds(10, 10, 205, 27);
		editstudentinformation.add(lblNewLabel_35);
		
		lblNewLabel_38 = new JLabel("Detail of the student");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_38.setBounds(574, 45, 235, 32);
		editstudentinformation.add(lblNewLabel_38);
		
		requirededitstudentid = new JLabel("");
		requirededitstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requirededitstudentid.setBounds(225, 8, 237, 27);
		editstudentinformation.add(requirededitstudentid);
		
		requirededitstudentid_1 = new JLabel("");
		requirededitstudentid_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requirededitstudentid_1.setBounds(10, 117, 340, 27);
		editstudentinformation.add(requirededitstudentid_1);
		
		addstudentinformation = new JPanel();
		layeredPane.add(addstudentinformation, "name_3436503250400");
		
		JLabel lblNewLabel_3 = new JLabel("Student id");
		lblNewLabel_3.setBounds(208, 103, 89, 26);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		addstudentid = new JTextField();
		addstudentid.setBounds(351, 103, 225, 26);
		addstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addstudentid.setBorder(null);
		addstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addstudentid.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("First name");
		lblNewLabel_3_1.setBounds(208, 139, 89, 26);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_2 = new JLabel("Last name");
		lblNewLabel_3_2.setBounds(208, 173, 89, 26);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_3 = new JLabel("Father name");
		lblNewLabel_3_3.setBounds(208, 209, 119, 26);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_4 = new JLabel("Mother name");
		lblNewLabel_3_4.setBounds(208, 244, 119, 26);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5 = new JLabel("Address");
		lblNewLabel_3_5.setBounds(208, 275, 89, 26);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5_1 = new JLabel("DOB");
		lblNewLabel_3_5_1.setBounds(208, 311, 89, 26);
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5_2 = new JLabel("Department");
		lblNewLabel_3_5_2.setBounds(208, 347, 102, 26);
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		addfirstname = new JTextField();
		addfirstname.setBounds(351, 139, 225, 26);
		addfirstname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addfirstname.setColumns(10);
		addfirstname.setBorder(null);
		
		addlastname = new JTextField();
		addlastname.setBounds(351, 173, 225, 26);
		addlastname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addlastname.setColumns(10);
		addlastname.setBorder(null);
		
		addfathername = new JTextField();
		addfathername.setBounds(351, 209, 225, 26);
		addfathername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addfathername.setColumns(10);
		addfathername.setBorder(null);
		
		addmothername = new JTextField();
		addmothername.setBounds(351, 244, 225, 26);
		addmothername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addmothername.setColumns(10);
		addmothername.setBorder(null);
		
		addaddress = new JTextField();
		addaddress.setBounds(351, 275, 225, 26);
		addaddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		addaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addaddress.setColumns(10);
		addaddress.setBorder(null);
		
		adddob = new JDateChooser();
		adddob.setBounds(351, 311, 225, 26);
		adddob.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		
		adddepartment = new JComboBox();
		adddepartment.setBounds(351, 347, 225, 26);
		adddepartment.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setEmptyJfieldOfAddStudentInformation();
			}
		});
		adddepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adddepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		
		JButton add = new JButton("Add");
		add.setBounds(418, 394, 89, 32);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				addstudentinformationintodatabase();
			}
		});
		add.setBorder(null);
		add.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentid = new JLabel("");
		requiredaddstudentid.setBounds(609, 103, 234, 26);
		requiredaddstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentfirstname = new JLabel("");
		requiredaddstudentfirstname.setBounds(609, 139, 234, 26);
		requiredaddstudentfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentlastname = new JLabel("");
		requiredaddstudentlastname.setBounds(609, 171, 234, 26);
		requiredaddstudentlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentfathername = new JLabel("");
		requiredaddstudentfathername.setBounds(609, 203, 234, 26);
		requiredaddstudentfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentmothername = new JLabel("");
		requiredaddstudentmothername.setBounds(609, 240, 234, 26);
		requiredaddstudentmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentaddress = new JLabel("");
		requiredaddstudentaddress.setBounds(609, 278, 234, 26);
		requiredaddstudentaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		requiredaddstudentdob = new JLabel("");
		requiredaddstudentdob.setBounds(609, 314, 234, 26);
		requiredaddstudentdob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblNewLabel_34 = new JLabel("Add student information");
		lblNewLabel_34.setBounds(10, 10, 229, 23);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addstudentinformation.setLayout(null);
		addstudentinformation.add(lblNewLabel_3);
		addstudentinformation.add(addstudentid);
		addstudentinformation.add(requiredaddstudentid);
		addstudentinformation.add(lblNewLabel_3_1);
		addstudentinformation.add(addfirstname);
		addstudentinformation.add(requiredaddstudentfirstname);
		addstudentinformation.add(lblNewLabel_3_2);
		addstudentinformation.add(addlastname);
		addstudentinformation.add(requiredaddstudentlastname);
		addstudentinformation.add(lblNewLabel_3_4);
		addstudentinformation.add(addmothername);
		addstudentinformation.add(requiredaddstudentmothername);
		addstudentinformation.add(lblNewLabel_3_5);
		addstudentinformation.add(addaddress);
		addstudentinformation.add(requiredaddstudentaddress);
		addstudentinformation.add(lblNewLabel_3_5_1);
		addstudentinformation.add(adddob);
		addstudentinformation.add(requiredaddstudentdob);
		addstudentinformation.add(lblNewLabel_3_5_2);
		addstudentinformation.add(adddepartment);
		addstudentinformation.add(add);
		addstudentinformation.add(lblNewLabel_34);
		addstudentinformation.add(lblNewLabel_3_3);
		addstudentinformation.add(addfathername);
		addstudentinformation.add(requiredaddstudentfathername);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(92)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
					.addGap(10))
		);
		panel.setLayout(gl_panel);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("Book", null, panel_4, null);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 128));
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(addbookinformation);
			}
		});
		panel_6.setBounds(10, 10, 266, 44);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Home");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(addbookinformation);			
			}
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(105, 10, 61, 24);
		panel_6.add(lblNewLabel_2);
		
		panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(editbookinformation);
			}
		});
		panel_7.setBounds(10, 64, 266, 44);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		lblNewLabel_14 = new JLabel("Edit book information");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					switchpanel1(editbookinformation);
			}
		});
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(43, 10, 186, 24);
		panel_7.add(lblNewLabel_14);
		
		panel_8 = new JPanel();
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(deletebookinformation);
			}
		});
		panel_8.setBounds(10, 118, 266, 44);
		panel_5.add(panel_8);
		panel_8.setLayout(null);
		
		lblNewLabel_15 = new JLabel("Delete book information");
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(deletebookinformation);
			}
		});
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(41, 10, 201, 24);
		panel_8.add(lblNewLabel_15);
		
		panel_9 = new JPanel();
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(showallbook);
				searchbook();
			}
		});
		panel_9.setBounds(10, 172, 266, 44);
		panel_5.add(panel_9);
		panel_9.setLayout(null);
		
		lblNewLabel_16 = new JLabel("Show all books");
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchpanel1(showallbook);
				searchbook();
			}
		});
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(68, 10, 153, 24);
		panel_9.add(lblNewLabel_16);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		addbookinformation = new JPanel();
		layeredPane_1.add(addbookinformation, "name_11588895528400");
		addbookinformation.setLayout(null);
		
		lblNewLabel_17 = new JLabel("Book number");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_17.setBounds(206, 104, 148, 35);
		addbookinformation.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Book name");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_18.setBounds(206, 152, 148, 35);
		addbookinformation.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Author");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(206, 200, 148, 35);
		addbookinformation.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Department");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_20.setBounds(206, 249, 148, 35);
		addbookinformation.add(lblNewLabel_20);
		
		addbooknumber = new JTextField();
		addbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setNullAddBookInformation();
			}
		});
		addbooknumber.setBorder(null);
		addbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbooknumber.setBounds(384, 104, 278, 35);
		addbookinformation.add(addbooknumber);
		addbooknumber.setColumns(10);
		
		addbookname = new JTextField();
		addbookname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setNullAddBookInformation();
			}
		});
		addbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbookname.setColumns(10);
		addbookname.setBorder(null);
		addbookname.setBounds(384, 152, 278, 35);
		addbookinformation.add(addbookname);
		
		addbookauthor = new JTextField();
		addbookauthor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setNullAddBookInformation();
			}
		});
		addbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbookauthor.setColumns(10);
		addbookauthor.setBorder(null);
		addbookauthor.setBounds(384, 200, 278, 35);
		addbookinformation.add(addbookauthor);
		
		addbookdepartment = new JComboBox();
		addbookdepartment.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if ( e.getKeyCode() == KeyEvent.VK_ENTER) {
					if ( addbooknumber.getText().isEmpty()) {
						requiredaddbooknumber.setText("Required");
						return;
					}
					try {
						Integer.parseInt(addbooknumber.getText());
					}catch(NumberFormatException ee) {
						requiredaddbooknumber.setText("Integer only");
						return;
					}
					if ( addbookname.getText().isEmpty() ) {
						requiredaddbookname.setText("Required");
						return;
					}
					
					if ( addbookauthor.getText().isEmpty()) {
						requiredaddbookauthor.setText("Required");
						return;
					}
					
			      addbookinformation();
					
				}
				
			}
		});
		addbookdepartment.setFont(new Font("Dialog", Font.PLAIN, 18));
		addbookdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		addbookdepartment.setBounds(384, 249, 278, 35);
		addbookinformation.add(addbookdepartment);
		
		addbook = new JButton("Add book");
		addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ( addbooknumber.getText().isEmpty()) {
					requiredaddbooknumber.setText("Required");
					return;
				}
				try {
					Integer.parseInt(addbooknumber.getText());
				}catch(NumberFormatException ee) {
					requiredaddbooknumber.setText("Integer only");
					return;
				}
				if ( addbookname.getText().isEmpty() ) {
					requiredaddbookname.setText("Required");
					return;
				}
				
				if ( addbookauthor.getText().isEmpty()) {
					requiredaddbookauthor.setText("Required");
					return;
				}
				addbookinformation();		
			}
		});
		addbook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbook.setBounds(464, 294, 118, 35);
		addbookinformation.add(addbook);
		
		lblNewLabel_21 = new JLabel("Add book information");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_21.setBounds(355, 10, 307, 35);
		addbookinformation.add(lblNewLabel_21);
		
		requiredaddbooknumber = new JLabel("");
		requiredaddbooknumber.setForeground(Color.RED);
		requiredaddbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredaddbooknumber.setBounds(692, 107, 148, 35);
		addbookinformation.add(requiredaddbooknumber);
		
		requiredaddbookname = new JLabel("");
		requiredaddbookname.setForeground(Color.RED);
		requiredaddbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredaddbookname.setBounds(692, 152, 148, 35);
		addbookinformation.add(requiredaddbookname);
		
		requiredaddbookauthor = new JLabel("");
		requiredaddbookauthor.setForeground(Color.RED);
		requiredaddbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requiredaddbookauthor.setBounds(692, 200, 148, 35);
		addbookinformation.add(requiredaddbookauthor);
		
		editbookinformation = new JPanel();
		editbookinformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requirededitbookbooknumber.setText(null);
			}
		});
		layeredPane_1.add(editbookinformation, "name_11602533324000");
		editbookinformation.setLayout(null);
		
		lblNewLabel_22 = new JLabel("Search by book number");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_22.setBounds(10, 63, 201, 32);
		editbookinformation.add(lblNewLabel_22);
		
		editbooksearchbooknumber = new JTextField();
		editbooksearchbooknumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				requirededitbookbooknumber.setText(null);
			}
		});
		editbooksearchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requirededitbookbooknumber_1.setText(null);
				requirededitbookbooknumber.setText(null);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(editbooksearchbooknumber.getText().isEmpty()) {
						requirededitbookbooknumber.setText("Required");
						return;
					}
					searchbookbynumber();
				}
			}
		});
		editbooksearchbooknumber.setBorder(null);
		editbooksearchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbooksearchbooknumber.setBounds(243, 63, 263, 32);
		editbookinformation.add(editbooksearchbooknumber);
		editbooksearchbooknumber.setColumns(10);
		
		lblNewLabel_23 = new JLabel("Book number");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_23.setBounds(441, 140, 141, 32);
		editbookinformation.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Book name");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_24.setBounds(441, 185, 141, 32);
		editbookinformation.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Author");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_25.setBounds(441, 228, 141, 32);
		editbookinformation.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("Department");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_26.setBounds(441, 270, 141, 32);
		editbookinformation.add(lblNewLabel_26);
		
		editbookbooknumber = new JTextField();
		editbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookbooknumber.setColumns(10);
		editbookbooknumber.setBorder(null);
		editbookbooknumber.setBounds(614, 140, 263, 32);
		editbookinformation.add(editbookbooknumber);
		
		editbookbookname = new JTextField();
		editbookbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookbookname.setColumns(10);
		editbookbookname.setBorder(null);
		editbookbookname.setBounds(614, 185, 263, 32);
		editbookinformation.add(editbookbookname);
		
		editbookauthor = new JTextField();
		editbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookauthor.setColumns(10);
		editbookauthor.setBorder(null);
		editbookauthor.setBounds(614, 228, 263, 32);
		editbookinformation.add(editbookauthor);
		
		editbookdepartment = new JComboBox();
		editbookdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		editbookdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookdepartment.setBounds(614, 270, 263, 32);
		editbookinformation.add(editbookdepartment);
		
		btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editbookinformation();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(688, 312, 111, 32);
		editbookinformation.add(btnNewButton);
		
		lblNewLabel_39 = new JLabel("Edit book information");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_39.setBounds(10, 10, 220, 32);
		editbookinformation.add(lblNewLabel_39);
		
		lblNewLabel_40 = new JLabel("Detail of book");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_40.setBounds(614, 63, 220, 32);
		editbookinformation.add(lblNewLabel_40);
		
		requirededitbookbooknumber = new JLabel("");
		requirededitbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requirededitbookbooknumber.setBounds(240, 10, 220, 32);
		editbookinformation.add(requirededitbookbooknumber);
		
		requirededitbookbooknumber_1 = new JLabel("");
		requirededitbookbooknumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requirededitbookbooknumber_1.setBounds(10, 140, 388, 32);
		editbookinformation.add(requirededitbookbooknumber_1);
		
		deletebookinformation = new JPanel();
		layeredPane_1.add(deletebookinformation, "name_11605756966300");
		deletebookinformation.setLayout(null);
		
		lblNewLabel_27 = new JLabel("Search by book number");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_27.setBounds(10, 61, 222, 40);
		deletebookinformation.add(lblNewLabel_27);
		
		deletebooksearchbooknumber = new JTextField();
		deletebooksearchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requireddeletebooknumber.setText(null);
				requireddeletebooknumber_1.setText(null);	
				if ( e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(deletebooksearchbooknumber.getText().isEmpty()) {
						requireddeletebooknumber.setText("Required");
						return;
					}
					
					try {
						Integer.parseInt(deletebooksearchbooknumber.getText());
					} catch (Exception e2) {
						requireddeletebooknumber.setText("Integer only");
						return;
					}
					
					deletebook();
				}
			}
		});
		deletebooksearchbooknumber.setBorder(null);
		deletebooksearchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebooksearchbooknumber.setBounds(242, 61, 261, 40);
		deletebookinformation.add(deletebooksearchbooknumber);
		deletebooksearchbooknumber.setColumns(10);
		
		lblNewLabel_28 = new JLabel("Book number");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_28.setBounds(377, 141, 161, 40);
		deletebookinformation.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("Book name");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_29.setBounds(377, 191, 126, 40);
		deletebookinformation.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("Author");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_30.setBounds(377, 241, 83, 40);
		deletebookinformation.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("Department");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_31.setBounds(377, 291, 126, 40);
		deletebookinformation.add(lblNewLabel_31);
		
		deletebookbooknumber = new JTextField();
		deletebookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookbooknumber.setColumns(10);
		deletebookbooknumber.setBorder(null);
		deletebookbooknumber.setBounds(602, 141, 282, 40);
		deletebookinformation.add(deletebookbooknumber);
		
		deletebookbookname = new JTextField();
		deletebookbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookbookname.setColumns(10);
		deletebookbookname.setBorder(null);
		deletebookbookname.setBounds(602, 191, 282, 40);
		deletebookinformation.add(deletebookbookname);
		
		deletebookauthor = new JTextField();
		deletebookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookauthor.setColumns(10);
		deletebookauthor.setBorder(null);
		deletebookauthor.setBounds(602, 241, 282, 40);
		deletebookinformation.add(deletebookauthor);
		
		deletebookdepartment = new JTextField();
		deletebookdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookdepartment.setColumns(10);
		deletebookdepartment.setBorder(null);
		deletebookdepartment.setBounds(602, 291, 282, 40);
		deletebookinformation.add(deletebookdepartment);
		
		btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(deletebooksearchbooknumber.getText().isEmpty()) {
					requireddeletebooknumber_1.setText("See book information first");
					return;
				}
				
				if(deletebookbooknumber.getText().isEmpty()) {
					requireddeletebooknumber_1.setText("No data found");
					return;
				}
				
				try {
					deletebookinformationfromdatabase();
				} catch (SQLException e1) {
					JOptionPane.showConfirmDialog(null, e1.toString());
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(697, 341, 103, 33);
		deletebookinformation.add(btnNewButton_1);
		
		lblNewLabel_41 = new JLabel("Delete book information");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_41.setBounds(10, 10, 222, 40);
		deletebookinformation.add(lblNewLabel_41);
		
		lblNewLabel_42 = new JLabel("Detail of book");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_42.setBounds(602, 61, 222, 40);
		deletebookinformation.add(lblNewLabel_42);
		
		requireddeletebooknumber = new JLabel("");
		requireddeletebooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletebooknumber.setBounds(242, 10, 222, 40);
		deletebookinformation.add(requireddeletebooknumber);
		
		requireddeletebooknumber_1 = new JLabel("");
		requireddeletebooknumber_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		requireddeletebooknumber_1.setBounds(10, 141, 330, 40);
		deletebookinformation.add(requireddeletebooknumber_1);
		
		showallbook = new JPanel();
		showallbook.setBackground(new Color(60, 179, 113));
		layeredPane_1.add(showallbook, "name_11632278757300");
		
		lblNewLabel_32 = new JLabel("Search by");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		showallbookbooknumber = new JTextField();
		showallbookbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
//				searchbookbybooknumber();
			}
			@Override
			public void keyReleased(KeyEvent e) {
				searchbookbybooknumber();
			}
		});
		showallbookbooknumber.setBorder(null);
		showallbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		showallbookbooknumber.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		showallbooknobook = new JLabel("");
		showallbooknobook.setForeground(new Color(255, 0, 0));
		showallbooknobook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		showallbookselect = new JComboBox();
		showallbookselect.setModel(new DefaultComboBoxModel(new String[] {"book number", "book name", "author", "department"}));
		showallbookselect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_showallbook = new GroupLayout(showallbook);
		gl_showallbook.setHorizontalGroup(
			gl_showallbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE))
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGap(69)
					.addComponent(showallbookbooknumber, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addGroup(gl_showallbook.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_showallbook.createSequentialGroup()
							.addComponent(showallbooknobook, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
							.addGap(378))
						.addGroup(gl_showallbook.createSequentialGroup()
							.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(showallbookselect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(321))))
		);
		gl_showallbook.setVerticalGroup(
			gl_showallbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGroup(gl_showallbook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_showallbook.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_showallbook.createParallelGroup(Alignment.BASELINE)
								.addComponent(showallbookbooknumber, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_showallbook.createSequentialGroup()
							.addContainerGap()
							.addComponent(showallbookselect, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addGap(16)
					.addComponent(showallbooknobook, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
					.addGap(10))
		);
		showallbook.setLayout(gl_showallbook);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(156)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
public void addstudentinformationintodatabase() {
	
	    StudentInformation student = new StudentInformation();
	
		if (addstudentid.getText().isEmpty()) {
			requiredaddstudentid.setText("Required");
			return;
		}
		try {
			Integer.parseInt(addstudentid.getText());
		} catch (NumberFormatException e) {
			requiredaddstudentid.setText("Integer Only");
			return;
		}
		
		if(addfirstname.getText().isEmpty()) {
			requiredaddstudentfirstname.setText("Required");
			return;
		}
		
		if(addlastname.getText().isEmpty()) {
			requiredaddstudentlastname.setText("Required");
			return;
		}
		if(addfathername.getText().isEmpty()) {
			requiredaddstudentfathername.setText("Required");
			return;
		}
		if(addmothername.getText().isEmpty()) {
			requiredaddstudentmothername.setText("Required");
			return;
		}
		if(addaddress.getText().isEmpty()) {
			requiredaddstudentaddress.setText("Required");
			return;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(adddob.getDate());
			student.setDob(date);
		} catch (Exception e) {
			requiredaddstudentdob.setText("Required");
			return;
		}
		
		student.setStudentid(Integer.parseInt(addstudentid.getText()));
		student.setFirstname(addfirstname.getText());
		student.setLastname(addlastname.getText());
		student.setFathername(addfathername.getText());
		student.setMothername(addmothername.getText());
		student.setAddress(addaddress.getText());
		
		
		
		student.setDepartment((String) adddepartment.getSelectedItem());
		AddStudentInformationIntoDatabase st = new AddStudentInformationIntoDatabase();
		boolean flag = st.add(student);
		if ( flag )
		{
			JOptionPane.showConfirmDialog(null, "Added successfully");
		}else
		{
			JOptionPane.showConfirmDialog(null, "Added not successfully");
		}
		
		addstudentid.setText(null);
		addfirstname.setText(null);
		addlastname.setText(null);
		addfathername.setText(null);
		addmothername.setText(null);
		addaddress.setText(null);
		adddob.setDate(null);		
	}	

void setEmptyJfieldOfAddStudentInformation() {
	requiredaddstudentid.setText(null);
	requiredaddstudentfirstname.setText(null);
	requiredaddstudentlastname.setText(null);
	requiredaddstudentfathername.setText(null);
	requiredaddstudentmothername.setText(null);
	requiredaddstudentaddress.setText(null);
	requiredaddstudentdob.setText(null);
}
		public void editstudentinformationintodatabase() {
			 
			 if(editsearchstudentid.getText().isEmpty()) {
				 requirededitstudentid_1.setText("See student details first!!");
				 return;
			 }
			 
			 if(editstudentid.getText().isEmpty()) {
				 requirededitstudentid_1.setText("No data found");
				 return;
			 }
			 
			 EditStudentInformations editstudent = new EditStudentInformations();
			 StudentInformation student = new StudentInformation();
			 student.setStudentid(Integer.parseInt(editsearchstudentid.getText()));
			 student.setStudentidfirst(Integer.parseInt(editstudentid.getText()));
			 student.setFirstname(editfirstname.getText());
			 student.setLastname(editlastname.getText());
			 student.setFathername(editfathername.getText());
			 student.setMothername(editmothername.getText());
			 student.setAddress(editaddress.getText());
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 String date = sdf.format(editdob.getDate());
			 student.setDob(date);
			 student.setDepartment((String) editdepartment.getSelectedItem());
			 if (editstudent.update(student)) {
				 JOptionPane.showConfirmDialog(null, "Update successfully");
			 }else {
				 JOptionPane.showConfirmDialog(null, "Update not successfull");
			 }
			 editsearchstudentid.setText(null);
			 editstudentid.setText(null);
			 editfirstname.setText(null);
			 editlastname.setText(null);
			 editfathername.setText(null);
			 editmothername.setText(null);
			 editaddress.setText(null);
			 editdob.setDate(null);
		}
		
		
		public void edidstudentinformation() {
			
			  Statement st = null;
				ResultSet rs = null;
			 try {
					Connection con = DatabaseConnection.getConnection();
					String query = "select * from studentinformation where studentid = "+Integer.parseInt(editsearchstudentid.getText())+"";
				    st = con.createStatement();
				    rs = st.executeQuery(query);
					rs.next();
					editstudentid.setText(rs.getString("Studentid"));
					editfirstname.setText(rs.getString("First_name"));
					editlastname.setText(rs.getString("Last_name"));
					editfathername.setText(rs.getString("Father_name"));
					editmothername.setText(rs.getString("Mother_name"));
					editaddress.setText(rs.getString("Address"));
					editdob.setDate(rs.getDate("Date_of_birth"));
				} catch (Exception e2) {
					requirededitstudentid_1.setText("No data found");
					return;
				}
				finally {
					try {
						rs.close();
						st.close();
					} catch (Exception e3) {
						JOptionPane.showConfirmDialog(null, e3.toString());
					}
				}		
		}
		
		public void deletestudentinformation() {
			    Statement st = null;
				ResultSet rs = null;
			 try {
					Connection con = DatabaseConnection.getConnection();
					String query = "select * from studentinformation where studentid = "+Integer.parseInt(deletesearchstudentid.getText())+"";
				    st = con.createStatement();
				    rs = st.executeQuery(query);
					rs.next();
					deletestudentid.setText(rs.getString("Studentid"));
					deletefirstname.setText(rs.getString("First_name"));
					deletelastname.setText(rs.getString("Last_name"));
					deletefathername.setText(rs.getString("Father_name"));
					deletemothername.setText(rs.getString("Mother_name"));
					deleteaddress.setText(rs.getString("Address"));
					deletedob.setDate(rs.getDate("Date_of_birth"));
					deletedepartment.setText(rs.getString("Department"));
				} catch (Exception e2) {
					requireddeletestudentid_1.setText("No data found");
					return;
				}
				finally {
					try {
						rs.close();
						st.close();
					} catch (Exception e3) {
						JOptionPane.showConfirmDialog(null, e3.toString());
					}
				}		
		}
		

     	public void deletestudentinformationfromdatabase() {
     		
     		if(deletesearchstudentid.getText().isEmpty()) {
     			requireddeletestudentid_1.setText("See the detail of student first!");
     			return;
     			
     		}
     		if(deletestudentid.getText().isEmpty()) {
     			requireddeletestudentid_1.setText("No data found");
     			return;
     		}

			StudentInformation information = new StudentInformation();
			DeleteStudentInformation del = new DeleteStudentInformation();
			information.setStudentid(Integer.parseInt(deletesearchstudentid.getText()));
			if (del.delete(information)) {
				JOptionPane.showConfirmDialog(null, "Delete  successfull");
			}else {
				JOptionPane.showConfirmDialog(null, "Delete not successfull");
			}
			
		}
		
     	public void addbookinformation() {
    		BookInformation book = new BookInformation();
    		book.setBooknumber(Integer.parseInt(addbooknumber.getText()));
    		book.setBookname(addbookname.getText());
    		book.setBookauthor(addbookauthor.getText());
    		book.setDepartment((String) addbookdepartment.getSelectedItem());
    		AddBookInformationIntoDatabaseCode add = new AddBookInformationIntoDatabaseCode();
    		if(add.addbookinformation(book)) {
    			JOptionPane.showConfirmDialog(null, "Book added successfully");
    		}else {
    			JOptionPane.showConfirmDialog(null, "Book not added");
    		}		
    	}
   	
     	public void editbookinformation() {
     		
     		if (editbooksearchbooknumber.getText().isEmpty()) {
     			requirededitbookbooknumber_1.setText("See detail of book first!");
     			return;
     		}
     		
     		try {
     			Integer.parseInt(editbooksearchbooknumber.getText());
     		}catch(NumberFormatException e) {
     			requirededitbookbooknumber.setText("Integer only");
     			return;
     		}
     		
     		if(editbookbooknumber.getText().isEmpty()) {
     			requirededitbookbooknumber_1.setText("No data found");
     			return;
     		}
     		
    		BookInformation books = new BookInformation();
    		books.setBooknumber(Integer.parseInt(editbooksearchbooknumber.getText()));
    		books.setBooknumberchange(Integer.parseInt(editbookbooknumber.getText()));
    		books.setBookname(editbookbookname.getText());
    		books.setBookauthor(editbookauthor.getText());
    		books.setDepartment((String) editbookdepartment.getSelectedItem());
    		EditBookInformationCode edit = new EditBookInformationCode();
    		boolean flag = edit.editbookinformation(books);
    		if (flag) {
    			JOptionPane.showConfirmDialog(null, "update successfully");
    		}else {
    			JOptionPane.showConfirmDialog(null, "Update not successfull");
    		}
    		editbooksearchbooknumber.setText(null);
    		editbookbooknumber.setText(null);
    		editbookbookname.setText(null);
    		editbookauthor.setText(null);
    	}
     	
     	
     	public void searchbookbynumber() {
     		
     		if (editbooksearchbooknumber.getText().isEmpty()) {
     			requirededitbookbooknumber.setText("Required");
     			return;
     		}
     		
     		try {
     			Integer.parseInt(editbooksearchbooknumber.getText());
     		}catch(NumberFormatException e) {
     			requirededitbookbooknumber.setText("Integer only");
     			return;
     		}
     		
    		Statement st = null;
    		ResultSet rs = null;
    		try {
    			Connection connection = DatabaseConnection.getConnection();
    			String sql = " select * from bookinformation where book_number = "+editbooksearchbooknumber.getText()+"";
    			st        = connection.createStatement();
    			rs = st.executeQuery(sql);
    			rs.next();
    			editbookbooknumber.setText(rs.getString(1));
    			editbookbookname.setText(rs.getString(2));
    			editbookauthor.setText(rs.getString(3));
    		} catch (Exception e) {
    			requirededitbookbooknumber_1.setText("No data found");
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
     /*
      * Create  method to select book information to conform the book information before deletion	
      */
     	public void deletebook() {
     		Statement st = null;
    		ResultSet rs = null;
    		try {
    			Connection connection = DatabaseConnection.getConnection();
    			String sql = " select * from bookinformation where book_number = "+deletebooksearchbooknumber.getText()+"";
    			st        = connection.createStatement();
    			rs = st.executeQuery(sql);
    			rs.next();
    			deletebookbooknumber.setText(rs.getString(1));
    			deletebookbookname.setText(rs.getString(2));
    			deletebookauthor.setText(rs.getString(3));
    			deletebookdepartment.setText(rs.getString(4));
    		} catch (Exception e) {
    			requireddeletebooknumber_1.setText("No data found");
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
  /*
   * Create a method to delete book information from database   	
   */
     	public void deletebookinformationfromdatabase() throws SQLException {
     		BookInformation book = new BookInformation();
     		book.setBooknumber(Integer.parseInt(deletebooksearchbooknumber.getText()));
     		Deletebookinformation delete = new Deletebookinformation();
     		if ( delete.deletebookinformation(book) ) {
     			JOptionPane.showConfirmDialog(null, "Deleted");
     		}else {
     			JOptionPane.showConfirmDialog(null, "Not Deleted");
     		}
     	}
     /*
      *  Create a method to select all the book from database	
      */
     	public void searchbook() {
    		Statement st = null;
    		ResultSet rs = null;
    		try {
    			Connection connection = DatabaseConnection.getConnection();
    			String query = "select * from bookinformation";
    			st = connection.createStatement();
    			rs = st.executeQuery(query);
    			table_1.setModel(DbUtils.resultSetToTableModel(rs));
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
     	
   /*
    *  Create a method to select the book by book number matched entered by user in text field.  	
    */
     	
     	public void searchbookbybooknumber() {
    		Statement st = null;
    		ResultSet rs = null;
    		String query = null;
    		try {
    			Connection connection = DatabaseConnection.getConnection();
    			String select = (String) showallbookselect.getSelectedItem();
    			if (select.equalsIgnoreCase("book number")) {
    				 query = "select * from bookinformation where book_number like  '%"+showallbookbooknumber.getText()+"%'";
    			}else if (select.equalsIgnoreCase("book name")) {
    				 query = "select * from bookinformation where book_name like  '%"+showallbookbooknumber.getText()+"%'";
    			}else if(select.equalsIgnoreCase("author")) {
    				 query = "select * from bookinformation where author like  '%"+showallbookbooknumber.getText()+"%'";
    			}else if(select.equalsIgnoreCase("department")){
    				 query = "select * from bookinformation where department like  '%"+showallbookbooknumber.getText()+"%'";
    			}else {
    				query = "select * from bookinformation where book_number like  '%"+showallbookbooknumber.getText()+"%'";
    			} 			
    			st = connection.createStatement();
    			rs = st.executeQuery(query);
    			table_1.setModel(DbUtils.resultSetToTableModel(rs));
    		} catch (Exception e) {
    			showallbooknobook.setText("No book found");
    		}
    		finally {
    			try {
    				rs.close();
    				st.close();
    			} catch (Exception e2) {
    				showallbooknobook.setText("No book found");
    			}
    		}
    		
    	}
     	
     	// creating the method to show the data of student and book
    public 	void showStudentAndBookInformation() {
    	
			if( studentid.getText().isEmpty()) {
				requiredstudentid.setText("Required");
				return;
			}
			
			Statement st = null, stt = null;
			ResultSet rss =null, rs = null;
			try {
				Connection con = DatabaseConnection.getConnection();
				String sql = "select * from studentinformation where studentid = "+studentid.getText()+"";
				String query = "select bookinformation.book_number, bookinformation.Book_name, bookinformation.author, bookinformation.Department, studentandbooknumber.Issued_date from bookinformation , studentandbooknumber where bookinformation.Book_number = studentandbooknumber.Book_number and studentandbooknumber.Student_id = "+studentid.getText()+"";
				st = con.createStatement();
				rss= st.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rss));
				stt = con.createStatement();
				rs = stt.executeQuery(sql);
				studentname.setText("Name");
				studentfullname.setText(rs.getString("first_name")+ " "+ rs.getString("last_name"));
				con.close();
			} catch (Exception e2) {
				requiredstudentid.setText("No data found");
				studentname.setText(null);
				return;
			}	
			finally {
				try {
					rss.close();
					st.close();
					rs.close();
					stt.close();
				} catch (Exception e3) {
					requiredstudentid.setText("No data found");
					studentname.setText(null);
					return;
				}
			}
     	}
    
    void setNullAddBookInformation() {
    	requiredaddbooknumber.setText(null);
		requiredaddbookname.setText(null);
		requiredaddbookauthor.setText(null);
    }
}

