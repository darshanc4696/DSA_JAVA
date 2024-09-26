package com.DoublyLinkedList;

import java.io.Serializable;

class Node
{
	int data;
	Node prev;
	Node next;
	
	public Node(int data) {
		this.data = data;
		prev = null;
		next=null;
	}
}


class doublyLL
{
	Node head;
	Node tail;
	
	void add(int data) {
		
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	
	void printLL() {
		Node curr = head;
		
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	void printReverse()
	{
		Node curr = tail;
		
		while(curr != null)
		{
			System.out.print(curr.data+" ");
			curr = curr.prev;
		}
		System.out.println();
	}
	
	void addFirst(int data) {
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
			tail = temp;
		}
		else
		{
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	void addBasedOnIndex(int data, int index) throws IndexOutOfBoundsException {
		Node temp = new Node(data);
		
		try {
			int count = 0;
			Node curr = head;
			while(count < index-1)
			{
				count++;
				curr = curr.next;
			}
			
			curr.next.prev = temp;
			temp.next = curr.next;
			temp.prev = curr;
			curr.next = temp;
			
		} 
		catch (Exception e) {
			throw (new IndexOutOfBoundsException()); 
			
		}
	}
	
	void addAll(int[] ar) {
		for(int e : ar)
		{
			add(e);
		}
	}
	
	void removeFirst() {
		if(head == null) {
		}
		else if(head.next == null)
		{
			head = null; 
			tail = null;
		}
		else
		{
			Node curr = head;
			head = head.next;
			head.prev = null;
			curr.next = null;
		}
	}
	
	void removeLast() {
		if(head == null) {
		}
		else if(head.next == null)
		{
			head = null; 
			tail = null;
		}
		else
		{
			Node curr = tail;
			tail = tail.prev;
			tail.next = null;
			curr.prev = null;
		}
	}
	
	Serializable indexOf(int data)
	{
		int index = 0;
		
		Node curr = head;
		while(curr != null)
		{
			if(curr.data == data) return index;
			index++;
			curr = curr.next;
		}
		
		return "Not found";
	}
}


public class DoublyLinkedList 
{

	public static void main(String[] args) 
	{
		doublyLL dll = new doublyLL();
		dll.add(4);
		dll.add(3);
		dll.add(2);
		dll.add(1);
		dll.add(5);
		dll.add(6);

//		dll.printLL();
//		int[] ar = {7,8,9,10,11};
//		dll.addAll(ar);
//		dll.printLL();
//		dll.removeFirst();
//		dll.printLL();
//		dll.removeLast();
//		dll.printLL();
		
		System.out.println(dll.indexOf(6 ));
		
	}

}
