package com.ArraysDS;

public class MaximumConsecuitveOnes 
{
	static int maxConsecutiveOnes(int[] ar)
	{
		int count = 0, maxCount = 0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] == 1)
			{
				count++;
			}
			else
			{
				if(count > maxCount)
				{
					maxCount = count;
				}
				count = 0;
			}
		}
		if(count > maxCount)
		{
			maxCount = count;
		}
		
		return maxCount;
	}

	public static void main(String[] args) 
	{
		int ar[] = {0,1,1,0,0,1};
		
		System.out.println(maxConsecutiveOnes(ar));
	}

}
