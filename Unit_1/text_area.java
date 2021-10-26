import java.awt.*;
public class text_area{
	text_area(){
		Frame f = new Frame();

		TextArea area = new TextArea();
		area.setBounds(10,30,300,300);
		f.add(area);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

		// main method
		public static void main(String[] args) {
			new text_area();
		}

	
}