package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
	
	void createUI(){
		frame.add(panel);
		panel.add(button); panel.add(button2);
		button.setText("Trick");
		button.addActionListener(this);
		button2.setText("Treat");
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String [] args) {
		new NastySurprise().createUI();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			showPictureFromTheInternet("https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2018/3/22/0/shutterstock_national-puppy-day-224423782.jpg.rend.hgtvcom.966.725.suffix/1521744674350.jpeg");
		}
		else if(e.getSource() == button2) {
			showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2FAZ2ZPmEfjvU%2Fmaxresdefault.jpg&imgrefurl=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DAZ2ZPmEfjvU&docid=yA34_tV7kFR03M&tbnid=PTfdhkgrSBzhhM%3A&vet=10ahUKEwjTirfS29PiAhVDWqwKHTdkBLMQMwh0KAAwAA..i&w=1280&h=720&bih=879&biw=1920&q=puppy&ved=0ahUKEwjTirfS29PiAhVDWqwKHTdkBLMQMwh0KAAwAA&iact=mrc&uact=8");
		}
	}
}
