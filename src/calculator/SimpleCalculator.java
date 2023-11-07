package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JLabel lblMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setBounds(41, 50, 65, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Number 2");
		lblNewLabel_2.setBounds(41, 104, 65, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(132, 47, 96, 20);
		frame.getContentPane().add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(132, 101, 96, 20);
		frame.getContentPane().add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ret;
				String str;
				
				// addition
				str = tfNum1.getText();
				num1 = Integer.parseInt(str);
				
				str = tfNum2.getText();
				num2 = Integer.parseInt(str);
				
				ret = num1 + num2;
				
				//set added number into lblMsg component
				lblMsg.setText(String.valueOf(ret));
				
			}
		});
		btnAdd.setBounds(29, 143, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ret;
				String str;
				
				// subtraction
				str = tfNum1.getText();
				num1 = Integer.parseInt(str);
				
				str = tfNum2.getText();
				num2 = Integer.parseInt(str);
				
				ret = num1 - num2;
				
				//set result into lblMsg component
				lblMsg.setText(String.valueOf(ret));
			}
		});
		btnSub.setBounds(139, 143, 89, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ret;
				String str;
				
				// Multiplication
				str = tfNum1.getText();
				num1 = Integer.parseInt(str);
				
				str = tfNum2.getText();
				num2 = Integer.parseInt(str);
				
				ret = num1 * num2;
				
				//set result into lblMsg component
				lblMsg.setText(String.valueOf(ret));
			}
		});
		btnMul.setBounds(251, 143, 89, 23);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, ret;
				String str;
				
				// division
				str = tfNum1.getText();
				num1 = Double.parseDouble(str);
				
				str = tfNum2.getText();
				num2 = Double.parseDouble(str);
				
				ret = num1 / num2;
				
				//set result into lblMsg component
				lblMsg.setText(String.valueOf(ret));
			}
		});
		btnDiv.setBounds(350, 143, 89, 23);
		frame.getContentPane().add(btnDiv);
		
		lblMsg = new JLabel("");
		lblMsg.setBounds(41, 210, 47, 14);
		frame.getContentPane().add(lblMsg);
	}

}
