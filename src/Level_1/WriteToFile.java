package Level_1;


	import java.io.*;
	import java.nio.Buffer;
	import java.util.Scanner;

	public class WriteToFile {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] data = {"Mary", "Jon" , "Jack" , "Jim" };
			String path = "./src/FilesIO/output.txt";
			//Write to a file
			write(data , path);
			//Append to a file
			String newData = "Joann"; 
			append(newData , path);
			//Read from the file
			read(path);
		}
		
		public static void write(String[] data , String path){ 
			/*
			 * 1- FileOutputStream + PrintWriter
			 * 2- Exception: FileNotFoundException: FileNotFound, 
			 * File could not be created.
			 * 3- Rewrite behavior: old content will be lost.
			 * 4- Close the file explicitly when finished or Java will. But?
			 * 5- OutputStreams are buffered.why? (discuss performance)
			 */
			PrintWriter pw =null;
			try{
				pw = new PrintWriter(path);
				//pw = new PrintWriter(new File(path));
				//pw = new PrintWriter(new FileOutputStream(new File(path), false));
				for(int i=0;i<data.length; i++)
					if(data[i] != null){
						System.out.println("[Writing to file ...]");
						pw.write(data[i]+  "\n");
					}
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				pw.close();
			}
			
			
		}
		
		public static void append(String data , String path){
			PrintWriter pw=null; 
			try{
				System.out.println("[Append to file....]");
				pw = new PrintWriter(new FileOutputStream(new File(path), true));
				pw.write(data);
			}catch(FileNotFoundException e){
				System.out.println("File can not be created"); 
			}finally{
				pw.close();
			}
		}
		
		public static void read(String path){
			//Scanner + FileInputStream
			//FileNotFoundException
			//NoSuchElementException
			//Test EOF
			//BufferedReader +FileReader
			
			/*
			Scanner scanner =null;
			try {
				 scanner = new Scanner(new FileInputStream(path));
				 while(scanner.hasNextLine()){
					 System.out.println("[Reading from file...]");
					 System.out.println(scanner.next());
				 }
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			BufferedReader br = null;
			String line="";
			String[] outData = new String[5];
			int counter=0;
	 		try{
				br = new BufferedReader(new FileReader(path)); 
				while( (line = br.readLine()) !=null ){
					System.out.println("[Reading from file ...]");
					//System.out.println(line);
					//store this information inside another file
					outData[counter++] = line;
				}
				String newPath = "src/FilesIO/copy.txt";
				write(outData,newPath);
				
				File f = new File("src/FilesIO/copy.txt");
				System.out.println(f.isDirectory());
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			
		}

	}

