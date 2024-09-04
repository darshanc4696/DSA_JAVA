package com.ArraysDS;

public class TrappingRainWater_O_n 
{
	static int trappedWater(int[] ar)
	{
		int res=0;
		int[] lb = new int[ar.length];
		int[] rb = new int[ar.length];
		
		lb[0] = ar[0];
		for(int i=1; i<ar.length; i++)
		{
			lb[i] = Math.max(ar[i], lb[i-1]);
		}
		
		rb[rb.length-1] = ar[ar.length-1];
		for(int i=ar.length-2; i>=0; i--)
		{
			rb[i] = Math.max(ar[i], rb[i+1]);
		}
		
		for(int i=1; i<ar.length-1; i++)
		{
			res += (Math.min(lb[i], rb[i])-ar[i]);
		}
		
		return res;
		
	}

	public static void main(String[] args) 
	{
		int[] ar = {4,2,0,3,2,5};
		
		System.out.println(trappedWater(ar));

	}

}
