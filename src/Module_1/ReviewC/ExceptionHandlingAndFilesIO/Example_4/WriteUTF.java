package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUTF {
	
	//Writing and Reading a String to and from a binary file
	public static void main(String[] args) throws IOException{
		String names[] = {"Warren" , "Becky" , "Holly" , "Zach" , "Chloe"}; 
		//Create the output objects.
		
		FileOutputStream fstream = new FileOutputStream("binaryString.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("writing names to the file...");
		
		//write the array elements to the file
		for(int i=0; i< names.length; i++){
			outputFile.writeUTF(names[i]); 
		}
		
		System.out.println("Done.");
		outputFile.close();
		
		//Reading from a file
		FileInputStream fstreamInput = new FileInputStream("binaryString.dat"); 
		DataInputStream inputFile = new DataInputStream(fstreamInput);
		
		System.out.println("Reading the names from the file");
		
		boolean eof = false;
		String name; 
		
		while (!eof){
			try{
				name = inputFile.readUTF(); 
				System.out.println(name + " ");
				
			}catch (EOFException e){
				eof = true;
			}
		}
		
		System.out.println("Done.");
		inputFile.close();

	}

}