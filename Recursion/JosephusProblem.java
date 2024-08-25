package com.Recursion;

import java.util.Scanner;

public class JosephusProblem 
{
	static int Josephus(int n, int k)
	{
		if(n == 1)
		{
			return 0;
		}
		return (Josephus(n-1, k)+k)%n;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(Josephus(n, k));

	}

}
