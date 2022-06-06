package fibonacci;
public class FibonacciSeries
{
	public static void main(String[]args) 
	{
		// TODO Auto-generated method stub
	
		int f=1;
		int s=1;
		int n=10;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++)
	{
		int t;
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}
	}

}
