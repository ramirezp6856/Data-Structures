package Module_1.ReviewB.InheritanceAndPolymorphism.Example_1;

public class Programmer extends Employee{

	public Programmer(double s){
		super(s);
	}
	
	public double getPromotion(){
		return baseSal+baseSal*.2; 
	}
}
