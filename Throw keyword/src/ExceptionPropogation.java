
		//throw and throws keyword example
		
import java.io.IOException;
public class ExceptionPropogation {
	
	void m() throws IOException
	{
	   throw new IOException("DEVICE ERROR");
	}
	void n() throws IOException
	{
		m();
	}
	void p()throws IOException
	{
		n();
	}
	void q()
	{
		try
		{
		p();
	}
	
	catch (Exception e)
	{
		System.out.println(e);
		System.out.println("exception caught");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionPropogation ep=new ExceptionPropogation();
		 
		ep.q();
		
		System.out.println("rest of the code");
	}

}
