import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx02 frame = new EventEx02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EventEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		userMouseEvent ume = new userMouseEvent();
		
		JButton btn1 = new JButton("버튼1");
		btn1.setName("Button1");
		btn1.addMouseListener(ume);
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setName("Button2");
		btn2.addMouseListener(ume);
		btn2.setBounds(12, 43, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setName("Button3");
		btn3.addMouseListener(ume);
		btn3.setBounds(12, 76, 97, 23);
		contentPane.add(btn3);
	}
	
	class userMouseEvent1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MouseClick");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MousePressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseReleased");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MouseEntered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MouseClick");
		}
		
	}
	
	
	class userMouseEvent2 extends MouseAdapter {

		@Override
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

}


