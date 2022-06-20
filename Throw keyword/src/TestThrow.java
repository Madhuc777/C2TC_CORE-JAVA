
public class TestThrow {

	void validate(int age)
	{
		try
		{
		if(age<18)
		{		
			throw new ArithmeticException("person is not eligible");
		
		}
		else 
		{
			System.out.println("welcome to vote");
		}
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		
		TestThrow t=new TestThrow();
		
		t.validate(17);
		System.out.println("rest of the code");

	}

}