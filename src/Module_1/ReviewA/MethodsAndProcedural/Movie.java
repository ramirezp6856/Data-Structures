package Module_1.ReviewA.MethodsAndProcedural;

public class Movie {
	
	private String genre; 
	private String name; 
	private static final int MAX = 100; 
	private String[] casts = new String[MAX]; 
	private int num; 
	public Movie(){}
	public Movie(String name, String genre){
		this.name = name; 
		this.genre = genre; 
		num = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setGenre(String g){
		genre = g;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public boolean addCast(String cast){
		if(num>=MAX) return false; 
		casts[num++] = cast;
		return true;
	}

	public String toString(){
		String out = "";
		for(int i=0;i<num; i++){
			out+=casts[i] + ","; 
		}
		return String.format("%s %s %s", "Name:" + name, "Genre: " + 
		genre, "Casts: "+ out); 
	}
}