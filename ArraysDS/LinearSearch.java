package com.ArraysDS;

public class LinearSearch 
{
	static int linearSearch(int[] ar, int key)
	{
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int []ar = {1,4,2,8,4,5,13,11,47,34};
		int key = 3;
		System.out.println(linearSearch(ar, key));
	}

}
