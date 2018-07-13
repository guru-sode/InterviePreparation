package com.guru.imp;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=scan.nextLine();
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println("Reverse:"+rev);
	}

}
