import java.io.Serializable;
import java.util.ArrayList;

public class UapCse implements Serializable{
       ArrayList<Employee> employees=new ArrayList<Employee>();
       
       public void addNewEmployee(Employee e){
    	   employees.add(e);
       }
       
      public Employee addNewEmployee(String n, String i, String d, double s) {
    	   Employee e=new SalariedEmployee(n,i,d,s);
    	   addNewEmployee(e);  	   
    	   return e;
       }
       
       public Employee addNewEmployee(String n, String i, String d, double hr, int hw){
    	   Employee e=new HourlyEmployee(n,i,d,hr,hw);
    	   addNewEmployee(e);
    	   return e;
       }
       
      public Employee addNewEmployee(String n, String i, String d, double p, double s){
    	Employee e= new CommissionEmployee(n,i,d,p,s);
    	 addNewEmployee(e);
    	 return e;
      }
      
      public Employee findEmployee(String id){
    	  int i=0;
    	  boolean b=false;
    	  try {
    	  
    	  
    	  
    	  for(i=0;i<employees.size();i++){
    		  if(employees.get(i).id.equals(id)){
    			  b=true;
    			  break;
    		  }
    	  }
    	  }catch(Exception e) {
    		  
    	  }
    	  if(b==true)
    		  return employees.get(i);
    	  else
    		  return null;
    	  
    	 	  
      }
      
      public int increaseSalary(String id, double amt){
    	  Employee e=findEmployee(id);
    	  int i=0;
    	  if(e!=null) {
    	     i=e.increaseSalary(amt);
    	  }
    	  return i;
      }
      
      public double getSalary(String id){
    	  Employee e=findEmployee(id);
    	  if(e!=null) {
            return e.getSalary();
    	  }
    	  else
    		  return -1;
    	  
    	  
      }
//      public void display() {
//    	  int i;
//    	  for(i=0;i<employees.length;i++){
//    		  if(employees[i]!=null){
//    			  employees[i].display();
//    		  }
//    		  else
//    			  break;
//    	  }
//      }

	@Override
	public String toString() {
		return employees.toString();
	}

	
	
	
}
