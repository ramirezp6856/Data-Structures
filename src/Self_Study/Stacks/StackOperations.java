package Self_Study.Stacks;

import java.util.Stack;

/**
 * 
 * @author pramirez
 * Take Home Assignment 4
 * Question 3
 *
 */
public class StackOperations {

	public static void main(String[] args){
		int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		Stack<Integer> intStack = new Stack<Integer>();
		
		System.out.println("Pushed: " + intArray[0]);
		intStack.push(intArray[0]);
		
		System.out.println("Pushed: " + intArray[1]);
		intStack.push(intArray[1]);

		// Pop 1
		System.out.println("1. Popped: " + intStack.pop());
		
		// Pop 2
		System.out.println("2. Popped: " + intStack.pop());
		
		// Pop 3
		//pop but empty
		System.out.println("3. Is stack empty? " + intStack.isEmpty());
		
		System.out.println("Pushed: " + intArray[2]);
		intStack.push(intArray[2]);

		System.out.println("Pushed: " + intArray[3]);
		intStack.push(intArray[3]);

		// Pop 4
		System.out.println("4. Popped: " + intStack.pop());
		
		// Pop 5
		System.out.println("5. Popped: " + intStack.pop());
		
		// Pop 6
		//pop but empty
		System.out.println("6. Is stack empty? " + intStack.isEmpty());
		
		System.out.println("Pushed: " + intArray[4]);
		intStack.push(intArray[4]);

		System.out.println("Pushed: " + intArray[5]);
		intStack.push(intArray[5]);

		System.out.println("Pushed: " + intArray[6]);
		intStack.push(intArray[6]);
		
		// Pop 7
		System.out.println("7. Popped: " + intStack.pop());
				
		// Pop 8
		System.out.println("8. Popped: " + intStack.pop());
		
		// Pop 9
		System.out.println("9. Popped: " + intStack.pop());
		
		// Pop 10
		//pop but empty
		System.out.println("10. Is stack empty? " + intStack.isEmpty());

		System.out.println("Pushed: " + intArray[7]);
		intStack.push(intArray[7]);

		System.out.println("Pushed: " + intArray[8]);
		intStack.push(intArray[8]);

		System.out.println("Pushed: " + intArray[9]);
		intStack.push(intArray[9]);

		System.out.println("Pushed: " + intArray[10]);
		intStack.push(intArray[10]);

		System.out.println("Pushed: " + intArray[11]);
		intStack.push(intArray[11]);

		System.out.println("Pushed: " + intArray[12]);
		intStack.push(intArray[12]);

		System.out.println("Pushed: " + intArray[13]);
		intStack.push(intArray[13]);

		System.out.println("Pushed: " + intArray[14]);
		intStack.push(intArray[14]);

		System.out.println("Pushed: " + intArray[15]);
		intStack.push(intArray[15]);

		System.out.println("Pushed: " + intArray[16]);
		intStack.push(intArray[16]);

		System.out.println("Pushed: " + intArray[17]);
		intStack.push(intArray[17]);

		System.out.println("Pushed: " + intArray[18]);
		intStack.push(intArray[18]);

		System.out.println("Pushed: " + intArray[19]);
		intStack.push(intArray[19]);

		System.out.println("Pushed: " + intArray[20]);
		intStack.push(intArray[20]);

		System.out.println("Pushed: " + intArray[21]);
		intStack.push(intArray[21]);

		System.out.println("Pushed: " + intArray[22]);
		intStack.push(intArray[22]);

		System.out.println("Pushed: " + intArray[23]);
		intStack.push(intArray[23]);

		System.out.println("Pushed: " + intArray[24]);
		intStack.push(intArray[24]);
		
		System.out.println("Stack size: " + intStack.size());
		
		System.out.println("Is stack empty? " + recurseStackPop(intStack).isEmpty());
		
		System.out.println("Is html?: " + isHTMLMatched("<name style='data:bear'></name>"));
		
		System.out.println("Is html?: " + isHTMLMatched("<name style=\"data:bear\"></name>"));
		
	}


	/**
	 * @author Phillip Ramirez
	 * Take Home Assignment 4
	 * Question 3
	 * Recursive method for removing all the elements from a stack.
	 * @param intStack
	 * @return
	 */
	private static Stack<Integer> recurseStackPop(Stack<Integer> intStack) {
		
		// base case - if stack is not empty pop the top element
		if(!intStack.isEmpty())
		{
			
			intStack.pop();
			
			recurseStackPop(intStack);
			return intStack;
		}
		else // recurse case - stack is empty, thus no more elements to pop
			return intStack;
	}
	
	/** 
	 *  @author Phillip Ramirez
	 * Take Home Assignment 4
	 * Question 5
	 * Tests if every opening tag has a matching closing tag in HTML string even if the opening tag has attributes. 
	 * Since html follows the same format of <tagName attribute='attributeValue'> I saw I could the split function
	 * to tokenize the html and utilize the space between the tag name and the attribute as the delimiter.
	 * @param html
	 * @return
	 */
	public static boolean isHTMLMatched(String html) 
	{ 
		//Stack<String> buffer = new LinkedStack<>(); 
		Stack<String> buffer = new Stack<>(); 
		int j = html.indexOf('<'); // find first ’<’ character (if any) 
		System.out.println("index of < =" + j);
		while (j != -1) { 
			int k = html.indexOf('>', j+1); // find next ’>’ character 
			System.out.println("index of > = " + k);
			if (k == -1) 
				return false; // invalid tag 
			String tagPrep = html.substring(j+1, k); // strip away < > 
			String[] tagArr = tagPrep.split(" "); // split string into tokens using space as a delimiter
			String tag = tagArr[0]; // assign first token to tag
		
			if (!tag.startsWith("/")) // this is an opening tag 
				 buffer.push(tag); 
			else { // this is a closing tag 
				if (buffer.isEmpty()) 
					return false; // no tag to match 
				if (!tag.substring(1).equals(buffer.pop())) 
					return false; // mismatched tag 
			} 
			j = html.indexOf('<', k+1); // find next ’<’ character (if any) 
		} 
		return buffer.isEmpty(); // were all opening tags matched? 
	} 
			

}


