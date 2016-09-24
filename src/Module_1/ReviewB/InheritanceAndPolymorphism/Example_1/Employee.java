package Module_1.ReviewB.InheritanceAndPolymorphism.Example_1;

public class Employee {
	double baseSal; 
	
	public Employee(double bsal){
		baseSal = bsal;
	}
	
	
	public String toString(){
		if(this instanceof Director)
			return "Salary: " + ((Director)this).getPromotion();
		else
			return "Salary: " + ((Programmer)this).getPromotion();
	}
	
}