package Activity_1;
public class SoftwareSystem {
	private String customer;
	private int vendor;
	public static final String [] VENDORS = {"Oracle", "Datatel", "Migrant"};
	public static final double [] COST = {35000, 25000, 10000};
	
	public boolean setCustomer (String c, int v)
	{
		if (v < 1 || v > VENDORS.length)
			return false;
		vendor = v - 1;
		return true;
	}
	public static String vendors ()
	{
		String list = "Vendors: \n";
		for (int i = 0; i < VENDORS.length; i++)
			list += "  "+(i+1)+".  "+VENDORS[i]+ " ( $"+COST[i]+")\n";
		return list;
	}
	public String getVendor() {return VENDORS[vendor];}
	public double getCost() {return COST[vendor];}
	
	public String toString ()
	{
		return customer + " purchased " + VENDORS[vendor]
					+ " at a cost of $"+COST[vendor];
	}
	}	