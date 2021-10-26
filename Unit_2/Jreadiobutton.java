import java.awt.*;
import javax.swing.*;
public class Jreadiobutton{
	public static void main(String[] args) {
		JFrame f = new JFrame("JRedio Button");
		JRadioButton rb1 = new JRadioButton("Python",true);
		rb1.setBounds(50,100,90,50);
		JRadioButton rb2 = new JRadioButton("Java");
		rb2.setBounds(50,150,90,50);
		JRadioButton rb3 = new JRadioButton("C++");
		rb3.setBounds(50,200,90,50);
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}