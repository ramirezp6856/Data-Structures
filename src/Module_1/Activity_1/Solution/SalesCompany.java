package Module_1.Activity_1.Solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SalesCompany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Input a list of sales people and what systems they have sold from a 
		 * text file (you can create a dummy file for this purpose).
		 */
		
		SalesPerson[] employees = new SalesPerson[100];
		int count = getInput(employees); 
		
		//Determine which sales person sold the most (highest total cost)
		SalesPerson bestEmployee = getMostSold(employees , count); 
		JOptionPane.showMessageDialog(null, "The best employee is:\n"+ bestEmployee.toString());
		/**Write the information about all software systems in a text file, 
		including type, cost, and description
		*/
		
		String outPath = "./src/Lecture_1/Activity1/outPath";
		writeToFile(outPath, employees);
	}
	
	public static int getInput(SalesPerson[] employees){
		int num=0;
		String inPath = "./src/Lecture_1/Activity1/inPath"; 
		BufferedReader br  =null;
		String line="";
		SalesPerson em = null; 
		Scanner scan = null; 
		
		try{
			br = new BufferedReader(new FileReader(inPath)); 
			while((line = br.readLine())!=null){
				scan = new Scanner(line);
				scan.useDelimiter(";");
				String name = scan.next().trim(); 
				SoftwareSystem[] sold = getArray(scan.next(), ",");
				em = new SalesPerson(name, 20000);
				for(SoftwareSystem s: sold){
					if(s!=null)
						em.sellSystem(s);
				}
				employees[num++] = em;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return num;
	}
	
	
	public static SoftwareSystem[] getArray(String str, String delimiter){
		String[] out = new String[3]; 
		SoftwareSystem[] sold = new SoftwareSystem[3];
		Scanner soldScan =new Scanner(str); 
		soldScan.useDelimiter(delimiter);
		int counter=0;
		while(soldScan.hasNext())
			out[counter++] = soldScan.next();
		
		counter = 0;
		for(String s:out){
			if(s!=null){
				if(s.trim().equals("Oracle")){
					SoftwareSystem ss = new SoftwareSystem(); 
					ss.setCustomer("customer"+ (counter+1), 1);
					sold[counter++] = ss;
				}
				else if(s.trim().equals("Datatel")){
					SoftwareSystem ss = new SoftwareSystem(); 
					ss.setCustomer("customer"+ (counter+1), 2);
					sold[counter++] = ss;
				}
				else if(s.trim().equals("Migrant")){
					SoftwareSystem ss = new SoftwareSystem(); 
					ss.setCustomer("customer"+ (counter+1), 3);
					sold[counter++] = ss;
				}
				
				
			}
		}
		
		return sold;
	}
	
	
	public static SalesPerson getMostSold(SalesPerson[] employees , int count){
		SalesPerson most = employees[0]; 
		double amount = employees[0].getTotalSold(); 
		for(int i=0;i<count;i++){
			if(employees[i].getTotalSold() > amount){
				amount = employees[i].getTotalSold();
				most = employees[i]; 
			}
		}
		
		return most;
	}
	
	
	public static void writeToFile(String outPath, SalesPerson[] employees){
		//TODO
	}

}
