class Animalll
{
	void display1()
	{
		System.out.println("animal is running");
	}
}
class Dog extends Animalll
{
	void display2()
	{
		System.out.println("dogs are barking");
	}
}
class Labrador extends Dog
{
	void display()
	{
		System.out.println("labrador is black in colour");
	}
}

public class MultilevelInheritance {
public static void main(String[] args)
{
	Labrador l=new Labrador();
	l.display1();
	l.display2();
	l.display();
	}
}