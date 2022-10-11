package com.linkedlist.program;

import com.Linklists.Assignment.LinkListUC5.Node;

public class LinkedListProgrm {
	Node head; 
	int size;

	LinkedListProgrm() {
		this.size=3;
	}

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
		Node currNode = head;
		while (currNode != null)  {
			System.out.print(currNode.data +"->" );
			currNode = currNode.next;
		}
		System.out.println("null");
	}


	public static void main(String[] args) {
		LinkedListProgrm list=new LinkedListProgrm();
		list.addfirst(56);
		list.addlast(30);			
		list.addlast(70);
		list.printlist();	
	}
}