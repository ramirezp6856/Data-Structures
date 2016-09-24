package Module_1.ReviewB.InheritanceAndPolymorphism.Example_3;

public class Person {
	private String name; 
	private Account account; 
	
	public Person(String name){
		this.name = name; 
	}
	
	public String getName(){
		return name;
	}
	
	public void setAccount(Account acc){
		account = acc; 
	}
	
	public Account getAccount() {
		return account;
	}
	
	public String toString(){
		return String.format("name: %s", name);
	}
	
	public boolean makeDeposit(double d) {
		return account.deposit(d); 
	}
	
	public boolean makeWithdrawal(double w){
		return account.withdraw(w);
	}

}