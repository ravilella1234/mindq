package com.icici.loans.personalloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		
		String s1=" ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.indexOf('k'));
		
		
		String s2=new String("ravikanth");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		//s1=s1+s2;
		//System.out.println(s1);
		
		//s1=s1.concat(s2);
		//System.out.println(s1);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.trim().equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		 String s3="ravi kanth lella";
		 String[] str = s3.split("n");
		System.out.println(str[0]);
		System.out.println(str[1]);
		//System.out.println(str[2]);
		
		
		String s4="RaviKanth";
		System.out.println(s4.toLowerCase().startsWith("ravi"));
		System.out.println(s4.endsWith("anth"));
		
		String s5="ravikanth";
		System.out.println(s5.substring(1, 7));
		
		
		String s6="ravikanth";
		System.out.println(s6.replace('r', 'k'));
		
		System.out.println(s6.replaceAll(s6, "ravi"));
	}
	

}
