package com.ArraysDS;

public class AllocateBooks 
{
	static boolean isPossible(int[] ar, int students, int m)
	{
		int spc = 0; int b=1;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] > m) return false;
			if(ar[i] + spc <= m)
			{
				spc += ar[i];
			}
			else
			{
				b++;
				if(b > students) return false;
				spc = ar[i];
			}
		}
		return true;
	}
	
	
	static int allocateBooks(int[] ar, int students)
	{
		int l=ar[0], h=0, m=0;
		
		for(int i=0; i<ar.length; i++)
		{
			h += ar[i];
			if(ar[i] < l)
			{
				l=ar[i];
			}
		}
		int res = -1;
		while(l<=h)
		{
			m = l+(h-l)/2;
			
			if(isPossible(ar, students, m))
			{
				res = m;
				h = m-1;
			}
			else
			{
				l = m+1;
			}
		}
		
		return res;
	}
	

	public static void main(String[] args) 
	{
		int[] ar = {15,17,20};
		int students = 5;
		
		System.out.println(allocateBooks(ar, students));

	}

}
