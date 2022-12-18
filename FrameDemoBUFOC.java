import java.awt.*;
public class FrameDemoBUFOC{
	FrameDemoBUFOC()
	{
		Frame f = new Frame();
		Button b = new Button("Click_Me");
		b.setBounds(30,50,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		FrameDemoBUFOC fb = new FrameDemoBUFOC();
	}
}