package Module_1.ReviewB.InheritanceAndPolymorphism.Example_3;

public class Bank {
	
	private String name;
	private int num; 
	private int pnum;
	final int MAX = 200; 
	final int PMAX = 300; 
	private Account[] accounts;
	private Person[] people; 

	public Bank(){}
	public Bank(String name){
		this.name = name;
		num = 0; 
		pnum=0;
		accounts = new Account[MAX];
		people = new Person[PMAX];
	}
	
	public boolean addAccount(Account acc){
		if (num >= MAX)
			return false;
		accounts[num++] = acc; 
		return true;
	}
	
	
	public int login(int accNum){
		for(int i=0 ; i< num; i++){
			if(accounts[i] !=null && accounts[i].getAccountNum() == accNum ){
				return i;
			}
			else{
				continue;
			}
		}
		
		return -1;
	}
	
	
	
	public boolean removeAccount(Account a){
		if(num<=0 || a == null) return false; 
		int ix = login(a.getAccountNum()); 
		if(ix==-1) return false;
		else{
			for(int i = ix ; i< num-1; i++){
				accounts[i] = accounts[i+1]; 
			}
			accounts[--num] = null; 
			return true;
		}
	}
	
	public Account getAccount(int accnum){
		int ix = login(accnum); 
		if (ix!=-1) return accounts[ix]; 
		else return null;
	}
	
	public String toString(){
		String accString = ""; 
		for(int i=0 ; i< num; i++){
			accString += accounts[i].toString() + "\n"; 
		}
		return "bank: " + name +"," + "accounts: \n"+ accString; 
	}
	
	public boolean addPerson(Person p){
		if(pnum >= PMAX) return false;
		people[num++] = p; 
		return true;
	}
}
