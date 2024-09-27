package com.CircularLinkedList;

class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
	}
}

class CircularLinkedList
{
	Node head;
	
	void print()
	{
		if(head != null)
		{
			Node curr = head;
			do {
				System.out.print(curr.data+" ");
				curr = curr.next;
			} while (curr != head);
			System.out.println();
		}
		else
		{
			System.out.println("Node Nodes to print");
		}
	}
	
	
	void addFirst(int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			temp.next = temp;
			head = temp;
		}
		else
		{
//			-----------Time Complexity (O(1))---------------
//			Node curr = head;
//			while(curr.next != head)
//			{
//				curr = curr.next;
//			}
//			
//			curr.next = temp;
//			temp.next = head;
//			head = temp;
			
//			------------------OR--------------------------
//			-----------Time Complexity (O(1))---------------
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
		}
	}
	
	void addLast(int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			temp.next = temp;
			head = temp;
		}
		else
		{
//			-----------Time Complexity O(n)-------------
//			Node curr = head.next;
//			while(curr.next != head)
//			{
//				curr = curr.next;
//			}
//			
//			curr.next = temp;
//			temp.next = head;
//			
//			-----------Time Complexity O(1)-------------
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			head = temp;
			
		}
	}
	
	void removeFirst()
	{
		if(head == null) {
		}
		else if(head.next == head) {
			head = null;
		}
		else
		{
//			-----------Time Complexity O(n)-------------
//			Node curr = head;
//			while(curr.next != head) {
//				curr = curr.next;	
//			}
//			curr.next = head.next;
//			head = head.next;
			
//			-----------Time Complexity O(1)-------------
			Node curr = head.next;
			int t = curr.data;
			curr.data = head.data;
			head.data = t;
			
			head.next = curr.next;
			curr.next = null;
			
		}
	}
	
	void removeLast()
	{
		if(head == null){
		}
		else if(head.next == head)
		{
			head = null;
		}
		else
		{
			Node curr = head;
			while(curr.next.next != head)
			{
				curr = curr.next;
			}
			
			curr.next.next = null;
			curr.next = head;
		}
	}
}


public class AllAboutCircularLinkedList {

	public static void main(String[] args) 
	{
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.addLast(5);
		cll.addLast(15);
		cll.addLast(25);
		cll.addLast(35);
		cll.addLast(45);
		
		cll.print();
		cll.addLast(55);
		cll.addLast(65);		
		cll.print();
		cll.removeFirst();
		cll.print();
		cll.removeLast();
		cll.print();
		cll.removeLast();
		cll.print();
		

	}

}
