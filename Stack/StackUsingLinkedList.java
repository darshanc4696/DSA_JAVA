package com.Stack;


class StackUnderflowException extends Exception
{
	public StackUnderflowException()
	{
		super("No elements to delete");
	}
}




class Node1
{
	int data;
	Node1 next;
	
	public Node1(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class Stack1
{
	Node1 top;
	int size;
	
	public void push(int data) {
		Node1 temp = new Node1(data);
		temp.next = top;
		top = temp;
		size++;
	}
	
	public void pop() throws StackUnderflowException {
		
		if(top == null)
		{
			throw new StackUnderflowException();
		}
		System.out.println("popped: "+top.data);
		Node1 curr = top;
		top = top.next;
		curr.next = null;
		size--;
	}
	
	public void print() {
		Node1 curr = top;
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
	
	public void peek() throws StackUnderflowException
	{
		if(top == null)
		{
			throw new StackUnderflowException();
		}
		System.out.println("peek is: "+top.data);
	}
}

public class StackUsingLinkedList {

	public static void main(String[] args) throws Exception {
		Stack1 stack1 = new Stack1();
		
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		
		stack1.peek();
		stack1.peek();
		stack1.print();
		stack1.pop();
		stack1.peek();
		stack1.print();
		

	}

}
