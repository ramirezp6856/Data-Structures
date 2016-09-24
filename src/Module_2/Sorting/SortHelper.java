package Module_2.Sorting;

public class SortHelper {
	
	public static boolean linearSearch(String name, String[] list){
		for(String s: list){
			if(s.equals(name)){
				return true; 
			}
		}
		return false;
	}
	

	public static int[] insertionSort(int[] data){
		for(int i =1; i< data.length-1; i++){
			int k = i;
			while(k > 0 && data[k] < data[k-1] ){
				int temp = data[k-1]; 
				data[k-1] = data[k]; 
				data[k] = temp; 
				k--;
			}
		}
		
		return data;
	}
	
	public static int[] selectionSort(int[] data){
		int min=0, k=0; 
		for(int i=0; i<data.length-1; i++){
			min = data[i];
			for(int j=i+1; j<data.length; j++){
				if(min > data[j]) {
					min = data[j]; 
					k=j;
				}
			}
			if(data[i] > min){ //swap
				int temp = data[i];
				data[i] = data[k]; 
				data[k] = temp; 
			}
		}
		
		return data;
	}
}
