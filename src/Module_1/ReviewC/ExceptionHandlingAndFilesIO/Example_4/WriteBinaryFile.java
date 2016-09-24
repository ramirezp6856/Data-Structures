package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {
	
	public static void main(String[] args) throws  IOException{
		//An array to write to the file
		int[]  numbers = {2,4,6,8,10,12,14}; 
		
		//create the binary output objects.
		
		FileOutputStream fstream = new FileOutputStream("binaryOutput.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("Writing the numbers to the file...");
		
		//write the array elements to the file
		for(int i = 0; i< numbers.length; i++){
			outputFile.writeInt(numbers[i]); 
		}
		
		System.out.println("Done.");
		outputFile.close();
		
		
		//read file
		FileInputStream fstreamIn = new FileInputStream("binaryOutput.dat");
		DataInputStream inputFile = new DataInputStream(fstreamIn);
		System.out.println("Reading the numbers from the file...");
		boolean eof = false;
		int number;
		//read the array elements from the file
		while(!eof){
			try{ 
				number = inputFile.readInt(); 
				System.out.println(number);
			}catch (EOFException e){
				eof = true;
			}
		}
		
		System.out.println("Done.");
		inputFile.close();
		
	}

}