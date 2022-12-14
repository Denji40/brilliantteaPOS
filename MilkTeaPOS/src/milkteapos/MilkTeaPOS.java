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
		frame.setBounds(0, 0, 1292, 743);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer's Name:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 143, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 58, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setBounds(932, 19, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRILLIANT MILKTEA AND SNACKS");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(485, 58, 258, 26);
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
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBounds(834, 516, 143, 21);
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
		tabbedPane.setBounds(10, 81, 612, 615);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
}
