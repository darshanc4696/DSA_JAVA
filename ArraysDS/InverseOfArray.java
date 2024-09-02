package com.ArraysDS;

public class InverseOfArray {
	
	static int[] inverse(int[] ar)
	{
		int[] temp = new int[ar.length];
		
		for(int i=0;i<ar.length; i++)
		{
			temp[ar[i]] = i;
		}
		
		return temp;
	}

	public static void main(String[] args) 
	{
		int[] ar = {2,5,1,0,4,3};
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		int[] temp = inverse(ar);
		System.out.println();
		
		for(int i=0; i<temp.length; i++)
		{
			System.out.print(temp[i]+" ");
		}

	}

}
