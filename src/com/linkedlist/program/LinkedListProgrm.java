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
//   Search Method
	public Object search(int input) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == input)
                return temp.data+"  is in that LinkedList The Value";
            temp = temp.next;
        }
        return "Not In LinkedList";
    }

		
      public static void main(String[] args) {
    	
    	  LinkedListProgrm list=new LinkedListProgrm();
			list.addfirst(56);
			list.addlast(30);
			list.addlast(70);
			list.printlist();
			System.out.println(list.search(30));
		}
}
