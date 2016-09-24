package Module_1.ReviewA.MethodsAndProcedural;

import javax.swing.JOptionPane;

public class CompanyOOApplication {
	
	public static void main(String[] args){
		String companyName = JOptionPane.showInputDialog("Enter company's name"); 
		String menu = "1- Add order \n2- Display orders \n3-Exit."; 
		int choice = 0 ; 
		CompanyOO comp = new CompanyOO(companyName);
		
		do{
			choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(choice){
			case 1: 
				Order newOrder = new Order(JOptionPane.showInputDialog("enter customer name"), 
						JOptionPane.showInputDialog("Enter service type"), Integer.parseInt(JOptionPane.showInputDialog("Enter hours of service"))); 
				if (comp.addOrder(newOrder)) JOptionPane.showMessageDialog(null, "successfully added the order"); 
				else JOptionPane.showMessageDialog(null, "no more orders can be added!");
				break; 
			case 2:
				JOptionPane.showMessageDialog(null, comp.toString()); 
				break; 
			case 3:
				System.exit(0); 
			}
		}while(JOptionPane.showConfirmDialog(null, "Continue using the system?")==JOptionPane.YES_OPTION);
	}

}