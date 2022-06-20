//custom exception by throw keyword
	
	class customException extends Exception
	{
		public customException(String str)
		{
			super(str);
		}
	}

public class UserDefinedException 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	  
		try
		{
			throw new customException("this is user defined exception");
			
		}
		
		catch(customException e)
		{
			System.out.println("caught the exception");
			System.out.println(e.getMessage());
		}
	}

}
