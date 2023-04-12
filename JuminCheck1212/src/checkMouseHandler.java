import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class checkMouseHandler extends MouseAdapter  {
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭");
		
		System.out.println(((JButton)e.getSource()).getText());
		System.out.println(((JButton)e.getSource()).getName());
		
		String name = (((JButton)e.getSource()).getName());
		
		
		
		switch(name) {
		
		case "1" :
			
			break;
		case "2" :
			
			break;
		case "3" :
			
			break;
		default :
			System.out.println("Error");
		}
		
	}
}
