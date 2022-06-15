import java.util.Scanner;
public class ExceptionHandlingchecked {
	static void validate (int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible to vote");
		}
		else
		{
			System.out.println("candidate is eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the age");
	int age = sc.nextInt();
	try
	{
		validate(age);
	}
	catch(Exception e)
	{
	System.out.println("hello");
	}
	System.out.println("rest of the code ....");
	}
}