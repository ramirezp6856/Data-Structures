package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;

public class SavingsAccount extends Account{

	/*
	 * Note that the balance of an account may only be modified through the deposit(double) and withdraw(double) methods.
	 * The Account class should not need to be modified at all.
	 * Be sure to test what you have done after each step.
	 */
	private double interest;
	
	public SavingsAccount(int accountNumber) {
		super(accountNumber);
		interest = 0;
		// TODO Auto-generated constructor stub
	}

	public void addInterest(double sum){
		interest+=sum; 
	}
	
	public String toString(){
		return super.toString()+ " \ninterest: "+interest; 
	}

}
