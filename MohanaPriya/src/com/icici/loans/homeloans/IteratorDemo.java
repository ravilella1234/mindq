package com.icici.loans.homeloans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		 for(int i=1;i<=10;i++)
		 {
			 a.add(i);
		 }
		 System.out.println(a);
		 
		ListIterator<Integer> val = a.listIterator();
		 while(val.hasNext())
		 {
			 Integer var = val.next();
			 if(var==10)
				 val.set(100);
			 else
				 val.remove();
		 }
		 System.out.println(a);
	}

}
