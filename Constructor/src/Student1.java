
public class Student1 {
	
	int id;
	String name;
	
	Student1(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	//constructor to initialize another object
	Student1(Student1 s)
	{
		id=s.id;
		name=s.name;
	}
	void print()
	{
		System.out.println(id+  "  "  +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s=new Student1(11,"Dhoni");
		Student1 s1=new Student1(12,"Sachin");
		
		s.print();
		s1.print();
	}

}
