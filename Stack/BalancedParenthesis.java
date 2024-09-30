package com.Stack;

import java.util.Scanner;

class StackUnderflowException1 extends Exception
{
	public StackUnderflowException1()
	{
		super("No elements to delete");
	}
}

class CNode
{
	char data;
	CNode next;
	
	public CNode(char data) {
		this.data = data;
	}
}

class Stack2
{
	CNode top;
	int size;
	
	public void push(char data) {
		CNode temp = new CNode(data);
		temp.next = top;
		top = temp;
		size++;
	}
	
	public void pop() throws StackUnderflowException1 {
		
		if(top == null)
		{
			throw new StackUnderflowException1();
		}
		CNode curr = top;
		top = top.next;
		curr.next = null;
		size--;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public char peek() throws StackUnderflowException1
	{
		if(top == null)
		{
			throw new StackUnderflowException1();
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

public class BalancedParenthesis  {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isBalancedParenthesis(s));
		sc.close();

	}

	private static boolean isBalancedParenthesis(String s) throws Exception {
		
		Stack2 stack = new Stack2();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			else if(stack.getSize() > 0 && 
					(c == ')' && stack.peek() == '(' ||
					c == '}' && stack.peek() == '{' ||
					c == ']' && stack.peek() == '[')) {
						stack.pop();						
			}
			else {
				return false;
			}
		}
		
		if(stack.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
