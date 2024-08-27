package com.Recursion;

import java.util.Scanner;

public class TowerOfHanoi 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		hanoi(n,'A','B','C');
	}

	private static void hanoi(int n, char src, char aux, char dest) 
	{
		if(n == 1)
		{
			System.out.println(src+"--->"+dest);
			return;
		}
		hanoi(n-1, src, dest, aux);
		hanoi(1, src, aux, dest);
		hanoi(n-1, aux, src, dest);
	}

}
