package Module_3.Recursion.Example_4.LinearRecursion.ReversingSequence;

public class ReverseSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5};
		data = reverseArray(data , 0 , data.length-1);
		for(int i=0;i<data.length; i++) System.out.print(data[i] + ",");
	}

	
	public static int[] reverseArray(int[] data , int low , int high){
		if (low < high){
			int temp = data[low]; 
			data[low] = data[high];
			data[high] = temp; 
			reverseArray(data , low+1 , high-1);
		}
		return data;
	}
	
	
}
