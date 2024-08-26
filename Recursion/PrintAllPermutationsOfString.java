package com.Recursion;

import java.util.Scanner;

public class PrintAllPermutationsOfString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		permutations (s.toCharArray(), 0);
	}

	private static void permutations(char[] ar, int fi) 
	{
		if(fi == ar.length-1)
		{
			System.out.println(ar);
			return;
		}
		
		for(int i=fi; i<ar.length; i++)
		{
			swap(ar, i, fi);
			permutations(ar, fi+1);
			swap(ar, i, fi);
		}
	}

	private static void swap(char[] ar, int i, int fi) 
	{
		char temp = ar[fi];
		ar[fi] = ar[i];
		ar[i] = temp;
	}
}
