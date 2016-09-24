package Module_3.Recursion.Example_3;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(harmonicNumber(3));
	}
	
	
	public static double harmonicNumber(double n) { 
		if(n==1) return 1;
		return harmonicNumber(n-1) + 1/n;
	}

}
