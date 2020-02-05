package com.icici.loans.carloans;

public class B extends A
{
	
	public void m2()
	{
		System.out.println("iam m2 from classB");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.m2();
		b.m1();
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
