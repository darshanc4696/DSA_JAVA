package com.Recursion;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(SumOfN(n));

	}

	private static int SumOfN(int n) 
	{
		if(n==0)
		{
			return 0;
		}
		return SumOfN(n/10)+(n%10);
	}

}
