package Module_1.Activity_1.Solution;

public class SalesPerson {
	private String name;
	private double salary;
	private SoftwareSystem[] soldSystems;
	private int count;
	private static final int MAX = 1000;
	
	public SalesPerson(String name, double salary){
		this.name  = name;
		this.salary = (salary > 0) ?salary :-1;
		soldSystems = new SoftwareSystem[MAX]; 
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public boolean setSal(double salary){
		if(salary<0) return false;
		this.salary = salary;
		return true;
	}
	
	public boolean sellSystem(SoftwareSystem s){
		if(count >= soldSystems.length) return false;
		soldSystems[count++] = s;
		return true;
	}
	
	public double getTotalSold(){
		//sum of the cost of all sold systems
		double total=0;
		for(SoftwareSystem s: soldSystems)
			if(s!=null){
				total+=s.getCost(); 
			}
		return total;
	}
	
	public String toString(){
		String out="Name: " + name + "\nSalary: " + salary+
				"\nSold Systems: ";

		String soldSys="";
		for(int i=0;i<count;i++){
			soldSys+=soldSystems[i].toString() + "; ";
		}
		
		return out+soldSys; 
	}

}



