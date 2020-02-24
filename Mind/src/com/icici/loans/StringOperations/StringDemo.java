package com.icici.loans.StringOperations;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * String s1="ravikanth"; System.out.println(s1);
		 * System.out.println(s1.hashCode());
		 * 
		 * String s2=new String("lella"); System.out.println(s2);
		 * System.out.println(s2.hashCode());
		 * 
		 * s1=s1+s2; System.out.println(s1); System.out.println(s1.hashCode());
		 */
		
		StringBuffer s1=new StringBuffer("ravikanth");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer s2=new StringBuffer("lella");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1=s1.append(s2);
		System.out.println(s1);System.out.println(s1.hashCode());
				
	}

}
