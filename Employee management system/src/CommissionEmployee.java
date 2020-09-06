import javax.swing.JOptionPane;

public class CommissionEmployee extends Employee {
      public double commission;
      public double sale;
	
      public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
		super(name, id, designation);
		this.commission = commission;
		this.sale = sale;
	}
    
  	@Override
  	public int  increaseSalary(double amt) {
  		int i=0;
  		if(amt<0 && amt>100) {
			JOptionPane.showMessageDialog(null, "Invalid Commission","Error",JOptionPane.ERROR_MESSAGE);
			
  		}
  		else if(commission+amt<=100) {
  	       commission+=amt;
  	       i=1;
  		}
  		else {
			JOptionPane.showMessageDialog(null, "Commission must be less then or equal to 100 %","Error",JOptionPane.ERROR_MESSAGE);
			
  		}
  		return i;
  	}

  	@Override
  	public double getSalary() {
  	   return commission*sale;
  	}

	@Override
	public String toString() {
		return "[ "+name+" ] [ "+id+" ] [ "+designation+" ] [ "+commission +" ] [ "+sale+ " ] [ "+(commission*sale)/100+" ]";
	}
  	
//  	@Override
//  	public void display() {
//  		super.display();
//        System.out.println("Commission :["+commission+"]");
//   	}

      
}
