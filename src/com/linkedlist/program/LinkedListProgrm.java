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

	public static void main(String[] args) {
		LinkedListProgrm list=new LinkedListProgrm();
		list.addfirst(56);
		list.addfirst(30);
		list.addfirst(70);
		list.printlist();

	}

}