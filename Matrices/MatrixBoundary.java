package com.Matrices;

import java.util.Scanner;

public class MatrixBoundary 
{
	static void matrixBoundaryElements(int[][] ar)
	{
		int i=0, j=0;
		for(i=0; i<ar.length; i++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		
		i = ar.length-1;
		for(j=1; j<ar[i].length; j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		
		j = ar.length-1;
		for(i=ar.length-2; i>=0; i--)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		
		i=0;
		for(j=ar[i].length-2; j>=1; j--)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
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
		
		matrixBoundaryElements(ar);

	}

}
