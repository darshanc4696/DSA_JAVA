package com.ArraysDS;

public class FindFirstAndLastPositionOfElement 
{
	static int[] position(int[] ar, int key)
	{
		int l=0, h=ar.length-1,mid=0;
		int[] res = {-1,-1};
		
		while(l<=h)
		{
			mid = (l+h)/2;
			
			if(key == ar[mid])
			{
				res[0] = mid;
				h = mid-1;
			}
			else if(key < ar[mid])
			{
				h = mid-1;
			}
			else
			{
				l = mid+1;
			}
		}
		
		l=0;
		h=ar.length-1;
		mid=0;
		
		while(l<=h)
		{
			mid = (l+h)/2;
			
			if(key == ar[mid])
			{
				res[1] = mid;
				l=mid+1;
			}
			else if(key < ar[mid])
			{
				h = mid-1;
			}
			else
			{
				l = mid+1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) 
	{
		int[] ar = {1,2,4,5};
		int key = 2;
		
		int[] res = position(ar, key);
		for(int i=0; i<res.length; i++)
		{
			System.out.println(res[i]);
		}
		
	}
}
