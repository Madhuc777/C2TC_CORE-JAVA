	//Example for method overriding

class Sports
	{
	public  void sportsRecord()
		{
		System.out.println("Ms Dhoni is a sportsman");
		}
	//static method cannot be overriden
	void print()
	{
	System.out.println("virat is a run machine in cricket");	
	}
	}
class Cricket extends Sports
{

	@Override
	public void sportsRecord() {
		// TODO Auto-generated method stub
		super.sportsRecord();
		System.out.println("ms dhoni won all icc trophis as a captain of indian cricket team");
	}
	
	void display()
	{
		System.out.println("sachin is the god of cricket");
	}
}
public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket c1=new Cricket();
		Sports s1=new Cricket();
		
		c1.sportsRecord();
		System.out.println();
		c1.display();
		System.out.println();
		s1.sportsRecord();
		System.out.println();
		s1.print();
		Sports s= new Cricket();
		s.print();
		System.out.println();
		s.sportsRecord();

	}

}
