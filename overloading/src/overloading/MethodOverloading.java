package overloading;

public class MethodOverloading {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
	return a+b+c;
	}
	static double add(double a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(50,20));
		System.out.println(add(50,20,49));
		System.out.println(add(5.5,20,49));
	}

}
