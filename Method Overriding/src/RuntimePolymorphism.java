//example for runtime polymorphism with no methodoverriding  	 	

	class Cricket0
	{
		void century()
		{
			System.out.println("century in cricket is a great milestone");
		}
	}
	class Cricketer1 extends Cricket0
	{

		@Override
		void century() {
			// TODO Auto-generated method stub
			//super.century();
			System.out.println("sachin had scored '100' centuries in cricket");
		}
		
	}
	class Cricketer2 extends Cricketer1
	{
		void records()
		{
			System.out.println("no records");
		}
	}
public class RuntimePolymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket0 c=new Cricketer1();
		Cricket0 c2=new  Cricketer2();
		c.century();
		c2.century();//calls parent class method because no overriden
	}

}
