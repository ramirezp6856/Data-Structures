package Module_4.LinkedList.Example_1;

public class LNode {
	
	Integer data;
	LNode link;
	
	
	public LNode(Integer data , LNode link){
		this.data = data; 
		this.link = link; 
	}
	
	public Integer getData() {
		return this.data; 
	}
	
	public LNode getNext(){
		return this.link; 
	}
	
	public void setNext(LNode link){
		this.link = link; 
	}
	
	public void setData(Integer data){
		this.data = data; 
	}
	
	
	public boolean hasNext(){
		if (link ==null ) return false;
		else return true;
	}


}
