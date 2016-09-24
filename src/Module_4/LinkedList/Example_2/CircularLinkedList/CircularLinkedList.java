package Module_4.LinkedList.Example_2.CircularLinkedList;


public class CircularLinkedList {
	private LNode head; 
	private LNode tail; 
	private int size; 
	
	
	public CircularLinkedList(){
		head= null; 
		tail = null; 
		size =0;
	}
	
	public void addToHead(LNode newNode){
		//adding to head:
		if(head==null){
			head = newNode; 
			tail = head;
		}
		else{
			//update head
			newNode.setNext(head); 
			tail.setNext(newNode); 
			head = newNode; 
		}
		size++; 
	}
	
	
	public void addToTail(LNode newNode){
		if(tail==null){
			tail = newNode; 
			head= tail; 
		}
		else{
			//update tail
			tail.setNext(newNode);
			newNode.setNext(head);
			tail = newNode;
		}
		size++;
	}
	
	
	public String display(){
		String out=""; 
		if (head==null) return null;
		LNode current = head; 
		do{
			out+=current.getData() +",";
			if (current==tail) break;
			current = current.getNext(); 
		}while(current!=null);
		return out;
	}
	
	public boolean isEmpty(){ return (head==null ? true : false); }
	public int getSize() { return size; }
	
}
