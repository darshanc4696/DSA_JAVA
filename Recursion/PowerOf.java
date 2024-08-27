package com.Recursion;

import java.util.Scanner;

public class PowerOf 
{
	

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int pow = scanner.nextInt();
		
		System.out.println(power(n, pow));
	}

	private static long power(int n, int pow) 
	{
		if(pow == 0)
		{
			return 1;
		}
		
		if(pow%2 == 0)
		{
			long res = power(n, pow/2);
			return res*res;
		}
		else
		{
			return power(n, pow-1)*n; 
		}
		
	}

}
