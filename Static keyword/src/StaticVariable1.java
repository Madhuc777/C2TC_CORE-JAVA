	class Student
	{
		int id;
		String name;
		static String college="Dr AIT";
		
		Student(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		void display()
		{
			System.out.println(id+ "   " +name+ "   " +college);
		}
		
	}
public class StaticVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Dhoni");
		Student s2=new Student(102,"kohli");
		
		s1.display();
		s2.display();

	}

}
