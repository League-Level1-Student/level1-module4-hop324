package Yeet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Yagga implements ActionListener {
	JFrame frame = new JFrame();
	JButton left = new JButton();
	JButton middle = new JButton();
	JButton right = new JButton();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JTextField text = new JTextField();
	
	int directionalValue = 0;
	int stageValue = 0;
	int gold = 0;
	
	int playerHealth = 10;
	int playerDamage = 3;
	int playerDamageMod = 1;
	int playerIntiative = 4;
	
	int goblinHealth = 3;
	int goblinDamage = 2;
	int goblinDamageMod = 1;
	
	public static void main(String [] args) {
		new Yagga().createUI();
		JOptionPane.showMessageDialog(null, "Choose a Button and then type 'Run Dungeon' in the text field");
	
	
	}
	
	
	public void createUI(){
		left.addActionListener(this);
		middle.addActionListener(this);
		right.addActionListener(this);
		
		frame.setLayout(new BorderLayout());
		frame.setTitle("Maze I Guess I dunno I'm bored");
		frame.add(panel, BorderLayout.LINE_START); frame.add(panel2, BorderLayout.CENTER); frame.add(panel3, BorderLayout.LINE_END);
		panel.add(left); panel2.add(middle); panel3.add(right);
		frame.add(text, BorderLayout.PAGE_END);
		frame.setSize(900, 800);
		left.setSize(300, 600); right.setSize(300, 600); middle.setSize(300, 600);
		frame.setVisible(true);
		left.setText("Left"); middle.setText("Middle"); right.setText("Right");
		
		
		if(text.getText() == "Run Dungeon") {
			
		}
	}
	
	public void runDungeon() {
		if(stageValue == 0) {
			if(directionalValue == 1) {
				goblinEncounter(2, false, false);
			}
			else if(directionalValue == 2) {
				stageValue++;
			}
			else if(directionalValue == 3) {
				stageValue++;
				gold+=5;
			}
		}
		else if( stageValue == 1){
			if(directionalValue == 1) {
				
			}
			else if(directionalValue == 2) {
				
			}
			else if(directionalValue == 3) {
				
			}
		}
		else if(stageValue == 2) {
			if(directionalValue == 1) {
				
			}
			else if(directionalValue == 2) {
				
			}
			else if(directionalValue == 3) {
				
			}
		}
		else if(stageValue == 3) {
			if(directionalValue == 1) {
				
			}
			else if(directionalValue == 2) {
				
			}
			else if(directionalValue == 3) {
				
			}
		}
		else {
			bossFight();
		}
		
	}
	
	public void goblinEncounter(int numberOfGoblins, Boolean archer, Boolean mage) {
		Random randy = new Random();
		int goblinInitiative = 0;
		int numberOfArchers = 0;
		int numberOfSwords = 0;
		int numberOfMage = 0;
		
		
		//Creating Archers and Mages
		numberOfSwords += numberOfGoblins;
		if(archer) {
			numberOfSwords--;
			numberOfArchers++;
		}
		if(mage) {
			numberOfSwords--;
			numberOfMage++;
		}
		//Creating Archers and Mages
		
		//Creating Individuals
		for(int k = numberOfSwords; k > 0; k--) {
			Yagga jeff = new Yagga("Jeffery: " + k);
		}
		//Creating Individuals
		
		//Starting Encounter
		JOptionPane.showMessageDialog(null, "Herble Gerble, Goblin Attack!");
		for(int i = numberOfGoblins; i > 0; i--) {
			goblinInitiative = randy.nextInt(6);
		}
	}
	
	
	 public Yagga(String name) {
		Random gherg = new Random();
		int initiative = gherg.nextInt(6);
		if(name.contentEquals(cs))
	}
	
	
	
	
	public void bossFight() {
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == left) {
			directionalValue = 1;
		}
		else if(e.getSource() == middle) {
			directionalValue = 2;
		}
		else if(e.getSource() == right) {
			directionalValue = 3;
		}
		
	}
	
}
