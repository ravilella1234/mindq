package com.icici.loans.homeloans;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(50));
		System.out.println(a.hashCode());
		a.add(2, "saikerthan");
		System.out.println(a);
		a.add(50);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
