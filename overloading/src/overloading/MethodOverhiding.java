package overloading;
class Bank
{
float getRateOfIntrest()
{
	return 6.7f;
}
}
class SBI extends Bank
{
	@Override
	float getRateOfIntrest()
	{
		super.getRateOfIntrest();
		return 6.1f;
	}
}
class HDFC extends Bank
{
	@Override
	float getRateOfIntrest()
	{
		return 5.7f;
	}
}
public class MethodOverhiding {
	public static void main(String[] args)
	{
		SBI obj = new SBI();
	System.out.println(obj.getRateOfIntrest());
	Bank obj1=new HDFC();
	System.out.println(obj1.getRateOfIntrest());
	Bank obj2=new SBI();
	System.out.println(obj2.getRateOfIntrest());
	}

}
