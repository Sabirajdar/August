/*Q2. Write a java program to create pojo class name as Employee with a 
		following properties like as id, name, email, salary to perform 
		following operations using Arraylist : 
		Case 1: Add 5 Records Of Employee.
		Case 2: Display All Employee Details.
		Case 3: Update Employee Record By Name.
		Case 4: Delete Employee Record By salary.
		Case 5: Search Employee Record By Id.
*/
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private String email;
	private int salary;
	
	public Employee(int id, String name, String email, int salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class EmployeeArrayList
{
	public static void main(String x[])
	{
		ArrayList<Employee> emp=new ArrayList<>();
		do
		{
			Scanner xyz=new Scanner(System.in);
			System.out.println("Case 1: Add 5 Records Of Employee.");
			System.out.println("Case 2: Display All Employee Details.");
			System.out.println("Case 3: Update Employee Record By Name.");
			System.out.println("Case 4: Delete Employee Record By salary.");
			System.out.println("Case 5: Search Employee Record By Id.");
			
			System.out.println("Enter your choice");
			int choice=xyz.nextInt();
			switch(choice)
			{
				case 1:
						for(int i=0;i<3;i++)
						{
							System.out.println("Enter id");
							int id=xyz.nextInt();
							xyz.nextLine();
							System.out.println("Enter name");
							String name=xyz.nextLine();
							System.out.println("Enter email");
							String email=xyz.nextLine();
							System.out.println("Enter salary");
							int salary=xyz.nextInt();
						
							emp.add(new Employee(id,name,email,salary));
						}
						
				break;
				case 2:
						System.out.println("Display Details");
						for(Employee e:emp)
						{
							System.out.println("Id:"+e.getId()+"\t"+"Name: "+e.getName()+"\t"+"Email: "+e.getEmail()+"\t"+"Salary:"+e.getSalary());
						}
				break;
				case 3:
							xyz.nextLine();
						System.out.println("Enter name for update");
						String upname=xyz.nextLine();
						
						for(Employee e:emp)
						{
							if(e.getName().equals(upname))
							{
								System.out.println("Enter updated email id");
								String email=xyz.nextLine();
								e.setEmail(email);
								System.out.println("Enter updated salary");
								int salary=xyz.nextInt();
								e.setSalary(salary);
								xyz.nextLine();
								System.out.println("Employee Details Updated Successfully....");
							}
						}
				break;
				case 4:
						System.out.println("Enter salary for delete records");
						int delsalary=xyz.nextInt();
						
						Iterator<Employee>itr=emp.iterator();
						while(itr.hasNext())
						{
							Employee e=itr.next();
							if(e.getSalary()==delsalary)
							{
								itr.remove();
							}
						}
						System.out.println("Deleted records successfully...");
	
				break;
				case 5:
						System.out.println("Enter search id");
						int sid=xyz.nextInt();
						boolean found=false;
						for(Employee e:emp)
						{
							
							if(e.getId()==sid)
							{
								System.out.println("Employee found: ");
							System.out.println("Id:"+e.getId()+"\t"+"Name: "+e.getName()+"\t"+"Email: "+e.getEmail()+"\t"+"Salary:"+e.getSalary());
							}
							found=true;
						}
						if(!found)
						{
							System.out.println("Id  is not found");
						}
				break;
			}
			
		}while(true);
	}
}