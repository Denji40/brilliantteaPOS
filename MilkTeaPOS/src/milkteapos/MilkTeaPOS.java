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

public class MilkTeaPOS {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilkTeaPOS window = new MilkTeaPOS();
					window.frame.setVisible(true);
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
		frame.setBounds(0, 0, 1405, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 687, 684);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(707, 522, 674, 172);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel.setBounds(58, 7, 110, 45);
		panel_1.add(lblNewLabel);
		
		JLabel lblCash = new JLabel("Cash:");
		lblCash.setFont(new Font("Dialog", Font.BOLD, 35));
		lblCash.setBounds(58, 62, 110, 45);
		panel_1.add(lblCash);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setFont(new Font("Dialog", Font.BOLD, 35));
		lblBalance.setBounds(10, 117, 145, 45);
		panel_1.add(lblBalance);
		
		JLabel lblNewLabel_1 = new JLabel("00");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_1.setBounds(168, 7, 124, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("00");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(165, 117, 124, 45);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 35));
		textField.setBounds(168, 62, 162, 42);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 40));
		btnNewButton.setBounds(366, 10, 144, 152);
		panel_1.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 40));
		btnPrint.setBounds(520, 10, 144, 152);
		panel_1.add(btnPrint);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1067, 10, 314, 502);
		frame.getContentPane().add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(707, 10, 352, 467);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Dialog", Font.BOLD, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Item", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(136);
		table.getColumnModel().getColumn(1).setPreferredWidth(64);
		table.getColumnModel().getColumn(2).setPreferredWidth(86);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton_1.setBounds(918, 484, 139, 28);
		frame.getContentPane().add(btnNewButton_1);
	}
}
