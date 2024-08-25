package com.Recursion;

import java.util.Scanner;

public class SumOfElementsInArray {


	private static int SumOfElements(int[] ar, int i) 
	{
		if(i == ar.length)
		{
			return 0;
		}
		
		return SumOfElements(ar, i+1)+ar[i];
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []ar = {1,2,3,8,9};
		
		System.out.println(SumOfElements(ar, 0));;

	}

}
