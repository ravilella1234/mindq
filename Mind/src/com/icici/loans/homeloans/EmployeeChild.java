package com.icici.loans.homeloans;

public class EmployeeChild extends Employee
{
	String address;

	public EmployeeChild(String address) 
	{
		super(1743,"sai",345.34f);
		this.address=address;
		
		System.out.println(this.address);
	}
	
	public void m4()
	{
	
	}

	public static void main(String[] args) 
	{
		EmployeeChild obj=new EmployeeChild("Hyderabad");
		

	}

}
