import java.awt.*;
public class list1{
	list1(){
		Frame f = new Frame("List");
		List l1 = new List(5);
		l1.setBounds(100,100,75,75);
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("Python");
		l1.add("PHP");
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new list1();
	}
}