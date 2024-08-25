package com.BitwiseManipulation;

import java.util.Scanner;

public class MaximumXorValue 
{
    // Function to find the maximum XOR value
    public static int maxXorValue(int[] ar) 
    {
        int maxXor = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) 
        {
            // Update the mask to include the current bit
            mask = mask | (1 << i);
            int newMaxXor = maxXor | (1 << i);

            // Use a set to store the prefixes of all numbers up to the ith bit
            java.util.Set<Integer> prefixes = new java.util.HashSet<>();
            for (int num : ar) 
            {
                prefixes.add(num & mask);
            }

            // Check if there is any pair of prefixes that would result in newMaxXor when XORed
            for (int prefix : prefixes) 
            {
                if (prefixes.contains(prefix ^ newMaxXor)) 
                {
                    maxXor = newMaxXor;
                    break;
                }
            }
        }

        return maxXor;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) 
        {
            ar[i] = sc.nextInt();
        }

        int value = maxXorValue(ar);
        System.out.println(value);
    }
}

