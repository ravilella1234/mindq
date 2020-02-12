package com.icici.loans.homeloans;

class Parent
{
	public strictfp Number workHard()
	{
		System.out.println("Wakeup early, goto college....");
		return 0;
		
	}
	
	void care()
	{
		System.out.println("Atmost care......");
	}
	
}

public class Child extends Parent
{
	public strictfp Object workHard()
	{
		System.out.println("Wakeup anytime, goto bar/beauty parlour....");
		return 0;
	}
	
	void love()
	{
		System.out.println("iam in love.....");
	}
	
	 public static void main(String[] args) {
		Child obj=new Child();
		obj.workHard();
		obj.care();
		obj.love();
	}

}
