import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.io.ObjectInputStream;

public class Main {
	static UapCse cse=null;
	static Home frame = new Home();
	static AddEmployee frame1 = new AddEmployee();
	static AddSalariedEmployee frame2 = new AddSalariedEmployee();
	static AddHourlyEmployee frame3 = new AddHourlyEmployee();
	static AddCommissionEmployee frame4 = new AddCommissionEmployee();
	static IncreaseSalary frame5 = new IncreaseSalary();
	static DefaultListModel<String> employees = new DefaultListModel<String>();
	static DefaultListModel<String> salEmp = new DefaultListModel<String>();
	static DefaultListModel<String> hourEmp = new DefaultListModel<String>();
	static DefaultListModel<String> comEmp = new DefaultListModel<String>();

	static GetSalary frame6 = new GetSalary();
	static Login frame7 = new Login();
	static Display frame8 = new Display();
	static AddAllEmployee frame9 = new AddAllEmployee();
	static EmployeeDetails frame10 = new EmployeeDetails();
	static String fileName="Data.txt";
	
	static void exitSave(){
		ObjectOutputStream oos=null;
        
    	try {
			oos = new ObjectOutputStream(new FileOutputStream(Main.fileName));
			oos.writeObject(Main.cse);
		} catch (Exception f) {
			  JOptionPane.showMessageDialog(null, f.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

		} 
		finally {
			try {
				oos.close();
			} catch (IOException i) {
				System.out.println(i);
			}
		}
	}
//	static void exit() {
//		int option = JOptionPane.showConfirmDialog(null, "Want to Exit?", "Exit", JOptionPane.YES_NO_OPTION);
//		System.out.print(option);
//		if(option==JOptionPane.YES_OPTION) {
//			System.exit(0);
//		}
//		else {
//			Main.frame.setVisible(true);
//		}
//			
//	}
	public static void main(String[] args) {
		frame.setVisible(true);
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream(fileName));
			cse=(UapCse)ois.readObject();
		} catch (Exception e) {
			cse=new UapCse();	
	}
		finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
}
}