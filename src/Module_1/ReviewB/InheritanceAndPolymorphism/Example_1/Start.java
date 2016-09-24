package Module_1.ReviewB.InheritanceAndPolymorphism.Example_1;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Director(10000);
		System.out.println(e1.toString());
		
		Employee e2 = new Programmer(10000);
		System.out.println(e2.toString());
	}

	
}
