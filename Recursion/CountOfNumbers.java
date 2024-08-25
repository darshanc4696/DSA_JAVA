package com.Recursion;

import java.util.Scanner;

public class CountOfNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(CountN(n));

	}

	private static int CountN(int n) 
	{
		if(n==0)
		{
			return 0;
		}
		return CountN(n/10)+1;
		
	}

}
