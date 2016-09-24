package Module_3.Recursion.Example_2;

//import java.lang.reflect.Array;
//import java.util.*;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,6,13,16,17,18,33,80};
		Student[] students = { new Student("Tom",1), new Student("Jon",6),
				new Student("Mary",13), new Student("Peter",16),new Student("Jim",17),
				new Student("Roxanne",18),new Student("Joann",33), new Student("Raj",80)};
		
//		List<Student> l = Arrays.asList(students);
//		Collections.sort( l ,new StudentCompare()); 
//		l.toArray(students);
		
		/*
		
		System.out.println("nonrecursive search--------\n");
		System.out.println("index for 7:" + BinarySearch.nonRecursiveBinarySearch(arr1 , 7));
		System.out.println("index for 18:" + BinarySearch.nonRecursiveBinarySearch(arr1 , 18));
		
		System.out.println("index for Peter, 16:" + BinarySearch.nonRecursiveBinarySearch(students ,new Student("Peter" , 16)));
		System.out.println("index for Jim,10:" + BinarySearch.nonRecursiveBinarySearch(students , new Student ("Jim" , 10)));
	
		*/
		
		System.out.println("\n\nrecursive search--------\n");
		System.out.println("index for 7:" + BinarySearch.recursiveBinarySearch(arr1 , 0, arr1.length , 7));
		System.out.println("index for 18:" + BinarySearch.recursiveBinarySearch(arr1 , 0, arr1.length , 18));		
		
		
		System.out.println("index for Peter, 16:" + BinarySearch.recursiveBinarySearch(students, 0,students.length ,new Student("Peter" , 16)));
		System.out.println("index for Jim,10:" + BinarySearch.recursiveBinarySearch(students, 0 , students.length , new Student ("Jim" , 10)));
	
	}

}


/*
class StudentCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getScore() == o2.getScore())
			return 0;
		else if(o1.getScore()  < o2.getScore())
			return -1;
		else
			return 1;
	}
}

*/
