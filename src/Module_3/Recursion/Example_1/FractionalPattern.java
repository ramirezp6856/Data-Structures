package Module_3.Recursion.Example_1;

public class FractionalPattern {

	public static final double INC = 0.25;
	public static final int BASE = 4;
	
	
	//This method generates the fractional pattern for 
	//mathematical series 1 1/4 , 1 1/2 , 1 3/4 ,...
	public static void nonRecursiveFractionalPattern(int count){
		String out = "The series is: ";
		double input  =1;
		RecursiveFraction fraction = null; 
		for (int i = 0 ; i< count; i++){
			input+=INC; 
			fraction = new RecursiveFraction(input, BASE);
			int decimal= fraction.getDecimal();
			int num = fraction.getNumerator();
			int denum = fraction.getDenumerator(); 
			
			if(num!=0) {
				out += decimal+ " ";
				out+=  num + "/";
				out+= denum + " ,";
			}
			else{
				out += decimal+ " ,";
			}
		}
		System.out.println(out);
	}
	
	
	public static void recursiveFractionalPattern(int count){
		String out = "The series is: ";
		double input  =1;
		RecursiveFraction fraction = null; 
		for (int i = 0 ; i< count; i++){
			input+=INC; 
			fraction = new RecursiveFraction(input, BASE);
			int decimal= fraction.getDecimal();
			int num = fraction.getNumerator();
			int denum = fraction.getDenumerator(); 
			
			if(num!=0) {
				out += decimal+ " ";
				out+=  num + "/";
				out+= denum + " ,";
			}
			else{
				out += decimal+ " ,";
			}
				
			
		}
		
		System.out.println(out);
	}
	
}
