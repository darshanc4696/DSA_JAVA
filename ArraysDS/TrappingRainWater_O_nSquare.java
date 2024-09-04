package com.ArraysDS;

public class TrappingRainWater_O_nSquare 
{
	static int trappedWater(int[] ar)
	{
		int res = 0;
		for(int i=1; i<ar.length-1; i++)
		{
			int lb = i, hb=i;
			for(int j=0; j<i; j++)
			{
				if(ar[j] > lb) lb = ar[j];
			}
			
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j] > hb) hb = ar[j];
			}
			
			int minb = lb<hb? lb : hb;
			
			res = res + (minb-ar[i]);
		}
		
		return res;
	}

	public static void main(String[] args) 
	{
		int[] ar = {4,2,0,3,2,5};
		
		System.out.println(trappedWater(ar));
	}

}
