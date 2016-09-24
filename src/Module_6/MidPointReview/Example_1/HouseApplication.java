package Module_6.MidPointReview.Example_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class HouseApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readAndSortOnPrice("data.txt");
	}
	
	
	public static House[] readAndSortOnPrice(String filepath) 
	{ 
		House[] houses = new House[100];
		Scanner reader = null; 
		try{
			reader = new Scanner(new FileInputStream(filepath)); 
			while(reader.hasNextLine()){
				String line = reader.nextLine(); 
				String address = line.substring(0, line.indexOf(";"));
				double price = Double.parseDouble(line.substring(line.indexOf(";") +3,
						line.indexOf(";", line.indexOf(";")+1)));
				String status = line.substring(line.lastIndexOf(";")); 
				House house = new House(address, price, status); 
				houses[House.getTotal()-1] = house;
			}
			
			houses = insertionSort(houses);
			
			return houses;
		}catch(FileNotFoundException e){
			e.printStackTrace(); 
		}catch(IOException e) {
			e.printStackTrace(); 
		}
		return null;
	}

	
	public static House[] insertionSort(House[] houses){
		int sorted=1; //assume the first element is sorted
		while(sorted<House.getTotal()){
			//start from the second element
			int s = sorted-1; //this is the rear index to sorted list
			int  u = s+1; //beg index to unsorted list
			
			if (houses[u].getPrice() < houses[s].getPrice()){
				while(s>=0 && u <= House.getTotal() &&
						houses[u].getPrice() < houses[s].getPrice()){
					House temp = houses[u]; 
					houses[u] = houses[s];
					houses[s] = temp;
					u--; 
					s--;
				}
				sorted++;	
			}
			else {
				u++;
				sorted++;
			}
		}
		return houses;
	}
}
