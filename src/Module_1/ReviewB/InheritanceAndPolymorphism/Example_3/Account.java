package Module_1.ReviewB.InheritanceAndPolymorphism.Example_3;


/**
A class for bank accounts.

This class provides the basic functionality of accounts.
It allows deposits and withdrawals but not overdraft
limits or interest rates.   
*/

public class Account
{
	private double bal;  //The current balance
	private int accnum;  //The account number
 
 
 public Account(int accountNumber)
 {    
	bal=0.0;
	accnum=accountNumber;
 }
 
 public int getAccountNum(){
	 return accnum; 
 }

 
 public boolean deposit(double sum)
 {
	if (sum>0){
	    bal+=sum;
	    return true;
	}
	else{
	    System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
	    return false;
	}
 }
 
 public boolean withdraw(double sum)
 {
	if (sum > 0 && sum < bal){
	    bal-=sum;  
	    return true;
	}
	else{
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");   
	    return false;
	}
 }
 
 public double getBalance()
 {
	return bal;
 }
 
 
 public String toString()
 {
	return "Acc " + accnum + ": " + "balance = " + bal;   
//	return String.format("%d %f", accnum , bal);
 }
 
 public final void print()
 {
	//Don't override this,
	//override the toString method
	System.out.println( this );    
 }
 
}
