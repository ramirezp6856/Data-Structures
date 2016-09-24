package Module_2.Sorting;

public class SortingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {42,12,8,3,10,50}; 
		for(int i=0; i< 6; i++){
			System.out.print(data[i] +" ,");
		}
		System.out.println();
		
		//calling insertion sort
//		data = SortHelper.insertionSort(data);
//		for(int i=0; i< 6; i++){
//			System.out.print(data[i] +" ,");
//		}
//		
		
		//calling selection sort
		data= SortHelper.selectionSort(data);
		for(int i=0; i< 6; i++){
			System.out.print(data[i] +" ,");
		}
	}

}
