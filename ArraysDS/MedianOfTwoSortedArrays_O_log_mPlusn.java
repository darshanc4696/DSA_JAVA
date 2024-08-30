package com.ArraysDS;

public class MedianOfTwoSortedArrays_O_log_mPlusn 
{
	static float median(int[] ar1, int[] ar2)
	{
		if(ar2.length < ar1.length) {
			return median(ar2, ar1);
		}
		int l=0, h=ar1.length;

		while(l<=h)
		{
			int mid1 = (l+h)/2;
			int mid2 = ((ar1.length+ar2.length+1)/2) - mid1;
			
			int l1 = (mid1 == 0)? Integer.MIN_VALUE: ar1[mid1-1];
			int r1 = (mid1 == ar1.length)? Integer.MAX_VALUE: ar1[mid1];
			int l2 = (mid2 == 0)? Integer.MIN_VALUE: ar2[mid2-1];
			int r2 = (mid2 == ar2.length)? Integer.MAX_VALUE: ar2[mid2];
			
			if(l1 <= r2 && l2 <= r1)
			{
				if( (ar1.length+ar2.length)%2 == 0 )
				{
					return (float)(Integer.max(l1, l2) + Integer.min(r1, r2))/2;
				}
				else
				{
					return Integer.max(l1, l2);
				}
			}
			else if(l2 > r1)
			{
				l = mid1+1;
			}
			else
			{
				h = mid1-1;
			}
		}
		
		return 0.0f;
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {1,3,8,17};
		int[] arr2 = {5,6,7,19,21,25};
		
		System.out.println(median(arr1, arr2));
	}

}
