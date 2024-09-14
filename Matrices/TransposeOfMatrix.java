package com.Matrices;

import java.util.Scanner;

public class TransposeOfMatrix 
{
	static void transpose(int[][] ar)
	{
		for(int i=0; i<ar.length; i++) 
		{
			for(int j=i+1; j<ar[0].length; j++)
			{
				int temp = ar[i][j];
				ar[i][j] = ar[j][i];
				ar[j][i] = temp;
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
		
		transpose(ar);
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
