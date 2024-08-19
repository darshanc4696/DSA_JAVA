package com.BitwiseManipulation;

import java.util.Scanner;

public class SwapEvenOddBits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(swapBits(n));

	}

	private static int swapBits(int n) 
	{
		return ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
	}

}
