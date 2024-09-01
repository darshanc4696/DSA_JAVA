package com.ArraysDS;

public class ReverseTheArray 
{
	static void reverse(int[] ar)
	{
		int i=0, j=ar.length-1, temp=0;
		
		while(i<j)
		{
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = ar[i];
			
			i++; j--;
		}
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,5,6};
		for(int i=0;i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		reverse(ar);
		System.out.println();
		
		for(int i=0;i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
