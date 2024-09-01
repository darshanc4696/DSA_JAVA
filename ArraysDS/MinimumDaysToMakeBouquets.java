package com.ArraysDS;

public class MinimumDaysToMakeBouquets 
{
	static boolean isPossible(int[] ar, int boq, int flowers, int m)
	{
		int adj=0; int b=0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] <= m)
			{
				adj++;
				if(adj == flowers)
				{
					b++;
					if(b == boq)
					{
						return true;
					}
					adj=0;
				}
			}
			else
			{
				adj = 0;
			}
		}
		
		return false;
	}
	
	static int minDays(int[] ar, int boq, int flowers)
	{
		int l=ar[0], h=0, m=0, res=0;
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i] < l)
			{
				l = ar[i];
			}
			if(ar[i] > h)
			{
				h = ar[i];
			}
		}
		
		while(l <= h)
		{
			m = (l+h)/2;
			if(isPossible(ar, boq, flowers, m))
			{
				res = m;
				h=m-1;
			}
			else
			{
				l = m+1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) 
	{
		int[] bloomDay = {2,4,6,3,10,9};
		int boq = 2;
		int flowers = 3;
		
		System.out.println(minDays(bloomDay, boq, flowers));
	}

}
