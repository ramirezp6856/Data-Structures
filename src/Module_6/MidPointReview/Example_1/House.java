package Module_6.MidPointReview.Example_1;

public class House{
private String address;
private double price;
private String status;
private static int total; 

	public House(String ad , double p , String s) {
		address = ad; price = p; status = s;
		total++;
	}
	public double getPrice() { return price; }
	public String getAddress() {return address; }
	public String getStatus() {return status; }
	public static int getTotal(){ return total;}
}
