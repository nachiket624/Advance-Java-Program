import java.awt.*;
import javax.swing.*;

/*<applet  code="myicon.class"  width=300  height=300> </applet> */
public class myicon extends JApplet
{
 public void init( )
 {
  Container  cPane = getContentPane( );
  ImageIcon  i1= new  ImageIcon("User profile image.png");
  JLabel   l1 =  new  JLabel("User profile image.png", i1, JLabel.CENTER);
  cPane.add(l1);
  }
}