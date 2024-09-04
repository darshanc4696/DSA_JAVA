package com.ArraysDS;

public class FrequencyOfElements 
{
	static void frequency(int[] ar)
	{
		int count = 1;
		
		for(int i=0; i<ar.length-1; i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ar[i] + " " + count);
				count = 1;
			}
		}
		System.out.println(ar[ar.length-1]+" "+count);
	}

	public static void main(String[] args) 
	{
		int[] ar = {20,20,30,30,30,40};
		
		frequency(ar);

	}

}
