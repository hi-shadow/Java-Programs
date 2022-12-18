import java.applet.Applet;
import java.awt.Graphics;
public class FirstAppletDemo extends Applet{

	public void paint(Graphics g){
		g.drawString("Welcome to the first demo of applet" ,  150 , 150);
	}

}
/* <Applet code = "FirstAppletDemo.class" height=300 width = 300></Applet>*/