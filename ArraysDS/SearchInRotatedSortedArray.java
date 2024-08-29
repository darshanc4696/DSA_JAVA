package com.ArraysDS;

public class SearchInRotatedSortedArray 
{
	static int search(int[] ar, int key)
	{
		int l=0, h=ar.length-1, mid=0;
		
		while(l<=h)
		{
			mid = l+(h-l)/2;
			
			if(ar[mid] == key)
			{
				return mid;
			}
			else if(ar[l] <= ar[mid])
			{
				if(key <= ar[mid] && key >= ar[l])
				{
					h = mid;
				}
				else
				{
					l = mid+1;
				}
			}
			else
			{
				if(key >= ar[mid+1] && key <= ar[h])
				{
					l = mid+1;
				}
				else
				{
					h = mid;
				}
			}
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] ar = {6,7,8,1,2,3,4,5};
		int key = 5;
		
		System.out.println(search(ar, key));
	}
}
