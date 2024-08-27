package com.Recursion;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int counter = scanner.nextInt();
		
		System.out.println(isLucky(n, counter));

	}

	private static boolean isLucky(int n, int counter) 
	{
		if(n%counter == 0)
		{
			return false;
		}
		if(n<counter)
		{
			return true;
		}
		
		return isLucky(n-(n/counter), counter+1);
		
	}

}
