package com.icici.loans.homeloans;

import com.icici.loans.carloans.A;

public class C extends A
{
	
	public void m3()
	{
		System.out.println("iam m3 from classC");
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.m3();
		c.m1();
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
