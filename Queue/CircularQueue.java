package com.Queue;


class CQueue
{
	int[] ar;
	int front;
	int rear;
	int size;
	int capacity;
	
	public CQueue(int capacity)
	{
		this.capacity = capacity;
		this.ar = new int[capacity];
		this.front = 0;
		this.rear = -1;
	}
	
	public void enqueue(int data)
	{
		if(size == capacity) {
			System.out.println("Queue is full, "+data+" cannot be added");
		}
		else
		{
			rear = (rear+1)%capacity;
			ar[rear] = data;
			size++;
		}
	}
	
	public int dequeue() {
		if(size == 0) {
//			System.out.println("Queue is empty. No elements Present");
			return -1;
		}
		else
		{
			int ele = ar[front];
			front = (front+1)%capacity;
			size--;
			return ele;
		}
	}
	
	public int getFront() {
		if(size > 0) {
			return ar[front];
		}
		else {
			return -1;
		}
	}
	
	public int getRear() {
		if(size > 0) {
			return ar[rear];
		}
		else {
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}

}



public class CircularQueue {

	public static void main(String[] args) {
		
		CQueue cq = new CQueue(3);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		System.out.println(cq.getFront());
		System.out.println(cq.getRear());
		System.out.println(cq.isEmpty());
		System.out.println(cq.isFull());
		System.out.println(cq.dequeue());
		System.out.println(cq.isFull());
		cq.enqueue(4);
		System.out.println(cq.getFront());
		System.out.println(cq.getRear());
		

	}

}
