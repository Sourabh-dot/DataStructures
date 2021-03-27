package com.DataStructures.Logical;

public class Stack {
	int[] arr;
	int startpointer;

		public Stack(int size)
		{
			this.arr = new int[size];
			this.startpointer=-1;
		}
		public boolean isStackFull()
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
		public boolean isStackEmpty()
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
		public void push(int valueToBeInserted)
		{
			if(isStackFull())
			{
				System.out.println("Stack OverFlow");
			}
			else
			{
				arr[startpointer+1] = valueToBeInserted;
				startpointer++;
				System.out.println("Value at "+"["+startpointer+"]"+" : "+arr[startpointer]);
			}
		}
		public void pop()
		{
			if(isStackEmpty())
			{
				System.out.println("Stack Underflow");
			}
			else
			{
				System.out.println("Removing Value at "+"["+startpointer+"]"+": "+arr[startpointer]);
				startpointer--;
			}
		}
		public static void main(String[] args) 
		{
			Stack s = new Stack(5);
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			
			s.pop();
			s.pop();
			s.push(60);
			s.push(80);
		}
		

}
