package Module_3.Recursion.Example_2;

public class BinarySearch{

	public static int nonRecursiveBinarySearch(int[] sortedArray , int j){
		int start= 0 ;
		int end = sortedArray.length;
		
		while(start < end){
			int mid = (start + end )/2;
			if(j == sortedArray[mid])
				return mid;
			else if(j < sortedArray[mid]){
				end = mid;
			}
			else{
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	public static int nonRecursiveBinarySearch(Student[] sortedArray, Student s){
		int start= 0 ;
		int end = sortedArray.length;
		
		while(start < end){
			int mid = (start + end )/2;
			if(s.compareTo(sortedArray[mid]) ==0)
				return mid;
			else if(s.compareTo(sortedArray[mid]) <0){
				end = mid;
			}
			else{
				start = mid+1;
			}
		}
		
		return -1;
	}

	
	public static int recursiveBinarySearch(int[] sortedArray , int start, int end , int j){
		if(start > end) 
			return -1; 
			
		int mid = (int) Math.floor((start + end )/2);
		
		if(j == sortedArray[mid])
			return mid;
		
		else if(j < sortedArray[mid]){
				end = mid-1;
				return recursiveBinarySearch(sortedArray, start, end, j);
		}
		else{
			start = mid+1;
			return recursiveBinarySearch(sortedArray, start, end, j);
		}
		
	}

	
	public static int recursiveBinarySearch(Student[] sortedArray, int start , int end, Student s){
		if(start > end) 
			return -1; 
			
		int mid = (start + end )/2;
		
		if(s.compareTo(sortedArray[mid])==0)
			return mid;
		
		else if(s.compareTo(sortedArray[mid])<0){
				end = mid-1;
				return recursiveBinarySearch(sortedArray, start, end, s);
		}
		else{
			start = mid+1;
			return recursiveBinarySearch(sortedArray, start, end, s);
		}
	}

}
