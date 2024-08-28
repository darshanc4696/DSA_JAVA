package com.ArraysDS;

public class SpanOfArray 
{
	static int span(int[] ar)
	{
		int max= ar[0];
		int min = ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] > max)
			{
				max= ar[i];
			}
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		
		return Math.subtractExact(max, min); // or return max-min;
	}

	public static void main(String[] args) 
	{
		int []ar = {1,4,2,8,5,13,11,47,34};
		System.out.println(span(ar));
	}

}
