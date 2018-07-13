package com.guru.imp;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int range=scan.nextInt();
		int[] arr=new int[range];
		System.out.println("Enter elements");
		for(int i=0;i<range;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Entred array:"+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<range;i++)
		{
			for(int j=0;j<range-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else
					continue;
			}
		}
		System.out.println("Sorted array:"+Arrays.toString(arr));
	}

}
