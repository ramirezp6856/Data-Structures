package Module_3.Recursion.Example_1;

import java.text.NumberFormat;

public class RecursiveFraction {
	private int decimal; 
	private int numerator;
	private int denumerator;
	
	//e.g. (1.75, 4)
	public RecursiveFraction(double input , int base){
		NumberFormat number = NumberFormat.getCurrencyInstance(); 
		number.setMaximumFractionDigits(0); 
		decimal = getDecimalPts((new Double(input)).toString());
		input-=decimal; 
		int floatingPts = getFloatingPts((new Double(input)).toString());
		int temp = getNumFloatingPoint(floatingPts , 0);
		numerator = floatingPts / ((int) Math.pow(10, temp) / base) ; 
		denumerator = base;
	}
	
	//e.g. 0.75
	private int getFloatingPts(String digit){
		int ix = digit.indexOf('.'); 
		digit = digit.substring(ix+1); 
		return Integer.parseInt(digit);
	}
	
	private int getDecimalPts(String digit){
		int ix = digit.indexOf('.'); 
		digit = digit.substring(0, ix); 
		return Integer.parseInt(digit);
	}
	
	private int getNumFloatingPoint(int num , int f){

		if(num > 10){
			f++; 
			num = num/10;
			return getNumFloatingPoint(num, f);
		}
		else{
			f++; 
			return f;
		}
		
		
	}
	
	public int getDecimal(){
		return decimal;
	}
	
	public int getNumerator(){
		return numerator;
	}
	
	public int getDenumerator(){
		return denumerator;
	}
}
