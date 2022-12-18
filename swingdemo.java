import java.awt.*;
import java.awt.event;
import javax.swing.*;
class Hello extends JFrame {

	JLabel l1,l2,l4,l3,l5;

		Hello()
		{
			FlowLayout layout = new FlowLayout();
			this.setLayout(layout);

			
				l1 = new JLabel("Label1");
				l2 = new JLabel("Label2");
				l3= new JLabel("Label3");
				l4= new JLabel("Label4");
				l5 = new JLabel("Label5");
				this.add(l1);
				this.add(l2);
				this.add(l3);
				this.add(l4);
				this.add(l5);
			
		}


}
public class swingdemo
{
	public static void main(String[] args) {
		Hello  s= new Hello();
		f.setSize(300,300);
		f.setBounds(200,100,600,400);
		f.setVisible(true);
	}
}

