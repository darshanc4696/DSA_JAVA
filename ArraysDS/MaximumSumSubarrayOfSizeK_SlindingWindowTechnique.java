package com.ArraysDS;

public class MaximumSumSubarrayOfSizeK_SlindingWindowTechnique 
{
	static int maxSumsubarray(int[] ar, int k)
	{
		int wSum=0, maxSum=Integer.MIN_VALUE;
		
		for(int i=0; i<k; i++)
		{
			wSum += ar[i];
		}
		
		for(int i=k; i<ar.length; i++)
		{
			wSum = wSum-ar[i-k]+ar[i];
			maxSum = wSum>maxSum? wSum:maxSum;
		}
		return maxSum;	
	}

	public static void main(String[] args) 
	{
		int[] ar = {2,5,34,-2,67,23,-5,1};
		int k=3;
		
		System.out.println(maxSumsubarray(ar,k));

	}

}
