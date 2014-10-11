package MainPackage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JFrame frame;
	private JTextField txtInvestmentAmmount;
	private JTextField txtYears;
	private JTextField txtAnnualInterestRate;
	private JTextField txtFutureValue;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private JTextField textField_3;

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtInvestmentAmmount = new JTextField();
		txtInvestmentAmmount.setEditable(false);
		txtInvestmentAmmount.setFont(new Font("Verdana", Font.BOLD, 14));
		txtInvestmentAmmount.setText("Investment Amount");
		txtInvestmentAmmount.setBounds(10, 20, 180, 20);
		frame.getContentPane().add(txtInvestmentAmmount);
		txtInvestmentAmmount.setColumns(10);

		txtYears = new JTextField();
		txtYears.setEditable(false);
		txtYears.setFont(new Font("Verdana", Font.BOLD, 14));
		txtYears.setText("Years");
		txtYears.setBounds(10, 53, 180, 20);
		frame.getContentPane().add(txtYears);
		txtYears.setColumns(10);

		txtAnnualInterestRate = new JTextField();
		txtAnnualInterestRate.setEditable(false);
		txtAnnualInterestRate.setFont(new Font("Verdana", Font.BOLD, 14));
		txtAnnualInterestRate.setText("Annual Interest Rate");
		txtAnnualInterestRate.setBounds(10, 84, 180, 20);
		frame.getContentPane().add(txtAnnualInterestRate);
		txtAnnualInterestRate.setColumns(10);

		txtFutureValue = new JTextField();
		txtFutureValue.setEditable(false);
		txtFutureValue.setFont(new Font("Verdana", Font.BOLD, 14));
		txtFutureValue.setText("Future Value");
		txtFutureValue.setBounds(10, 115, 180, 20);
		frame.getContentPane().add(txtFutureValue);
		txtFutureValue.setColumns(10);

		textField = new JTextField();
		textField.setBounds(285, 22, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(285, 53, 139, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(285, 84, 139, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(285, 115, 139, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PresentValue = Double.parseDouble(textField.getText()); 
				double Years = Double.parseDouble(textField_1.getText()); 
				double InterestRate = Double.parseDouble(textField_2.getText());
				FutureValue proto = new FutureValue();
				double total = proto.returnFutureValue(PresentValue, InterestRate, Years);
				textField_3.setText("$" + total);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(335, 146, 89, 23);
		frame.getContentPane().add(btnNewButton);

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

