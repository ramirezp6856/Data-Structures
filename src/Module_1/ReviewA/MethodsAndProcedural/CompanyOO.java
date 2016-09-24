package Module_1.ReviewA.MethodsAndProcedural;

//a class is a template.
public class CompanyOO {
	
	//instance variables.
	public static final int MAX_ORDERS = 200; 
	private String name;
	private Order[] orders; 
	private int num = 0; 
	
	public CompanyOO(String name){
		//special purpose constructor.
		//this object overcomes the shadowing problem. 
		this.name = name; 
		orders = new Order[MAX_ORDERS];
	}
	
	
	public boolean addOrder(Order o){
		if(num >= MAX_ORDERS -1) return false;
		orders[num++] = o; 
		return true;
	}
	
	//instance methods, validators, etc.
	
	public String toString(){
		String orderString = ""; 
		for(int i = 0; i< num; i++){
			try{
			orderString = orderString + orders[i].toString() + "\n"; 
			}
			catch(NullPointerException e){
				e.printStackTrace();
			}
		}
		return String.format("%s", name) + "\n Orders: \n" + orderString ; 
	}
}