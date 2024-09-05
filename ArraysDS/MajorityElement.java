package com.ArraysDS;

public class MajorityElement 
{
	public static int majorityElement(int[] ar)
	{
		int majele = ar[0];
		int count = 1;
		
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i] == majele) count++;
			else 
			{
				count--;
			}
			
			if(count == 0)
			{
				majele = ar[i];
				count = 1;
			}
		}
		
		return majele;
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,1,2,2,1,1};
		
		System.out.println(majorityElement(ar));
	}

}
