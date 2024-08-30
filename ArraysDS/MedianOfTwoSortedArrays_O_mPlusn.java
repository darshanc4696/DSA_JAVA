package com.ArraysDS;

public class MedianOfTwoSortedArrays_O_mPlusn 
{
	static float median(int[] arr1, int[] arr2)
	{
		int i=0, j=0, k=0;
		int[] temp = new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j < arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				temp[k++] = arr1[i++];
			}
			else
			{
				temp[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length)
		{
			temp[k++] = arr1[i++];
		}
		while(j<arr2.length)
		{
			temp[k++] = arr2[j++];
		}
		
		
		if(temp.length%2 == 0)
		{
			int mid = temp.length/2;
			return (float)(temp[mid]+temp[mid-1])/2;
		}
		else
		{
			return (temp[(0+(temp.length-1))/2]);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,12,13};
		
		System.out.println(median(arr1, arr2));
	}
}
