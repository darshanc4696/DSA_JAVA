package com.Stack;

import java.util.ArrayList;

class StackOverflowException extends Exception
{
	public StackOverflowException()
	{
		super("No Elements to remove");
	}
}

class Stack
{
	ArrayList<Integer> stack= null;
	int top = -1;
	
	public Stack() {
		this.stack = new ArrayList<Integer>();
	}
	
	void push(int element) {
		top++;
		this.stack.add(element);
	}
	
	void pop() throws StackOverflowException {
		if(stack.size() == 0)
		{
			throw new StackOverflowException();
		}
		
			int t = stack.remove(stack.size()-1);
			System.out.println("popped : "+t);
			top--;
			
//			Integer t = stack.remove(top);
//			System.out.println("Popped: "+t);
//			top--;
	}
	
	void printStack()
	{
		
		if(!stack.isEmpty())
		{
			for(int i : stack)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("stack is empty");
		}
	}
}


public class AllAboutStack 
{
	public static void main(String[] args) throws Exception
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.printStack();
		stack.pop();
		stack.pop();

		stack.printStack();
		
		

	}

}
