package com.DataStructures.Logical;

public class Queue 
{
	int[] arr;
	int startpointer;
	int endpointer;
	
	public Queue(int size)
	{
		this.arr = new int[size];
		this.startpointer=-1;
		this.endpointer=-1;
		System.out.println("Queue Created of Size : "+size);
	}
	public boolean isQueueFull()
	{
		if(startpointer==arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enQueue(int valuetoBeInserted)
	{
		if(isQueueFull())
		{
			System.out.println("Queue OverFlow");
			return;
		}
		else
		{
			arr[startpointer+1]=valuetoBeInserted;
			startpointer++;
		}
	}
	public boolean isQueueEmpty()
	{
		if(startpointer==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void deQueue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue UnderFlow");
			return;
		}
		else
		{
			System.out.println("Value : "+arr[endpointer+1]);
			endpointer++;
		}
	}
	public static void main(String[] args) 
	{
		Queue q = new Queue(5);
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		
		q.deQueue();
		
		
		
		
		
		
		
	}
	
}
