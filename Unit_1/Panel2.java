import java.awt.*;


public class Panel2 extends Frame
{
    Panel2()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("This is title");

    }
    public static void main(String[] args) {
        Panel2 p = new Panel2();
        Label l1 = new Label("welcome",Label.CENTER);
        p.add(l1);
    }
}