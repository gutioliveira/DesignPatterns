
public class App {

	public static void main(String[] args) {
		
		Employee developer = new Employee(1000.0, new DeveloperSalary());
		
		Employee manager = new Employee(1000.0, new ManagerSalary());
		
		System.out.println("Developer salary: "+ developer.getSalary());
		System.out.println("Manager salary: "+ manager.getSalary());
	}
}
