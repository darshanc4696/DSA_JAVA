package com.Matrices;

import java.util.Scanner;

public class RotateImage 
{
	static void rotate_nintyDegree(int[][] ar)
	{
		//transpose
		for(int i=0; i<ar.length; i++) 
		{
			for(int j=i+1; j<ar[0].length; j++)
			{
				int temp = ar[i][j];
				ar[i][j] = ar[j][i];
				ar[j][i] = temp;
			}
		}
		
		//reverse[mirror them]
		int left = 0, right = ar[0].length-1;
		
		while(left<right)
		{
			int pointer = 0;
			while(pointer < ar.length)
			{
				int temp = ar[pointer][left];
				ar[pointer][left] = ar[pointer][right];
				ar[pointer][right] = temp;
				pointer++;
			}
			left++;
			right--;
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
		
		rotate_nintyDegree(ar);
		
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
