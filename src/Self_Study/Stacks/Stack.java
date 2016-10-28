package Self_Study.Stacks;

public interface Stack<E>
{ 
	/**
	 * 
	 * @return
	 */
	int size();
	
	/**
	 * 
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @param e
	 */
	void push(E e);
	
	/**
	 * 
	 * @return
	 */
	E top();
	
	/**
	 * 
	 * @return
	 */
	E pop();
}
