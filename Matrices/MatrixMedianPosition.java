package com.Matrices;

import java.util.Scanner;

public class MatrixMedianPosition 
{
	static int binarySearch(int[] ar, int mid)
	{
		int l=0, h=ar.length-1;
		
		while(l<=h)
		{
			int m = (l+h)/2;
			
			if(ar[m] == mid)
			{
				return m;
			}
			else if(ar[m] < mid)
			{
				l = m+1;
			}
			else
			{
				h = m-1;
			}
		}
		
		return -l;
	}
	
	
	static int matrixMedian(int[][] ar)
	{
		int min = ar[0][0], max = ar[0][ar[0].length-1], mid=0;
		int medianPos = (ar.length * ar[0].length +1)/2;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i][0] < min)
			{
				min = ar[i][0];
			}
			if(ar[i][ar[0].length-1] > max)
			{
				max = ar[i][ar[0].length-1];
			}
		}
		
		
		while(min < max)
		{
			mid = (min+max)/2;
			int count=0;
			
			for(int i=0; i<ar.length; i++)
			{
				int x = binarySearch(ar[i], mid);
				if(x >= 0)
				{
					while(ar[i][x] == mid)
					{
						x++;
					}	
					count += x;
				}
				else
				{
					count += -x;
				}

			}
			
			if(count < medianPos)
			{
				min = mid+1;
			}
			else
			{
				max = mid;
			}
			
		}
		
		return min;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		
		int[][] ar = new int[row][column];
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println(matrixMedian(ar));

	}

}
