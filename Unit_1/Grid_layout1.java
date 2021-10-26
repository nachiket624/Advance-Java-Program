import java.awt.*;
class Grid_layout1{
	public static void main(String[] args) {
		

	Frame f = new Frame("Grid Layout");
	GridLayout obj = new GridLayout(3,3);
	Button b1 = new Button("one");
	Button b2 = new Button("two");
	Button b3 = new Button("three");
	Button b4 = new Button("four");
	Button b5 = new Button("five");
	Button b6 = new Button("six");

	f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
	f.setLayout(obj);
	f.setSize(400,400);
	f.setVisible(true);
	
	}
}
