package Module_4.Activity_4;

import javax.swing.JOptionPane;

public class NodeTester_b {

	public static void main(String args[]) {
		int option = 0 , newVal;
		
		//Assumption: The beginning of the list does not carry a specific data.
		Node beg=new Node(10, null);
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("" +
					"To add Enter 1\nTo print Enter 2 \nEnter 3 to delete \nEnter 4 to exit"));
			switch (option){
				case 1:
					newVal = Integer.parseInt(JOptionPane.showInputDialog(
							"Enter an integer to add"));
					beg = addToBegin(newVal, beg);
					break;
					
				case 2:
					//printing unsorted list
					System.out.print("Unsorted List: ");
					print(beg);
					break;
				case 3:
					//Deleteing
					System.out.print("Deleting: ");
					delete(beg);
					print(beg);
					break;
				case 4:
					System.exit(0);
				
			}
			
		}while (option!=4);
	}
	
	/**
	 * Exercise 1-part-b
	 * Adds to the end of the input list.
	 * @param val
	 * @param list
	 */
	public static Node addToBegin(int val , Node beg){
		Node node = new Node(val, beg);
		beg = node;
		return beg;
	}
	
	/**
	 * Prints the entire List starting from the beginning.
	 * @param list
	 */
	public static void print(Node beg){	
		Node current = beg;
		while(current!=null){
			System.out.print(current.getVal() +">");
			current= current.getNext();
		}
	}

	/**
	 * Exercise 2
	 * @param beg
	 * @return
	 */
	public static Node delete(Node beg){
		Node previous,current;
		current = beg; 
		previous= current; 
		
		if (! beg.hasNext()){
			beg=null;
			return null;
		}
		if(beg==null) return null;
		
		while(current.hasNext()){
			previous = current; 
			current=  current.getNext();
		}
		
		//delete the last node
		previous.setNext(null);
		current=null;
		return beg;
	}
	
}
