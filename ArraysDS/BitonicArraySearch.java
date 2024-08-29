package com.ArraysDS;

public class BitonicArraySearch 
{
	static int ascendingBinarySearch(int[] ar, int key, int range)
	{
		int l=0, h=range;
		
		while(l <= h)
		{
			int mid = (l+h)/2;
			
			if(ar[mid] == key)
			{
				return mid;
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
		
		return -1;
	}
	
	static int descendingBinarySearch(int[] ar, int key, int range)
	{
		int l=range, h=ar.length-1;
		
		while(l <= h)
		{
			int mid = (l+h)/2;
			
			if(ar[mid] == key)
			{
				return mid;
			}
			else if(key < ar[mid])
			{
				l = mid+1;
			}
			else
			{
				h = mid-1;
			}
		}
		
		return -1;
	}
	
	static int bitonic(int[] arr)
	{
		int l=0,h=arr.length-1;
		
		while(l <= h)
		{
			int mid = (l+h)/2;
			
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
			{
				return mid;
			}
			else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1])
			{
				l = mid;
			}
			else
			{
				h = mid;
			}
			
		}
		
		return -1;
	}
	
	static int searchBitonic(int[] ar, int key, int bIndex)
	{
		if(key == ar[bIndex])
		{
			return bIndex;
		}
		if(key > ar[bIndex])
		{
			return -1;
		}
		
		int res = ascendingBinarySearch(ar, key, bIndex-1);
		if(res != -1)
		{
			return res;
		}
		
		int res1 = descendingBinarySearch(ar, key, bIndex+1);
		if(res1 != -1)
		{
			return res1;
		}
		
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int[] ar = {5,6,7,8,9,10,1};
		int key = 8;
		int bIndex = bitonic(ar);
		
		System.out.println(searchBitonic(ar, key, bIndex));
	}

}
