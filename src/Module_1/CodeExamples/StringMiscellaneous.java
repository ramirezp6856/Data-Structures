package Module_1.CodeExamples;

public class StringMiscellaneous {
	
	public static void main(String[] args){
		String s1="hello there"; 
		char[] charArray = new char[5];
		System.out.printf("s= %s", s1);
		System.out.printf("\nlength of the string is: %s", s1.length());
		
		//loop through characters in s1 with charAt and display reversed
		for(int i=s1.length()-1 ; i >=0; i--){
			System.out.printf("%c", s1.charAt(i));
		}
		
		//copy characters from string into charArray
		s1.getChars(0, 5, charArray, 0);
		System.out.print("\nThe character array is: ");
		for(char character: charArray)
			System.out.print(character); 
		
	}

}