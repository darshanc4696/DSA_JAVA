package com.ArraysDS;

public class CheckIfArrayIsSorted 
{
	
	static boolean isSorted(int []ar)
	{
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i] < ar[i-1])
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,2,4,3,5,6};
		System.out.println(isSorted(ar));

	}

}
