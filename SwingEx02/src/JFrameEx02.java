import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JFrameEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx02 frame = new JFrameEx02();
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
	public JFrameEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("라벨1");
		//rgb 혼합색상 (0-255)
		//lbl1.setForeground(new Color(143, 45, 234));
		lbl1.setForeground(Color.magenta);
		
		lbl1.setVerticalAlignment(SwingConstants.TOP);
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setBounds(12, 10, 170, 15);
		contentPane.add(lbl1);
		
		String text = "<html><body>Hello Label<br> Hellp Label</body></html>";
		JLabel lbl2 = new JLabel(text);
		lbl2.setFont(new Font("굴림", Font.BOLD, 16));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(12, 24, 170, 76);
		contentPane.add(lbl2);
		
		System.out.print(lbl1.getText());
		System.out.print(lbl2.getText());
		
		lbl1.setText("새라벨1");
		
		JLabel lbl3 = new JLabel("New label");
		lbl3.setIcon(new ImageIcon("C:\\Java\\java-eclipse-workspace\\SwingEx02\\windowbuilder.png"));
		lbl3.setBounds(12, 110, 104, 109);
		contentPane.add(lbl3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(151, 44, 97, 23);
		contentPane.add(btnNewButton);
		//lbl2.setText("새라벨2라벨3");
		
		
	}
}
