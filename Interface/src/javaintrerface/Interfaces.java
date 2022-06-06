package javaintrerface;
interface I1
{
	void set(int a,int b);
}
interface I2
{
	void display();
}
class  Impclass implements I1,I2
{
	 static int p=16;
	static int q=40;
	@Override
	public void set(int a, int b) {
		// TODO Auto-generated method stub
		this.p=a;
		this.q=b;
	}
	void incr()
	{
		this.p+=1;
		this.q+=1;
	}
	public void display() 
		// TODO Auto-generated method stub
		{
			System.out.println(this.p);
			System.out.println(this.q);
		}	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Impclass c = new Impclass();
c.display();
c.set(10, 20);
c.incr();
c.display();
	
	}	
	}


