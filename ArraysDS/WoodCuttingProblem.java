package com.ArraysDS;

public class WoodCuttingProblem 
{
	static int findWoodCount(int[] ht, int mid)
	{
		int total = 0;
		
		for(int i=0; i<ht.length; i++)
		{
			if(ht[i] > mid)
			{
				total += (ht[i]-mid);
			}
		}
		
		return total;
	}

	static int cuttingHeight(int[] ht, int b)
	{
		int maxHeight = ht[0];
		for(int i=1; i<ht.length; i++)
		{
			if(ht[i]>maxHeight)
			{
				maxHeight = ht[i];
			}
		}
		
		int l=0,h=maxHeight, mid=0;
		
		while(l<=h)
		{
			mid = (l+h)/2;
			
			int wc = findWoodCount(ht, mid);
			
			if(wc == b || l == mid)
			{
				return mid;
			}
			else if(wc > b)
			{
				l = mid;
			}
			else
			{
				h = mid;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		int[] treeHeights = {20,17,15,10};
		int hSaw = 8;
		
		System.out.println(cuttingHeight(treeHeights, hSaw));

	}

}
