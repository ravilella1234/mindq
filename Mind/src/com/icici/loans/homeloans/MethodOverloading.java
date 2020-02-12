package com.icici.loans.homeloans;

public class MethodOverloading 
{

	
	public void m1(Object y)
	{
		System.out.println(y);
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.m1(100);
		obj.m1(12.23f);
		obj.m1("ravilella");
		obj.m1(10);
		obj.m1(23.456);
		obj.m1(200.34f);
	}

}
