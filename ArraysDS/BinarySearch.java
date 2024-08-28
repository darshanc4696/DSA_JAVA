package com.ArraysDS;

import java.util.Arrays;

public class BinarySearch 
{
	static int binarySearch(int[] ar, int key)
	{
		int l=0, r=ar.length-1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			if(ar[mid] == key)
			{
				return mid;
			}
			else if(key < ar[mid]) 
			{
				r = mid-1;
			}
			else
			{
				l = mid+1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		int []ar = {1,4,2,8,4,5,13,11,47,34};
		// Condition: to apply binary search the array must be sorted first
		Arrays.sort(ar); // {1,2,4,4,5,8,11,13,34,47}
		int key = 34;
		System.out.println(binarySearch(ar, key));		

	}
}
