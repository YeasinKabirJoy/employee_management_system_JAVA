import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.Box;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class AddAllEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField txName;
	private JTextField txID;
	private JTextField txSalary;
	private JTextField txDesig;
	private JTextField txHourRate;
	private JTextField txHourWorked;
	private JTextField txCommission;
	private JTextField txSale;
	
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddAllEmployee frame = new AddAllEmployee();
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
	public AddAllEmployee() {
		
		setTitle("Add");
		setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		
				
		
		setBounds(400, 150, 622, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblName.setBounds(66, 26, 60, 17);
		contentPane.add(lblName);
		
		
		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(66, 64, 48, 19);
		contentPane.add(lblId);
		
		
		txName = new JTextField();
		txName.setBackground(new Color(220, 220, 220));
		txName.setBounds(199, 22, 224, 28);
		contentPane.add(txName);
		txName.setColumns(10);
		
		
		txID = new JTextField();
		txID.setBackground(new Color(220, 220, 220));
		txID.setBounds(199, 61, 224, 28);
		contentPane.add(txID);
		txID.setColumns(10);
		
		
		txSalary = new JTextField();
		txSalary.setBackground(new Color(220, 220, 220));
		txSalary.setBounds(167, 213, 206, 28);
		contentPane.add(txSalary);
		txSalary.setColumns(10);
		txSalary.setVisible(false);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSalary.setBounds(47, 216, 79, 19);
		contentPane.add(lblSalary);
		lblSalary.setVisible(false);
		
		txDesig = new JTextField();
		txDesig.setBackground(new Color(220, 220, 220));
		txDesig.setBounds(199, 100, 224, 28);
		contentPane.add(txDesig);
		txDesig.setColumns(10);

		
		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignation.setBounds(66, 106, 109, 19);
		contentPane.add(lblDesignation);
		
		
		txHourRate = new JTextField();
		txHourRate.setBackground(new Color(220, 220, 220));
		txHourRate.setBounds(167, 213, 206, 28);
		contentPane.add(txHourRate);
		txHourRate.setColumns(10);
		txHourRate.setVisible(false);
		
		JLabel lblHourRate = new JLabel("Hour Rate : ");
		lblHourRate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHourRate.setBounds(49, 215, 96, 20);
		contentPane.add(lblHourRate);
		lblHourRate.setVisible(false);
		
		JLabel lblHourWorked = new JLabel("Hour Worked");
		lblHourWorked.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHourWorked.setBounds(45, 253, 100, 14);
		contentPane.add(lblHourWorked);
		lblHourWorked.setVisible(false);
		
		txHourWorked = new JTextField();
		txHourWorked.setBackground(new Color(220, 220, 220));
		txHourWorked.setBounds(167, 258, 206, 28);
		contentPane.add(txHourWorked);
		txHourWorked.setColumns(10);
		txHourWorked.setVisible(false);
		
		
		JRadioButton rdbtnSalaried = new JRadioButton("Salaried");
		rdbtnSalaried.setBackground(SystemColor.inactiveCaption);
		rdbtnSalaried.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		rdbtnSalaried.setBounds(66, 167, 109, 23);
		contentPane.add(rdbtnSalaried);
		//rdbtnSalaried.setSelected(true);
		//rdbtnSalaried.setd;
		
		JRadioButton rdbtnHourly = new JRadioButton("Hourly");
		rdbtnHourly.setBackground(SystemColor.inactiveCaption);
		rdbtnHourly.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		rdbtnHourly.setBounds(199, 167, 109, 23);
		contentPane.add(rdbtnHourly);
		
		JRadioButton rdbtnCommission = new JRadioButton("Commission");
		rdbtnCommission.setBackground(SystemColor.inactiveCaption);
		rdbtnCommission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		rdbtnCommission.setBounds(320, 167, 116, 23);
		contentPane.add(rdbtnCommission);
		
		txCommission = new JTextField();
		txCommission.setBackground(new Color(220, 220, 220));
		txCommission.setBounds(167, 213, 206, 28);
		contentPane.add(txCommission);
		txCommission.setColumns(10);
		txCommission.setVisible(false);
		
		txSale = new JTextField();
		txSale.setBackground(new Color(220, 220, 220));
		txSale.setBounds(167, 258, 206, 28);
		contentPane.add(txSale);
		txSale.setColumns(10);
		txSale.setVisible(false);
		
		JLabel lblCommission = new JLabel("Commission :");
		lblCommission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCommission.setBounds(45, 214, 100, 19);
		contentPane.add(lblCommission);
		lblCommission.setVisible(false);
		
		JLabel lblSale = new JLabel("Sale :");
		lblSale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSale.setBounds(45, 253, 48, 14);
		contentPane.add(lblSale);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnAdd.setBounds(207, 318, 149, 28);
		contentPane.add(btnAdd);
		btnAdd.setVisible(false);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHome.setBounds(20, 351, 89, 34);
		contentPane.add(btnHome);
		lblSale.setVisible(false);
		
		rdbtnSalaried.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHourly.setSelected(false);
				rdbtnCommission.setSelected(false);
				lblHourWorked.setVisible(false);
				lblHourRate.setVisible(false);
				txHourWorked.setVisible(false);
				txHourRate.setVisible(false);
				lblCommission.setVisible(false);
				lblSale.setVisible(false);
				txCommission.setVisible(false);
				txSale.setVisible(false);
				
				lblSalary.setVisible(true);
				txSalary.setVisible(true);
				btnAdd.setVisible(true);
				
				if(rdbtnSalaried.isSelected()==false) {
					lblSalary.setVisible(false);
					txSalary.setVisible(false);
					btnAdd.setVisible(false);
				}
				
				
				
			}
		});
		rdbtnHourly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSalaried.setSelected(false);
				rdbtnCommission.setSelected(false);
				lblSalary.setVisible(false);
				txSalary.setVisible(false);
				lblCommission.setVisible(false);
				lblSale.setVisible(false);
				txCommission.setVisible(false);
				txSale.setVisible(false);
				
				lblHourWorked.setVisible(true);
				lblHourRate.setVisible(true);
				txHourWorked.setVisible(true);
				txHourRate.setVisible(true);
                btnAdd.setVisible(true);
				
				if(rdbtnHourly.isSelected()==false) {
					lblHourWorked.setVisible(false);
					lblHourRate.setVisible(false);
					txHourWorked.setVisible(false);
					txHourRate.setVisible(false);
	                btnAdd.setVisible(false);
				}
			}
		});
		rdbtnCommission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSalaried.setSelected(false);
				rdbtnHourly.setSelected(false);
				lblSalary.setVisible(false);
				txSalary.setVisible(false);
				lblHourWorked.setVisible(false);
				lblHourRate.setVisible(false);
				txHourWorked.setVisible(false);
				txHourRate.setVisible(false);
				
				lblCommission.setVisible(true);
				lblSale.setVisible(true);
				txCommission.setVisible(true);
				txSale.setVisible(true);
				  btnAdd.setVisible(true);
				
				if(rdbtnCommission.isSelected()==false) {
					lblCommission.setVisible(false);
					lblSale.setVisible(false);
					txCommission.setVisible(false);
					txSale.setVisible(false);
					  btnAdd.setVisible(false);
					
				}
				
				
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
			 if(rdbtnSalaried.isSelected()==true) {
				
				 String name=txName.getText();
				 String id=txID.getText();
				 String desig=txDesig.getText();
				 double sal=Double.parseDouble(txSalary.getText());				 
					Employee emp=Main.cse.findEmployee(id);
					if(emp !=null) {
						JOptionPane.showMessageDialog(null, "ID Not Available","Error",JOptionPane.ERROR_MESSAGE);

					}
					else {
				 emp=Main.cse.addNewEmployee(name, id, desig, sal);
				 Main.employees.addElement(emp.toString());
				Main.salEmp.addElement(emp.toString());
				JOptionPane.showMessageDialog(null, "Successfully Added","Successfull",JOptionPane.INFORMATION_MESSAGE);

				 txName.setText("");
				 txID.setText("");
				 txDesig.setText("");
				 txSalary.setText("");
					}
			 }				 
			 else if(rdbtnHourly.isSelected()==true) {
				 String name=txName.getText();
				 String id=txID.getText();
				 String desig=txDesig.getText();
				 double hr=Double.parseDouble(txHourRate.getText());
					int hw=Integer.parseInt(txHourWorked.getText());
				 Employee emp=Main.cse.findEmployee(id);
					if(emp!=null) {
						JOptionPane.showMessageDialog(null, "ID Not Available","Error",JOptionPane.ERROR_MESSAGE);

					}
					else {
					 emp=Main.cse.addNewEmployee(name, id, desig,hr,hw);
					Main.employees.addElement(emp.toString());
					Main.hourEmp.addElement(emp.toString());
					JOptionPane.showMessageDialog(null, "Successfully Added","Successfull",JOptionPane.INFORMATION_MESSAGE);
					
					 txName.setText("");
					 txID.setText("");
					 txDesig.setText("");
					 txHourRate.setText("");
					 txHourWorked.setText("");
					}
			 }
			 else if(rdbtnCommission.isSelected()==true) {
				 String name=txName.getText();
				 String id=txID.getText();
				 String desig=txDesig.getText();
				 double com=Double.parseDouble(txCommission.getText());
				 double sale=Double.parseDouble(txSale.getText());
					
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
					Main.comEmp.addElement(emp.toString());
					JOptionPane.showMessageDialog(null, "Successfully Added", "Scuccessful", JOptionPane.INFORMATION_MESSAGE);
					
					 txName.setText("");
					 txID.setText("");
					 txDesig.setText("");
					 txCommission.setText("");
					 txSale.setText("");
					}
				 
			 }
			 }catch(Exception e1) {
				 
			 }
			}
		});
		
	
	}

	
}
