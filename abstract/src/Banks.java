//partial abstraction
abstract class Bankk
{
	public abstract void loan();
	public void credit()
	{
		System.out.println("bank credit");
	}
	 void debit()
	{
		System.out.println("bank debit");
	}
}
 	class HDFC extends Bankk
 {

		@Override
		public void loan() 
		{
			System.out.println("hdfc loan method");
		}
	 void funds()
	 {
		 System.out.println("hdfc funds");
	 }
 
 }
 
public class Banks {
	public static void main(String [] args)
	{
		HDFC hb = new HDFC();
		hb.credit();
		hb.debit();
		hb.funds();
		hb.loan();
		Bankk b = new HDFC();
		System.out.println();
		b.credit();
		b.debit();
		b.loan();
		
	}
}
