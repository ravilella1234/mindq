package com.icici.loans.homeloans;

public class Calculation 
{
	int a,b,c;
	
	public Calculation(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}

	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is  : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is  : " + c);
	}

	public static void main(String[] args) 
	{
		Calculation obj=new Calculation(10,20);
		obj.add();
		obj.sub();
		
		Calculation obj1=new Calculation(100, 200);
		obj1.add();
		obj1.sub();

	}

}
