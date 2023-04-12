import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Component;

public class juminCheckMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JButton btn3;
	private JButton btn1;
	private JButton btn4;
	private JButton btn2;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn9;
	private JButton btn0;
	private JButton btn8;
	private JButton btndel;
	private JButton btncheck;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juminCheckMain frame = new juminCheckMain();
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
	public juminCheckMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		checkMouseHandler ch = new checkMouseHandler();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 8);
		panel.setLayout(fl_panel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("-");
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		btn1 = new JButton("1");
		btn1.setName("1");
		panel_1.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setName("2");
		panel_1.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setName("3");
		panel_1.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setName("4");
		panel_1.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setName("5");
		panel_1.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setName("6");
		panel_1.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setName("7");
		panel_1.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setName("8");
		panel_1.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setName("9");
		panel_1.add(btn9);
		
		btn0 = new JButton("0");
		btn0.setName("0");
		panel_1.add(btn0);
		
		btndel = new JButton("DEL.");
		btndel.setName("11");
		panel_1.add(btndel);
		
		btncheck = new JButton("검사");
		btncheck.setName("12");
		panel_1.add(btncheck);
		btn1.addMouseListener(ch);
		btn2.addMouseListener(ch);
		btn3.addMouseListener(ch);
		btn4.addMouseListener(ch);
		btn5.addMouseListener(ch);
		btn6.addMouseListener(ch);
		btn7.addMouseListener(ch);
		btn8.addMouseListener(ch);
		btn9.addMouseListener(ch);
		btn0.addMouseListener(ch);
		btndel.addMouseListener(ch);
		btncheck.addMouseListener(ch);
		
		panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		lblNewLabel_1 = new JLabel("결과: ");
		panel_2.add(lblNewLabel_1);
	}

	class checkMouseHandler extends MouseAdapter  {
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			String name = (((JButton)e.getSource()).getName());
			
			
			switch(name) {
			
			case "12" :
				
				int[] CRC = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
				String jumin = (String)textField.getText() + (String)textField_1.getText();
				if(jumin.length() == 13) {
					int sum = 0;
					
					for ( int i=0; i<CRC.length; i++) {
						sum += Integer.parseInt(jumin.substring(i, i+1))* CRC[i];
					}
					
						int lastNum = Integer.parseInt(jumin.substring(12,13));
						int resultNum = (11 - (sum % 11) % 10);
					
					if (lastNum == resultNum) {
						lblNewLabel_1.setText("결과 : 주민등록번호 형식이 맞습니다");
					} else {
						lblNewLabel_1.setText("결과 : 주민등록번호 형식이 다릅니다");
					}
				} else {
					lblNewLabel_1.setText("주민번호 자리수가 13자리가 아닙니다");
				}
				
				break;
				
			case "1" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "1");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "1");
				}
				break;
			case "2" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "2");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "2");
				}
				break;
			case "3" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "3");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "3");
				}
				break;
			case "4" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "4");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "4");
				}
				break;
			case "5" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "5");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "5");
				}
				break;
			case "6" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "6");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "6");
				}
				break;
			case "7" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "7");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "7");
				}
				break;
			case "8" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "8");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "8");
				}
				break;
			case "9" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "9");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "9");
				}
				break;
			case "0" :
				if(textField.getText().length()<6) {
					textField.setText(textField.getText() + "0");
				} else if(textField_1.getText().length()<7) {
					textField_1.setText(textField_1.getText() + "0");
				}
				break;
				
			case "11" :
				textField.setText("");
				textField_1.setText("");
				break;
				
			default :
				System.out.println("Error");
			}
		}
	}
}

