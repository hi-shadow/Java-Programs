import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Appletdemo2 {
    public void panit(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString("Hello World", 150,150);
        g.drawLine(20,30,20,300);

    }
    
}
