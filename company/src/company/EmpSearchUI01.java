package company;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.CompanyListModel;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;

public class EmpSearchUI01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpSearchUI01 frame = new EmpSearchUI01();
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
	public EmpSearchUI01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0AC\uC6D0\uC774\uB984 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 21, 616, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("사원이름");
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
				String setEname = textField.getText().trim();
				if(setEname.length() < 2) {
					JOptionPane.showMessageDialog(EmpSearchUI01.this, "사원이름을 두자리 이상 입력하세요", "입력경고", JOptionPane.WARNING_MESSAGE);
				} else {
				list.setModel(new CompanyListModel(setEname));
			}
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
			String[] values = new String[] {"[사원번호] 사원이름 부서번호 급여 입사일자 매니저명"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setViewportView(list);
		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setText("사원정보");
		textField1.setBounds(6, 439, 616, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
	}
}
