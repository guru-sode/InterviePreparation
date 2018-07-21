package com.guru.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.tools.ForwardingFileObject;

public class CountingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int range=scan.nextInt();
		int[] array=new int[range];
		System.out.println("Enter the elementes of array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		scan.close();
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			if(hm.containsKey(array[i]))
			{
				hm.put(array[i], hm.get(array[i])+1);
			}
			else
				hm.put(array[i], 1);
		}
		ArrayList<Integer> al=new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1)
				al.add(entry.getKey());
			else
				continue;
		}
		System.out.println("The duplicate items are:"+al);
		System.out.println("Total number of duplicate items:"+al.size());
	}

}
