package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.Database.QueueTableModel;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC9C1\uCC45\uBCC4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 10, 504, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("직책");
		lblNewLabel.setBounds(12, 27, 32, 23);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 84, 501, 418);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String StrJob = (String)e.getItem();
				table.setModel(new QueueTableModel(StrJob));
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SALESMAN", "MANAGER", "ANALYST", "CLERK", "PRESIDENT"}));
		comboBox.setBounds(44, 27, 448, 23);
		panel.add(comboBox);
		
		
		/*
		 * table.setModel(new DefaultTableModel( new Object[][] { {null, null, null,
		 * null, null, null, null}, }, new String[] { "\uC0AC\uC6D0\uBC88\uD638",
		 * "\uC0AC\uC6D0\uC774\uB984", "\uAD00\uB9AC\uC790\uBC88\uD638",
		 * "\uC785\uC0AC\uC77C\uC790", "\uAE09\uC5EC", "\uBCF4\uB108\uC2A4",
		 * "\uBD80\uC11C" } ) { boolean[] columnEditables = new boolean[] { false,
		 * false, false, false, false, false, false }; public boolean isCellEditable(int
		 * row, int column) { return columnEditables[column]; } });
		 */
		
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(6).setResizable(false);
		
	}
}
