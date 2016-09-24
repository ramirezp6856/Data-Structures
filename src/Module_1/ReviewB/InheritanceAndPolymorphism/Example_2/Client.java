package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;

import javax.swing.JOptionPane;

public class Client extends Person{
	
	private Account account; 
	private Employee serviceAgent; 
	private Bank bank; 
	
	public Client (String name) {
		 super(name);
	}
	
	public void setServiceAgent(Employee employee){
		serviceAgent = employee;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setBank(Bank b){
		bank = b;
	}
	
	public boolean setAccount(Account acc){
		if (serviceAgent==null) JOptionPane.showMessageDialog(null, "Please ask for bank service");
		serviceAgent.setBank(bank);
		serviceAgent.addingAccount(acc);
		account = acc; 
		return true;
	}
}
