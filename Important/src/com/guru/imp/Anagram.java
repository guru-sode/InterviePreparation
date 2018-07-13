package com.guru.imp;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
		String first=scan.nextLine();
		System.out.println("Enter the second string");
		String second=scan.nextLine();
		int count=0;
		if(first.length()==second.length())
		{
			for(int i=0;i<first.length();i++)
			{
				String first_char=Character.toString(first.charAt(i));
				for(int j=0;j<second.length();j++)
				{
					String second_char=Character.toString(second.charAt(j));
					if(first_char.equalsIgnoreCase(second_char))
						count++;
					else
						continue;
				}
			}
			if(count==first.length())
				System.out.println("Anagram");
			else
				System.out.println("Not anagram");
		}
		else
			System.out.println("Not anagram");
	}

}
