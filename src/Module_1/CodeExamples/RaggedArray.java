package Module_1.CodeExamples;

public class RaggedArray {
	
	public static void main(String[] args){
		int[][] array1 = {{1,2,3} , {4} , {5,6,7}};
		
		displayArray(array1);
	}
	
	public static void displayArray(int[][] arr){
		for(int row=0;row<arr.length; row++){
			for(int column=0; column<arr[row].length; column++)
				System.out.print(arr[row][column]);
		}
		
		System.out.println("\n");
		
		for(int[] row:arr){
			for(int col:row)
				System.out.print(col);
		}
	}

}
