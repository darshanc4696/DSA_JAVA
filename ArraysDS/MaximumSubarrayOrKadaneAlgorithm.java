package com.ArraysDS;

public class MaximumSubarrayOrKadaneAlgorithm 
{
	private static int maxSubarraySum(int[] ar) 
	{
		int sum = ar[0], maxSum = ar[0];
		
		for(int i=1; i<ar.length; i++)
		{
			if(sum >= 0)
			{
				sum += ar[i];
			}
			else
			{
				sum = ar[i];
			}
			
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,-4};
		
		System.out.println(maxSubarraySum(ar));
	}

}
