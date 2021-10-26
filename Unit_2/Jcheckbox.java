import java.awt.*;
import javax.swing.*;
public class Jcheckbox
{
	public static void main(String[] args) {
		JFrame f = new JFrame("JCheckbox");
		JCheckBox ch1 = new JCheckBox("Python");
		ch1.setBounds(50,100,90,50);
		JCheckBox ch2 = new JCheckBox("Java");
		ch2.setBounds(50,150,90,50);
		JCheckBox ch3 = new JCheckBox("C++");
		ch3.setBounds(50,200,90,50);
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.setSize(400,400);		
		f.setLayout(null);
		f.setVisible(true);

	}
}