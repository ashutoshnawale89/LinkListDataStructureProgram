package com.linkedlist.program;

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
	// Delete First Method 
	public void deletefirst() {
		if (head==null) {
			System.out.println("The list is Empty");
		}
		else {
			head=head.next;
		}
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
		list.addfirst(30);
		list.addfirst(70);
		list.printlist();
		list.deletefirst();
		list.printlist();
	}
}