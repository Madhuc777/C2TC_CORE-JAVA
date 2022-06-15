import java.util.*;
public class TestCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter the value of a and b");
			a=sc.nextInt();
			b=sc.nextInt();
			int data=a/b;
			//may throw exception
			System.out.println("data value is" +data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code.....");
		
		
		
	}

}
