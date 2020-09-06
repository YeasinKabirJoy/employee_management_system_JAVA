import java.util.Scanner;
public class UAP {

	public static void main1(String[] args) {
		UapCse cse=new UapCse();
		Scanner scan=new Scanner(System.in);		
			int option;
			
			do {
				
				System.out.println("Input ‘1’ to add a new Employee.");
				System.out.println("Input ‘2’ to get Salary info of a specific Employee.");
				System.out.println("Input ‘3’ to increase the salary of an Employee.");
				System.out.println("Input ‘4’ to display the list of the Employees.");
				System.out.println("Input ‘0’ to exit the system.");
				
				System.out.println("Enter your choice");
				 option=scan.nextInt();
			
			switch(option){
			
			        case 0:{
			        	break;
			        }
				
					case 1:{
						int op;
							System.out.println("Input ‘1’ to add Salaried Employee");
							System.out.println("Input ‘2’ to add Hourly Employee");
							System.out.println("Input ‘3’ to add  Commission Employee");
							op=scan.nextInt();
							
						switch(op) {
						
						case 1:{
							scan.nextLine();
							System.out.println("Enter Employee Name ,Id,Designation And Monthly Salary");
							String name=scan.nextLine();
							String id=scan.nextLine();
							String desig=scan.nextLine();
							double salary=scan.nextDouble();
							cse.addNewEmployee(name, id, desig, salary);
							break;
						}
						
						case 2:{
							scan.nextLine();
							System.out.println("Enter Employee Name ,Id,Designation,Hourly Rate And Hour Workrd");
							String name=scan.nextLine();
							String id=scan.nextLine();
							String desig=scan.nextLine();
							double hr=scan.nextDouble();
							int hw=scan.nextInt();
							cse.addNewEmployee(name, id, desig, hr, hw);
							break;
						}
						case 3:{
							scan.nextLine();
							System.out.println("Enter Employee Name ,Id,Designation,Commission And Sale");
							String name=scan.nextLine();
							String id=scan.nextLine();
							String desig=scan.nextLine();
							double p=scan.nextDouble();
							double s=scan.nextDouble();
							cse.addNewEmployee(name, id, desig, p, s);
							break;
					}
						}
						break;
						
						}
					
					
					case 2:{
						System.out.println("Enter the Id of the Employee");
						String id=scan.next();
						System.out.println(cse.getSalary(id));
						break;
					}
					
					case 3:{
						System.out.println("Enter the Id of the Employee");
						String id=scan.next();
						System.out.println("Enter the Amount");
						double amt=scan.nextDouble();
						cse.increaseSalary(id,amt);
						break;
					}
					
					case 4:{
						//cse.display();
						break;
					}
						
					}
			}while(option!=0);
			
			}
			
		}	

