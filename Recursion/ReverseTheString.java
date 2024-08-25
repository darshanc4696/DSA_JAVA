package com.Recursion;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(reverseS(s,"",s.length()-1));

	}

	private static String reverseS(String s ,String r ,int i) 
	{
		if(i<0)
		{
			return r;
		}
		return reverseS(s,r+s.charAt(i), i-1);
		
		
	}

}
