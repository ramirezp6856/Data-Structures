package Module_3.Recursion.Example_5.BinaryRecursion.Fibonacci;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("fibonacci 0:" + fibonacci(0) + "\n");
		System.out.print("fibonacci 1:" + fibonacci(1) + "\n");
		System.out.print("fibonacci 2:" + fibonacci(2) + "\n");
		System.out.print("fibonacci 3:" + fibonacci(3) + "\n");
		System.out.print("fibonacci 4:" + fibonacci(4) + "\n");
		System.out.print("fibonacci 5:" + fibonacci(5) + "\n");
	}
	
	public static int fibonacci(int n){
		if(n==0) return 0; 
		if(n==1) return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}

}
