package com.Matrices;

import java.util.Scanner;

public class MatrixZigZag 
{
	static void matrixZigZag(int[][] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			if(i%2 == 0)
			{
				for(int j=0; j<ar[i].length; j++)
				{
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
			else
			{
				for(int j=ar[i].length-1; j>=0; j--)
				{
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
		}
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
		
		matrixZigZag(ar);
		

	}

}
