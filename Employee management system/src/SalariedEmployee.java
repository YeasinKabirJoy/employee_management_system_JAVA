
public class SalariedEmployee extends Employee {
	public double monthlySalary;

	public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
		super(name, id, designation);
		this.monthlySalary = monthlySalary;
	}
	

	@Override
	public int increaseSalary(double amt) {
		
		int i=0;
		if(amt>0) {
		monthlySalary+=amt;
		i=1;
		}
		return i;
	}

	@Override
	public double getSalary() {
		
		return monthlySalary;
	}


	@Override
	public String toString() {
		super.toString();
		return "[ "+name+" ] [ "+id+" ] [ "+designation+" ] [ "+monthlySalary+" ]";
	}
	
//	@Override
//	public void display() {
//		super.display();
//		System.out.println("Salary :["+monthlySalary+"];");
//	}


	

}

