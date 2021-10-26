import java.awt.*;
class gridBagLay1{
	public static void main(String[] args) {
		Frame f = new Frame();
		GridBagLayout obj = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(obj);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		Button b1 = new Button("Button1");
		f.add(b1,gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		Button b2 = new Button("Button2");
		f.add(b2,gbc);

		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		Button b3 = new Button("Button1");
		f.add(b3,gbc);

		f.setSize(400,400);
		f.setVisible(true);

	}
}