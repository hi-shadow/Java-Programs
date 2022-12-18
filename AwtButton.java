import java.awt.*;
public class AwtButton extends Frame{
	AwtButton(){
		Button b  = new Button("AwtButton");
		b.setBounds(20 , 20 , 100 , 30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[] args) {
		AwtButton awt = new AwtButton();
	}
}