package Module_3.Recursion.Example_6;

/*
 * This is a recursive implementation for drawing english ruler.
 */
public class EnglishRuler {
	
	
	public static void main(String[] args){
		drawRuler(10, 4);
	}
	
	/**
	 * @param nInch : the length of the ruler in inch
	 * @param majorLength : the length of the largest tick
	 */
	public static void drawRuler(int nInch, int majorLength){
		drawLine(majorLength,0);
		for(int j=1;j<nInch;j++){
			drawInterval(majorLength-1);  //recursive case
			drawLine(majorLength , j);  
		}
	}
	
	/**
	 * this methods draw a tick length
	 * @param tickLength
	 * @param tickLabel
	 */
	private static void drawLine(int tickLength, int tickLabel){
		for(int j=0;j<tickLength;j++)
			System.out.print("-");
		if(tickLabel>=0) 
			System.out.print(tickLabel);
		System.out.print("\n");
	}
	
	private static void drawInterval(int centralLength){
		if(centralLength >=1 ){
			drawInterval(centralLength-1);//- 
			drawLine(centralLength , -1); /*  --   when centralLength == 1, it exits the current instance of this 
													method instance, and continues to this next line.*/ 
											
			drawInterval(centralLength-1);//- 
		}
			
	}
	

}
