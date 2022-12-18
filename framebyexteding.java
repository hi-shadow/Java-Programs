import java.awt.*;
public class framebyextending extends Frame{
	
	framebyextending()
	{
		Button b = new Button("BCA");
		add(b);
		setLayout(null);
		setVisible(true);
		b.setBounds(20 , 40 ,200 , 80);
		setSize(500,300);
	}

	public static void main(String[] args) {

		framebyextending fbec =  new framebyextending();

		
	}
}