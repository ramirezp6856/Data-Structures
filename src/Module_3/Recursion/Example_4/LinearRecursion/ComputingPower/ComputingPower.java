package Module_3.Recursion.Example_4.LinearRecursion.ComputingPower;

public class ComputingPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3));
	}
	
	
	public static int pow(int x, int y){
		if(y==0) return 1;
		return x * pow(x,y-1);
	}

}
