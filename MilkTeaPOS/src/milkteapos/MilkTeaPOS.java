package milkteapos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MilkTeaPOS {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilkTeaPOS window = new MilkTeaPOS();
					window.frame.setVisible(true);
					window.frame.setTitle("Brilliant Tea and Snacks");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MilkTeaPOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1292, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer's Name:");
		lblNewLabel.setBounds(10, 10, 143, 26);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setBounds(10, 58, 45, 13);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setBounds(932, 19, 45, 13);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRILLIANT MILKTEA AND SNACKS");
		lblNewLabel_3.setBounds(485, 58, 258, 26);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(150, 9, 242, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(632, 94, 345, 437);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(149);
		table.getColumnModel().getColumn(1).setPreferredWidth(44);
		table.getColumnModel().getColumn(2).setPreferredWidth(84);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(981, 94, 289, 462);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 289, 462);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Remove Item");
		btnNewButton.setBounds(834, 535, 143, 21);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(628, 568, 642, 154);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Total:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_4.setBounds(52, 10, 86, 35);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Cash:");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(49, 55, 76, 35);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Change:");
		lblNewLabel_4_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_4_2.setBounds(19, 100, 106, 35);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("00");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_5.setBounds(130, 10, 168, 35);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("00");
		lblNewLabel_5_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_5_1.setBounds(130, 100, 168, 35);
		panel_1.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 25));
		textField_1.setBounds(129, 55, 169, 35);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Pay");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton_1.setBounds(359, 22, 125, 49);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton_2.setBounds(359, 85, 125, 50);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 25));
		btnNewButton_3.setBounds(508, 23, 125, 112);
		panel_1.add(btnNewButton_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 79, 614, 643);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Drinks", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_4_5 = new JButton("palitan ng jlabel");
		btnNewButton_4_5.setBounds(65, 10, 176, 166);
		panel_3.add(btnNewButton_4_5);
		
		JButton btnNewButton_5_1_4 = new JButton("M-40");
		btnNewButton_5_1_4.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_4.setBounds(117, 179, 65, 21);
		panel_3.add(btnNewButton_5_1_4);
		
		JButton btnNewButton_4_2_1 = new JButton("New button");
		btnNewButton_4_2_1.setBounds(65, 210, 176, 166);
		panel_3.add(btnNewButton_4_2_1);
		
		JButton btnNewButton_5_1_1_1 = new JButton("M-40");
		btnNewButton_5_1_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_1_1.setBounds(117, 379, 65, 21);
		panel_3.add(btnNewButton_5_1_1_1);
		
		JButton btnNewButton_4_4_1 = new JButton("New button");
		btnNewButton_4_4_1.setBounds(65, 410, 176, 166);
		panel_3.add(btnNewButton_4_4_1);
		
		JButton btnNewButton_5_1_3_1 = new JButton("M-40");
		btnNewButton_5_1_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_3_1.setBounds(117, 579, 65, 21);
		panel_3.add(btnNewButton_5_1_3_1);
		
		JButton btnNewButton_5_2_3_1 = new JButton("L-60");
		btnNewButton_5_2_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_3_1.setBounds(192, 579, 65, 21);
		panel_3.add(btnNewButton_5_2_3_1);
		
		JButton btnNewButton_5_5_1 = new JButton("S-35");
		btnNewButton_5_5_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_5_1.setBounds(42, 579, 65, 21);
		panel_3.add(btnNewButton_5_5_1);
		
		JButton btnNewButton_5_3_1 = new JButton("S-35");
		btnNewButton_5_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_3_1.setBounds(42, 379, 65, 21);
		panel_3.add(btnNewButton_5_3_1);
		
		JButton btnNewButton_5_2_1_1 = new JButton("L-60");
		btnNewButton_5_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_1_1.setBounds(192, 379, 65, 21);
		panel_3.add(btnNewButton_5_2_1_1);
		
		JButton btnNewButton_5_2_4 = new JButton("L-60");
		btnNewButton_5_2_4.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_4.setBounds(192, 179, 65, 21);
		panel_3.add(btnNewButton_5_2_4);
		
		JButton btnNewButton_5_6 = new JButton("S-35");
		btnNewButton_5_6.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_6.setBounds(42, 179, 65, 21);
		panel_3.add(btnNewButton_5_6);
		
		JButton btnNewButton_4_1_1 = new JButton("pinakita ko lang yung size");
		btnNewButton_4_1_1.setBounds(365, 10, 176, 166);
		panel_3.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5_4_2_1 = new JButton("S-35");
		btnNewButton_5_4_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_4_2_1.setBounds(354, 179, 65, 21);
		panel_3.add(btnNewButton_5_4_2_1);
		
		JButton btnNewButton_5_1_2_2_1 = new JButton("M-40");
		btnNewButton_5_1_2_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_2_2_1.setBounds(429, 179, 65, 21);
		panel_3.add(btnNewButton_5_1_2_2_1);
		
		JButton btnNewButton_5_2_2_2_1 = new JButton("L-60");
		btnNewButton_5_2_2_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_2_2_1.setBounds(504, 179, 65, 21);
		panel_3.add(btnNewButton_5_2_2_2_1);
		
		JButton btnNewButton_4_3_2 = new JButton("New button");
		btnNewButton_4_3_2.setBounds(365, 210, 176, 166);
		panel_3.add(btnNewButton_4_3_2);
		
		JButton btnNewButton_5_1_2_3 = new JButton("M-40");
		btnNewButton_5_1_2_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_2_3.setBounds(429, 379, 65, 21);
		panel_3.add(btnNewButton_5_1_2_3);
		
		JButton btnNewButton_5_2_2_3 = new JButton("L-60");
		btnNewButton_5_2_2_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_2_3.setBounds(504, 379, 65, 21);
		panel_3.add(btnNewButton_5_2_2_3);
		
		JButton btnNewButton_5_4_3 = new JButton("S-35");
		btnNewButton_5_4_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_4_3.setBounds(354, 379, 65, 21);
		panel_3.add(btnNewButton_5_4_3);
		
		JButton btnNewButton_4_3_1_1 = new JButton("New button");
		btnNewButton_4_3_1_1.setBounds(365, 410, 176, 166);
		panel_3.add(btnNewButton_4_3_1_1);
		
		JButton btnNewButton_5_1_2_1_1 = new JButton("M-40");
		btnNewButton_5_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_1_2_1_1.setBounds(429, 579, 65, 21);
		panel_3.add(btnNewButton_5_1_2_1_1);
		
		JButton btnNewButton_5_2_2_1_1 = new JButton("L-60");
		btnNewButton_5_2_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_2_1_1.setBounds(504, 579, 65, 21);
		panel_3.add(btnNewButton_5_2_2_1_1);
		
		JButton btnNewButton_5_4_1_1 = new JButton("S-35");
		btnNewButton_5_4_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_4_1_1.setBounds(354, 579, 65, 21);
		panel_3.add(btnNewButton_5_4_1_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Snacks", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("palitan ng jlabel");
		btnNewButton_4.setBounds(64, 10, 176, 166);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("pinakita ko lang yung size");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setBounds(364, 10, 176, 166);
		panel_2.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("New button");
		btnNewButton_4_2.setBounds(64, 210, 176, 166);
		panel_2.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("New button");
		btnNewButton_4_3.setBounds(364, 210, 176, 166);
		panel_2.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("New button");
		btnNewButton_4_4.setBounds(64, 410, 176, 166);
		panel_2.add(btnNewButton_4_4);
		
		JButton btnNewButton_5_5 = new JButton("Cheese");
		btnNewButton_5_5.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_5.setBounds(41, 579, 93, 21);
		panel_2.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_2_3 = new JButton("Yema");
		btnNewButton_5_2_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_3.setBounds(163, 579, 93, 21);
		panel_2.add(btnNewButton_5_2_3);
		
		JButton btnNewButton_4_3_1 = new JButton("New button");
		btnNewButton_4_3_1.setBounds(364, 410, 176, 166);
		panel_2.add(btnNewButton_4_3_1);
		
		JButton btnNewButton_5_4_1 = new JButton("Malunggay");
		btnNewButton_5_4_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_4_1.setBounds(353, 579, 93, 21);
		panel_2.add(btnNewButton_5_4_1);
		
		JButton btnNewButton_5_2_2_1 = new JButton("Carrot");
		btnNewButton_5_2_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5_2_2_1.setBounds(475, 579, 93, 21);
		panel_2.add(btnNewButton_5_2_2_1);
		
		JButton btnResetOrder = new JButton("Reset Order");
		btnResetOrder.setFont(new Font("Dialog", Font.BOLD, 15));
		btnResetOrder.setBounds(632, 537, 143, 21);
		frame.getContentPane().add(btnResetOrder);
	}
}
