
	//Runtime polymorphism can't be achieved by data members

	class a
	{
		int data=50;
	}
	class b extends a
	{
		int data =100;
	}
public class RuntimePolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a a1=new b();
	System.out.println(a1.data);
	}

}
