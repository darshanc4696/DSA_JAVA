package com.DynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {
	

	private static int computeFibonacci(int n) {

//		--- Naive Approach: (O(2^n)) ---
//		if(n==0 || n==1) return 1;
//		
//		return computeFibonacci(n-1) + computeFibonacci(n-2);
		
		
//		--- Memoization Technique: TC (O(n)) ,  SC (O(n)) ---
		
		int[] ar = new int[n+1];
		
		if(ar[n] == 0)
		{
			if(n == 0 || n == 1) 
				ar[n] = 1;
			else
				ar[n] = computeFibonacci(n-1) + computeFibonacci(n-2);
		}
		
		return ar[n];
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(computeFibonacci(n));
		sc.close();
		
	}

}
