package com.Stack;

import java.util.Scanner;

class StackUnderflowException2 extends Exception
{
	public StackUnderflowException2()
	{
		super("No elements to delete");
	}
}




class Node2
{
	int data;
	Node2 next;
	
	public Node2(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class Stack3
{
	Node2 top;
	int size;
	
	public void push(int data) {
		Node2 temp = new Node2(data);
		temp.next = top;
		top = temp;
		size++;
	}
	
	public void pop() throws StackUnderflowException2 {
		
		if(top == null)
		{
			throw new StackUnderflowException2();
		}
		Node2 curr = top;
		top = top.next;
		curr.next = null;
		size--;
	}
	
	public void print() {
		Node2 curr = top;
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int peek() throws StackUnderflowException
	{
		if(top == null)
		{
			throw new StackUnderflowException();
		}

		return top.data;
	}
	
	public boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class ClosestSmallest {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scanner.nextInt();
		}
		
		closestSmallest(ar);

	}

	private static void closestSmallest(int[] ar) throws Exception {
		Stack3 stack = new Stack3();

//		------ Naive Approach - (O(n^2))-------------
//		for(int i=0 ; i<ar.length; i++)
//		{
//			int x = -1;
//			for(int j = i-1; j>=0; j--)
//			{
//				if(ar[j] < ar[i])
//				{
//					x = ar[j];
//					break;
//				}
//			}
//			
//			System.out.print(x+" ");
//			
//		}
		
//		------------Optimized Approach - (O(n)) with space complexity (O(n))--------
		
		for(int i=0 ;i<ar.length; i++)
		{
			while(stack.getSize() != 0 && stack.peek() > ar[i]) {
				stack.pop();
			}
			
			if(stack.top == null) {
				System.out.print("-1"+" ");
			}
			else
			{
				System.out.print(stack.top.data+" ");
			}
			
			stack.push(ar[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
