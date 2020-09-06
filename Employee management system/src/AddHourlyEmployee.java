import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
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

public class AddHourlyEmployee extends JFrame {
	
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
//					AddHourlyEmployee frame = new AddHourlyEmployee();
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
	public AddHourlyEmployee() {
		setTitle("                                                          Hourly Employee");
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
		contentPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(109, 46, 107, 32);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID : \r\n");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(109, 89, 107, 32);
		contentPane.add(lblId);
		
		JLabel lblDesignation = new JLabel("Designation : ");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignation.setBounds(109, 132, 107, 27);
		contentPane.add(lblDesignation);
		
		JLabel lblHourlyRate = new JLabel("Hourly Rate : ");
		lblHourlyRate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHourlyRate.setBounds(109, 170, 107, 30);
		contentPane.add(lblHourlyRate);
		
		JLabel lblHourWorked = new JLabel("Hour Worked : ");
		lblHourWorked.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHourWorked.setBounds(109, 211, 107, 27);
		contentPane.add(lblHourWorked);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setForeground(new Color(128, 0, 0));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(226, 54, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setColumns(10);
		textField_1.setBounds(226, 97, 179, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setColumns(10);
		textField_2.setBounds(226, 137, 179, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setColumns(10);
		textField_3.setBounds(226, 177, 179, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setForeground(new Color(128, 0, 0));
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setColumns(10);
		textField_4.setBounds(226, 216, 179, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(423, 25, 84, 40);
		contentPane.add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAdd.setBackground(SystemColor.activeCaption);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String name=textField.getText();
				String id=textField_1.getText();
				String desig=textField_2.getText();
				double hr=Double.parseDouble(textField_3.getText());
				int hw=Integer.parseInt(textField_4.getText());
				Employee emp=Main.cse.findEmployee(id);
				if(emp!=null) {
					JOptionPane.showMessageDialog(null, "ID Not Available","Error",JOptionPane.ERROR_MESSAGE);

				}
				else {
				 emp=Main.cse.addNewEmployee(name, id, desig, hr, hw);
				Main.employees.addElement(emp.toString());
				JOptionPane.showMessageDialog(null, "Successfully Added","Successfull",JOptionPane.INFORMATION_MESSAGE);
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
		btnAdd.setBounds(188, 263, 179, 32);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.addActionListener(new ActionListener() {
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
		btnBack.setBounds(22, 323, 133, 27);
		contentPane.add(btnBack);
	}

}
