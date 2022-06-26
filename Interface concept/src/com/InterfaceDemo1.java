	//Interface having default method

package com;
 interface A
 {
	 void show1();
	 void show2();
	 void show3();
	 
	default void print()
	 {
		 System.out.println("good morning");
	 }
 }
abstract class B implements A
 {
	public void show2()
	{
		System.out.println("iam 2");
	}
 }
  class C extends B
  {

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("iam 1");
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("iam 3");
	}
  @Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("hello good evening");
	}
	  
  }
public abstract class InterfaceDemo1 {
	
	public static void main(String []args)
	{
	A a=new C();
	a.show1();
	a.show2();
	a.show3();
	a.print();
}}