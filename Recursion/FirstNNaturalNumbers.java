package com.Recursion;

import java.util.Scanner;

public class FirstNNaturalNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PrintN(n);

	}

	private static void PrintN(int n) 
	{
		if(n == 0)
		{
			return;
		}
//		------ascending--------------
//		PrintN(n-1);
//		System.out.println(n);
		
//		------descending--------------
		System.out.println(n);
		PrintN(n-1);
		
		
	}

}
