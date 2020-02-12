package com.icici.loans.carloans;

import java.util.Date;

import com.icici.loans.homeloans.C;

public  class A 
{
	public  void m1()
	{
		System.out.println("iam m1 from ClassA");
	}
	
	public void m6()
	{
		System.out.println("iam m6 static method from Class A");
	}
	
	static
	{
		System.out.println("iam static block from Class A");
		Date dt=new Date();
		System.out.println(dt);
	}
	
	static
	{
		System.out.println("iam second static block from class A");
	}
	
	
	
	public static void main(String[] args) {
		
		
		A obj;
		
		obj=new B();
		obj.m1();
		
		obj=new C();
		obj.m1();
		
	}

}
