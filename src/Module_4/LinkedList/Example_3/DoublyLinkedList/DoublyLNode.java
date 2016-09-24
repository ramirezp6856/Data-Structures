package Module_4.LinkedList.Example_3.DoublyLinkedList;


public class DoublyLNode {

	private String data; 
	private DoublyLNode next;
	private DoublyLNode previous; 
	
	public DoublyLNode (String data, DoublyLNode previous , DoublyLNode next){
		this.data = data;
		this.next = next;
		this.previous = previous; 
	}
	
	public void setPrevious(DoublyLNode previous){
		this.previous = previous; 
	}
	
	public void setNext(DoublyLNode next){
		this.next = next;
	}
	
	public boolean hasNext() { return (next==null ? false : true); }
	
	public boolean hasPrevious() { return (previous==null ? false : true); }
	
	public String getData() { return data;}
	public DoublyLNode getNext() {return next; }
	public DoublyLNode getPrevious() { return previous; }
	
}
