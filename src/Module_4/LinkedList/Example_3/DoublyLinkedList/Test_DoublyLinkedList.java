package Module_4.LinkedList.Example_3.DoublyLinkedList;


public class Test_DoublyLinkedList {

	public static void main(String[] args){
		DoublyLinkedList dlist = new DoublyLinkedList(); 
		dlist.addToHead(new DoublyLNode("1", null, null));
		dlist.addToHead(new DoublyLNode("2", null, null));
		dlist.addToHead(new DoublyLNode("3", null, null));
		dlist.addToHead(new DoublyLNode("4", null, null));
		
		System.out.println(dlist.display());
		dlist.remove("3"); 
		System.out.println(dlist.display());
	}
}
