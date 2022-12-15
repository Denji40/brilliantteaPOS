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
		frame.setBounds(0, 0, 1292, 740);
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
		scrollPane.setBounds(632, 94, 345, 414);
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
		panel.setBounds(981, 94, 289, 412);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 288, 412);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Remove Item");
		btnNewButton.setBounds(834, 516, 143, 21);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(630, 542, 642, 154);
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
		tabbedPane.setBounds(10, 79, 614, 617);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("S-35");
		btnNewButton_4.setBounds(47, 166, 63, 21);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("M-40");
		btnNewButton_4_1.setBounds(120, 166, 63, 21);
		panel_2.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("L-60");
		btnNewButton_4_2.setBounds(198, 166, 63, 21);
		panel_2.add(btnNewButton_4_2);
		
		JLabel lblNewLabel_6 = new JLabel("WINTERMELON");
		lblNewLabel_6.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6.setBounds(103, 145, 99, 28);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("WINTERMELON");
		lblNewLabel_6_1.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(403, 145, 99, 28);
		panel_2.add(lblNewLabel_6_1);
		
		JButton btnNewButton_4_3 = new JButton("S-35");
		btnNewButton_4_3.setBounds(347, 166, 63, 21);
		panel_2.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_1_1 = new JButton("M-40");
		btnNewButton_4_1_1.setBounds(420, 166, 63, 21);
		panel_2.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_2_1 = new JButton("L-60");
		btnNewButton_4_2_1.setBounds(498, 166, 63, 21);
		panel_2.add(btnNewButton_4_2_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("WINTERMELON");
		lblNewLabel_6_2.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2.setBounds(103, 343, 99, 28);
		panel_2.add(lblNewLabel_6_2);
		
		JButton btnNewButton_4_4 = new JButton("S-35");
		btnNewButton_4_4.setBounds(47, 364, 63, 21);
		panel_2.add(btnNewButton_4_4);
		
		JButton btnNewButton_4_1_2 = new JButton("M-40");
		btnNewButton_4_1_2.setBounds(120, 364, 63, 21);
		panel_2.add(btnNewButton_4_1_2);
		
		JButton btnNewButton_4_2_2 = new JButton("L-60");
		btnNewButton_4_2_2.setBounds(198, 364, 63, 21);
		panel_2.add(btnNewButton_4_2_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("WINTERMELON");
		lblNewLabel_6_2_1.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_1.setBounds(403, 343, 99, 28);
		panel_2.add(lblNewLabel_6_2_1);
		
		JButton btnNewButton_4_4_1 = new JButton("S-35");
		btnNewButton_4_4_1.setBounds(347, 364, 63, 21);
		panel_2.add(btnNewButton_4_4_1);
		
		JButton btnNewButton_4_1_2_1 = new JButton("M-40");
		btnNewButton_4_1_2_1.setBounds(420, 364, 63, 21);
		panel_2.add(btnNewButton_4_1_2_1);
		
		JButton btnNewButton_4_2_2_1 = new JButton("L-60");
		btnNewButton_4_2_2_1.setBounds(498, 364, 63, 21);
		panel_2.add(btnNewButton_4_2_2_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("WINTERMELON");
		lblNewLabel_6_2_2.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_2.setBounds(103, 538, 99, 28);
		panel_2.add(lblNewLabel_6_2_2);
		
		JButton btnNewButton_4_4_2 = new JButton("S-35");
		btnNewButton_4_4_2.setBounds(47, 559, 63, 21);
		panel_2.add(btnNewButton_4_4_2);
		
		JButton btnNewButton_4_1_2_2 = new JButton("M-40");
		btnNewButton_4_1_2_2.setBounds(120, 559, 63, 21);
		panel_2.add(btnNewButton_4_1_2_2);
		
		JButton btnNewButton_4_2_2_2 = new JButton("L-60");
		btnNewButton_4_2_2_2.setBounds(198, 559, 63, 21);
		panel_2.add(btnNewButton_4_2_2_2);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("WINTERMELON");
		lblNewLabel_6_2_3.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_3.setBounds(403, 538, 99, 28);
		panel_2.add(lblNewLabel_6_2_3);
		
		JButton btnNewButton_4_4_3 = new JButton("S-35");
		btnNewButton_4_4_3.setBounds(347, 559, 63, 21);
		panel_2.add(btnNewButton_4_4_3);
		
		JButton btnNewButton_4_1_2_3 = new JButton("M-40");
		btnNewButton_4_1_2_3.setBounds(420, 559, 63, 21);
		panel_2.add(btnNewButton_4_1_2_3);
		
		JButton btnNewButton_4_2_2_3 = new JButton("L-60");
		btnNewButton_4_2_2_3.setBounds(498, 559, 63, 21);
		panel_2.add(btnNewButton_4_2_2_3);
		
		JButton btnNewButton_5 = new JButton("kunwari jlabel to");
		btnNewButton_5.setBounds(62, 10, 184, 138);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("para makita lang yung size");
		btnNewButton_5_1.setBounds(359, 10, 184, 138);
		panel_2.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("yung isang design");
		btnNewButton_5_1_1.setBounds(357, 207, 184, 138);
		panel_2.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_1_2 = new JButton("nasa kabilang tab");
		btnNewButton_5_1_2.setBounds(57, 207, 184, 138);
		panel_2.add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_2_1 = new JButton("New button");
		btnNewButton_5_1_2_1.setBounds(57, 403, 184, 138);
		panel_2.add(btnNewButton_5_1_2_1);
		
		JButton btnNewButton_5_1_1_1 = new JButton("New button");
		btnNewButton_5_1_1_1.setBounds(357, 403, 184, 138);
		panel_2.add(btnNewButton_5_1_1_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(10, 39, 178, 196);
		panel_3.add(btnNewButton_6);
		
		JLabel lblNewLabel_7 = new JLabel("WINTERMELON");
		lblNewLabel_7.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7.setBounds(36, 238, 124, 32);
		panel_3.add(lblNewLabel_7);
		
		JButton btnNewButton_6_3 = new JButton("New button");
		btnNewButton_6_3.setBounds(10, 327, 178, 196);
		panel_3.add(btnNewButton_6_3);
		
		JLabel lblNewLabel_7_1 = new JLabel("WINTERMELON");
		lblNewLabel_7_1.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(36, 526, 124, 32);
		panel_3.add(lblNewLabel_7_1);
		
		JButton btnNewButton_6_4 = new JButton("New button");
		btnNewButton_6_4.setBounds(216, 327, 178, 196);
		panel_3.add(btnNewButton_6_4);
		
		JLabel lblNewLabel_7_2 = new JLabel("WINTERMELON");
		lblNewLabel_7_2.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_2.setBounds(242, 526, 124, 32);
		panel_3.add(lblNewLabel_7_2);
		
		JButton btnNewButton_6_5 = new JButton("New button");
		btnNewButton_6_5.setBounds(421, 327, 178, 196);
		panel_3.add(btnNewButton_6_5);
		
		JLabel lblNewLabel_7_3 = new JLabel("WINTERMELON");
		lblNewLabel_7_3.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_3.setBounds(447, 526, 124, 32);
		panel_3.add(lblNewLabel_7_3);
		
		JButton btnNewButton_6_1 = new JButton("New button");
		btnNewButton_6_1.setBounds(421, 39, 178, 196);
		panel_3.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_7_4 = new JLabel("WINTERMELON");
		lblNewLabel_7_4.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_4.setBounds(447, 238, 124, 32);
		panel_3.add(lblNewLabel_7_4);
		
		JButton btnNewButton_6_2 = new JButton("New button");
		btnNewButton_6_2.setBounds(216, 39, 178, 196);
		panel_3.add(btnNewButton_6_2);
		
		JLabel lblNewLabel_7_5 = new JLabel("WINTERMELON");
		lblNewLabel_7_5.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_5.setBounds(242, 238, 124, 32);
		panel_3.add(lblNewLabel_7_5);
	}
}
