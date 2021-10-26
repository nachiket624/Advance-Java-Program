import java.awt.*;
class Border_layout1{
	public static void main(String[] args) {
		Frame f = new Frame ("Border Layout");
								// 			hgap vgap
		BorderLayout obj = new BorderLayout(20,20);
		Button b1 = new Button("NORTH");
		Button b2 = new Button("SOUTH");
		Button b3 = new Button("EAST");
		Button b4 = new Button("WEST");
		Button b5 = new Button("CENTER");

		f.add(b1,BorderLayout.NORTH);f.add(b2,BorderLayout.SOUTH);f.add(b3,BorderLayout.EAST);f.add(b4,BorderLayout.WEST);f.add(b5,BorderLayout.CENTER);
		f.setSize(400,400);
		f.setVisible(true);
	}
}
