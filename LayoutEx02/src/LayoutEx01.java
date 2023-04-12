import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class LayoutEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEx01 frame = new LayoutEx01();
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
	public LayoutEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("North");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("South");
		contentPane.add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("East");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("Center");
		contentPane.add(btnNewButton_4, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		System.out.println(panel.getLayout());
	}

}
