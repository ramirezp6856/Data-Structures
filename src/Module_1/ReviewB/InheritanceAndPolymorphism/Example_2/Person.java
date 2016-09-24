package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;

public class Person {
	private String name; 
	
	public Person(String name){
		this.name = name; 
	}
	
	public String getName(){
		return name;
	}

	
	public String toString(){
		return String.format("name: %s", name);
	}
	
	public boolean makeDeposit(double d , Account account) {
		return account.deposit(d); 
	}
	
	public boolean makeWithdrawal(double w, Account account){
		return account.withdraw(w);
	}

}
