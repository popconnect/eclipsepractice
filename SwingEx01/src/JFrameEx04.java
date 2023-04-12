import javax.swing.JFrame;

public class JFrameEx04 extends JFrame {
	
	public JFrameEx04() {
		/*
		 * this.setSize(1024,768); this.setLocation(100, 100);
		 */
		
		this.setBounds(100, 100, 1024, 768);
		this.setTitle("JFrame Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false)
		System.out.println(this.getTitle());
	}
	
	public static void main(String[] args) {
		
		
		JFrameEx04 frame = new JFrameEx04();
		
		frame.setVisible(true);
		
	}
}
