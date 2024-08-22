package com.BitwiseManipulation;

import java.util.Scanner;

public class MinimumAndValue 
{

	private static int checkBits(int[] ar, int mask) 
	{
		int count = 0;
		
		for(int i=0; i<ar.length; i++)
		{
			if((mask & ar[i]) == mask)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static int minAndValue(int[] ar) 
	{
		int res = 0;
		int mask = 0;
		
		for(int i=31; i>=0; i--)
		{
			mask = res | (1<<i);
			if(checkBits(ar, mask) >= 2)
			{
				res = res | mask;
			}
		}
		
		return res;
		
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] ar = new int[size];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int value = minAndValue(ar);
		System.out.println(value);

	}

}
