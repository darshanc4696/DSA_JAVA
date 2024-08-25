package com.BitwiseManipulation;

import java.util.Scanner;

public class RightMostSetBit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(posOfRMSB(n));

	}

	private static int posOfRMSB(int n) 
	{
//		---------------------BRUTE_FORCE(o(n))--------------------------
//		String t="";
//		int pos = 0;
//		while(n >= 1)
//		{
//			int rem = n%2;
//			t = rem + t;
//			n = n/2;
//		}
//		
//		for(int i=t.length()-1; i>=0; i--)
//		{
//			if(t.charAt(i) == '1')
//			{
//				return pos+1;
//			}
//			else
//			{
//				pos++;
//			}
//									
//				
//		}
//		return pos;
		
//		---------------------OptimisedApproch(o(1))---------------------------
		
		if(n == 0)
		{
			return -1;
		}
		return (int)(Math.log(n^n&(n-1))/Math.log(2))+1;
	}

}
