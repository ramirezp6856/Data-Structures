package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class StartEmployee {

	public static void main(String[] args){
		//we suppose the maximum number of employees is 10
		Employee[] employees = new Employee[10];
		String[] empsProfile = new String[10];
		
		//read from the text file and convert the content into an String array.
		int size = readFile("src/data.txt", empsProfile);

		//convert empsProfile to Employee object Array
		employees = convertToEmployees(empsProfile , size); 
		
		for(int i =0 ; i< size; i++){
			System.out.println(employees[i].toString());
		}
	}
	
	
	public static int readFile(String path , String[] empsProfile){
		Scanner inputStream;
		int counter = 0; 
		try{
			inputStream= new Scanner(new FileInputStream(path)); 
			
			while(inputStream.hasNext() && counter < 10){
				empsProfile[counter] = inputStream.nextLine(); 
				counter++; 
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		return counter; 
	}
	
	
	public static Employee[] convertToEmployees(String[] empsProfile , int size){
		Employee[] employees = new Employee[10];
		Scanner scanRow; 
		String name; 
		String type; 
		Address address; 
		double sal;
		Employee e = null; 
		Random r ;
		for(int i=0; i<size; i++){
			scanRow = new Scanner(empsProfile[i]); 
			scanRow.useDelimiter(";"); 
			name = scanRow.next(); 
			address =stringToAddress(scanRow.next()) ; 
			sal= Double.parseDouble(scanRow.next().trim()); 
			type = scanRow.next().trim(); 
			r= new Random(4); 
			
			if(type.equalsIgnoreCase("director"))
				e = new Director(r.nextDouble(), address);
			else if(type.equalsIgnoreCase("regular"))
				e= new Regular(r.nextDouble(), address); 
			e.setName(name); 
			e.setMonthlySalary(sal);
			employees[i] = e;
		}
		
		return employees; 
	}
	
	
	public static Address stringToAddress(String str){
		Address addr = new Address(); 
		Scanner scan  = new Scanner(str); 
		scan.useDelimiter(","); 
		addr.setStreetNumber(scan.next());
		addr.setCity(scan.next());
		addr.setState(scan.next());
		addr.setZipcode(Integer.parseInt(scan.next().trim())); 
		return addr; 
	}
}
