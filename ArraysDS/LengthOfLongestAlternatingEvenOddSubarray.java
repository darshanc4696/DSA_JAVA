package com.ArraysDS;

public class LengthOfLongestAlternatingEvenOddSubarray 
{
	static int  longLength1(int[] ar)
	{
//		------------O(n^2)-------------
		int count = 1, maxCount = 1;
		
		for(int i=0; i<ar.length; i++)
		{

			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j]%2 == 0 && ar[j-1]%2 != 0 || 
						ar[j]%2 != 0 && ar[j-1]%2 == 0 )
				{
					count++;
				}
				else
				{
					break;
				}
			}
			maxCount = count>maxCount? count : maxCount;
			count = 1;
		}
		
		return maxCount;
	}

	static int longLength2(int[] ar)
	{
		int count = 1, maxCount=1;
		
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i]%2 == 0 && ar[i-1]%2 != 0 || 
					ar[i]%2 != 0 && ar[i-1]%2 == 0 )
			{
				count++;
				maxCount = count>maxCount? count:maxCount;
			}
			else
			{
				count=1;
			}
		}
		
		return maxCount;
	}
	
	
	public static void main(String[] args) 
	{
		int ar[] = {8,10,13,14,6,5};
		
		System.out.println(longLength2(ar));

	}

}
