package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton SecretButton;
	int moleAssigner = 0;
	static int score = 0;
	static int failures = 0;
	static Date date;
	Random randy = new Random();
	
	//button creation
	
	
	//button creation END
	
	//drawButtons START
	public void drawButtons(Random rand) {
		 moleAssigner = rand.nextInt(23);
			
			for(int i = 24; i > 0; i--) {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
				if(i == moleAssigner) {
					button.setText("Mole!");
					SecretButton = button;
				}
			}
			
				//panel.setLayout(new GridLayout());
					frame.add(panel);
					frame.setSize(300, 300);
					date = new Date();
					frame.setVisible(true);
					//Framing Stoof END
		 //Action Listeners START
			//ActionListener END
	
		//Declaring the Mole in the Hole START
		//Declaring the Mole in the Hole END
					
					
	}

//ACTION PERFORMED
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
	if(e.getSource() == SecretButton){
		score++;
		System.out.println(score);
		System.out.println(failures);
		WhackAMole X = new WhackAMole();
		frame.removeAll();
		X.drawButtons(randy);
		if(score == 10) {
			X.endGame(date, score);

		}
	}
		else {
			JOptionPane.showMessageDialog(null, "You stink");
			failures ++;
		}
		
		
	}
}
