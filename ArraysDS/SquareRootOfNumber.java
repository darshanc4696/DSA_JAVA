package com.ArraysDS;

public class SquareRootOfNumber 
{
	
	static int squareRoot(int n)
	{
		if(n == 1 || n ==0)
		{
			return n;
		}
		
		int l=1, h=n/2, m=0;
		
		while(l<=h)
		{
			m = (l+h)/2;
			
			if(m*m == n)
			{
				return m;
			}
			else if(m*m < n)
			{
				l = m+1;
			}
			else
			{
				h = m-1;
			}
		}
		return h;
	}

	public static void main(String[] args) 
	{
		int n=2;
		
		System.out.println(squareRoot(n));

	}

}
