package com.BitwiseManipulation;

//Given an array of integers, where all elements but one occur twice, find the unique element.
//Example:
//ar = [1,2,3,4,3,2,1]
//The unique element is 4.

public class LonelyInteger {

	public static void main(String[] args) 
	{
		int[] ar = {1,2,3,4,3,2,1};
		System.out.println(uniqueInt(ar));
	}

	private static int uniqueInt(int[] ar) 
	{
//		-------------------BRUTE FORCE(o(n + n log(n)))-----------------------------
//		
//		Arrays.sort(ar); // [1,1,2,2,3,3,4]
//		for(int i=0; i<ar.length-2; i=i+2)
//		{
//			if(ar[i] != ar[i+1])
//			{
//				return ar[i];
//			}
//		}
//		return ar[ar.length-1];
		
//		--------------------OPTIMSATION-1 (o(n)) and we need extra space---------------------------
//		Set<Integer> hs = new HashSet<Integer>();
//		
//		for(Integer i : ar)
//		{
//			if(hs.contains(i))
//			{
//				hs.remove(i);
//			}
//			else
//			{
//				hs.add(i);
//			}
//		}
//		
//		for(Integer x : hs)
//		{
//			return x;
//		}
//		
//		return -1;
		
//		--------------------OPTIMSATION-2 (o(n))------------------------------------
		int res = 0;
		
		for(int i : ar)
		{
			res = res ^ i;
		}
		
		return res;

	}

}
