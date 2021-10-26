import java.awt.*;
public class menu1 extends Frame
{
	menu1(){
		Frame f = new Frame("Menu Bar");
		MenuBar mb=new MenuBar();  
        Menu menu=new Menu("File");  
        Menu submenu = new Menu ("Sub Menu");
     	MenuItem i1=new MenuItem("Save");  
     	MenuItem i4=new MenuItem("Save As");  
     	
    	MenuItem i2=new MenuItem("Open");  
    	MenuItem i3=new MenuItem("Close");
    	Menu close=new Menu("Close");  
    	Menu exit=new Menu("Exit");    
     	 

        menu.add(i1);  
        menu.add(i3);  
        menu.add(i4);  
        submenu.add(i2);  
        
        menu.add(submenu); 
		mb.add(menu);
		mb.add(close);
		mb.add(exit);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[]  args) {
		new menu1();
	}
}