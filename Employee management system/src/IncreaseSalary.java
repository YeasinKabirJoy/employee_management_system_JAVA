import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class IncreaseSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ImageIcon icon;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IncreaseSalary frame = new IncreaseSalary();
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
	public IncreaseSalary() {
		setTitle("                                                                Salary Increase");
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
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(98, 98, 89, 41);
		contentPane.add(lblId);
		
		JLabel lblAmount = new JLabel("Amount : \r\n");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblAmount.setBounds(98, 135, 89, 59);
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(177, 106, 168, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setColumns(10);
		textField_1.setBounds(177, 152, 168, 29);
		contentPane.add(textField_1);
		
		JButton btnIncrease = new JButton("Increase");
		btnIncrease.setBackground(SystemColor.activeCaption);
		btnIncrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					String id=textField.getText();
					double amt =Double.parseDouble(textField_1.getText());
					Employee emp=Main.cse.findEmployee(id);
					if(emp!=null) {
						int i=Main.cse.increaseSalary(id, amt);
						if(i==1)
						JOptionPane.showMessageDialog(null,"Increased","Successful", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "ID Not Found","Error",JOptionPane.ERROR_MESSAGE);
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

				}
			
				
			}
		});
		btnIncrease.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnIncrease.setBounds(98, 219, 118, 29);
		contentPane.add(btnIncrease);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(SystemColor.activeCaption);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnReset.setBounds(295, 219, 118, 29);
		contentPane.add(btnReset);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBackground(SystemColor.activeCaption);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHome.setBounds(394, 309, 118, 29);
		contentPane.add(btnHome);
	}
}
