package com.ArraysDS;

public class LeadersOfAnArray 
{
	static void leaders(int[] ar)
	{
		int currentLeader = ar[ar.length-1];
		System.out.println(currentLeader);
		
		for(int i=ar.length-2; i>=0; i--)
		{
			if(ar[i] > currentLeader)
			{
				currentLeader = ar[i];
				System.out.println(currentLeader);
			}
			else
			{
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] ar = {8,5,11,6,11,7,6,3};
		
		leaders(ar);
	}

}
