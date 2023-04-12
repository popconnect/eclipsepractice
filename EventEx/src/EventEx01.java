import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class EventEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx01 frame = new EventEx01();
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
	public EventEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		//1. 이벤트를 연결하는 메서드
		//2. 이벤트 클래스
		//    interface / adapter class
		//            내용x    
		//3. 이벤트 핸들러 (이벤트처리용 메서드)
		
		btn1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseClick");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MousePress");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseReleased");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseEntered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("MouseExited");
			}
		
			
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("New button");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mouseClick");
			}
		});
		btn2.setBounds(12, 43, 97, 23);
		contentPane.add(btn2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBounds(12, 76, 97, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(12, 109, 249, 21);
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append(textField.getText() + System.lineSeparator());
				textField.setText("");
			}
		});
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn5 = new JButton("New button");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(textField.getText());
				System.out.println(e.getX());
				System.out.println(e.getY());
				System.out.println(e.getClickCount());
				System.out.println(e.getSource());
				JButton btn = (JButton)e.getSource();
				btn.setText("클릭됨");
			
			}	
		});
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		btn5.setBounds(273, 108, 97, 23);
		contentPane.add(btn5);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 140, 359, 262);
		contentPane.add(textArea);
	}
}
