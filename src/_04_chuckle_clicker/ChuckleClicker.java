package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	private JButton button1 = new JButton();
	private JButton button2 = new JButton();
public static void main(String [] args) {
	new ChuckleClicker().run();
}
public void run() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	button1 = makeButtons("Big");
	button1.addActionListener(this);
	button2 = makeButtons("Chungus");
	button2.addActionListener(this);
	panel.add(button1); panel.add(button2);
	frame.add(panel); 
	frame.pack();
}

private JButton makeButtons(String buttonText) {
	//JOptionPane.showMessageDialog(null, "Make Buttons");
	JButton button = new JButton();
	button.setText(buttonText);
	return button;
	
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == button1) {
		JOptionPane.showMessageDialog(null, "What were the BOYS lookin  for at 3:00 AM?");
	}
	else {
		JOptionPane.showMessageDialog(null, " B E A N S");
	}
}

}
