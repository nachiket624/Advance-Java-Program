import  java.awt.*;
import javax.swing.*;
import  javax.swing.tree.*;

public  class  Jtree
 {
   public  static  void   main(String  args[  ])
    {
     JFrame  f  =  new  JFrame( );
   
      DefaultMutableTreeNode root = new  DefaultMutableTreeNode("Subject"); 
    
      DefaultMutableTreeNode parent1 = new  DefaultMutableTreeNode("1st Year");  
      DefaultMutableTreeNode child = new  DefaultMutableTreeNode("Math 1");
      DefaultMutableTreeNode child1 = new  DefaultMutableTreeNode("Basic computer");
       DefaultMutableTreeNode child2 = new  DefaultMutableTreeNode("Science");
      DefaultMutableTreeNode parent2 = new  DefaultMutableTreeNode("2nd Year");
      DefaultMutableTreeNode  child3 = new  DefaultMutableTreeNode("Math 2");
      DefaultMutableTreeNode  child4 = new  DefaultMutableTreeNode("C Progrmming");
      DefaultMutableTreeNode  child5 = new  DefaultMutableTreeNode("DBMS");
      parent1.add(child);
      parent1.add(child1);
      parent1.add(child2);
      parent2.add(child3);
      parent2.add(child4);
      parent2.add(child5);

    
     root.add(parent1);
     root.add(parent2);
     
     JTree  jt =new JTree(root);
     JScrollPane jsp =new JScrollPane(jt);
     f.add(jsp);
    f.setSize(200,200); 
    f.setVisible(true);
    }
}