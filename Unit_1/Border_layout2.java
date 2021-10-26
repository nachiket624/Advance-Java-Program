import java.awt.*;
class Border_layout2 extends Frame{
	Border_layout2(){
		setLayout(new BorderLayout(20,20));
		add(new Button("C"),BorderLayout.NORTH);
		add(new Button("C++"),BorderLayout.SOUTH);
		add(new Button("PHP"),BorderLayout.EAST);
		add(new Button("Java"),BorderLayout.WEST);
		add(new Button("Python"),BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		Border_layout2 frame = new Border_layout2();
		frame.setTitle("Border Layout");
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}