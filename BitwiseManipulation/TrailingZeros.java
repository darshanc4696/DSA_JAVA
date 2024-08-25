package com.BitwiseManipulation;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(counttrailZero(n));

	}

	private static int counttrailZero(int n) 
	{
		return (int)(Math.log10((n & (n-1)) ^ n) / Math.log10(2));
	}

}
