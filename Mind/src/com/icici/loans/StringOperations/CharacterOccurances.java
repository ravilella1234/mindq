package com.icici.loans.StringOperations;

public class CharacterOccurances 
{

	public static void frequencyCount(String str)
	{
		str=str.replace(" ", "");
		while(str.length() > 0)
		{
			char ch = str.charAt(0);
			System.out.println(ch + " " + countCharacter(str,ch));
			str=str.replace(""+ ch,"");
		}
		
	}
	
	public static int countCharacter(String str, char ch) 
	{
		int count = 0;
		while(str.indexOf(ch)!= -1)
		{
			count++;
			str=str.substring((str.indexOf(ch)+1));
		}
		return count;
	}

	public static void main(String[] args) 
	{
		String str="malayalam";
		System.out.println(str);
		frequencyCount(str);

	}

}
