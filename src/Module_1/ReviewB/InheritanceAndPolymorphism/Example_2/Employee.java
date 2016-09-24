package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;

public class Employee extends Person{
	private double annualSalary;
	private int startYear;
	private String nationalInsurance; 
	private static Bank bank; 
	private boolean isBusy; 
	
	public Employee(String name) {
		super(name);
		isBusy=false;
	}
	
	public boolean isAvailable(){
		if (isBusy) return false; 
		else {
			isBusy=true;
			return true;
		}
	}
	
	
	public void setBank(Bank bank){
		this.bank = bank;
	}
	
	public boolean setAnnualSalary(double sal){
		if(sal <=0 || sal > 200000) return false;
		annualSalary = sal;
		return true;
	}
	
	public double getAnnualSalary(){
		return annualSalary;
	}
	
	public boolean setStartYear(int year){
		if(year<= 0) return false; 
		startYear = year;
		return true;
	}
	
	public int getStartYear(){
		return startYear;
	}
	
	public void setNationalInsuranceNumber(String n){
		nationalInsurance = n;
	}
	
	public String getNationalInsuranceNumber(){
		return nationalInsurance;
	}
	
	public boolean addingAccount(Account a){
		return bank.addAccount(a);
	}
	
	public Account getAccount(int accnum){
		return bank.getAccount(accnum);
	}
	
	public boolean removingAccount(int accnum) {
		return bank.removeAccount(bank.getAccount(accnum));
	}
}
