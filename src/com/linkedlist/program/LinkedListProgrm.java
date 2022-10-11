package com.linkedlist.program;


public class LinkedListProgrm {
Node head;   
	
	class Node {
        int data;
        Node next;
        
        Node (int data) {    //  CONSTRUCTOR 
        	this.data=data;
        	this.next=null;
        }
	}
	// ADD - FIRST POSITION
		public void addfirst(int data) {
			Node newNode=new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}
		// ADD - LAST POSITION
	public void addlast(int data) {
		Node newNode= new Node(data);
		if (head == null) {
			head=newNode;
		}
		Node currNode = head;
		while (currNode.next != null)  {
			currNode = currNode.next;
		}
			currNode.next = newNode;
			return;
	}
       // PRINT METHOD
	public void printlist() {
	     if (head == null) {
	    	 System.out.println("List is Empty");
	     }
	     Node currNode = head;
			while (currNode != null)  {
				System.out.print(currNode.data +"->" );
				currNode = currNode.next;
			}
			System.out.println("null");
			
			}
	public void deletelast() {
		if (head==null) {
			System.out.println("The list is Empty");
		}
		else if (head.next==null) { 
			head=null;            	
		}
		Node currNode = head;
	    Node lastNode = head.next;
	    while(lastNode.next != null) {
	           currNode = currNode.next;
	           lastNode = lastNode.next;
	       }
	 
	       currNode.next = null;
	   }


		
      public static void main(String[] args) {
    	
    	  LinkedListProgrm list=new LinkedListProgrm();
			list.addfirst(56);
			list.addlast(30);
			list.addlast(70);
			list.printlist();
			list.deletelast();
			list.printlist();
		}
}
