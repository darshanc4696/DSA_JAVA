package com.Queue;


class Node
{
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}


class LQueue
{
	Node front;
	Node rear;
	int size;
	
	LQueue(){
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		if(isEmpty()) {
			this.front = temp;
			this.rear = temp;
			size++;
		}
		else {
			rear.next = temp;
			rear = temp;
			size++;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		else {
			Node temp = front;
			front = front.next;
			temp.next = null;
			size--;
			return temp.data;
		}
	}
	
	public int getFront() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return front.data;
		}
		
	}
	
	public int getRear() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return rear.data;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

}


public class AllAboutQueue_LinkedList {

	public static void main(String[] args) {
		
		LQueue lQueue = new LQueue();
		lQueue.enqueue(1);
		lQueue.enqueue(2);
		lQueue.enqueue(3);
		System.out.println(lQueue.getFront());
		System.out.println(lQueue.getRear());
		lQueue.dequeue();
		System.out.println(lQueue.getFront());
		System.out.println(lQueue.getRear());
		

	}

}
