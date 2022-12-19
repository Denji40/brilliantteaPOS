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
<<<<<<< HEAD
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
=======
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git

public class MilkTeaPOS {

	private JFrame frame;
	private JTextField customerName;
	private JTable table;
<<<<<<< HEAD
	private JTextField txtCash;
	private JTextField txtChange;
	private JTextField txtTotal;
=======
	private JTextField cashAmount;
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git

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
		
<<<<<<< HEAD
		JLabel lblName = new JLabel("Customer's Name:");
		lblName.setBounds(10, 10, 143, 26);
		lblName.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(lblName);
=======
		JLabel jlabelCustomerName = new JLabel("Customer's Name:");
		jlabelCustomerName.setBounds(10, 10, 143, 26);
		jlabelCustomerName.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(jlabelCustomerName);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
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
		
<<<<<<< HEAD
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn7.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn7.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(10, 10, 85, 70);
		panel.add(btn7);
=======
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 289, 462);
		panel.add(textArea);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn8.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn8.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(105, 10, 85, 70);
		panel.add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn9.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn9.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(200, 10, 85, 70);
		panel.add(btn9);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn5.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn5.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(105, 120, 85, 70);
		panel.add(btn5);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn4.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn4.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(10, 120, 85, 70);
		panel.add(btn4);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn6.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn6.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(200, 120, 85, 70);
		panel.add(btn6);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn2.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn2.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(105, 220, 85, 70);
		panel.add(btn2);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn1.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn1.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(10, 220, 85, 70);
		panel.add(btn1);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn3.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn3.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(200, 220, 85, 70);
		panel.add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! txtCash.getText().contains("."))
				{
					txtCash.setText(txtCash.getText()+ btnDot.getText());
				}
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(105, 319, 85, 70);
		panel.add(btnDot);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = txtCash.getText();
				
				if (Enternumber == "")
					
				{
					txtCash.setText(btn0.getText());
				}
				else
				{
					Enternumber = txtCash.getText() + btn0.getText();
					txtCash.setText(Enternumber);
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(10, 319, 85, 70);
		panel.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			txtCash.setText(null);
			txtChange.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(200, 319, 85, 70);
		panel.add(btnClear);
		
		JButton btnRemove = new JButton("Remove Item");
		btnRemove.setBounds(834, 516, 143, 21);
		btnRemove.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(btnRemove);
=======
		JButton removeitemBtn = new JButton("Remove Item");
		removeitemBtn.setBounds(834, 535, 143, 21);
		removeitemBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		frame.getContentPane().add(removeitemBtn);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(628, 568, 642, 154);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
<<<<<<< HEAD
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTotal.setBounds(52, 10, 86, 35);
		panel_1.add(lblTotal);
=======
		JLabel jlabelTotal = new JLabel("Total:");
		jlabelTotal.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelTotal.setBounds(52, 10, 86, 35);
		panel_1.add(jlabelTotal);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		JLabel lblCash = new JLabel("Cash:");
		lblCash.setFont(new Font("Dialog", Font.BOLD, 25));
		lblCash.setBounds(49, 55, 76, 35);
		panel_1.add(lblCash);
=======
		JLabel jlabelCash = new JLabel("Cash:");
		jlabelCash.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelCash.setBounds(49, 55, 76, 35);
		panel_1.add(jlabelCash);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		JLabel lblChange = new JLabel("Change:");
		lblChange.setFont(new Font("Dialog", Font.BOLD, 25));
		lblChange.setBounds(19, 100, 106, 35);
		panel_1.add(lblChange);
=======
		JLabel jlabelChange = new JLabel("Change:");
		jlabelChange.setFont(new Font("Dialog", Font.BOLD, 25));
		jlabelChange.setBounds(19, 100, 106, 35);
		panel_1.add(jlabelChange);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		txtCash = new JTextField();
		txtCash.setFont(new Font("Dialog", Font.BOLD, 25));
		txtCash.setBounds(129, 55, 169, 35);
		panel_1.add(txtCash);
		txtCash.setColumns(10);
=======
		JLabel totalAmnt = new JLabel("00");
		totalAmnt.setFont(new Font("Dialog", Font.BOLD, 25));
		totalAmnt.setBounds(130, 10, 168, 35);
		panel_1.add(totalAmnt);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		JButton btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPay.setBounds(359, 22, 125, 49);
		panel_1.add(btnPay);
=======
		JLabel cashChange = new JLabel("00");
		cashChange.setFont(new Font("Dialog", Font.BOLD, 25));
		cashChange.setBounds(130, 100, 168, 35);
		panel_1.add(cashChange);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Dialog", Font.BOLD, 25));
		btnExit.setBounds(359, 85, 125, 50);
		panel_1.add(btnExit);
=======
		cashAmount = new JTextField();
		cashAmount.setFont(new Font("Dialog", Font.BOLD, 25));
		cashAmount.setBounds(129, 55, 169, 35);
		panel_1.add(cashAmount);
		cashAmount.setColumns(10);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPrint.setBounds(508, 23, 125, 112);
		panel_1.add(btnPrint);
=======
		JButton payBtn = new JButton("Pay");
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		payBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		payBtn.setBounds(359, 22, 125, 49);
		panel_1.add(payBtn);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		txtChange = new JTextField();
		txtChange.setFont(new Font("Dialog", Font.BOLD, 25));
		txtChange.setColumns(10);
		txtChange.setBounds(129, 100, 169, 35);
		panel_1.add(txtChange);
=======
		JButton exitBtn = new JButton("Exit");
		exitBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		exitBtn.setBounds(359, 85, 125, 50);
		panel_1.add(exitBtn);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
<<<<<<< HEAD
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Dialog", Font.BOLD, 25));
		txtTotal.setColumns(10);
		txtTotal.setBounds(129, 10, 169, 35);
		panel_1.add(txtTotal);
=======
		JButton printBtn = new JButton("Print");
		printBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		printBtn.setBounds(508, 23, 125, 112);
		panel_1.add(printBtn);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 79, 614, 643);
		frame.getContentPane().add(tabbedPane);
		
<<<<<<< HEAD
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("MILKTEA", null, panel_2, "");
		panel_2.setLayout(null);
		
		JButton btnWinterS = new JButton("S-35");
		btnWinterS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double Price= 35;
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] {"WINTERMELON SMALL", "1", Price});
			}
		});
		btnWinterS.setBounds(47, 166, 63, 21);
		panel_2.add(btnWinterS);
		
		JButton btnWinterM = new JButton("M-40");
		btnWinterM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"WINTERMELON MEDIUM", "1", Price});
			}
		});
		btnWinterM.setBounds(120, 166, 63, 21);
		panel_2.add(btnWinterM);
		
		JButton btnWinterL = new JButton("L-60");
		btnWinterL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"WINTERMELON LARGE", "1", Price});
			}
		});
		btnWinterL.setBounds(198, 166, 63, 21);
		panel_2.add(btnWinterL);
		
		JLabel lblNewLabel_6 = new JLabel("WINTERMELON");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6.setBounds(103, 145, 99, 28);
		panel_2.add(lblNewLabel_6);
		
		JLabel btnTaroM = new JLabel("TARO");
		btnTaroM.setHorizontalAlignment(SwingConstants.CENTER);
		btnTaroM.setFont(new Font("Ink Free", Font.BOLD, 12));
		btnTaroM.setBounds(403, 145, 99, 28);
		panel_2.add(btnTaroM);
		
		JButton btnTaroS = new JButton("S-35");
		btnTaroS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"TARO SMALL", "1", Price});
			}
		});
		btnTaroS.setBounds(347, 166, 63, 21);
		panel_2.add(btnTaroS);
		
		JButton btnNewButton_4_1_1 = new JButton("M-40");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"TARO MEDIUM", "1", Price});
			}
		});
		btnNewButton_4_1_1.setBounds(420, 166, 63, 21);
		panel_2.add(btnNewButton_4_1_1);
		
		JButton btnTaroL = new JButton("L-60");
		btnTaroL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"TARO LARGE", "1", Price});
			}
		});
		btnTaroL.setBounds(498, 166, 63, 21);
		panel_2.add(btnTaroL);
		
		JLabel lblNewLabel_6_2 = new JLabel("MATCHA");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2.setBounds(103, 343, 99, 28);
		panel_2.add(lblNewLabel_6_2);
		
		JButton btnMatchaS = new JButton("S-35");
		btnMatchaS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"MATCHA SMALL", "1", Price});
			}
		});
		btnMatchaS.setBounds(47, 364, 63, 21);
		panel_2.add(btnMatchaS);
		
		JButton btnMatchaM = new JButton("M-40");
		btnMatchaM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"MATCHA MEDIUM", "1", Price});
			}
		});
		btnMatchaM.setBounds(120, 364, 63, 21);
		panel_2.add(btnMatchaM);
		
		JButton btnMatchaL = new JButton("L-60");
		btnMatchaL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"MATCHA LARGE", "1", Price});
			}
		});
		btnMatchaL.setBounds(198, 364, 63, 21);
		panel_2.add(btnMatchaL);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("COOKIES AND CREAM");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_2_1.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_1.setBounds(403, 343, 138, 28);
		panel_2.add(lblNewLabel_6_2_1);
		
		JButton btnCCS = new JButton("S-35");
		btnCCS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"COOKIES&CREAM SMALL", "1", Price});
			}
		});
		btnCCS.setBounds(347, 364, 63, 21);
		panel_2.add(btnCCS);
		
		JButton btnCCM = new JButton("M-40");
		btnCCM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"COOKIES&CREAM MEDIUM", "1", Price});
			}
		});
		btnCCM.setBounds(420, 364, 63, 21);
		panel_2.add(btnCCM);
		
		JButton btnCCL = new JButton("L-60");
		btnCCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"COOKIES&CREAM LARGE", "1", Price});
			}
		});
		btnCCL.setBounds(498, 364, 63, 21);
		panel_2.add(btnCCL);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("HOKKAIDOU");
		lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_2.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_2.setBounds(103, 538, 99, 28);
		panel_2.add(lblNewLabel_6_2_2);
		
		JButton btnHokkaiS = new JButton("S-35");
		btnHokkaiS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HOKKAIDOU SMALL", "1", Price});
			}
		});
		btnHokkaiS.setBounds(47, 559, 63, 21);
		panel_2.add(btnHokkaiS);
		
		JButton btnHokkaiM = new JButton("M-40");
		btnHokkaiM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HOKKAIDOU MEDIUM", "1", Price});
			}
		});
		btnHokkaiM.setBounds(120, 559, 63, 21);
		panel_2.add(btnHokkaiM);
		
		JButton btnHokkaiL = new JButton("L-60");
		btnHokkaiL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"HOKKAIDOU LARGE", "1", Price});
			}
		});
		btnHokkaiL.setBounds(198, 559, 63, 21);
		panel_2.add(btnHokkaiL);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("OKINAWA");
		lblNewLabel_6_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_3.setFont(new Font("Ink Free", Font.BOLD, 12));
		lblNewLabel_6_2_3.setBounds(403, 538, 99, 28);
		panel_2.add(lblNewLabel_6_2_3);
		
		JButton btnOkinawaS = new JButton("S-35");
		btnOkinawaS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"OKINAWA SMALL", "1", Price});
			}
		});
		btnOkinawaS.setBounds(347, 559, 63, 21);
		panel_2.add(btnOkinawaS);
		
		JButton btnOkinawaM = new JButton("M-40");
		btnOkinawaM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"OKINAWA MEDIUM", "1", Price});
			}
		});
		btnOkinawaM.setBounds(420, 559, 63, 21);
		panel_2.add(btnOkinawaM);
		
		JButton btnOkinawaL = new JButton("L-60");
		btnOkinawaL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Price= 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"OKINAWA LARGE", "1", Price});
			}
		});
		btnOkinawaL.setBounds(498, 559, 63, 21);
		panel_2.add(btnOkinawaL);
		
		JLabel lblWintermelon = new JLabel("MILKTEA");
		lblWintermelon.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblWintermelon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWintermelon.setBackground(new Color(255, 255, 255));
		lblWintermelon.setBounds(57, 10, 184, 138);
		panel_2.add(lblWintermelon);
		
		JLabel lblTaro = new JLabel("MILKTEA");
		lblTaro.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblTaro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaro.setBounds(357, 10, 184, 138);
		panel_2.add(lblTaro);
		
		JLabel lblMatcha = new JLabel("MILKTEA");
		lblMatcha.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblMatcha.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatcha.setBackground(Color.WHITE);
		lblMatcha.setBounds(57, 197, 184, 138);
		panel_2.add(lblMatcha);
		
		JLabel lblCookiesCream = new JLabel("MILKTEA");
		lblCookiesCream.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblCookiesCream.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookiesCream.setBackground(Color.WHITE);
		lblCookiesCream.setBounds(357, 197, 184, 138);
		panel_2.add(lblCookiesCream);
		
		JLabel lblHokkaidou = new JLabel("MILKTEA");
		lblHokkaidou.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblHokkaidou.setHorizontalAlignment(SwingConstants.CENTER);
		lblHokkaidou.setBackground(Color.WHITE);
		lblHokkaidou.setBounds(57, 403, 184, 138);
		panel_2.add(lblHokkaidou);
		
		JLabel lblOkinawa = new JLabel("MILKTEA");
		lblOkinawa.setIcon(new ImageIcon("C:\\Users\\WIndows 10\\Downloads\\milktea.jpg"));
		lblOkinawa.setHorizontalAlignment(SwingConstants.CENTER);
		lblOkinawa.setBackground(Color.WHITE);
		lblOkinawa.setBounds(357, 403, 184, 138);
		panel_2.add(lblOkinawa);
		
=======
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
		JPanel panel_3 = new JPanel();
<<<<<<< HEAD
		tabbedPane.addTab("SNACKS", null, panel_3, null);
=======
		tabbedPane.addTab("Drinks", null, panel_3, null);
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
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
		
<<<<<<< HEAD
		JLabel lblNewLabel_7_5 = new JLabel("WINTERMELON");
		lblNewLabel_7_5.setFont(new Font("Ink Free", Font.BOLD, 15));
		lblNewLabel_7_5.setBounds(242, 238, 124, 32);
		panel_3.add(lblNewLabel_7_5);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 15));
		btnReset.setBounds(991, 516, 143, 21);
		frame.getContentPane().add(btnReset);
	}
=======
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
>>>>>>> branch 'master' of https://github.com/nathanielseth/brilliantteaPOS.git
}
	}
