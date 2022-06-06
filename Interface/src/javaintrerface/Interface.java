//complete abstraction by interface
package javaintrerface;
 interface Car
{
	public void start();
	void stop();
	void refuel();
}
 	class BMW implements Car
{

		@Override
		public void start() {
			// TODO Auto-generated method stub
		System.out.println("BMW starts");	
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("BMW stops");
		}

		@Override
		public void refuel() {
			// TODO Auto-generated method stub
			System.out.println("BMW refuel completed");
		}
		public void theftsafety() 
		{
		System.out.println("BMW is theft safety");
		}
}
public class Interface {
public static void main(String[] args)
{
	BMW b =new BMW();
	b.start();
	b.stop();
	b.refuel();
	b.theftsafety();
	Car c = new BMW();
	c.start();
	c.stop();
	c.refuel();
	
}
}
