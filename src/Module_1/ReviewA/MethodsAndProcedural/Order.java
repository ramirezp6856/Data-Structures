package Module_1.ReviewA.MethodsAndProcedural;

import java.text.NumberFormat;

public class Order {
	private String customer; 
	private String type; 
	private int hours;
	private double cost; 
	
	public Order(){}
	
	public Order(String customer, String type, int hour){
		this.customer = customer; 
		this.type = type; 
		hours = hour; 
		cost = 50 + 20;
		cost = calculateCost(hours, type);
	}
	
	public double getCost(){
		return cost; 
	}
	
	
	public static Order makeCopy(Order o){
		Order newCopy = new Order();
		newCopy.customer =o.customer; 
		newCopy.cost = o.cost;
		newCopy.hours = o.hours; 
		newCopy.type = o.type; 
		return newCopy; 
		
	}
	
	public double calculateCost(int h, String type){
		double c= cost; 
		if (h>1 && type.equals("pl")) c+= h*30; 
		else if(h>1 && type.equals("hc")) c+= h*40; 
		else if (h>1 && type.equals("pc")) c+= h*50; 
		return c;
	}
	
	public String toString(){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2); 
		
		return String.format("%s %s %d %s", customer , type, hours,"$"+
		number.format(cost) ); 
	}
	
	public void setCustomer(String c){
		customer = c;
	}
	
	public String getCustomer(){
		return customer;
	}
}