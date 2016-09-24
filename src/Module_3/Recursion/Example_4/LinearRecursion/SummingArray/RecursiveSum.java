package Module_3.Recursion.Example_4.LinearRecursion.SummingArray;

public class RecursiveSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(linearSum(arr, arr.length));
	}
	
	public static int linearSum(int[] arr , int n) {
		 if(n==0) 
			 return 0;
		 return arr[n-1] + linearSum(arr , n-1); 
	}
	
}
