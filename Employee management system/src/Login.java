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
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ImageIcon icon ,icon1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
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
	public Login() {
		setTitle("                                                                  Log In");
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblId.setBounds(83, 121, 70, 33);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(83, 187, 97, 26);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(198, 129, 223, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(198, 192, 223, 20);
		contentPane.add(textField_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				String pass=textField_1.getText();
				if(id.equals("CseUap") && pass.equals("CseRocks")) {
					JOptionPane.showMessageDialog(null, "Logged In", "Successfull",JOptionPane.INFORMATION_MESSAGE);
					dispose();
					Main.frame.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "ID or Password is Wrong,Try Again", "Error",JOptionPane.ERROR_MESSAGE);
				
			}
		});
		btnLogin.setBounds(99, 242, 129, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset\r\n");
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnReset.setBounds(303, 242, 156, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnExit.setBounds(190, 305, 156, 23);
		contentPane.add(btnExit);
		
		JLabel lblUapEmployeeManagement = new JLabel("UAP Employee Management System");
		lblUapEmployeeManagement.setForeground(new Color(139, 0, 0));
		lblUapEmployeeManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblUapEmployeeManagement.setBounds(159, 41, 308, 32);
		contentPane.add(lblUapEmployeeManagement);
		icon1=new ImageIcon(getClass().getResource("Uap.png"));
		JLabel lblNewLabel = new JLabel(icon1);
		lblNewLabel.setBounds(10, 11, 103, 99);
		contentPane.add(lblNewLabel);
	}
}
