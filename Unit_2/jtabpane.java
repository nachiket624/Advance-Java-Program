import java.awt.*;
import javax.swing.*;
public class jtabpane{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JCheckBox cb1 = new JCheckBox("Red");		
		JCheckBox cb2 = new JCheckBox("Green");		
		JCheckBox cb3 = new JCheckBox("Blue");		
		JPanel p1 = new JPanel();
		p1.add(cb1);
		JPanel p2 = new JPanel();
		p1.add(cb2);
		JPanel p3 = new JPanel();
		p1.add(cb3);
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50,50,200,200);
		tp.add("Color",p1);
		tp.add("Location",p2);
		tp.add("Info",p3);
		f.add(tp);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}