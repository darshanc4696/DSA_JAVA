package com.Stack;

import java.util.Scanner;

class StackUnderflowException3 extends Exception
{
	public StackUnderflowException3()
	{
		super("No elements to delete");
	}
}


class Node3
{
	int data;
	Node3 next;
	
	public Node3(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class Stack4
{
	Node3 top;
	int size;
	
	public void push(int data) {
		Node3 temp = new Node3(data);
		temp.next = top;
		top = temp;
		size++;
	}
	
	public void pop() throws StackUnderflowException2 {
		
		if(top == null)
		{
			throw new StackUnderflowException2();
		}
		Node3 curr = top;
		top = top.next;
		curr.next = null;
		size--;
	}
	
	public void print() {
		Node3 curr = top;
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


public class StockSpan {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		stockSpan(ar);

	}

	private static void stockSpan(int[] ar) throws Exception{
//		---------------NAIVE - O(n^2)--------------------------
//		for(int i=0; i<ar.length; i++)
//		{
//			int spanCount=1;
//			for(int j=i-1; j>=0 && ar[j]<ar[i]; j--)
//			{
//				spanCount++;
//			}
//			System.out.print(spanCount+" ");
//		}
		
//		--------------OPT - (O(n)) with space - (O(n))-----------
		Stack4 stack = new Stack4();
		
		for(int i=0; i<ar.length; i++)
		{
			while(stack.top != null && ar[stack.peek()] < ar[i])
			{
				stack.pop();
			}
			
			if(stack.top == null)
			{
				System.out.print((i+1)+" ");
			}
			else
			{
				System.out.print((i-stack.peek())+" ");
			}
			
			stack.push(i);
		}
		
	}

}
