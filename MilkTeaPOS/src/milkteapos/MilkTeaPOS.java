package milkteapos;

import java.awt.EventQueue;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MilkTeaPOS {

	private JFrame frame;
	private JTextField customerName;
	private JTable table;
	private JTextField cashAmount;

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
	
	// unfinished 
	public void ItemCost()
	{
	double sum = 0;
	
	for (int i = 0; i < table.getRowCount(); i++)
		{
		sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString()); 
		}
		//totalAmnt.setText(Double.toString(sum));
	}	
	// unfinished
		public void Change()
		{
		double sum = 0;
		//double cash = Double.parseDouble(cashAmount.getText());
		
		for (int i = 0; i < table.getRowCount(); i++)
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1292, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel jlabelCustomerName = new JLabel("Customer's Name:");
		jlabelCustomerName.setBounds(10, 10, 143, 26);
		jlabelCustomerName.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(jlabelCustomerName);
		
		JLabel jlabelMenu = new JLabel("MENU");
		jlabelMenu.setBounds(10, 58, 45, 13);
		jlabelMenu.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(jlabelMenu);
		
		JLabel jlabelDate = new JLabel("Date:");
		jlabelDate.setBounds(932, 19, 45, 13);
		jlabelDate.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(jlabelDate);
		
		JLabel jlabelBusiness = new JLabel("BRILLIANT MILKTEA AND SNACKS");
		jlabelBusiness.setBounds(485, 58, 258, 26);
		jlabelBusiness.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(jlabelBusiness);
		
		customerName = new JTextField();
		customerName.setBounds(150, 9, 242, 33);
		frame.getContentPane().add(customerName);
		customerName.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(632, 94, 345, 437);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		
		JButton removeitemBtn = new JButton("Remove Item");
		removeitemBtn.setBounds(834, 535, 143, 21);
		removeitemBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(removeitemBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(628, 568, 642, 154);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jlabelTotal = new JLabel("Total:");
		jlabelTotal.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelTotal.setBounds(52, 10, 86, 35);
		panel_1.add(jlabelTotal);
		
		JLabel jlabelCash = new JLabel("Cash:");
		jlabelCash.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelCash.setBounds(49, 55, 76, 35);
		panel_1.add(jlabelCash);
		
		JLabel jlabelChange = new JLabel("Change:");
		jlabelChange.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelChange.setBounds(19, 100, 106, 35);
		panel_1.add(jlabelChange);
		
		JLabel totalAmnt = new JLabel("00");
		totalAmnt.setFont(new Font("Dialog", Font.BOLD, 25));
		totalAmnt.setBounds(130, 10, 168, 35);
		panel_1.add(totalAmnt);
		
		JLabel cashChange = new JLabel("00");
		cashChange.setFont(new Font("Dialog", Font.BOLD, 25));
		cashChange.setBounds(130, 100, 168, 35);
		panel_1.add(cashChange);
		
		cashAmount = new JTextField();
		cashAmount.setFont(new Font("Dialog", Font.BOLD, 25));
		cashAmount.setBounds(129, 55, 169, 35);
		panel_1.add(cashAmount);
		cashAmount.setColumns(10);
		
		JButton payBtn = new JButton("Pay");
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		payBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		payBtn.setBounds(359, 22, 125, 49);
		panel_1.add(payBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		exitBtn.setBounds(359, 85, 125, 50);
		panel_1.add(exitBtn);
		
		JButton printBtn = new JButton("Print");
		printBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		printBtn.setBounds(508, 23, 125, 112);
		panel_1.add(printBtn);
		
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
		
		JLabel currentDate = new JLabel("");
		currentDate.setFont(new Font("Dialog", Font.BOLD, 15));
		currentDate.setBounds(978, 20, 270, 13);
		frame.getContentPane().add(currentDate);	
		Date date = new Date();
		currentDate.setText(date.toString());
}
	}
