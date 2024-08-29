package com.ArraysDS;

public class CountOfSmallerAndEqualElements 
{
	static int countElements(int[] ar, int k)
	{
		int l=0, h=ar.length-1, mid=0;
		
		while(l<=h)
		{
			mid = (l+h)/2;
			
			if(k == ar[mid])
			{
				while(mid+1 < ar.length && ar[mid+1] == k)
				{
					mid++;
				}
				break;
			}
			else if(k < ar[mid])
			{
				h = mid-1;
			}
			else
			{
				l = mid+1;
			}
		}
		
		if(ar[mid] == k)
		{
			return mid+1;
		}
		else
		{
			return mid;
		}
	
	}
	
	
	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,23,24,26,26};
		int num =  10;
		
		System.out.println(countElements(ar, num));
		

	}

}
