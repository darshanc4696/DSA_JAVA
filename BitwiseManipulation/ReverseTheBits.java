package com.BitwiseManipulation;

import java.util.Scanner;

public class ReverseTheBits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverseBits(n));
	}

	private static int reverseBits(int n) 
	{
		int f=31, l=0;
		int rev = 0;
		
		while(f > l)
		{
			if((n & (1 << f)) != 0)
			{
				rev = rev | (1<<l);
			}
			
			if((n & (1<<l)) != 0)
			{
				rev = rev | (1<<f);
			}
			
			f--;
			l++;
		}
		
		return rev;
	}

}
