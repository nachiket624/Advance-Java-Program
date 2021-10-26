import javax.swing.*;
import java.awt.*;
class Jframe extends JFrame
{
	public Jframe()
	{
		Container ct = getContentPane();
		JLabel j1 = new JLabel("JFrame");
		ct.add(j1);
	}
	public static void main(String args[])
	{
		Jframe fd = new Jframe();
		fd.setTitle("Frist jFrame");
		fd.setSize(400,400);
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fd.setVisible(true);
	}

}