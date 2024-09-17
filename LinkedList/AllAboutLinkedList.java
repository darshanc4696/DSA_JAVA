package com.LinkedList;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}


class LinkedList
{
	Node head;
	Node curr;
	
	void printLinkedList()
	{
		curr = head;
		
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	void addNode(int num)
	{
		Node temp = new Node(num);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node curr = head;
			while(curr.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = temp;
		}	
	}
	
	void addFirst(int num)
	{
		Node temp = new Node(num);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
	}
}

public class AllAboutLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);

		ll.printLinkedList();
		System.out.println();
		
		ll.addFirst(1);
		
		ll.printLinkedList();
	}

}
