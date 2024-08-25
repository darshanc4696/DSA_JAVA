package com.BitwiseManipulation;

import java.util.Scanner;

public class NumberOfSetBits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(numOfSetBits(n));

	}

	private static int numOfSetBits(int n) 
	{
		
//-------------------------------Brain Kernighan's Algorithm(o(log n)-------------------
		int count = 0;
		
		while(n > 0)
		{
			n = n & (n-1);
			count++;
		}
		
		
		
		return count;
	}

}
