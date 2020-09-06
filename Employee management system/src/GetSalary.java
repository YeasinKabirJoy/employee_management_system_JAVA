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

public class GetSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GetSalary frame = new GetSalary();
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
	public GetSalary() {
		setTitle("                                                                    Salary");
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
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(127, 50, 86, 60);
		contentPane.add(lblId);
		JLabel label = new JLabel("");
		label.setBackground(new Color(220, 220, 220));
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		label.setBounds(164, 206, 240, 37);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBackground(new Color(220, 220, 220));
		textField.setForeground(new Color(128, 0, 0));
		textField.setBounds(180, 67, 201, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGetSalary = new JButton("Get Salary");
		btnGetSalary.setBackground(SystemColor.activeCaption);
		btnGetSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String id=textField.getText();
					Employee emp=Main.cse.findEmployee(id);
					if(emp!=null) {
						double sal=Main.cse.getSalary(id);
						//textField_1.setText(String.valueOf(sal));
						label.setText(String.valueOf(sal));
					}
					else {
						JOptionPane.showMessageDialog(null, "ID Not Found","Error",JOptionPane.ERROR_MESSAGE);
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

				}
				
			}
		});
		btnGetSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnGetSalary.setBounds(97, 121, 138, 37);
		contentPane.add(btnGetSalary);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBackground(SystemColor.activeCaption);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				label.setText("");
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHome.setBounds(371, 305, 138, 30);
		contentPane.add(btnHome);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(SystemColor.activeCaption);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				label.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnReset.setBounds(299, 121, 138, 37);
		contentPane.add(btnReset);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSalary.setBounds(97, 206, 98, 37);
		contentPane.add(lblSalary);
		
		
	}
}
