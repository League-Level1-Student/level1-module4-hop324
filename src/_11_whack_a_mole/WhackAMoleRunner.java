package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JOptionPane;

public class WhackAMoleRunner {
	
public static void main(String[] args) {
	Random jerry = new Random();
	WhackAMole X = new WhackAMole();
	X.drawButtons(jerry);
	JOptionPane.showMessageDialog(null, "Hi");
}
}
