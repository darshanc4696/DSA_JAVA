package com.ArraysDS;

public class TrappingRainWater_O_n_Space_O_1 
{
	static int trappedWater(int[] ar)
	{
		int lhb=ar[0], rhb=ar[ar.length-1], l=0, h=ar.length-1, res=0;
		
		while(l<=h)
		{
			if(lhb <= rhb)
			{
				if(ar[l] >= lhb) 
				{
					lhb = ar[l];
				}
				else
				{
					res += (lhb-ar[l]);
				}
				l++;
			}
			else
			{
				if(ar[h] >= rhb)
				{
					rhb = ar[h];
				}
				else
				{
					res += (rhb-ar[h]);
				}
				h--;
			}
		}
		
		return res;
		
		
	}

	public static void main(String[] args) 
	{
		
		int[] ar = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trappedWater(ar));
	}

}
