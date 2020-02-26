package com.icici.loans.exceptions;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) throws UserDefineException 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the String data :");
			str = sc.nextLine();
			
			try 
			{
				if (str.length() != 10)
					throw new UserDefineException("String whould be 10 characters");
				else
					System.out.println(str);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally 
			{
				System.out.println("iam finally...");
			}
		}

	}

}
