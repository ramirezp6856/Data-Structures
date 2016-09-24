package Module_4.Activity_4;

public class Node{
	private int val; 
	private Node next;
	private static int size; 
	
	public Node(int v , Node n) {
		val = v; 
		next = n;
	}
	
	public boolean hasNext(){
		if (next==null) return false; 
		else return true; 
	}
	
	public void setNext(Node n){
		next = n;
		size++;
	}
	
	public void setVal(int v){
		val = v;
	}
	
	public int getVal(){
		return val;
	}
	
	public Node getNext(){
		return next;
	}
	
	/**
	 * getSize()
	 * @return size of the linkedlist.
	 */
	public int getSize(){
		return size;		
	}
}