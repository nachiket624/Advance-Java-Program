import java.awt.*;
class card_layout1{
	public static void main(String[] args) {
		Frame f = new Frame("Card Layout");
		CardLayout obj = new CardLayout(60,60);
		f.setLayout(obj);
		Button b1 = new Button("Button1");
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");

		f.add(b1);f.add(b2);f.add(b3);
		f.setSize(400,400);
		f.setVisible(true);

	}
}