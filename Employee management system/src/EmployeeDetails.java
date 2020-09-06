import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.ScrollPane;

public class EmployeeDetails extends JFrame {
	private ImageIcon icon;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmployeeDetails frame = new EmployeeDetails();
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
	public EmployeeDetails() {
		icon=new ImageIcon(getClass().getResource("Uap.png"));
		setIconImage(icon.getImage());	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		    	 Main.exitSave();

		    }
		});
		setBounds(50, 100, 1279, 576);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBackground(new Color(255, 228, 225));
		list.setBounds(0, 64, 328, 429);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBackground(new Color(220, 220, 220));
		list_1.setBounds(328, 64, 467, 429);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_2.setBackground(new Color(224, 255, 255));
		list_2.setBounds(795, 64, 471, 429);
		contentPane.add(list_2);
		list.setModel(Main.salEmp);
		list_1.setModel(Main.hourEmp);
		list_2.setModel(Main.comEmp);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(238, 130, 238));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBackground(new Color(138, 43, 226));
		btnNewButton.setBounds(552, 504, 169, 22);
		contentPane.add(btnNewButton);
		
		JLabel lblSalaried = new JLabel("  Salaried");
		lblSalaried.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSalaried.setForeground(new Color(255, 69, 0));
		lblSalaried.setBounds(110, 0, 130, 25);
		contentPane.add(lblSalaried);
		
		JLabel lblHoury = new JLabel("   Hourly");
		lblHoury.setForeground(new Color(255, 0, 0));
		lblHoury.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblHoury.setBounds(505, 5, 111, 14);
		contentPane.add(lblHoury);
		
		JLabel lblCommission = new JLabel("Commission");
		lblCommission.setForeground(new Color(255, 0, 0));
		lblCommission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCommission.setBounds(955, 5, 117, 14);
		contentPane.add(lblCommission);
		
		JLabel lblNewLabel = new JLabel("NAME | ID |  DESIGNATIN | SALARY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setForeground(new Color(135, 206, 250));
		lblNewLabel.setBounds(10, 39, 247, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNameId = new JLabel("NAME | ID |  DESIGNATION | HOUR RATE | HOUR WORKED  | SALARY");
		lblNameId.setForeground(new Color(135, 206, 250));
		lblNameId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNameId.setBounds(345, 39, 450, 14);
		contentPane.add(lblNameId);
		
		JLabel lblNameId_1 = new JLabel("NAME | ID |  DESIGNATION | COMMISSION | SALE  | SALARY");
		lblNameId_1.setForeground(new Color(135, 206, 250));
		lblNameId_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNameId_1.setBounds(816, 39, 450, 14);
		contentPane.add(lblNameId_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(778, 81, 17, 48);
		contentPane.add(scrollBar);
		
	
		
	}
}
