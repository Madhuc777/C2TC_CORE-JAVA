	class Student
	{
		int roll_no;
		String name;
		static String college="SMVIT";
		
		Student(int roll_no,String name)
		{
		this.roll_no=roll_no;
		this.name=name;
		}

		static void change()
		{
			college="Dr.AIT";
		}

		void display()
		{
			System.out.println(roll_no+ "  " +name +"  " +college);
		}
	}
	
public class StaticVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"MS DHONI");
		Student s2=new Student(2,"SACHIN TENDULKER");
		Student s3=new Student(3,"VIRAT KOHLI");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
	
