package com.icici.loans.personalloans;

public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		  String a = "one";

		  switch (a)
		  {
			 case "one":
			     System.out.println("You chose One");
			 break;
	
			 case "two":
			     System.out.println("You chose Two");
			break;
	
			 case "three":
			     System.out.println("You chose Three");
			 break;
	
			 case "four":
			     System.out.println("You chose Four");
			 break;
	
			 case "five":
			     System.out.println("You chose Five");
			 break;
	
			 default:
			     System.out.println("Invalid Choice. Enter a no between 1 and 5");
			 break;
		  }

	}

}
