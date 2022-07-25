package com;
import java.util.*;

class Student
{
	  int id;
	  String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Student> list=new ArrayList<Student>();
		Student s1=new Student(1,"rohith");
		Student s2=new Student(2,"rahul");
		Student s3=new Student(3,"virat");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student st:list) {
			System.out.println(st.id +" "+st.name );
	}

}
}