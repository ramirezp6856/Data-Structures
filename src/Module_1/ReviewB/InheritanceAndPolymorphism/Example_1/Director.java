package Module_1.ReviewB.InheritanceAndPolymorphism.Example_1;

public class Director extends Employee{
	
	public Director(double s){
		super(s);
	}
	
	public double getPromotion(){
		return baseSal+baseSal*.5; 
	}
}