	//example for runtime polymorphism

	class Bike
	{
		void run()
		{
			System.out.println("bike is running");
		}
	}
	class Splender extends Bike
	{

		@Override
		void run() {
			// TODO Auto-generated method stub
			//super.run();
			System.out.println("splender is running smoothly");
		}
		void miallege()
		{
			System.out.println("splender gives good miallege");
		}
		
	}
	class SplenderPlus extends Splender
	{
		void run()
		{
			System.out.println("splender plus runs faster");
		}
		void mialleg()
		{
			System.out.println("excellent miallege from Splender plus");
		}
	}
public class RuntimePolymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b=new Splender();
		Bike b1=new Bike();
		Splender s=new Splender();
		b.run();
		b1.run();
		s.run();
		System.out.println();
		Splender sp=new SplenderPlus();
		SplenderPlus sp1=new SplenderPlus();
		sp.run();
		sp.miallege();
		sp1.mialleg();
	}

}
