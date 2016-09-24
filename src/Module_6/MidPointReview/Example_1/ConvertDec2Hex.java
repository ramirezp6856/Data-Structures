package Module_6.MidPointReview.Example_1;

public class ConvertDec2Hex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(2000));
	}
	
	
	public static String convert(int n){
		if(n<16) return symbol(n); 
		else return convert(n/16) + symbol(n % 16); 
	}
	
	public static String symbol(int n){
		if(n<= 9 ) return Integer.toString(n); 
		if(n==10) return "A"; 
		if(n==11) return "B"; 
		if(n==12) return "C"; 
		if(n==13) return "D"; 
		if(n==14) return "E";
		if(n==15) return "F"; 
		else return null; 
	}
		
}

