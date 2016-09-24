package Module_3.Recursion.Example_1.FractionalPattern;

public class FractionalPattern {

	public static final double INC = 0.25;
	
	public static void main(String[] args){
		FractionalPattern.recursiveFractionalPattern(5);
	}
	
	//This method generates the fractional pattern for 
	//mathematical series 1 1/4 , 1 1/2 , 1 3/4 ,...
	public static double recursiveFractionalPattern(double n){
		if(n==0) {
			System.out.print(0+ " ,");
			return 0;
		}
		if(n==1) {
			System.out.print(1+ " ,");
			return 1;
		}
		
		double number= 0.25 + recursiveFractionalPattern(n-1); 
		System.out.print( number + " , ");
		return number;
	}
	
}
