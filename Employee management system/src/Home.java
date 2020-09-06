import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JCheckBoxMenuItem;
public class Home extends JFrame {
	private ImageIcon icon,icon1;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home frame = new Home();
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
	public Home() {
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setBackground(new Color(240, 248, 255));
		setTitle("                                                                               Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(400, 150, 611, 492);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.setBackground(new Color(135, 206, 250));
		btnAddEmployee.setForeground(SystemColor.desktop);
		btnAddEmployee.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//Main.frame1.setVisible(true);
				Main.frame9.setVisible(true);
				}
			
		});
		btnAddEmployee.setBounds(191, 58, 205, 32);
		contentPane.add(btnAddEmployee);
		
		JButton btnEmployeeDetails = new JButton("Employee Details");
		btnEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.salEmp.clear();
				Main.hourEmp.clear();
				Main.comEmp.clear();
				for(Employee emp:Main.cse.employees) {
					if(emp==null)
					break;
					else if(emp instanceof SalariedEmployee)
					Main.salEmp.addElement(emp.toString());
					else if(emp instanceof HourlyEmployee)
						Main.hourEmp.addElement(emp.toString());
					else
						Main.comEmp.addElement(emp.toString());
				}
				Main.frame10.setVisible(true);
			}
		});
		btnEmployeeDetails.setBackground(new Color(135, 206, 250));
		btnEmployeeDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEmployeeDetails.setBounds(191, 125, 205, 32);
		contentPane.add(btnEmployeeDetails);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(135, 206, 250));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Main.exitSave();
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnExit.setBounds(191, 320, 205, 32);
		contentPane.add(btnExit);
		
		JButton btnIncreaaseSalary = new JButton("Increaase Salary ");
		btnIncreaaseSalary.setBackground(new Color(135, 206, 250));
		btnIncreaaseSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame5.setVisible(true);
			}
		});
		btnIncreaaseSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnIncreaaseSalary.setBounds(191, 188, 205, 32);
		contentPane.add(btnIncreaaseSalary);
		
		JButton btnGetSalary = new JButton("Get Salary\r\n");
		btnGetSalary.setBackground(new Color(135, 206, 250));
		btnGetSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame6.setVisible(true);
			}
		});
		btnGetSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnGetSalary.setBounds(191, 253, 205, 32);
		contentPane.add(btnGetSalary);
		
		icon1=new ImageIcon(getClass().getResource("gifUap.gif"));
		JLabel lblNewLabel = new JLabel(icon1);
		lblNewLabel.setForeground(new Color(173, 216, 230));
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setBounds(191, 396, 205, 46);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 204));
		panel.setBounds(191, 58, 102, 294);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(294, 58, 102, 294);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 0, 204));
		panel_2.setBounds(395, 58, 200, 294);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 255, 204));
		panel_3.setBounds(0, 58, 193, 294);
		contentPane.add(panel_3);
		
		
	}
}
