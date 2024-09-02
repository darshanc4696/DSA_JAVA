package com.ArraysDS;

public class MoveZerosToEnd 
{
	static void moveZeros(int[] ar)
	{
		if(ar.length == 0 || ar.length == 1)
		{
			return;
		}
		
		int i=0,j=0;
		
		while(i < ar.length)
		{
			if(ar[i]==0)
			{
				i++;
			}
			else
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				j++;i++;
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] ar = {0,1,0,2,3,0,5};
		
		moveZeros(ar);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
