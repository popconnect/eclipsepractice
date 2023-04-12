import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JuminCheck extends JFrame {

	private JPanel contentPane;
	private JTextField tx1;
	private JTextField tx2;
	private String jumin;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuminCheck frame = new JuminCheck();
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
	public JuminCheck() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tx1 = new JTextField();
		tx1.setBounds(12, 10, 116, 21);
		contentPane.add(tx1);
		tx1.setColumns(10);
		
		tx2 = new JTextField();
		tx2.setBounds(140, 10, 116, 21);
		contentPane.add(tx2);
		tx2.setColumns(10);
		
		JButton btn1 = new JButton("검사하기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jumin = tx1.getText() + tx2.getText();
				lbl1.setText(jumin);
				
				int[] checkDigits = {2,3,4,5,6,7,8,9,2,3,4,5};
				int sum = 0;

				for(int i=0; i<12; i++) {
				  sum += Integer.parseInt(jumin.substring(i, i+1)) * checkDigits[i];
				}

				int m1 = sum % 11;
				int checkDigit = 11 - m1;

				if(checkDigit == 10) {
				  checkDigit = 0;
				} else if(checkDigit == 11) {
				  checkDigit = 1;
				}
				
				if(checkDigit != Integer.parseInt(jumin.substring(12))) {
					  		lbl1.setText("검사결과 : 주민번호 형식이 올바르지 않습니다");
						} else {
							lbl1.setText("검사결과 : 주민등록번호가 올바릅니다.");
					}
				}
			});
		
			btn1.setBounds(268, 9, 97, 23);
			contentPane.add(btn1);
			
			lbl1 = new JLabel("검사결과 : ");
			lbl1.setHorizontalAlignment(SwingConstants.LEFT);
			lbl1.setBounds(12, 51, 353, 50);
			contentPane.add(lbl1);
	}

}
