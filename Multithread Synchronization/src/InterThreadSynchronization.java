class Customer1
{
	int balance=10000;
	synchronized void withdraw(int balance)
	{
		System.out.println("Going to withdraw");
		if(this.balance<balance)
		{
			System.out.println("less balance; waiting for deposit");
		
		try
		{
			wait();
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
		this.balance-=balance;
		
			System.out.println("withdraw completed");
		}
	}
		
		synchronized void deposit(int balance)
		{
			this.balance+=balance;
			{
				System.out.println("deposit completed");
			}
		
			notify();
	}
}
	
public class InterThreadSynchronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Test{    
			public static void main(String args[]) 
			{    
			final Customer1 c=new Customer1();    
			new Thread()
			{    
			public void run()
			{
				c.withdraw(15000);
			}    
			}
			.start();    
			new Thread()
			{    
			public void run(){c.deposit(10000);
			}    
			}
			.start();    
			    
			}
			}   
	
	}
}
	





