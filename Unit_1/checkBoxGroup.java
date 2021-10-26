import java.awt.*;
public class checkBoxGroup{
	//creating a constructor

	checkBoxGroup(){
		Frame f = new Frame("Check Box Group");
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox checkbox1 = new Checkbox("DO",cg,false);
		checkbox1.setBounds(100,100,50,50);
		Checkbox checkbox2 = new Checkbox("Die",cg,true);
		checkbox2.setBounds(100,150,50,50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new checkBoxGroup();
	}
}