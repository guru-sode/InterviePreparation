package com.guru.imp;

import java.util.Arrays;
import java.util.Scanner;

public class RevSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence to reverse");
		String sentence=scan.nextLine();
		String[] words=sentence.split(" ");
		String rev=" ";
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i]+" ";
		}
		System.out.println("Reversed sentence:"+(rev));
	}

}
