//to refer parent class instance variable using super keyword
class Devices
{
	String n="panasonic";
	void display1()
	{
		System.out.println(n);
	}
}
class TeliVision extends Devices
{
String n="sony";
	void display()
	{
		System.out.println(super.n);
		System.out.println(n);
	}
}
public class SuperRefer {
	public static void main (String[] args)
	{
		TeliVision tv = new TeliVision();
		tv.display();
	}
}
		
	

