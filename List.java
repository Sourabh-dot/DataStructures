package com.DataStructures.LinkedList;


public class List 
{
public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList(10);
		list.insert(30, 1);
		list.insert(20, 2);
		list.insert(60, 3);
		list.insert(70, 4);
		
		
		list.traverseLinkedlist();
		list.search(60);
	}
}
