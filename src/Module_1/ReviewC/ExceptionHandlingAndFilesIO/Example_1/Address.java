package Module_1.ReviewC.ExceptionHandlingAndFilesIO.Example_1;

public class Address {
	private String streetNumber; 
	private String city; 
	private String state; 
	private int zipcode;
	
	public Address() {}
	
	public Address(String sn, String c, String st, int zc){
		this.streetNumber =sn; 
		this.city = c;
		this.state = st; 
		this.zipcode =zc; 
	}
	
	public String getStreetNumber (){
		return this.streetNumber;
	}
	
	public String getCity(){
		return this.city; 
	}
	
	public String getState(){
		return this.state;
	}
	
	public int getZipcode() {
		return this.zipcode;
	}
	


	public void setStreetNumber (String st){
		this.streetNumber=st;
	}
	
	public void setCity(String c){
		this.city = c; 
	}
	
	public void setState(String s){
		this.state=s;
	}
	
	public void setZipcode(int zip) {
		this.zipcode = zip;
	}
}
