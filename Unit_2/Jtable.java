import  java.awt.*;
import javax.swing.*;

public class Jtable
 {
    public  static  void   main(String  args[  ])
    {
     JFrame  f  =  new  JFrame( );
     String  data[ ][ ] ={{ "1","Person 1","10"},
                                          { "6","Person 2","100"},
                                          { "78","Person 3","1000"}};
    String column[ ]={"ID","NAME","RANK"};
    JTable jt = new JTable(data,column);
    jt.setBounds(30,40,200,300);
   JScrollPane sp= new JScrollPane(jt);
    f.add(sp);
    f.setSize(300,400); 
    f.setVisible(true);
    }
}