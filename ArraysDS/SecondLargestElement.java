package com.ArraysDS;

public class SecondLargestElement 
{
	static int secondLargest(int[] ar)
	{
		int first=0, second=0;
		
		if(ar[0] > ar[1])
		{
			first = ar[0];
			second = ar[1];
		}
		else
		{
			first = ar[1];
			second = ar[0];
		}
		
		for(int i=2; i<ar.length; i++)
		{
			if(ar[i] > first)
			{
				second = first;
				first = ar[i];
			}
			else if(ar[i] > second && ar[i] != first)
			{
				second = ar[i];
			}
		}
		
		return second;
		
	}

	public static void main(String[] args) 
	{
		int []ar = {1,4,2,8,5,13,11,47,47,34};
		System.out.println(secondLargest(ar));

	}

}
