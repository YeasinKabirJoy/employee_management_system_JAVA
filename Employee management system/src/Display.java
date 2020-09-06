import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.SystemColor;
import java.awt.Font;

public class Display extends JFrame {

	private JPanel contentPane;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Display frame = new Display();
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
	public Display() {
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(350, 200, 666, 507);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setForeground(new Color(128, 0, 0));
		list.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		list.setBackground(new Color(173, 216, 230));
		list.setBounds(10, 23, 630, 348);
		contentPane.add(list);
		list.setModel(Main.employees);
		
//		JButton btnShow = new JButton("Show");
//		btnShow.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Main.employees.clear();
//				for(Employee emp:Main.cse.employees) {
//					if(emp==null)
//					break;
//					Main.employees.addElement(emp.toString());
//				}
//				list.setModel(Main.employees);
//			}
//		});
		//btnShow.setBounds(50, 300, 89, 23);
		//contentPane.add(btnShow);
		
		JButton btnBack = new JButton("Home");
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnBack.setBackground(SystemColor.activeCaption);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.employees.clear();
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnBack.setBounds(273, 407, 113, 23);
		contentPane.add(btnBack);
		
	}
}
