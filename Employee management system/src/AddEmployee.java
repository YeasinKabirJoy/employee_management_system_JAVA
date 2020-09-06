import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private ImageIcon icon,icon1;
	 
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setTitle("                                                                 Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(400, 150, 611, 492);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalariedEmployee = new JButton("Salaried Employee");
		btnSalariedEmployee.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnSalariedEmployee.setBackground(SystemColor.activeCaption);
		btnSalariedEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame2.setVisible(true);
			}
		});
		btnSalariedEmployee.setBounds(185, 87, 201, 39);
		contentPane.add(btnSalariedEmployee);
		
		JButton btnHourlyEmployee = new JButton("Hourly Employee");
		btnHourlyEmployee.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHourlyEmployee.setBackground(SystemColor.activeCaption);
		btnHourlyEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame3.setVisible(true);
			}
		});
		btnHourlyEmployee.setBounds(185, 175, 201, 39);
		contentPane.add(btnHourlyEmployee);
		
		JButton btnCommissionEmployee = new JButton("Commission Employee");
		btnCommissionEmployee.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnCommissionEmployee.setBackground(SystemColor.activeCaption);
		btnCommissionEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame4.setVisible(true);
			}
		});
		btnCommissionEmployee.setBounds(185, 265, 201, 44);
		contentPane.add(btnCommissionEmployee);
		
		JButton btnBack = new JButton("Home");
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnBack.setBounds(30, 385, 106, 33);
		contentPane.add(btnBack);
		
		icon1=new ImageIcon(getClass().getResource("emp.jpg"));
		JLabel lblNewLabel = new JLabel(icon1);
		lblNewLabel.setBounds(0, 0, 595, 453);
		contentPane.add(lblNewLabel);
		
	}
}
