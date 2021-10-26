import java.awt.*;
public class Panel1 {
    public static void main(String[] args) {
        Frame f = new Frame("Java  Panel");
        Button b = new Button("Button");
        b.setBounds(150,70,70,50);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
