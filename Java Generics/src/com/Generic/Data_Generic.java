package com.Generic;

	class Generic<T>
	{
	private	T obj;

	public Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data_Generic [obj=" + obj + ", getObj()=" + getObj() + "]";
	}

	}
	
public class Data_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic <String> g = new Generic<String>("good morning");
		//typecasting is not required by using Generics
		String in = g.getObj();
		System.out.println(in);
	}

}
