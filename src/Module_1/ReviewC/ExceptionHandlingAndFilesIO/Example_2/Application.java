package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_2;

import javax.swing.JOptionPane;

public class Application {
	
	public static void main(String[] args){
		
		//write
		do{
			ReadFileScanner.writeToFile("output.txt",JOptionPane.showInputDialog("Write to a File: \nEnter a number between 0 and 100") + " ");
		}while(JOptionPane.showConfirmDialog(null, "continue?")==JOptionPane.YES_OPTION);
		
		
		//append
		do{
			ReadFileScanner.appendToFile("output.txt",JOptionPane.showInputDialog("Append to a File: \nEnter a number between 0 and 100") + " ");
			//ReadFileScanner.writeToFileWFileOutputStream("output.txt",JOptionPane.showInputDialog("Append to a File: \nEnter a number between 0 and 100") + " ");
		}while(JOptionPane.showConfirmDialog(null, "continue?")==JOptionPane.YES_OPTION);
		
		//read file
		System.out.print("Total_readFile: " + ReadFileScanner.readFile("output.txt")); 
		
		//Read file inputstream
		System.out.println("Total_readFileInputStream: " + ReadFileScanner.readFileInputStream("output.txt"));
		//ReadFileScanner.readFile("IT306_2014/Module03/input.txt");
		
		ReadFileScanner.readWebpage("http://www.google.com");
	}

}
