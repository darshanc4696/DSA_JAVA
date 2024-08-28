package com.ArraysDS;

public class CeilAndFloor 
{
	static int ceil(int[] ar, int key)
	{
		int l=0, r=ar.length-1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			if(ar[mid] == key)
			{
				return ar[mid];
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
		
		if(l<ar.length)
		{
			return ar[l];
		}
		else
		{
			return -1;
		}
	}

	static int floor(int[] ar, int key)
	{
		int l=0, r=ar.length-1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			if(ar[mid] == key)
			{
				return ar[mid];
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
		
		if(r>=0)
		{
			return ar[r];
		}
		else
		{
			return -1;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int []ar = {1,2,5,7,11};
		System.out.println("ceil is: " + ceil(ar, 10));
		System.out.println("floor is: " + floor(ar, 12));

	}

}
