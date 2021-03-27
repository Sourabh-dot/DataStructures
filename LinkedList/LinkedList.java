package com.DataStructures.LinkedList;

public class LinkedList 
{
   private SingleNode head=null;// step -1
   private SingleNode tail=null;
   private int size=0;
   private SingleNode tempNode;

   public LinkedList(int valueToBeInsert)// step -2 constructor creation   ---->   parameterized constructor
   {
	   SingleNode node=new SingleNode();
	   node.setValue(valueToBeInsert);
	   node.setNext(null);
	   head=node;
	   tail=node;
	   setSize(1);
   }
   public void insert(int valueToBeInsert,int location) // step -3 inserting the values
   {
	   SingleNode node = new SingleNode();  //  b/c object should be created for every SingleNode...
	   node.setValue( valueToBeInsert);
	   if(!checkExistance())
	   {
		   System.out.println("Linked list does not exist");
		   return;
		
	   }
	   else if(location==0) //step - 4  //inserting new node to head node
	   {
		  node.setNext(head);
		   head=node;  //head node values
	   }else if(location>=size)  //to fetch the last location of the node ---->inserting values to last node
	   {
		   node.setNext(null);  // since it is last node so the address will be null
		   tail.setNext(node);  //tail node values
		   tail = node;  //last node becomes node 5
	   }else
	   {
		  SingleNode tempNode=head; //traversing the address if the location is 3 we need to access the values of node 3
		  							// we need to use tempNode
		  int index = 0;
		  while(index<location-1)  //middle values--->node 2,node 3,node 4
		  {
			  tempNode = tempNode.getNext(); //so we can get the address of  next node--->here node 3-eg
			  index++;
		  }
		  SingleNode newNode = tempNode.getNext();
		  tempNode.setNext(node);
		  node.setNext(newNode);
	   }
	 setSize(getSize()+1); 
   }
   
   public void traverseLinkedlist()// step - 6 for traversing need to create a method
   {
	   if(!checkExistance()) {
		   System.out.println("LinkedList not exist....");
		   return;
	   }else {
		   SingleNode tempNode =  head;
		   for(int i = 0; i<getSize();i++) {
			   System.out.println("value at location :"+i+" is "+tempNode.getValue());
			   tempNode = tempNode.getNext();
		   }
	   }
   }
   
   public void search(int valueToBeSearch) // step - 7 to search where the address us stored...
   {
	   if(!checkExistance()) {
		   System.out.println("linkedlist doestnot exist...");
		   return;
	   }else {
		   SingleNode tempNode= head;
		   for(int i=0;i<getSize();i++)
		   {
			   if(tempNode.getValue() == valueToBeSearch)
			   {
				   System.out.println("value to be search found at location:"+i);
				   return;
			   }
			   tempNode = tempNode.getNext();
		   }
	   }
   }
   
   
   public void delete(int location) // if we want to delete and insert next node
   {
	   if(!checkExistance()) {
		   System.out.println("linkedlist doestnot exist...");
		   return;
	   }else if(location == 0) {
		    head  = head.getNext();
		    if(head == null)
		    {
		    	tail=null;
		    }
		    setSize(getSize() - 1);  //need to know last but one node
	   } else if(location >= size)
	   {
		   SingleNode tempNode = head;
		   for(int i=0;i<getSize()-1;i++)
		   {
			   tempNode = tempNode.getNext();
		   }
		   if(tempNode == head)
		   {
			   head = tail = null;
			   setSize(getSize() - 1);
			   return;
		   }
		   
		   tempNode.setNext(null);
		   tail =tempNode;
		   setSize(getSize() - 1);
		}else {
			SingleNode tempNode = head;
			for(int i =0;i<location - 1 ;i++)
			{
				tempNode = tempNode.getNext();			}
		}
	 tempNode.setNext(tempNode.getNext().getNext());
	 setSize(getSize() - 1);
	   
			
   }
   	public boolean checkExistance()  // step - 8
   	{
	   return head!=null;
   	}
   	public SingleNode getHead() {
	return head;
}
   	public void setHead(SingleNode head) {
	this.head = head;
}
   	public SingleNode getTail() {
	return tail;
}
   	public void setTail(SingleNode tail) {
	this.tail = tail;
}
   	public int getSize() {
	return size;
}
   	public void setSize(int size) {
	this.size = size;
}
   
}

