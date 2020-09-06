import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class AddCommissionEmployee extends JFrame {
	
	private JPanel contentPane;
	private ImageIcon icon;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddCommissionEmployee frame = new AddCommissionEmployee();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AddCommissionEmployee() {
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setTitle("Commission Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(350, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(98, 51, 125, 27);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(98, 96, 125, 27);
		contentPane.add(lblId);
		
		JLabel lblDesignation = new JLabel("Designation : ");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignation.setBounds(98, 134, 125, 27);
		contentPane.add(lblDesignation);
		
		JLabel lblCommission = new JLabel("Commission : ");
		lblCommission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCommission.setBounds(98, 176, 125, 27);
		contentPane.add(lblCommission);
		
		JLabel lblSale = new JLabel("Sale :\r\n");
		lblSale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSale.setBounds(98, 214, 125, 27);
		contentPane.add(lblSale);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 0));
		textField.setBackground(new Color(220, 220, 220));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(213, 56, 189, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(213, 101, 189, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(213, 139, 189, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setColumns(10);
		textField_3.setBounds(213, 181, 189, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setForeground(new Color(128, 0, 0));
		textField_4.setColumns(10);
		textField_4.setBounds(213, 219, 189, 20);
		contentPane.add(textField_4);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAdd.setBackground(SystemColor.activeCaption);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String name=textField.getText();
				String id=textField_1.getText();
				String desig=textField_2.getText();
				double com=Double.parseDouble(textField_3.getText());
				double sale=Double.parseDouble(textField_4.getText());
				
				Employee emp=Main.cse.findEmployee(id);
				if(emp!=null) {
					JOptionPane.showMessageDialog(null, "ID Not Available","Error",JOptionPane.ERROR_MESSAGE);

				}
				else if(com>100 || com<1)  {
					JOptionPane.showMessageDialog(null, "Invalid Commission","Error",JOptionPane.ERROR_MESSAGE);

				}
				else {
			    emp=Main.cse.addNewEmployee(name, id, desig, com, sale);
				Main.employees.addElement(emp.toString());
				JOptionPane.showMessageDialog(null, "Successfully Added", "Scuccessful", JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

				} 
	
			}
		});
		btnAdd.setBounds(176, 273, 207, 23);
		contentPane.add(btnAdd);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHome.setBackground(SystemColor.activeCaption);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				dispose();
				 Main.frame.setVisible(true);
			}
		});
		btnHome.setBounds(412, 11, 112, 35);
		contentPane.add(btnHome);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				dispose();
				Main.frame1.setVisible(true);
			}
		});
		btnNewButton.setBounds(21, 327, 135, 23);
		contentPane.add(btnNewButton);
		
	}
}
