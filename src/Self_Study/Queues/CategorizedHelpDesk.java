package Self_Study.Queues;

import java.util.Queue;
import java.util.ArrayDeque;
import Self_Study.Queues.Category;


public class CategorizedHelpDesk {

	private Queue<Enquiry> enquiries = new ArrayDeque<>();
	
	public boolean enquire(final Customer customer, final Category type)
	{
		return enquiries.offer(new Enquiry(customer, type));
	}
	
	public void processPrinterEnquiry()
	{
		final Enquiry enquiry = enquiries.peek();
		if(enquiry != null && enquiry.getCategory() == Category.PRINTER)
		{
			enquiry.getCustomer().reply("Is it out of paper?");
		}
		else
		{
			System.out.println("No work to do, let's have some coffee!");
		}
	}
	
	public void processGeneralEnquiry()
	{
		final Enquiry enquiry = enquiries.peek();
		if(enquiry != null && enquiry.getCategory() != Category.PRINTER)
		{
			enquiries.remove();
			enquiry.getCustomer().reply("Have you tried turning it on and off again.");
		}
		else
		{
			System.out.println("No work to do, let's have some coffee!");
		}
	}

	public static void main(String[] args)
	{
		CategorizedHelpDesk helpDesk = new CategorizedHelpDesk();
		
		helpDesk.enquire(Customer.JACK, Category.PHONE);
		helpDesk.enquire(Customer.JILL, Category.PRINTER);
		
		//top element is jack's phone request
		helpDesk.processPrinterEnquiry();
		//then general enquiry
		helpDesk.processGeneralEnquiry();
		//then Jill says she has a printer enquiry
		helpDesk.processPrinterEnquiry();
	}
}
