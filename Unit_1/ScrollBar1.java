import java.awt.*;
public class ScrollBar1{
	ScrollBar1()
	{
		Frame f = new Frame("Scroll Bar");
		Scrollbar s  = new Scrollbar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollBar1();
		
	}
}