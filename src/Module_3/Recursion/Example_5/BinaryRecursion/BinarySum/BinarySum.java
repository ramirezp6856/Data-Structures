package Module_3.Recursion.Example_5.BinaryRecursion.BinarySum;

public class BinarySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,3};
		System.out.println(binarySum(data, 0, data.length-1));
	}
	
	
	public static int binarySum(int[] data , int low, int high){
		if(low == high) return data[low];
		if(low > high) return 0;
		
		int mid = (low+high)/2; 
		return binarySum(data , low, mid) + binarySum(data,mid+1, high);
	}

}
