package Module_3.Recursion.Example_5.BinaryRecursion.HanoiTower;

import java.util.Stack;

public class BinaryRecursiveHanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> source = new Stack<Integer>(); 
		Stack<Integer> destination = new Stack<Integer>(); 
		Stack<Integer> temp = new Stack<Integer>(); 
		Stack<Integer> sourceCpy = new Stack<Integer>(); 
		
		for (int i=4; i>=1; i--){
			source.add(i); 
		}
		
		sourceCpy = (Stack<Integer>) source.clone();
		
		System.out.println("Source:");
		while(!sourceCpy.isEmpty())
			System.out.println(sourceCpy.pop() ); 
		
		hanoi(4,source,temp, destination);
		
		System.out.println("Destination:");
		while(!destination.isEmpty())
			System.out.println(destination.pop() ); 
	}
	
	
	//Tansfer the content of source to dest preserving the order.
	//n is the number of elements in source.
	public static void hanoi(int n, Stack<Integer> source , Stack<Integer> temp
			, Stack<Integer> dest){
		if(n<=0 || source.isEmpty()) 
			return;
		if(n==1){ //move that element from source to dest
			dest.push(source.pop());
		}
		else{
			hanoi(n-1 , source,dest , temp);
			if(!source.isEmpty())	
				dest.push(source.pop());
			else return; //Error
			hanoi(n-1 , temp , source, dest);
		}
		
	}

}
