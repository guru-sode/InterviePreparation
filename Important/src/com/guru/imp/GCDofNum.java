package com.guru.imp;

import java.util.Arrays;
import java.util.Scanner;

public class GCDofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		System.out.println("GCD:"+GCD(num1, num2));
		System.out.println("Enter the range of array");
		int range=scan.nextInt();
		int[] arr=new int[range];
		for(int i=0;i<range;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Entered array:"+Arrays.toString(arr));
		int GCDofTwo=0;
		for(int i=0;i<range-1;i++)
		{
			GCDofTwo=GCD(arr[i],GCDofTwo);
		}
		System.out.println("GCD of array:"+GCDofTwo);
	}
	public static int GCD(int num1,int num2) {
		if(num2==0)
			return num1;
		else
			return GCD(num2,num1%num2);
	}
}
