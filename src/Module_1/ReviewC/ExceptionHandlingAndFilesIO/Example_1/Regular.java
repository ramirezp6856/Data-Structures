package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_1;

public class Regular  extends Employee{

	private static final double PRATE = 0.01;
	
	public Regular(double ID, Address address) {
		super(ID, address);
		// TODO Auto-generated constructor stub
	}
	
	//method overriding
	public double getPromotionalMonthlySalary() {
		monthlySal += PRATE*monthlySal; 	
		return monthlySal; 
	}
		

}
