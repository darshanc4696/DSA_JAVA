package com.ArraysDS;

public class PaintersPartitionProblem 
{
	static boolean isPossible(int[] ar, int painters, int m)
	{
		int painter = 1, pbc=0;
		
		for(int i=0; i<ar.length; i++)
		{
			if((ar[i]+pbc) <= m)
			{
				pbc += ar[i];
			}
			else
			{
				painter++;
				if(painter > painters)
				{
					return false;
				}
				pbc = ar[i];
			}
		}
		return true;
	}
	
	static int minTime(int[] ar, int painters, int time)
	{
		int l=0, h=0, m=0, res=0;
		
		for(int i=0; i<ar.length; i++)
		{
			h += ar[i];
		}
		
		while(l<=h)
		{
			m = l+(h-l)/2;
			
			if(isPossible(ar, painters, m))
			{
				res = m;
				h = m-1;
			}
			else
			{
				l = m+1;
			}
		}
		
		return res*time;	
	}

	public static void main(String[] args) 
	{
		int[] boards = {10,20,30,40};
		int painters = 2;
		int time = 2;
		
		System.out.println(minTime(boards, painters, time));
	}

}
