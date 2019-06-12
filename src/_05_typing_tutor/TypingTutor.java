package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
public static void main(String [] args) {
	
}
public void createUI() {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	frame.setTitle("Type Or Bad");
	label.(currentLetter);
	panel.add(label);
	frame.add(panel);
}

char currentLetter = generateRandomLetter1();

public char generateRandomLetter1() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}