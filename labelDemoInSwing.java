import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Example extends JFrame{
	Jlabel l1,l2,l3,l4,l5;
	public Example()
	{
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		l1 = new Jlabel("Label1");
		l2 = new Jlabel("Label2");
		l3 = new Jlabel("Label3");
		l4 = new Jlabel("Label4");
		l5 = new Jlabel("Label5");
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
	}
}
class labelDemoInSwing{
	public static void main(String[] args) {
		Example e = new Example();
		f.setTitle("CENTRT LAYOUT");
		f.setBounds(200 , 100 , 600 , 400);
		f.setVisible(true);

	}
}