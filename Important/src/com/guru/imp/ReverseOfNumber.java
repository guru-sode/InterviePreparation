package com.guru.imp;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int rev=0;
		int dig=0;
		while(num!=0) {
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		System.out.println("Reverse:"+rev);
	}

}
