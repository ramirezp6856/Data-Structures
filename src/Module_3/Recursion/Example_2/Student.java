package Module_3.Recursion.Example_2;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private double score;
	private String name; 
	
	public Student(String n , double s){
		name  = n; 
		score = s;
	}
	
	public double getScore(){
		return score;
	}
	
	public String getName(){
		return name;
	}
	
	public int compareTo(Student o) {

		if(score == o.getScore())
			return 0;
		else if(score  < o.getScore())
			return -1;
		else
			return 1;
	}

}


