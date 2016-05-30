
public class Employee {
	
	private double salary;
	private Taxes taxes;
	
	public Employee(double salary, Taxes taxes){
		
		this.taxes = taxes;
		this.salary = this.taxes.calculateSalaryWithTaxes(salary);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Taxes getTaxes() {
		return taxes;
	}

	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}
}
