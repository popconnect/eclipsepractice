import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class userMouseEvent extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭");
		
		System.out.println(((JButton)e.getSource()).getText());
		System.out.println(((JButton)e.getSource()).getName());
		
		String name = (((JButton)e.getSource()).getName());
		switch(name) {
		case "Button1" :
			System.out.println("btn1 클릭");
			break;
		case "Button2" :
			System.out.println("btn2 클릭");
			break;
		case "Button3" :
			System.out.println("btn3 클릭");
			break;
		default :
			System.out.println("Error");
		}
		
	}
}
