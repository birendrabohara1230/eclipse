package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

public class CalculatorProject extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField answer;
	private JButton equal;
	private double firstNumber;
	private double secondNumber;
	private double result;
	private String operation;
	private JLabel upperShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorProject frame = new CalculatorProject();
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
	public CalculatorProject() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		answer = new JTextField();
		answer.setOpaque(false);
		answer.setFont(new Font("Tahoma", Font.BOLD, 30));
		answer.setForeground(Color.BLACK);
		answer.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		answer.setBackground(Color.WHITE);
		answer.setBorder(null);
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setColumns(10);
		answer.setBounds(10, 44, 439, 41);
		contentPane.add(answer);
		
		JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(answer.getText());
				answer.setText("");
				operation = "+";
			}
		});
		addition.setFont(new Font("Tahoma", Font.BOLD, 15));
		addition.setBounds(350, 237, 99, 183);
		contentPane.add(addition);
		
		JButton subtraction = new JButton("-");
		subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(answer.getText());
				answer.setText("");
				operation = "-";
			}
		});
		subtraction.setFont(new Font("Tahoma", Font.BOLD, 15));
		subtraction.setBounds(340, 108, 109, 119);
		contentPane.add(subtraction);
		
		equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNumber = Double.parseDouble(answer.getText());
				switch(operation) {
				case "+":
					result = firstNumber + secondNumber;
					answer.setText(String.format("%.5f", result));
					break;
				case "/":
					result = firstNumber / secondNumber;
					upperShow.setText(firstNumber + " " + operation + " " + secondNumber + " = " + " ");
					answer.setText(String.format("%.5f", result));
					break;
				case "x":
					result = firstNumber * secondNumber;
					answer.setText(String.format("%.5f", result));
					break;
				case "-":
					result = firstNumber - secondNumber;
					answer.setText(String.format("%.5f", result));
					break;
				}
			}
		});
		equal.setBounds(350, 419, 99, 119);
		contentPane.add(equal);
		
		JButton multiplication = new JButton("x");
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(answer.getText());
				answer.setText("");
				operation = "x";
			}
		});
		multiplication.setFont(new Font("Tahoma", Font.BOLD, 15));
		multiplication.setBounds(228, 108, 109, 119);
		contentPane.add(multiplication);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(answer.getText());
				answer.setText("");
				operation = "/";
				upperShow.setText(firstNumber + " " + operation + " ");
			}
		});
		division.setFont(new Font("Tahoma", Font.BOLD, 15));
		division.setBounds(115, 108, 109, 119);
		contentPane.add(division);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button9.getText();
				answer.setText(enterNumber);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button9.setBounds(238, 238, 109, 75);
		contentPane.add(button9);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button6.getText();
				answer.setText(enterNumber);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button6.setBounds(238, 314, 109, 75);
		contentPane.add(button6);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button3.getText();
				answer.setText(enterNumber);
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button3.setBounds(238, 389, 109, 75);
		contentPane.add(button3);
		
		JButton buttondecimal = new JButton(".");
		buttondecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decimalPoint = answer.getText();
				boolean flag = decimalPoint.contains(".");
				if( flag ) {
					String enterNumber = answer.getText();
					answer.setText(enterNumber);
				}else {
					String enterNumber = answer.getText() + buttondecimal.getText();
					answer.setText(enterNumber);
				}
			}
		});
		buttondecimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttondecimal.setBounds(238, 463, 109, 75);
		contentPane.add(buttondecimal);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button8.getText();
				answer.setText(enterNumber);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button8.setBounds(125, 238, 109, 75);
		contentPane.add(button8);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button5.getText();
				answer.setText(enterNumber);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button5.setBounds(125, 314, 109, 75);
		contentPane.add(button5);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button2.getText();
				answer.setText(enterNumber);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button2.setBounds(125, 389, 109, 75);
		contentPane.add(button2);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button7.getText();
				answer.setText(enterNumber);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button7.setBounds(10, 237, 109, 75);
		contentPane.add(button7);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button4.getText();
				answer.setText(enterNumber);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button4.setBounds(10, 314, 109, 75);
		contentPane.add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button1.getText();
				answer.setText(enterNumber);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button1.setBounds(10, 389, 109, 75);
		contentPane.add(button1);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = answer.getText() + button0.getText();
				answer.setText(enterNumber);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 15));
		button0.setBounds(10, 468, 224, 70);
		contentPane.add(button0);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(null);
				upperShow.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(10, 108, 99, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\uF0E7");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if( answer.getText().length() > 0) {
					StringBuilder str = new StringBuilder(answer.getText());
					str.deleteCharAt(answer.getText().length() - 1);
					backSpace = str.toString();
					answer.setText(backSpace);
				}
			}
		});
		btnNewButton_2_1.setBounds(10, 164, 99, 63);
		contentPane.add(btnNewButton_2_1);
		
		upperShow = new JLabel("");
		upperShow.setFont(new Font("Tahoma", Font.BOLD, 18));
		upperShow.setBackground(Color.WHITE);
		upperShow.setVerticalAlignment(SwingConstants.BOTTOM);
		upperShow.setHorizontalAlignment(SwingConstants.TRAILING);
		upperShow.setBounds(10, 0, 439, 45);
		contentPane.add(upperShow);
		
		
	}
}
