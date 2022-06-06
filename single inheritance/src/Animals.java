
public class Animals 
{
	void an()
	{
		System.out.println("animal is running");
	}

}
class Dogs extends Animals
{
	void dg()
	{
		System.out.println("dog is barking");
	}


public static void main(String[] args) 
{
Dogs d=new Dogs();
d.dg();
d.an();

}