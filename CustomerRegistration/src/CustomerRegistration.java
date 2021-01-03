import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField JtextMI;
	private JTextField JtextTmonths;
	private JTextField JtextPrice;
	private JTextField JtextContact;
	private JTextField JtextAddress;
	private JTextField JtextIcPassport;
	private JTextField JtextName;
	private JTextField JtextDate;
	private JTextField JtextRef;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 10, 1360, 728);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel title_1 = new JPanel();
		title_1.setBounds(21, 24, 1317, 85);
		panel.add(title_1);
		title_1.setLayout(null);
		title_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(123, 104, 238)));
		title_1.setBackground(new Color(250, 235, 215));
		
		
		JLabel titleLabel = new JLabel("Customer Registration");
		titleLabel.setForeground(new Color(0, 0, 0));
		titleLabel.setBackground(new Color(123, 104, 238));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Century Gothic", Font.BOLD, 55));
		titleLabel.setBounds(262, 11, 748, 63);
		title_1.add(titleLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(147, 112, 219)));
		panel_1_1.setBackground(new Color(154, 205, 50));
		panel_1_1.setBounds(21, 120, 519, 517);
		panel.add(panel_1_1);
		
		JLabel lblRef = new JLabel("Reference Num");
		lblRef.setHorizontalAlignment(SwingConstants.LEFT);
		lblRef.setForeground(new Color(0, 0, 0));
		lblRef.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRef.setBounds(31, 45, 140, 27);
		panel_1_1.add(lblRef);
		
		JLabel lblDate = new JLabel("Date Registered");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setForeground(new Color(0, 0, 0));
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDate.setBounds(31, 83, 154, 27);
		panel_1_1.add(lblDate);
		
		JtextMI = new JTextField();
		JtextMI.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextMI.setBounds(281, 458, 199, 26);
		panel_1_1.add(JtextMI);
		JtextMI.setColumns(10);
		
		JtextTmonths = new JTextField();
		JtextTmonths.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextTmonths.setColumns(10);
		JtextTmonths.setBounds(195, 423, 285, 26);
		panel_1_1.add(JtextTmonths);
		
		JtextPrice = new JTextField();
		JtextPrice.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPrice.setColumns(10);
		JtextPrice.setBounds(195, 365, 285, 26);
		panel_1_1.add(JtextPrice);
		
		JtextContact = new JTextField();
		JtextContact.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextContact.setColumns(10);
		JtextContact.setBounds(195, 268, 285, 26);
		panel_1_1.add(JtextContact);
		
		JtextAddress = new JTextField();
		JtextAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextAddress.setColumns(10);
		JtextAddress.setBounds(195, 233, 285, 26);
		panel_1_1.add(JtextAddress);
		
		JtextIcPassport = new JTextField();
		JtextIcPassport.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextIcPassport.setColumns(10);
		JtextIcPassport.setBounds(195, 196, 285, 26);
		panel_1_1.add(JtextIcPassport);
		
		JtextName = new JTextField();
		JtextName.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextName.setColumns(10);
		JtextName.setBounds(195, 138, 285, 26);
		panel_1_1.add(JtextName);
		
		JtextDate = new JTextField();
		JtextDate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextDate.setColumns(10);
		JtextDate.setBounds(195, 80, 285, 26);
		panel_1_1.add(JtextDate);
		
		JtextRef = new JTextField();
		JtextRef.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextRef.setColumns(10);
		JtextRef.setBounds(195, 45, 285, 26);
		panel_1_1.add(JtextRef);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(31, 135, 154, 27);
		panel_1_1.add(lblName);
		
		JLabel lblPassport = new JLabel("IC / Passport No");
		lblPassport.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassport.setForeground(new Color(0, 0, 0));
		lblPassport.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassport.setBounds(31, 172, 154, 27);
		panel_1_1.add(lblPassport);
		
		JLabel lblCarModel = new JLabel("Address");
		lblCarModel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarModel.setForeground(new Color(0, 0, 0));
		lblCarModel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCarModel.setBounds(31, 230, 140, 27);
		panel_1_1.add(lblCarModel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile Num");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(31, 267, 140, 27);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblMonthlyInstallments = new JLabel("Car Model");
		lblMonthlyInstallments.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonthlyInstallments.setForeground(new Color(0, 0, 0));
		lblMonthlyInstallments.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMonthlyInstallments.setBounds(31, 327, 140, 27);
		panel_1_1.add(lblMonthlyInstallments);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price (RM)");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(31, 364, 140, 27);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblPrice = new JLabel("Basic Salary");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setForeground(new Color(0, 0, 0));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPrice.setBounds(31, 423, 140, 27);
		panel_1_1.add(lblPrice);
		
		JLabel lblNewLabel_1_4 = new JLabel("Monthly Installment (RM)");
		lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(31, 460, 240, 27);
		panel_1_1.add(lblNewLabel_1_4);
		
		JComboBox cmbCarModel = new JComboBox();
		cmbCarModel.setForeground(new Color(0, 0, 0));
		cmbCarModel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cmbCarModel.setModel(new DefaultComboBoxModel(new String[] {"Click here to select", "Proton Saga", "Proton Persona", "Proton X50", "Proton X70"}));
		cmbCarModel.setBounds(195, 327, 285, 27);
		panel_1_1.add(cmbCarModel);
		
		JComboBox cmbIcPassport = new JComboBox();
		cmbIcPassport.setForeground(new Color(0, 0, 0));
		cmbIcPassport.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cmbIcPassport.setModel(new DefaultComboBoxModel(new String[] {"Click here to select", "IC ", "Passport"}));
		cmbIcPassport.setBounds(195, 168, 285, 27);
		panel_1_1.add(cmbIcPassport);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(147, 112, 219)));
		panel_1_2.setBackground(new Color(245, 222, 179));
		panel_1_2.setBounds(21, 648, 1317, 69);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				JtextRef.getText(),
				JtextDate.getText(),
				JtextName.getText(),
				JtextIcPassport.getText(),
				JtextAddress.getText(),
				JtextContact.getText(),
				cmbCarModel.getSelectedItem(),
				JtextPrice.getText(),
				JtextTmonths.getText(),
				JtextMI.getText(),
				cmbIcPassport.getSelectedItem(),
				
		});
				if (table.getSelectedRow() == -1){
					if (table.getRowCount() == 0){
						JOptionPane.showMessageDialog(null, "Registration is Confirmed", "Customer Registration",
					JOptionPane.OK_OPTION);
					}
				}
	}

});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.setBounds(20, 11, 202, 47);
		panel_1_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(176, 224, 230));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtextRef.setText("");
				JtextDate.setText("");
				JtextName.setText("");
				JtextIcPassport.setText("");
				JtextAddress.setText("");
				JtextContact.setText("");
				JtextPrice.setText("");
				JtextTmonths.setText("");
				JtextMI.setText("");
				cmbCarModel.setSelectedItem("Click here to select");
				cmbIcPassport.setSelectedItem("Click here to select");
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_1.setBounds(557, 11, 202, 47);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(176, 224, 230));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		DefaultTableModel model = (DefaultTableModel) table.getModel();		
		if (table.getSelectedRow() == -1){
			if (table.getRowCount() == 0){
				JOptionPane.showMessageDialog(null, "No data input to delete", "Customer Registration", JOptionPane.OK_OPTION);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Select a row to delete", "Customer Registration", JOptionPane.OK_OPTION);
			}
				
		}else {
			model.removeRow(table.getSelectedRow());
		}
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_2.setBounds(292, 11, 202, 47);
		panel_1_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(176, 224, 230));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_3.setBounds(825, 11, 202, 47);
		panel_1_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(176, 224, 230));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_4.setBounds(1090, 11, 202, 47);
		panel_1_2.add(btnNewButton_4);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(550, 120, 788, 517);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(new Color(221, 160, 221));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 768, 469);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref No", "Date", "Name", "IC/Passport", "Address", "Contact No", "Car Model", "Price (RM)", "Basic Salary",  "M.Installment",  
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(8).setPreferredWidth(55);
		scrollPane.setViewportView(table);
	}
}
