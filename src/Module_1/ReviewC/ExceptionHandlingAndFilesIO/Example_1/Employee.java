package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_1;

public class Employee {
	double id;
	String name; 
	double monthlySal; 
	Address address; 
	
	
	public Employee(double ID, Address addr){
		this.id = ID; 
		this.address = addr; 
	}
	
	public void setName(String s){
		this.name = s;
	}
	
	public void setAddress(Address addr){
		this.address = addr; 
	}
	
	public void setMonthlySalary(double sal){
		this.monthlySal = sal; 
	}
	
	public double getPromotionalMonthlySalary() {return 0.0; }
	
	public String toString(){
		return String.format("id: %f; name: %s; address: %s; salary: %f \n",id,name,address,getPromotionalMonthlySalary()); 
	}
	
}
