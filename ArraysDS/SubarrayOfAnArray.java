package com.ArraysDS;

public class SubarrayOfAnArray 
{
	static void subArray(int[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i; j<ar.length; j++)
			{
				for(int k=i; k<=j; k++)
				{
					System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4};
		
		subArray(ar);
	}

}
