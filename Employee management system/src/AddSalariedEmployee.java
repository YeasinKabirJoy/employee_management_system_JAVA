import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
public class AddSalariedEmployee extends JFrame {
	private JPanel contentPane;
	private ImageIcon icon;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddSalariedEmployee frame = new AddSalariedEmployee();
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
	public AddSalariedEmployee() {
		setTitle("                                                          Salaried Employee");
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(350, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel(" Name : ");
		lblName.setForeground(SystemColor.desktop);
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(73, 46, 117, 32);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(200, 54, 192, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 100, 192, 20);
		contentPane.add(textField_1);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setForeground(SystemColor.desktop);
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(73, 92, 72, 32);
		contentPane.add(lblId);
		
		JLabel lblDesignation = new JLabel("Designation : ");
		lblDesignation.setForeground(SystemColor.desktop);
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignation.setBounds(73, 137, 103, 32);
		contentPane.add(lblDesignation);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setColumns(10);
		textField_2.setBounds(200, 145, 192, 20);
		contentPane.add(textField_2);
		
		JLabel lblSalary = new JLabel("Salary : ");
		lblSalary.setForeground(SystemColor.desktop);
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSalary.setBounds(73, 180, 103, 32);
		contentPane.add(lblSalary);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setColumns(10);
		textField_3.setBounds(200, 188, 192, 20);
		contentPane.add(textField_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(SystemColor.activeCaption);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 String name=textField.getText();
			     String id=textField_1.getText();
				 String desig=textField_2.getText();
				 double sal=Double.parseDouble(textField_3.getText());
				
				Employee emp=Main.cse.findEmployee(id);
				if(emp !=null) {
					JOptionPane.showMessageDialog(null, "ID Not Available","Error",JOptionPane.ERROR_MESSAGE);

				}
				else {
					  emp=Main.cse.addNewEmployee(name, id, desig, sal);
					  Main.employees.addElement(emp.toString());
					  JOptionPane.showMessageDialog(null, "Successfully Added","Successfull",JOptionPane.INFORMATION_MESSAGE);
					    textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
				}
							
			}
		});
		btnAdd.setBounds(177, 249, 202, 26);
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
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnHome.setBounds(424, 28, 89, 44);
		contentPane.add(btnHome);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
				dispose();
				Main.frame1.setVisible(true);
			}
		});
		btnBack.setBounds(12, 324, 133, 26);
		contentPane.add(btnBack);
	}
}
