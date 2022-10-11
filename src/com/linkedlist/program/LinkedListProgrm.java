package com.linkedlist.program;

import com.Linklists.Assignment.LinkListUC4;
import com.Linklists.Assignment.LinkListUC4.Node;

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
		 // PRINT METHOD
	public void printlist() {
	     Node currNode = head;
			while (currNode != null)  {
				System.out.print(currNode.data +"->" );
				currNode = currNode.next;
			}
			System.out.println("null");
			
			}
	// ADD - MIDDLE POSITION 
	public void addMiddle(int num,int data) {
		if (num > size || num < 0 ) {
			System.out.println("The input Number is Error");
		}
		
		Node newnode=new Node(data);
		if (head == null || num == 0) {
			newnode.next=head;
			head=newnode;	
		}
		Node currnode=head;
		
		for (int i=1; i<num; i++) {
              if (i==num) {
				
				Node nextnode=currnode.next;
				currnode.next=newnode;
				newnode.next=nextnode;
              }			
		}
		System.out.println(currnode.data+"->"+newnode.data +"->"+currnode.next.data+"->");
	}
	

		
   public static void main(String[] args) {
 	  
	   LinkedListProgrm list=new LinkedListProgrm();
			list.addfirst(56);
			list.addfirst(70);
			list.printlist();
			list.addMiddle(2,30);
     	
			
			
			
		}
}