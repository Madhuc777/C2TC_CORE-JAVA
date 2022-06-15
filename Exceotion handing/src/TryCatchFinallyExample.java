
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("first statement");
			int a[]=new int[5];
			a[5] = 30/0;
			System.out.println("inside the block");
		}
		catch(ArithmeticException ae)
		{
		System.out.println(" AE exception cought in catch block");
		System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
		System.out.println("Array Out Of bounds Exception  caught");
		}
		catch(Exception e)
		{
			System.out.println("out of bound");
		}
		finally
		{
		System.out.println("finally block is excecuted");
		}
		System.out.println("rest of the code");
	}

}
