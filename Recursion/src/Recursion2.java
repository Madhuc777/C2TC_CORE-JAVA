	//recursion finite times

public class Recursion2
{	
	static int count=0;
	
	static void p()
	{
		count++;
		if(count<=5)
		{
			System.out.println("finite nuber of times" + count);
			
			p();
		}
	}

public static void main(String args[])
{		
	p();
}
}