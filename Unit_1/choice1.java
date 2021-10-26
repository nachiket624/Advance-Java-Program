import java.awt.*;
public class choice1{
	// creating a costrutor
	choice1(){
		Frame f = new Frame("Choice");
		Choice c = new Choice();
		c.setBounds(100,100,75,75);

		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("Python");
		c.add("PHP");
		c.add("Rube");

		f.add(c);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new choice1();
	}
}