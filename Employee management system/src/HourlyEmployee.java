public class HourlyEmployee extends Employee{
       
	
	public double hourlyRate;
	public int hourWorked;
	
	public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourWorked) {
		super(name, id, designation);
		this.hourlyRate = hourlyRate;
		this.hourWorked = hourWorked;
	}
	
	@Override
	public int  increaseSalary(double amt) {
		int i=0;
		if(amt>0) {
		hourlyRate+=amt;
		i=1;
		}
		return i;
	}

	@Override
	public double getSalary() {
		return hourlyRate*hourWorked;
	}
	
//	@Override
//	public void display() {
//		super.display();
//        System.out.println("Rate :["+hourlyRate+"]");
//	
//	}
	@Override
	public String toString() {
		return "[ "+name+" ] [ "+id+" ] ["+designation+" ] [ "+hourlyRate+" ] [ "+hourWorked+" ] [ "+hourlyRate*hourWorked+" ]";
	}

	
}
