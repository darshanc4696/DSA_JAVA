package com.Queue;


class Queue
{
	int[] ar;
	int front;
	int rear;
	int size;
	int capacity;
	
	public Queue(int capacity)
	{
		this.capacity = capacity;
		this.ar = new int[capacity];
		this.front = 0;
		this.rear = -1;
	}
	
	public void enqueue(int data)
	{
		if(rear == capacity-1) {
			System.out.println("Queue is full, "+data+" cannot be added");
		}
		else
		{
			ar[++rear] = data;
			size++;
		}
	}
	
	public int dequeue() {
		if(front>rear) {
//			System.out.println("Queue is empty. No elements Present");
			return -1;
		}
		else
		{
			int ele = ar[front++];
			return ele;
		}
	}
	
	public int getFront() {
		if(size == 0) {
			return -1;
		}
		else {
			return ar[front];
		}
	}
	
	public int getRear() {
		if(size == 0) {
			return -1;
		}
		else {
			return ar[rear];
		}
	}
	
	public boolean isEmpty() {
		return rear == -1;
	}
	
	public boolean isFull() {
		return size >= capacity;
	}
	
	public void display()
	{
		for(int i = front; i<=rear; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}



public class AllAboutQueue_ArrayDS {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		
		queue.display();
		System.out.print(queue.dequeue()+" ");
		System.out.println();
		System.out.println(queue.getFront()+" "+queue.getRear());
		queue.display();
		System.out.println(queue.isEmpty()+" "+queue.isFull());
		

	}

}
