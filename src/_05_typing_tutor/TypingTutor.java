package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	boolean change = false;
public static void main(String [] args) {
	new TypingTutor().createUI();
}
public void createUI() {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	frame.setTitle("Type Or Bad");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(label.CENTER);
	label.setText("Type: " + currentLetter);
	frame.add(label);
	frame.addKeyListener(this);
	frame.pack();
	frame.setVisible(true);
	change = false;
}

char currentLetter = generateRandomLetter();

public char generateRandomLetter() {
    Random r = new Random();
   char xD = (char) (r.nextInt(26) + 'a');
    return (xD);
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@Override
public void keyPressed(KeyEvent f) {
	System.out.println(f.getKeyChar());
	if(f.getKeyChar() == currentLetter) {
		JOptionPane.showMessageDialog(null, "Correct!");
		change = true;
	}
}
@Override
public void keyReleased(KeyEvent e) {
	
 currentLetter = generateRandomLetter();
	
}
}