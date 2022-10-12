package com.stack.program;

public class StackProgram {

	public Node head;
		// FOR NODE CLASS
	   class Node  {
			int data;
			Node next;
			// Constructor 
			Node (int data){
				this.data=data;
				this.next=null;
			}
		}
	   // Push Method
			public void push(int data) {
				Node newNode=new Node(data);
				if (head == null) {
					head=newNode; 
					System.out.print(head.data+"->");
				}
				else {
					newNode.next = head;
					head = newNode;
					System.out.print(head.data+"->");

				}  
			}
		
		public static void main(String[] args) {
			StackProgram obj=new StackProgram();
			obj.push(70);
			obj.push(30);
			obj.push(56);
			System.out.print("null");
		}
	}


