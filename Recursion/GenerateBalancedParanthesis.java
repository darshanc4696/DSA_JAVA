package com.Recursion;

import java.util.Scanner;

public class GenerateBalancedParanthesis 
{
	public static void balParan(char[] ar, int n, int i, int o, int c)
	{
		if(i == ar.length)
		{
			System.out.println(ar);
		}
		
		if(o<n)
		{
			ar[i] = '(';
			balParan(ar, n, i+1, o+1, c);
		}
		
		if(c<o)
		{
			ar[i] = ')';
			balParan(ar, n, i+1, o, c+1);
		}
		
	}
	

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		char[] ar = new char[n*2];
		
		balParan(ar, n, 0, 0, 0);
		

	}

}
