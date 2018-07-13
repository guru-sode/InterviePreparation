package com.guru.imp;

import java.util.Scanner;
import java.util.Stack;

public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number in decimal format");
		int dec=scan.nextInt();
		Stack<Integer> stack=new Stack<>();
		int digit=0;
		while(dec!=0)
		{
			digit=dec%2;
			stack.push(digit);
			dec=dec/2;
		}
		while(!(stack.isEmpty()))
				{
					System.out.print(stack.pop());
				}
	}

}
