
public class Employe 
{
	int empid;
	int salary;
	String name;
	int phno;
	void setdata(int empid,int salary,String name,int phno)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
		this.phno=phno;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(phno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp1=new Employe();
		emp1.setdata(100, 20000, "madhu", 5037849);
	emp1.display();
	}

}
