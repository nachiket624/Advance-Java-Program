import java.awt.*;

// import jdk.internal.or.jline.terminal.MouseEvent.Button;
public class Panel3 extends Frame{
    Panel3(){
        Frame f = new Frame("This is Title");
        Panel p = new Panel();
        p.setBounds(20,60,60,50);
        p.setBackground(Color.blue);
        f.add(p);//adding button to Panel
        Button b = new Button("Ok");
        b.setBounds(20,70,60,50);
        p.add(b);// adding button to frame
        Button b1 = new Button("Ok");
        b1.setBounds(120,120,20,20);
        f.add(b1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        }
    public static void main(String[] args) {
        Panel3 p1 = new Panel3();
    }
    
}
