	package Module_4.Activity_4;

import javax.swing.JOptionPane;

/*
 * For Activity4, implement an insertion sort to sort a linked list.
 * For testing, use input 4 1 3 0 , the output should be 0 1 3 4.
 */
public class NodeTester {
	public static void main(String args[]) {
		int option = 0 , newVal;
		
		//Assumption: The beginning of the list does not carry a specific data.
		Node unsortedList=new Node(0, null);
		Node beg = unsortedList; 
		
		do{
			option = Integer.parseInt(JOptionPane.showInputDialog("" +
					"To add Press 1\nTo sort Press 2 \nEnter 3 to exit."));
			switch (option){
				case 1:
					newVal = Integer.parseInt(JOptionPane.showInputDialog(
							"Enter an integer to add"));
					unsortedList = addToList(newVal, unsortedList);
					break;
					
				case 2:
					//printing unsorted list
					System.out.print("Unsorted List: ");
					print(beg);
					
					//in-place sort list
					bubbleSort(unsortedList,beg);
					//printing the sorted-merged list
					System.out.print("\nSorted list: ");
					print(beg);
					break;
				case 3:
					System.exit(0);
				
			}
			
		}while (option!=3);
	}
	
	/**
	 * Adds to the end of the input list.
	 * @param val
	 * @param list
	 */
	public static Node addToList(int val , Node list){
		list.setNext(new Node(val, null));
		list = list.getNext();
		return list;
	}
	
	/**
	 * Prints the entire List starting from the beginning.
	 * @param list
	 */
	public static void print(Node beg){	
		Node current = beg.getNext();
		while(current!=null){
			System.out.print(current.getVal() +">");
			current= current.getNext();
		}
	}
	
	
	public static Node bubbleSort(Node list , Node beg){
		int size = list.getSize(); 
		Node current, next; 
		if (size==0) //the list empty.
			return null;
		if(size==1) //one element in the list
			return list; 
		
		for(int i=1; i<=size; i++){
			current = beg.getNext(); 
			next = current.getNext(); 
			
			do{
				if(current.getVal() > next.getVal()){
					//swap operation
					int temp = current.getVal(); 
					current.setVal(next.getVal()); 
					next.setVal(temp);
				}
				current = next; 
				next = current.getNext(); 
			}while(current.hasNext());
		}
		
		return list;
	}
	
	
	public static Node insertionSort(Node list , Node beg){
		//TODO
		return null;
	}

}
