package com.BitwiseManipulation;

import java.util.Scanner;

public class NumberIsPowOfTwo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(IsNumPowOfTwo(n));

	}

	private static boolean IsNumPowOfTwo(int n) 
	{
		return (n&(n-1)) == 0;
	}

}
