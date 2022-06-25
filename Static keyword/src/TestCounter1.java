
public class TestCounter1 {
	
	static int count=0;
	
	void display()
	{
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCounter1 c1=new TestCounter1();
		TestCounter1 c2=new TestCounter1();
		TestCounter1 c3=new TestCounter1();
	//if variable is static type then increment takes place otherwise no incrementation
		c1.display();
		c2.display();
		c3.display();
	}

}
