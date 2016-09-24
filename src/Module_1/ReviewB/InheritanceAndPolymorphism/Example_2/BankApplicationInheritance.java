package Module_1.ReviewB.InheritanceAndPolymorphism.Example_2;


import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class BankApplicationInheritance {
	
	public static void main(String[] args){
		Bank b = new Bank("Bank 306");
		String menu = "Welcome to Bank 306\n" +
				"1-add Employee\n" +
				"2-add Client\n" +
				"3-display\n" +
				"4-bank service\n" +
				"5-self service\n" +
				"6-exit"; 
		int choice = 0; 
		do{
			choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(choice){
			case 1:
				//add employee
				Employee employee =getEmployee(); 
				employee.setBank(b);
				if(b.addPerson(employee)) JOptionPane.showMessageDialog(null, "successful!");
				else JOptionPane.showMessageDialog(null, "Error!");
				break;
			case 2:
				//add client
				Client client= getClient(); 
				client.setBank(b);
				Account account = getAccount();
				//set the agent to help
				Employee agent = b.getService(); 
				if (agent == null){
					JOptionPane.showMessageDialog(null, "currently all of our agents are busy. Please try again later.");
				}
				client.setServiceAgent(agent);
				client.setAccount(account);
				b.addPerson(client);
				break;
			case 3:
				//display
				JOptionPane.showMessageDialog(null, b.toString());
				break;
			case 4:
				//bank service
				//find an available employee to help
				Employee emp = b.getService(); 
				int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number")); 
				Account  acc = b.getAccount(accountNumber);
				String task = JOptionPane.showInputDialog("deposit or withdrawal?"); 
				if(task.equals("deposit")){
					while(!emp.makeDeposit(Double.parseDouble(JOptionPane.showInputDialog("enter an amount to deposit")), acc))
						JOptionPane.showMessageDialog(null, "invalid amount!please try again.");
				}
				else if(task.equals("withdrawal")){
					while(!emp.makeWithdrawal(Double.parseDouble(JOptionPane.showInputDialog("enter an amount to withdraw")), acc)){
						JOptionPane.showMessageDialog(null, "invalid amount!please try again.");
					}
				}
				break;
			case 5:
				//self service
				accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number")); 
				acc = b.getAccount(accountNumber);
				client = b.getClient(JOptionPane.showInputDialog("enter client's name"));
				task = JOptionPane.showInputDialog("deposit or withdrawal?"); 
				if(task.equals("deposit")){
					while(!client.makeDeposit(Double.parseDouble(JOptionPane.showInputDialog("enter an amount to deposit")), acc))
						JOptionPane.showMessageDialog(null, "invalid amount!please try again.");
				}
				else if(task.equals("withdrawal")){
					while(!client.makeWithdrawal(Double.parseDouble(JOptionPane.showInputDialog("enter an amount to withdraw")), acc)){
						JOptionPane.showMessageDialog(null, "invalid amount!please try again.");
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "invalid input"); 
				break;
			}
			
		}while (choice!=6);
		
	}
	
	
	public static Employee getEmployee(){
		String name = JOptionPane.showInputDialog("Enter employee name");
		Employee emp = new Employee(name);
		while(!emp.setAnnualSalary(Double.parseDouble(JOptionPane.showInputDialog("Enter annual salary.")))){
			JOptionPane.showMessageDialog(null, "The amount you entered is not valid. Please try again.");
		}
		
		while(!emp.setStartYear(Integer.parseInt(JOptionPane.showInputDialog("Enter start year.")))){
			JOptionPane.showMessageDialog(null, "The start year is invalid. Please try again.");
		}
		
		Random r = new Random(); 
		String number = new StringBuilder(r.nextInt(200)).toString();
		emp.setNationalInsuranceNumber(number);
		return emp;
	}
	
	
	public static Client getClient(){
		String name= JOptionPane.showInputDialog("Enter client name");
		Client client = new Client(name); 
		return client;
	}
	
	public static Account getAccount(){
		Account account = new Account(Integer.parseInt(JOptionPane.showInputDialog("Choose an account number")));
		while(!account.deposit(Double.parseDouble(JOptionPane.showInputDialog("Enter an amount to deposit")))){
			JOptionPane.showMessageDialog(null, "This amount is not valid. Please try again.");
		}
		return account;
	}

}
