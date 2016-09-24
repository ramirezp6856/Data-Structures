package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_3;

import java.util.Scanner;

public class ReadConsole {

	public static String getString(String message){
		System.out.println(message);
		Scanner in= new Scanner(System.in); 
		return in.next();
	}
	
	public static int getInt(String message){
		System.out.println(message);
		Scanner in= new Scanner(System.in); 
		return in.nextInt();
	}
	
	public static double getDouble(String message){
		System.out.println(message);
		Scanner in= new Scanner(System.in); 
		return in.nextDouble();
	}
}