class Bike
{
	void displayb()
	{
		System.out.println("bike is good for long drives");
		
}
}
class HeroHonda extends Bike
{
	void displayh ()
	{
		System.out.println("herohonda gives excellent millege");
	}
}
class Duke extends Bike
{
	void displayd ()
	{
		System.out.println("duke is good in look");
	}
}
class HarleyDevidson extends Bike
{
	void displayh1()
	{
		System.out.println("harleydavidson is very costly");
	}
}
public class HiorarchialInheritance {

	public static void main(String[] args) {
	
HeroHonda hh = new HeroHonda();
Duke d = new Duke();
HarleyDevidson hd = new HarleyDevidson();
hh.displayb ();
hh.displayh();
d.displayb();
d.displayd();
hd.displayb();
hd.displayh1();
	}
}