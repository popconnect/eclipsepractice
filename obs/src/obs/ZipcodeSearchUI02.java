package obs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import model1.zipcodeListModel;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractListModel;

public class ZipcodeSearchUI02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI02 frame = new ZipcodeSearchUI02();
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
	public ZipcodeSearchUI02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC6B0\uD3B8\uBC88\uD638\uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 21, 616, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("동이름");
		lbl.setBounds(12, 41, 57, 15);
		panel.add(lbl);
		
		textField = new JTextField();
		textField.setBounds(67, 38, 428, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//데이터베이스 접속 model List
				String strDong = textField.getText().trim();
				if(strDong.length() < 2) {
					JOptionPane.showMessageDialog(ZipcodeSearchUI02.this, "동이름을 두자리 이상 입력하세요", "입력경고", JOptionPane.WARNING_MESSAGE);
				}
				list.setModel(new ZipcodeListModel2(strDong));
			}
		});
		btn.setBounds(507, 37, 97, 23);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 111, 612, 318);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField1.setText( (String)list.getSelectedValue() );
			}
		});
		scrollPane.setViewportView(list);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setText("기본주소");
		textField1.setBounds(6, 439, 616, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("상세주소");
		textField2.setBounds(6, 470, 616, 21);
		contentPane.add(textField2);
		textField2.setColumns(10);
	}
}
