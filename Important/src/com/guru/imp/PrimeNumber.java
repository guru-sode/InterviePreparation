package com.guru.imp;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		boolean prime=false;;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				prime=true;
				break;
			}
			else
				continue;
		}
		if(prime==true)
			System.out.println("Not prime");
		else
			System.out.println("Number is prime");
	}
}
