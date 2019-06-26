package _08_calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	private JFrame frame = new JFrame();
	private JTextField input1 = new JTextField();
	private JTextField input2 = new JTextField();
	private JButton button1 = new JButton();
	private JButton button2 = new JButton();
	private JButton button3 = new JButton();
	private JButton button4 = new JButton();
	public void add(int number1, int number2) {
		int BIGBOI = number1 + number2;
		JOptionPane.showMessageDialog(null, BIGBOI);
	}
	public void multiply(int number1, int number2) {
int BIGBOI = number1 * number2;
JOptionPane.showMessageDialog(null, BIGBOI);
}
	public void subtract(int number1, int number2) {
		int BIGBOI = number1 - number2;
		JOptionPane.showMessageDialog(null, BIGBOI);
	}
	public void divide(int number1, int number2) {
		int BIGBOI = number1 / number2;
		JOptionPane.showMessageDialog(null, BIGBOI);
	}
	
	public void createUI() {
		button1.setText("Add");
		button1.addActionListener(this);
		button2.setText("Multiply");
		button2.addActionListener(this);
		button3.setText("Subtract");
		button3.addActionListener(this);
		button4.setText("Divide");
		button4.addActionListener(this);
		frame.add(input1);frame.add(input2);frame.add(button1);frame.add(button2);frame.add(button3);frame.add(button4);
		frame.setLayout(new GridLayout());
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String first = input1.getText();
		String second = input2.getText();
		int Big = Integer.parseInt(first);
		int Boi = Integer.parseInt(second);
		//int numuro1 = Integer.parseInt(input1);
		if(e.getSource() == button1) {
			add(Big, Boi);
		}
		else if(e.getSource() == button2) {
			multiply(Big, Boi);
		}
		else if(e.getSource() == button3) {
			subtract(Big, Boi);
		}
		else if(e.getSource() == button4) {
			divide(Big, Boi);
}
		
		
		
	}
	
}
