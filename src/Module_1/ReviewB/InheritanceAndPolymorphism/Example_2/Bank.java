package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;


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
		
		int emp =0,clients=0;
		for (int i=0; i<pnum ; i++ ){
			if(people[i]!=null && people[i] instanceof Client)
				clients++; 
			else if(people[i]!=null && people[i] instanceof Employee)
				emp++;
		}
		return "bank: " + name +"," + "accounts: \n"+ accString + "\nNumber of employees: "
				+ emp + "\nNumber of clients: " + clients;  
	}
	
	public boolean addPerson(Person p){
		if(pnum >= PMAX) return false;
		people[pnum++] = p; 
		return true;
	}
	
	public Employee getService(){
		for(int i=0;i<pnum; i++){
			if(people[i]!=null && people[i] instanceof Employee && ((Employee)people[i]).isAvailable())
				return (Employee)people[i]; 
		}
		return null;
	}
	
	
	public Client getClient(String name){
		for(int i=0;i<pnum; i++){
			if(people[i]!=null && people[i] instanceof Client && ((Client)people[i]).getName().equals(name))
				return (Client)people[i]; 
		}
		return null;
	}

}
