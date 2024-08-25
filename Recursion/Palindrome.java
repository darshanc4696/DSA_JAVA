package com.Recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isPalindrome(s, 0, s.length()-1));

	}

	private static boolean isPalindrome(String s, int i, int j) 
	{
		if(s.charAt(i) != s.charAt(j))
		{
			return false;
		}
		
		if(j<=i)
		{
			return true;
		}
		return isPalindrome(s, i+1, j-1);
	}

}
