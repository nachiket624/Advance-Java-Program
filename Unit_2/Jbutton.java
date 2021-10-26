import java.awt.*;
import javax.swing.*;
public class Jbutton {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Push Button");
		b.setBounds(80,80,120,50);
		f.add(b);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}