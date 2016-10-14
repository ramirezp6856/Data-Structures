package Self_Study.Queues;
import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk 
{
	private final Queue<Enquiry> enquiries = new ArrayDeque<>();
	
	public void enquire(final Customer customer, final Category category)
	{
		enquiries.offer(new Enquiry(customer, category));
	}
	
	public void processAllEnquiries()
	{
		/**
		 * one way to implement
		 */
		/*while(!enquiries.isEmpty())
		{
			final Enquiry enquiry = enquiries.remove();
			enquiry.getCustomer().reply("Have you tried turning it off and on again?");
		}*/
		
		/**
		 * another way to implement
		 */
		Enquiry enquiry;
		
		while((enquiry = enquiries.poll()) != null)
		{
			enquiry.getCustomer().reply("Have you tried turning it off and on again?");
		}
	}
	/**
	public static void main(String[] args)
	{
		HelpDesk helpDesk = new HelpDesk();
		
		helpDesk.enquire(Customer.JACK, Category.PHONE);
		helpDesk.enquire(Customer.JILL, Category.PRINTER);
		
		helpDesk.processAllEnquiries();
	}
	**/
}
