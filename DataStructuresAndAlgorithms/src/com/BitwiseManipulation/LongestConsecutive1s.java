package com.BitwiseManipulation;

import java.util.Scanner;

public class LongestConsecutive1s {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(numCons1s(n));

	}

	private static int numCons1s(int n) 
	{
		int count = 0;
		
		while(n != 0)
		{
			n = n & (n<<1);
			count++;
		}
		
		return count;
	}

}
