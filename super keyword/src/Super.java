//invoke immediate parent class using super keyword
class Device
{
	void display ()
	{
		System.out.println("device is running");
	}
}
class Tv extends Device
{
	void display1 ()
	{
		super.display();
		System.out.println("tv is turned off");
	}
}

public class Super {
	public static void main(String[] args)
	{
		Tv t = new Tv();
		t.display1();
	}
}
