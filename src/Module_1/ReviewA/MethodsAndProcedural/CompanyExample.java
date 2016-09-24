package Module_1.ReviewA.MethodsAndProcedural;

import javax.swing.JOptionPane;

public class CompanyExample {

	public static void main(String[] args){
		final int MAX_ORDERS = 200;
		String[] names = new String[MAX_ORDERS];
		String[] orderTypes = new String[MAX_ORDERS];
		int[] orderHours = new int[MAX_ORDERS];
		double[] orderCosts = new double[MAX_ORDERS];
		int num = -1; 
		
		String menu = new String("Enter 1 to add an order \nEnter 2 to display the orders \nEnter 3 to exit.");
		int choice= 0; 
		do{
			choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (choice){
			case 1:
				num++; 
				names[num] = getName();
				orderTypes[num] = getServiceType();
				orderHours[num] = getHour();
				orderCosts[num] = calculateTotalCost(orderHours[num], orderTypes[num]);
				break;
			case 2:
				display(num, names, orderTypes, orderHours, orderCosts);
				break; 
			case 3:
				System.exit(0);
			default: 
				JOptionPane.showMessageDialog(null, "wrong selection. Please re-enter.");
				break;
			}
			
		}while(num < MAX_ORDERS); 
		
	}
	
	public static String getName(){
		return JOptionPane.showInputDialog("Enter customer name");
	}
	
	public static int getHour(){
		return Integer.parseInt(JOptionPane.showInputDialog("Enter hours of service"));
	}
	
	public static String getServiceType(){
		return JOptionPane.showInputDialog("Enter service type (\"pm\" for plumming, \"hc\" for house cleaning, and \"pl\" for pool cleaning. ");
	}
	
	public static double calculateTotalCost(int hour, String type){
		double cost = 50 + 20;
		if (hour<=1) { 
			return cost;
		}
		else{
			if(type.equals("pm")){
				cost+=(hour-1)*20; 
				return cost; 
			}
			
			else if(type.equals("hc")){
				cost+=(hour-1)*40; 
				return cost;
			}
			
			else{
				cost+=(hour-1)*30; 
				return cost;
			}
		}
		
	}
	
	public static void display(int num, String[] names, String[] types, int[] hours, double[] costs){
		String result = "";
		for(int i=0; i<= num; i++){
			result += (i+1)+ "_"+names[i]+","+types[i]+","+hours[i]+","+costs[i]+ ".\n"; 
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	
}