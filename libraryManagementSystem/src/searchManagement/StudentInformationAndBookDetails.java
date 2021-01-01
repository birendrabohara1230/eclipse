package searchManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookInformation.AddBookInformationIntoDatabase;
import bookInformation.AddBookInformationIntoDatabaseCode;
import bookInformation.BookInformation;
import bookandstudentinformation.StudentandBookNumber;
import dao.StudentInformation;
import database.AddStudentInformationIntoDatabase;
import database.DeleteStudentInformation;
import database.EditStudentInformations;
import databaseConnection.DatabaseConnection;
import deleteManagement.DeleteStudentInformationFromDatabase;
import deleteManagement.Deletebookinformation;
import informationOfStudents.AddInformationOfStudentsIntoDatabase;
import insertionManagement.AddUserDetailDataIntoDatabase;
import net.proteanit.sql.DbUtils;
import returnandhistorymanagement.ReturnBook;
import updateManagement.EditStudentInformation;
import updatebookinformation.EditBookInformation;
import updatebookinformation.EditBookInformationCode;
import updatebookinformation.SelectingAllBooksInDatabase;

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
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_2;
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
	private JLabel nostudentid;


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
					e.printStackTrace();
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
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationAndBookDetails.class.getResource("/library.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * it fits the opening Jframe just to fit the screen of the given device.
		 */
		setExtendedState(JFrame.MAXIMIZED_BOTH);	
		setBounds(128, 50, 1230, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Student");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Add  student information");
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
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_10);
		
		mntmNewMenuItem_11 = new JMenuItem("Delete student information");
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_11);
		
		mntmNewMenuItem_12 = new JMenuItem("Show all student");
		mntmNewMenuItem_12.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_12);
		
		mnNewMenu_1 = new JMenu("Edit");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("Edit student information");
		mntmNewMenuItem_1.setArmed(true);
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditStudentInformation edit = new EditStudentInformation();
				edit.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mnNewMenu_2 = new JMenu("Delete");
		mnNewMenu_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_2 = new JMenuItem("Delete student information");
		mntmNewMenuItem_2.setArmed(true);
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentInformationFromDatabase delete  = new DeleteStudentInformationFromDatabase();
				delete.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		mnNewMenu_3 = new JMenu("User");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Add User Information   ");
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
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Delete user information");
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Show all user");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		mnNewMenu_4 = new JMenu("Book");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_3 = new JMenuItem("Add book information");
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
		mntmNewMenuItem_6.setArmed(true);
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanel1(showallbook);
			}
		});
		
		mntmNewMenuItem_13 = new JMenuItem("Delete book information");
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
				nostudentid.setText(null);
			}
		});
		studentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
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
					} catch (Exception e2) {
						JOptionPane.showConfirmDialog(null, "No data found");
					}	
					finally {
						try {
							rss.close();
							st.close();
							rs.close();
							stt.close();
						} catch (Exception e3) {
							JOptionPane.showConfirmDialog(null, e3.toString());
						}
					}
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
				if (studentid.getText().isEmpty() ) {
					nostudentid.setText("Please check student information before adding book!");
					return;
				}else {
					StudentandBookNumber sts = new StudentandBookNumber();
					sts.setVisible(true);
					StudentInformation students = new StudentInformation();
					students.setStudentid(Integer.parseInt(studentid.getText()));
					sts.showingstudentid(students);		
				}
			}
		});
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		studentname = new JLabel("");
		studentname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		studentfullname = new JLabel("");
		studentfullname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		nostudentid = new JLabel("");
		nostudentid.setForeground(new Color(255, 0, 0));
		nostudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_33_1 = new JLabel("Return book");
		lblNewLabel_33_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (studentid.getText().isEmpty()) {
					nostudentid.setText("Please check student information before adding book!");
					return;
				}else {
					ReturnBook returnbookbystudent = new ReturnBook();
					returnbookbystudent.setVisible(true);
					StudentInformation students = new StudentInformation();
					students.setStudentid(Integer.parseInt(studentid.getText()));
					returnbookbystudent.showingstudentid(students);
				}
			}
		});
		lblNewLabel_33_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_studentandbookinformation = new GroupLayout(studentandbookinformation);
		gl_studentandbookinformation.setHorizontalGroup(
			gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentandbookinformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_studentandbookinformation.createSequentialGroup()
							.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
							.addGap(2)
							.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
								.addComponent(studentfullname, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_studentandbookinformation.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_33_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_studentandbookinformation.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nostudentid, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)))
							.addGap(176))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)))
		);
		gl_studentandbookinformation.setVerticalGroup(
			gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentandbookinformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(nostudentid, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_studentandbookinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentfullname, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_33_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addContainerGap())
		);
		studentandbookinformation.setLayout(gl_studentandbookinformation);
		
		deletestudentinformation = new JPanel();
		layeredPane.add(deletestudentinformation, "name_3428113795200");
		deletestudentinformation.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Search by student id");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(134, 10, 184, 35);
		deletestudentinformation.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Search by student id");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(134, 114, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("First name");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(134, 159, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Last name");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(134, 204, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Father name");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(134, 250, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Mother name");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_5.setBounds(134, 294, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Address");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_6.setBounds(134, 341, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Date of birth");
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_7.setBounds(134, 389, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("Department");
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_8.setBounds(134, 434, 184, 35);
		deletestudentinformation.add(lblNewLabel_4_8);
		
		deletesearchstudentid = new JTextField();
		deletesearchstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					deletestudentinformation();
				}
			}
		});
		deletesearchstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletesearchstudentid.setBorder(null);
		deletesearchstudentid.setBounds(351, 10, 257, 35);
		deletestudentinformation.add(deletesearchstudentid);
		deletesearchstudentid.setColumns(10);
		
		deletestudentid = new JTextField();
		deletestudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletestudentid.setColumns(10);
		deletestudentid.setBorder(null);
		deletestudentid.setBounds(351, 114, 257, 35);
		deletestudentinformation.add(deletestudentid);
		
		deletefirstname = new JTextField();
		deletefirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletefirstname.setColumns(10);
		deletefirstname.setBorder(null);
		deletefirstname.setBounds(351, 159, 257, 35);
		deletestudentinformation.add(deletefirstname);
		
		deletelastname = new JTextField();
		deletelastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletelastname.setColumns(10);
		deletelastname.setBorder(null);
		deletelastname.setBounds(351, 204, 257, 35);
		deletestudentinformation.add(deletelastname);
		
		deletefathername = new JTextField();
		deletefathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletefathername.setColumns(10);
		deletefathername.setBorder(null);
		deletefathername.setBounds(351, 250, 257, 35);
		deletestudentinformation.add(deletefathername);
		
		deletemothername = new JTextField();
		deletemothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletemothername.setColumns(10);
		deletemothername.setBorder(null);
		deletemothername.setBounds(351, 294, 257, 35);
		deletestudentinformation.add(deletemothername);
		
		deleteaddress = new JTextField();
		deleteaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deleteaddress.setColumns(10);
		deleteaddress.setBorder(null);
		deleteaddress.setBounds(351, 341, 257, 35);
		deletestudentinformation.add(deleteaddress);
		
		deletedob = new JDateChooser();
		deletedob.setBounds(351, 389, 257, 35);
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
		delete.setBounds(424, 479, 106, 27);
		deletestudentinformation.add(delete);
		
		deletedepartment = new JTextField();
		deletedepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletedepartment.setColumns(10);
		deletedepartment.setBorder(null);
		deletedepartment.setBounds(351, 434, 257, 35);
		deletestudentinformation.add(deletedepartment);
		
		editstudentinformation = new JPanel();
		layeredPane.add(editstudentinformation, "name_3433140303000");
		editstudentinformation.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Search by student id");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(114, 10, 181, 32);
		editstudentinformation.add(lblNewLabel_5);
		
		editsearchstudentid = new JTextField();
		editsearchstudentid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					edidstudentinformation();
				}
			}
		});
		editsearchstudentid.setBorder(null);
		editsearchstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editsearchstudentid.setBounds(341, 10, 281, 32);
		editstudentinformation.add(editsearchstudentid);
		editsearchstudentid.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Student id");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(150, 117, 181, 32);
		editstudentinformation.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("First name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(150, 159, 181, 32);
		editstudentinformation.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Last name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(150, 201, 181, 32);
		editstudentinformation.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Father name");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(150, 243, 181, 32);
		editstudentinformation.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Mother name");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(150, 285, 181, 32);
		editstudentinformation.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Address");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(150, 327, 181, 32);
		editstudentinformation.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("DOB");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(150, 369, 181, 32);
		editstudentinformation.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Department");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(150, 411, 181, 32);
		editstudentinformation.add(lblNewLabel_13);
		
		editstudentid = new JTextField();
		editstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editstudentid.setColumns(10);
		editstudentid.setBorder(null);
		editstudentid.setBounds(341, 117, 281, 32);
		editstudentinformation.add(editstudentid);
		
		editfirstname = new JTextField();
		editfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editfirstname.setColumns(10);
		editfirstname.setBorder(null);
		editfirstname.setBounds(341, 159, 281, 32);
		editstudentinformation.add(editfirstname);
		
		editlastname = new JTextField();
		editlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editlastname.setColumns(10);
		editlastname.setBorder(null);
		editlastname.setBounds(341, 201, 281, 27);
		editstudentinformation.add(editlastname);
		
		editfathername = new JTextField();
		editfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editfathername.setColumns(10);
		editfathername.setBorder(null);
		editfathername.setBounds(341, 243, 281, 32);
		editstudentinformation.add(editfathername);
		
		editmothername = new JTextField();
		editmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editmothername.setColumns(10);
		editmothername.setBorder(null);
		editmothername.setBounds(341, 285, 281, 27);
		editstudentinformation.add(editmothername);
		
		editaddress = new JTextField();
		editaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editaddress.setColumns(10);
		editaddress.setBorder(null);
		editaddress.setBounds(341, 327, 281, 27);
		editstudentinformation.add(editaddress);
		
		editdob = new JDateChooser();
		editdob.setBounds(341, 369, 281, 32);
		editstudentinformation.add(editdob);
		
		editdepartment = new JComboBox();
		editdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		editdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editdepartment.setBounds(341, 414, 281, 32);
		editstudentinformation.add(editdepartment);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editstudentinformationintodatabase();
			}
		});
		edit.setBorder(null);
		edit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		edit.setBounds(438, 456, 91, 32);
		editstudentinformation.add(edit);
		
		addstudentinformation = new JPanel();
		layeredPane.add(addstudentinformation, "name_3436503250400");
		
		JLabel lblNewLabel_3 = new JLabel("Student id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		addstudentid = new JTextField();
		addstudentid.setBorder(null);
		addstudentid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addstudentid.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("First name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_2 = new JLabel("Last name");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_3 = new JLabel("Father name");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_4 = new JLabel("Mother name");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5 = new JLabel("Address");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5_1 = new JLabel("DOB");
		lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3_5_2 = new JLabel("Department");
		lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		addfirstname = new JTextField();
		addfirstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addfirstname.setColumns(10);
		addfirstname.setBorder(null);
		
		addlastname = new JTextField();
		addlastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addlastname.setColumns(10);
		addlastname.setBorder(null);
		
		addfathername = new JTextField();
		addfathername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addfathername.setColumns(10);
		addfathername.setBorder(null);
		
		addmothername = new JTextField();
		addmothername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addmothername.setColumns(10);
		addmothername.setBorder(null);
		
		addaddress = new JTextField();
		addaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addaddress.setColumns(10);
		addaddress.setBorder(null);
		
		adddob = new JDateChooser();
		
		adddepartment = new JComboBox();
		adddepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adddepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				addstudentinformationintodatabase();
			}
		});
		add.setBorder(null);
		add.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_addstudentinformation = new GroupLayout(addstudentinformation);
		gl_addstudentinformation.setHorizontalGroup(
			gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(addstudentid, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(addfirstname, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(addlastname, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(addfathername, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(addmothername, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(addaddress, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_5_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(adddob, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(120)
					.addComponent(lblNewLabel_3_5_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(adddepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(330)
					.addComponent(add, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_addstudentinformation.setVerticalGroup(
			gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addstudentinformation.createSequentialGroup()
					.addGap(106)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addstudentid, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addfirstname, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addlastname, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addfathername, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addmothername, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(addaddress, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_5_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(adddob, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_addstudentinformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_5_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(adddepartment, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(add, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		addstudentinformation.setLayout(gl_addstudentinformation);
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
		addbooknumber.setBorder(null);
		addbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbooknumber.setBounds(384, 104, 278, 35);
		addbookinformation.add(addbooknumber);
		addbooknumber.setColumns(10);
		
		addbookname = new JTextField();
		addbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbookname.setColumns(10);
		addbookname.setBorder(null);
		addbookname.setBounds(384, 152, 278, 35);
		addbookinformation.add(addbookname);
		
		addbookauthor = new JTextField();
		addbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addbookauthor.setColumns(10);
		addbookauthor.setBorder(null);
		addbookauthor.setBounds(384, 200, 278, 35);
		addbookinformation.add(addbookauthor);
		
		addbookdepartment = new JComboBox();
		addbookdepartment.setFont(new Font("Dialog", Font.PLAIN, 18));
		addbookdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		addbookdepartment.setBounds(384, 249, 278, 35);
		addbookinformation.add(addbookdepartment);
		
		addbook = new JButton("Add book");
		addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		editbookinformation = new JPanel();
		layeredPane_1.add(editbookinformation, "name_11602533324000");
		editbookinformation.setLayout(null);
		
		lblNewLabel_22 = new JLabel("Search by book number");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_22.setBounds(188, 63, 201, 32);
		editbookinformation.add(lblNewLabel_22);
		
		editbooksearchbooknumber = new JTextField();
		editbooksearchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				searchbookbynumber();
			}
		});
		editbooksearchbooknumber.setBorder(null);
		editbooksearchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbooksearchbooknumber.setBounds(421, 63, 263, 32);
		editbookinformation.add(editbooksearchbooknumber);
		editbooksearchbooknumber.setColumns(10);
		
		lblNewLabel_23 = new JLabel("Book number");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_23.setBounds(248, 173, 141, 32);
		editbookinformation.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Book name");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_24.setBounds(248, 218, 141, 32);
		editbookinformation.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Author");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_25.setBounds(248, 261, 141, 32);
		editbookinformation.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("Department");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_26.setBounds(248, 303, 141, 32);
		editbookinformation.add(lblNewLabel_26);
		
		editbookbooknumber = new JTextField();
		editbookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookbooknumber.setColumns(10);
		editbookbooknumber.setBorder(null);
		editbookbooknumber.setBounds(421, 173, 263, 32);
		editbookinformation.add(editbookbooknumber);
		
		editbookbookname = new JTextField();
		editbookbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookbookname.setColumns(10);
		editbookbookname.setBorder(null);
		editbookbookname.setBounds(421, 218, 263, 32);
		editbookinformation.add(editbookbookname);
		
		editbookauthor = new JTextField();
		editbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookauthor.setColumns(10);
		editbookauthor.setBorder(null);
		editbookauthor.setBounds(421, 261, 263, 32);
		editbookinformation.add(editbookauthor);
		
		editbookdepartment = new JComboBox();
		editbookdepartment.setModel(new DefaultComboBoxModel(new String[] {"Science and technology", "Education", "Engineering"}));
		editbookdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		editbookdepartment.setBounds(421, 303, 263, 32);
		editbookinformation.add(editbookdepartment);
		
		btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editbookinformation();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(492, 357, 111, 32);
		editbookinformation.add(btnNewButton);
		
		deletebookinformation = new JPanel();
		layeredPane_1.add(deletebookinformation, "name_11605756966300");
		deletebookinformation.setLayout(null);
		
		lblNewLabel_27 = new JLabel("Search by book number");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_27.setBounds(150, 42, 222, 40);
		deletebookinformation.add(lblNewLabel_27);
		
		deletebooksearchbooknumber = new JTextField();
		deletebooksearchbooknumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.getKeyCode() == KeyEvent.VK_ENTER) {
					deletebook();
				}
			}
		});
		deletebooksearchbooknumber.setBorder(null);
		deletebooksearchbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebooksearchbooknumber.setBounds(436, 42, 282, 40);
		deletebookinformation.add(deletebooksearchbooknumber);
		deletebooksearchbooknumber.setColumns(10);
		
		lblNewLabel_28 = new JLabel("Book number");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_28.setBounds(211, 141, 161, 40);
		deletebookinformation.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("Book name");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_29.setBounds(211, 191, 126, 40);
		deletebookinformation.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("Author");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_30.setBounds(211, 241, 83, 40);
		deletebookinformation.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("Department");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_31.setBounds(211, 291, 126, 40);
		deletebookinformation.add(lblNewLabel_31);
		
		deletebookbooknumber = new JTextField();
		deletebookbooknumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookbooknumber.setColumns(10);
		deletebookbooknumber.setBorder(null);
		deletebookbooknumber.setBounds(436, 141, 282, 40);
		deletebookinformation.add(deletebookbooknumber);
		
		deletebookbookname = new JTextField();
		deletebookbookname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookbookname.setColumns(10);
		deletebookbookname.setBorder(null);
		deletebookbookname.setBounds(436, 191, 282, 40);
		deletebookinformation.add(deletebookbookname);
		
		deletebookauthor = new JTextField();
		deletebookauthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookauthor.setColumns(10);
		deletebookauthor.setBorder(null);
		deletebookauthor.setBounds(436, 241, 282, 40);
		deletebookinformation.add(deletebookauthor);
		
		deletebookdepartment = new JTextField();
		deletebookdepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		deletebookdepartment.setColumns(10);
		deletebookdepartment.setBorder(null);
		deletebookdepartment.setBounds(436, 291, 282, 40);
		deletebookinformation.add(deletebookdepartment);
		
		btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					deletebookinformationfromdatabase();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(537, 341, 103, 33);
		deletebookinformation.add(btnNewButton_1);
		
		showallbook = new JPanel();
		showallbook.setBackground(new Color(60, 179, 113));
		layeredPane_1.add(showallbook, "name_11632278757300");
		
		lblNewLabel_32 = new JLabel("Search by book number");
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
		GroupLayout gl_showallbook = new GroupLayout(showallbook);
		gl_showallbook.setHorizontalGroup(
			gl_showallbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE))
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGap(91)
					.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_showallbook.createParallelGroup(Alignment.LEADING)
						.addComponent(showallbooknobook, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
						.addComponent(showallbookbooknumber, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
					.addGap(570))
		);
		gl_showallbook.setVerticalGroup(
			gl_showallbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showallbook.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_showallbook.createParallelGroup(Alignment.LEADING, false)
						.addComponent(showallbookbooknumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_32, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
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
		student.setStudentid(Integer.parseInt(addstudentid.getText()));
		student.setFirstname(addfirstname.getText());
		student.setLastname(addlastname.getText());
		student.setFathername(addfathername.getText());
		student.setMothername(addmothername.getText());
		student.setAddress(addaddress.getText());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(adddob.getDate());
		student.setDob(date);
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
		public void editstudentinformationintodatabase() {
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
					JOptionPane.showConfirmDialog(null, e2);
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
					JOptionPane.showConfirmDialog(null, e2);
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
    	}
     	
     	
     	public void searchbookbynumber() {
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
    		try {
    			Connection connection = DatabaseConnection.getConnection();
    			String query = "select * from bookinformation where book_number like  '%"+showallbookbooknumber.getText()+"%'";
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
}
