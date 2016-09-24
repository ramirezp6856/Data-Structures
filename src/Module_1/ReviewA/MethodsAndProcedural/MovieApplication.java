package Module_1.ReviewA.MethodsAndProcedural;

import javax.swing.JOptionPane;

public class MovieApplication {

	public static void main(String[] args){
		//create a new Movie
		Movie m = new Movie("star wars" , "SciFi"); 
		m.addCast("Harrison Ford");
		m.addCast("Mark Hamill");
		m.addCast("Carie Fisher");
		JOptionPane.showMessageDialog(null, m.toString());
	}
}