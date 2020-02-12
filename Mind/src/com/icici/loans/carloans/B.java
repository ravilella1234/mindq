package com.icici.loans.carloans;

public class B extends A
{
	
	
	public void m2()
	{
		System.out.println("iam m2 from classB");
	}
	
	public void m1()
	{
		System.out.println("iam overriden  m1 from ClassB");
	}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		m6();
	
		
		//A a=new A();  // HasA RelationShip
		//a.m1();
		
		//A obj =new B();
		//obj.m1();
		
		//B obj1=new A();
		
		
	}

	

}
