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
		System.out.println("n = " + n);
		System.out.println("n/16 = " + n/16);
		System.out.println("n%16 = " + n%16);
		if(n<16) return symbol(n); 
		else return convert(n/16) + symbol(n % 16); 
	}
	
	public static String symbol(int n){
		if (n <= 9) {
			System.out.println("n = " + n + " which returns " + n);
		    return Integer.toString(n);
		    }
		
		switch(n) {
	      case 10:
	    	System.out.println("n = " + n + " which returns A");
	        return "A";
	      case 11:
	    	System.out.println("n = " + n + " which returns B");
	        return "B";
	      case 12:
	    	System.out.println("n = " + n + " which returns C");
	    	return "C";
	      case 13:
	    	System.out.println("n = " + n + " which returns D");
	    	return "D";
	      case 14:
	    	System.out.println("n = " + n + " which returns E");
	    	return "E";
	      case 15:
	    	System.out.println("n = " + n + " which returns F");
	    	return "F";
	      default:
	    	System.out.println("n = " + n + " which returns null");
	    	return null;
	    } 
	}
		
}

