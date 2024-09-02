package com.ArraysDS;

public class RotateArray 
{
	
	static void reverse(int[] ar, int i, int j)
	{
		while(i<j)
		{
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++; j--;
		}
	}
	
	
	static void rotateArray(int[] ar, int rotate)
	{
		int k = rotate%ar.length;

		if(k < 0)
		{
			k = k+ar.length;
		}
		
		reverse(ar, 0, k-1);
		reverse(ar, k, ar.length-1);
		reverse(ar, 0, ar.length-1);
	}

	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,5,6,7};
		int rotate = -14;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
//		---------O(3n) = O(n){time complexity}
		rotateArray(ar, rotate);
		System.out.println();
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
