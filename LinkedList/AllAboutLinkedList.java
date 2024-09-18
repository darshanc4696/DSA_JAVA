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
	
	void addAtIndex(int index, int number) throws IndexOutOfBoundsException
	{
		Node temp = new Node(number);
		
		try {
			if(index < 1)
			{
				addFirst(number);
			}
			else
			{
				int count = 1;
				Node curr = head;
				
				while(count < index)
				{
					curr = curr.next;
					count++;
				}
				
				temp.next = curr.next;
				curr.next = temp;
			}
		} catch (Exception e) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	void addAll(int[] ar)
	{
		for(int ele : ar)
		{
			addNode(ele);
		}
	}
	
	void removeFirst()
	{
		if(head == null)
		{
			System.out.println("No elements to remove");
		}
		else if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node curr = head;
			head = curr.next;
			curr.next = null;
		}
	}
	
	void removeLast()
	{
		if(head == null)
		{
			System.out.println("No elements to remove");
		}
		else if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node curr = head;
			
			while(curr.next.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = null;
		}
	}
	
	public int indexOf(int num)
	{
		if(head == null)
		{
			return -1;
		}
		else
		{
			Node curr = head;
			int index = 0;
			
			while(curr != null)
			{
				if(curr.data == num) return index;
				index++;
				curr = curr.next;
			}
			
			return -1;
		}
	}
	
	public int lastIndexOf(int num)
	{
		Node curr = head;
		int count = 0;
		int index = -1;
		
		while(curr != null)
		{
			if(curr.data == num)  index = count;
			count++;
			curr = curr.next;
		}
		
		return index;
	}
	
	public int size()
	{
		int count = 0;
		Node curr = head;
		
		while(curr != null)
		{
			curr = curr.next;
			count++;
		}
		
		return count;
	}
}

public class AllAboutLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.addNode(1);
		ll.addNode(3);
		ll.addNode(5);
		ll.addNode(6);
		ll.addNode(6);

//		ll.printLinkedList();
//		System.out.println();
//		
//		ll.addAtIndex(21, 4 );
		
//		int[] ar = {1,2,3,4,5,6};
//		ll.addAll(ar);
		
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.removeFirst();
//		ll.removeFirst();
		
//		ll.printLinkedList();
//		System.out.println();
//		
//		ll.removeLast();
//		ll.printLinkedList();
//		System.out.println();
//		ll.removeLast();
//		ll.printLinkedList();
//		System.out.println();
//		ll.removeLast();
//		ll.printLinkedList();
//		System.out.println();
//		ll.removeLast();
//		ll.printLinkedList();
//		System.out.println();
//		ll.removeLast();
//		ll.printLinkedList();
		
//		System.out.println(ll.indexOf(6));
//		System.out.println(ll.lastIndexOf(6));
		
		System.out.println(ll.size());
		
		
		
		
	}

}
