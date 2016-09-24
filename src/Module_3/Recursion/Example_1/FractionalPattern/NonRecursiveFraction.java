package Module_3.Recursion.Example_1.FractionalPattern;

import java.text.NumberFormat;

public class NonRecursiveFraction {

	private int decimal; 
	private int numerator;
	private int denumerator;
	
	//e.g. (1.75, 4)
	public NonRecursiveFraction(double input , int base){
		NumberFormat number = NumberFormat.getCurrencyInstance(); 
		number.setMaximumFractionDigits(0); 
		decimal = getDecimalPts((new Double(input)).toString());
		input-=decimal; 
		int floatingPts = getFloatingPts((new Double(input)).toString());
		int temp = getNumFloatingPoint(floatingPts);
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
	
	private int getNumFloatingPoint(int num){
		int f = 0; 
		while(true){
			if(num > 10){
				f++; 
				num = num/10;
			}
			else{
				f++; 
				return f;
			}
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
