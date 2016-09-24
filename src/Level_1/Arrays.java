package Level_1;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1 ,0 , 2, 4};
		change(arr[1]);
		for(int i:arr)
			System.out.println(i);
	}

	
	public static void change(int a){ //call by value
		a = 3;
	}
}
