import java.awt.*;
import javax.swing.*;

@SuppressWarnings("unchecked")
public class Jscrollpane
{
	public static void main(String[] args) {
		JFrame f = new JFrame("JScrollPane");
		String s[] = {"India","China","Bhutan","India 1","China 1","Bhutan 1","India 2","China 2","Bhutan 2" ,"India 3","China 3","Bhutan 3","India 4","China 4","Bhutan 4"
                              };
        JList list = new JList(s);
        JScrollPane sp = new JScrollPane(list);
        f.add(sp);
        f.setSize(150,150);
        f.setVisible(true);
    }
}