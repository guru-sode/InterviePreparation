package com.guru.imp;

import java.util.Arrays;
import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=scan.nextInt();
		int[] fib=new int[length];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fib.length;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println("Fib series is:"+Arrays.toString(fib));
	}

}
