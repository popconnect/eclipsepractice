import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx05 extends JFrame {
	
	private JPanel contentPane;
	
	public JFrameEx05() {
		this.setBounds(100, 100, 1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.red);
		
		JButton btn1 = new JButton("난 버튼 1");
		btn1.setBounds(10, 10, 100, 25);
		JButton btn2 = new JButton("난 버튼 2");
		btn2.setBounds(10, 40, 100, 25);
		
		//null - null layout / absolute layout
		contentPane.setLayout(null);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		
		//레이아웃 매니저
		
		
		this.setContentPane(contentPane);

		System.out.println(this.getTitle());
	}
	
	public static void main(String[] args) {
		
		
		JFrameEx05 frame = new JFrameEx05();
		
		frame.setVisible(true);
		
	}
}
