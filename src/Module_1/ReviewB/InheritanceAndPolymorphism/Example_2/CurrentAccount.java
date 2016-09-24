package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;

public class CurrentAccount extends Account{
	
	private double overdraftLimit; 
	
	public CurrentAccount(int accNumber){ 
		super(accNumber);
	}

	public void setOverdraftLimit(double o){
		overdraftLimit = o;
	}
	
	public String toString(){
		return super.toString()+ " ,overdraft limit: $" + overdraftLimit;  
	}
}
