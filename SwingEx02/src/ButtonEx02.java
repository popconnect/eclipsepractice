import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonEx02 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEx02 frame = new ButtonEx02();
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
	public ButtonEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl1 = new JLabel("New label");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(12, 43, 315, 15);
		contentPane.add(lbl1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setText("버튼1 클릭됨");
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setText("버튼2 클릭됨");
			}
		});
		btn2.setBounds(121, 10, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setText("버튼3 클릭됨");
			}
		});
		btn3.setBounds(230, 10, 97, 23);
		contentPane.add(btn3);
		
	}

}
