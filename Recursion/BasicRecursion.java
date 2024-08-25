package com.Recursion;

import java.util.Scanner;

public class BasicRecursion {

	private static void fun(int n) 
	{
		if(n > 0)
		{
			System.out.println(n);
			fun(n-1);
		}
		return;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fun(n);
	}

}
