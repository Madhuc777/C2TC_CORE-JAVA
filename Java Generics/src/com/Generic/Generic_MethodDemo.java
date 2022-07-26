package com.Generic;

import java.util.ArrayList;
import java.util.List;

class Generics
	{
		
		public <E> void printLIstData(  List<E> ab)
		{
			for(E elements:ab)
			{
				System.out.println(elements);
			}
		}
	}

public class Generic_MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> obj = new ArrayList<Integer>();
		
		obj.add(50);
		obj.add(10);
		obj.add(56);
		obj.add(35);
		obj.add(1);
			
		Generics g=new Generics();
		
		g.printLIstData(obj);
		System.out.println();
		
		List <String> obj1 = new ArrayList<String>();
		
		obj1.add("Dhoni");
		obj1.add("is");
		obj1.add("a");
		obj1.add("legend");
		obj1.add("in cricket");
		
		g.printLIstData(obj1);
		System.out.println();
		List <Double> obj2 = new ArrayList<>();
		
		obj2.add(50.7686);
		obj2.add(1066.8);
		obj2.add(56.9808);
		obj2.add(35659.89);
		obj2.add(19785.890);
			
		g.printLIstData(obj2);
	}

}
