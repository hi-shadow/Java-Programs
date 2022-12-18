import java.awt.*;
public class framebyobject 
{
	framebyobject()
	{
		Frame f = new Frame();
		Button b = new Button("Click_Me");
		b.setBounds(30 , 50 , 100, 150);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		framebyobject fb= new framebyobject();
	}
}
