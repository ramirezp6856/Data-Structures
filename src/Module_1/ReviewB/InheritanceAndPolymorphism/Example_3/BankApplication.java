package Module_1.ReviewB.InheritanceAndPolymorphism.Example_3;

import java.util.Random;

import javax.swing.JOptionPane;

public class BankApplication {

	public static void main(String[] args){
		/*assumptions:
		* the bank can contain maximum of 200 accounts
		*
		*/
		Bank bank = createBank(); 
		String menu = "1- Add an account \n2-Deposit \n3-Withdrawal \n4-Remove Account \n5-Display account \n6-Display Accounts \n7-Exit.";
		int choice = 0; 
		do{
			choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(choice){
			case 1: 
				if(bank.addAccount(createAccount()))
					JOptionPane.showMessageDialog(null, "successfully added the account"); 
				else
					JOptionPane.showMessageDialog(null, "not enough space left to add an account"); 
				break;
			case 2:
				int accNum = Integer.parseInt(JOptionPane.showInputDialog("enter account number"));
				double deposit = Double.parseDouble(JOptionPane.showInputDialog("enter the deposit amount")); 
				Account acc = bank.getAccount(accNum);
				if(acc==null || !acc.deposit(deposit)) JOptionPane.showMessageDialog(null, "deposit is unsuccessful."); 
				else JOptionPane.showMessageDialog(null, "deposit is successful.");
				break;
			case 3: 
				accNum = Integer.parseInt(JOptionPane.showInputDialog("enter account number"));
				double withdraw = Double.parseDouble(JOptionPane.showInputDialog("enter the withdrawal amount")); 
				acc = bank.getAccount(accNum);
				if(acc==null || !acc.withdraw(withdraw)) JOptionPane.showMessageDialog(null, "withdrawal is unsuccessful."); 
				else JOptionPane.showMessageDialog(null, "withdrawal is successful!");
				break;
			case 4: 
				accNum = Integer.parseInt(JOptionPane.showInputDialog("enter account number"));
				if(bank.removeAccount(bank.getAccount(accNum)))
					JOptionPane.showMessageDialog(null, "account removed."); 
				else
					JOptionPane.showMessageDialog(null, "account could not be removed.");
				break;
			case 5:
				accNum = Integer.parseInt(JOptionPane.showInputDialog("enter account number"));
				acc = bank.getAccount(accNum);
				JOptionPane.showMessageDialog(null, acc); 
				break; 
			case 6:
				JOptionPane.showMessageDialog(null, bank);
				break; 
			case 7:
				System.exit(0);
			default: 
				JOptionPane.showMessageDialog(null, "This option is not supported. Please enter a different number.");
			}
			
			
		}while(JOptionPane.showConfirmDialog(null, "continue?") == JOptionPane.YES_OPTION);
	}
	
	
	public static Bank createBank(){
		String name  = JOptionPane.showInputDialog("enter the bank's name"); 
		Bank b = new Bank(name); 
		return b;
	}
	
	
	/*
	 * Comments: the following method create an account.
	 */
	
	public static Account createAccount(){
		Random r = new Random();
		int accountNum = r.nextInt(200); 
		Account acc = new Account(accountNum);
		acc.deposit(Double.parseDouble(JOptionPane.showInputDialog("enter the deposit amount for account number "+ accountNum)));
		return acc;
	}
}
