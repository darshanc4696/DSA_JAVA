package com.Stack;

import java.util.Scanner;

class StackUnderflowException4 extends Exception
{
	public StackUnderflowException4()
	{
		super("No elements to delete");
	}
}

class CNode1
{
	char data;
	CNode1 next;
	
	public CNode1(char data) {
		this.data = data;
	}
}

class Stack5
{
	CNode1 top;
	int size;
	
	public void push(char data) {
		CNode1 temp = new CNode1(data);
		temp.next = top;
		top = temp;
		size++;
	}
	
	public char pop() throws StackUnderflowException4 {
		
		if(top == null)
		{
			throw new StackUnderflowException4();
		}
		CNode1 curr = top;
		top = top.next;
		curr.next = null;
		size--;
		return curr.data;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public char peek()
	{
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

public class InfixToPostfix {

	public static void main(String[] args) throws StackUnderflowException4 {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		System.out.println(convert(s));

	}

	private static String convert(String s) throws StackUnderflowException4 {
		Stack5 stack = new Stack5();
		String result = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isLetter(ch))
			{
				result += ch;
			}
			else if(ch == '(')
			{
				stack.push(ch);
			}
			else if(ch == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
				{
					char temp = stack.pop();
					result += temp;
				}
				
				if(stack.size != 0) stack.pop();
			}
			else
			{
				if(stack.size == 0 || prec(ch) > prec(stack.peek()))
				{
					stack.push(ch);
				}
				else 
				{
					while(stack.size != 0 && prec(ch) <= prec(stack.peek()) && stack.peek() != '(')
					{
						char temp = stack.pop();
						result += temp;
					}
					stack.push(ch);
				}
			}
			
		}
		
		while(stack.size != 0)
		{
			char temp = stack.pop();
			result += temp;
		}
		
		return result;
		
	}

	private static int prec(char ch) {
		
		if(ch == '^') return 3;
		else if(ch == '*' || ch == '/') return 2;
		else if(ch == '+' || ch == '-') return 1;
		return 0;
	}

}
