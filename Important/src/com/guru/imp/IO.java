package com.guru.imp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String input=scan.nextLine();
		BufferedReader br=null;
		try {
			String content=null;
			br=new BufferedReader(new FileReader("C:\\Users\\pc-pc\\Desktop\\SongApp\\Movies to watch.txt"));
			content=br.readLine();
			while(content!=null) {
				System.out.println(content);
				content=br.readLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br!=null)
				br.close();	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
