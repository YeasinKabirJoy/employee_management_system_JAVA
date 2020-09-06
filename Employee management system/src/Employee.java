import java.io.Serializable;

public abstract class Employee implements Serializable{
	public String name;
	public String id ;
	public String designation;
	
	
	public Employee(String name, String id, String designation) {
		this.name = name;
		this.id = id;
		this.designation = designation;
		
	}
	
	public int increaseSalary(double amt){
		
		return 0;
	}
	
	public double getSalary()
	{
		return 0;
	}
//	public void display()
//	{
//		System.out.print("Name: ["+name+"]; Id :["+id+"]; Desig: ["+designation+"]; ");
//	}

	@Override
	public String toString() {
		
		return "Name: ["+name+"]; Id :["+id+"]; Desig: ["+designation+"]; ";
	}

	
	
	

}
