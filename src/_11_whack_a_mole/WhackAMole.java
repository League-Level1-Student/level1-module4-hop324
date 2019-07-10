package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int moleAssigner = 0;
	int score = 0;
	Random randy = new Random();
	
	//button creation
	
	
	//button creation END
	
	//drawButtons START
	public void drawButtons(Random rand) {
		 moleAssigner = rand.nextInt(24);
			
			for(int i = 24; i > 0; i--) {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
				if(i == moleAssigner) {
					button.setText("Mole!");
				}
			}
			
				panel.setLayout(new GridLayout());
					frame.add(panel);
					frame.pack();
					frame.setVisible(true);
					//Framing Stoof END
		 //Action Listeners START
			//ActionListener END
	
		//Declaring the Mole in the Hole START
		//Declaring the Mole in the Hole END
			
		
	}

//ACTION PERFORMED
	
	@Override
	public void actionPerformed(ActionEvent e){
		Object yeet = e.getSource();
		String yote = yeet.toString();
	if(yote.equalsIgnoreCase("Mole!")){
		score++;
	}
		else {
			JOptionPane.showMessageDialog(null, "You stink");
		}
		
		
	}
}
