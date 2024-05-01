package org.SinglyLinkedList;

import java.util.Scanner;

public class InsertNodeAtBeginning {
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		private ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	// function to insert node at the beginning of SLL
	public void insertFirst(int value) {
		ListNode temp = new ListNode(value);	//creating new node
		temp.next = head;		// connecting new node to head 
		head = temp;			// connecting head node to new node
	}
	
	
	public static void main(String[] args) {
		InsertNodeAtBeginning sll = new InsertNodeAtBeginning();

		sll.insertFirst(10);
		sll.insertFirst(11);
		sll.insertFirst(12);
		sll.insertFirst(13);
		sll.display();
	}
	


}
