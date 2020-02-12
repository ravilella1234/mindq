package com.icici.loans.homeloans;


import com.icici.loans.carloans.A;
import com.icici.loans.carloans.B;

public class C extends A
{
	
	public void m1()
	{
		System.out.println("iam overriden  m1 from ClassC");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from classC");
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.m3();
		c.m1();
		
		A a=new A();
		a.m1();
	}

	
}
