package com.guru.imp;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=0,digit=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		int digit_1=0,ans=0;
		if(sum>9)
		{
			while(sum!=0) {
				digit_1=sum%10;
				ans=ans+digit_1;
				sum=sum/10;
			}
		}
		System.out.println("Sum:"+ans);
	}
}
