package com.Matrices;

import java.util.Scanner;

public class SpiralMatrix 
{
	static void printSpiralMatrix(int[][] ar)
	{
		int top = 0, bottom = ar.length-1;
		int left = 0, right = ar[0].length-1;
		
		
		while(top <= bottom && left <= right)
		{
			for(int i=left; i<=right; i++)
			{
				System.out.print(ar[top][i]);
			}
			top++;
			
			for(int i=top; i<=bottom; i++)
			{
				System.out.print(ar[i][right]);
			}
			right--;
			
			if(!(top <= bottom && left <= right))
			{
				break;
			}
			
			for(int i=right; i>=left; i--)
			{
				System.out.print(ar[bottom][i]);
			}
			bottom--;
			
			for(int i=bottom; i>=top; i--)
			{
				System.out.print(ar[i][left]);
			}
			left++;
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
		
		printSpiralMatrix(ar);

	}

}
