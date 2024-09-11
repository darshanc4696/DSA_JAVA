package com.Matrices;

import java.util.Scanner;

public class _2DMatrixSearchElement 
{
//	--------------O(m+n)----------------------------
	static boolean searchElement(int[][] ar, int key)
	{
		int i=0 , j=ar[0].length-1;
		
		while(i<ar.length && j>=0)
		{
			if(ar[i][j] == key)
			{
				return true;
			}
			else if(ar[i][j] > key)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		return false;
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
		int key = 20;
		
		System.out.println(searchElement(ar, key));

	}

}
