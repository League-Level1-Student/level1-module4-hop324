package _12_slot_machine;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton spin = new JButton();
	Object yeet = new Object();
	Object yote = new Object();
	Object yagga = new Object();
	
	public static void main(String [] args) throws MalformedURLException {
		new SlotMachine().createUI();
		
	}
	JLabel Bad = new JLabel();
	JLabel are = new JLabel();
	JLabel you = new JLabel();
	JLabel wrong = new JLabel();

	
	public  void createUI() throws MalformedURLException {
		spin.setText("Spin 2 Win, or You're Bad");
		spin.addActionListener(this);
		Bad = createLabelImage("BAD.jpeg");
		are = createLabelImage("Are.png");
		you = createLabelImage("You.png");
		wrong = createLabelImage("Wrong.png");
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout());
		frame.add(panel1, BorderLayout.LINE_START); frame.add(panel2, BorderLayout.CENTER); frame.add(panel3, BorderLayout.LINE_END); frame.add(spin, BorderLayout.PAGE_START);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	private  JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Yeet");
		Random randy = new Random();
		int firstSlide = randy.nextInt(3);
		int secondSlide = randy.nextInt(3);
		int thirdSlide = randy.nextInt(3);
		if(firstSlide == 0) {
			panel1.add(you);
			frame.pack();
		}
		else if(firstSlide == 1) {
			panel1.add(are);
			frame.pack();
		}
		else {
			panel1.add(Bad);
			frame.pack();
		}
		if(secondSlide == 0) {
			panel2.add(you);
			frame.pack();
		}
		else if(secondSlide == 1) {
			panel2.add(are);
			frame.pack();
		}
		else {
			panel2.add(Bad);
			frame.pack();
		}
		if(thirdSlide == 0) {
			panel3.add(you);
			frame.pack();
		}
		else if(thirdSlide == 1) {
			panel3.add(are);
			frame.pack();
		}
		else {
			panel3.add(Bad);
			frame.pack();
		}
		yeet = panel1.getComponents();
		yote = panel2.getComponents();
		yagga = panel3.getComponents();
		if(yeet == you && yote == are && yagga == Bad) {
			JOptionPane.showMessageDialog(null, "You got lucky! And You Are Bad");
		}
		
	}
    
	
}
