package org.SinglyLinkedList;

public class removeDuplicates {

	private ListNode head;
	
	private class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// --------------------------------------------------------------------------------------------
	
	public void display() {
		if ( head == null) {
			System.out.println("null");
		}
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	// --------------------------------------------------------------------------------------------
	public void insertData(int data) {
		ListNode temp = new ListNode(data);
		temp.next = head;
		head = temp;
	}
	
	// --------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
		removeDuplicates sll = new removeDuplicates();
		sll.insertData(13);
		sll.insertData(13);
		sll.insertData(12);
		sll.insertData(12);
		sll.insertData(11);
		sll.insertData(10);
		sll.insertData(10);
		sll.insertData(10);
		sll.display();
		System.out.println();
		sll.removeDuplicate();
		sll.display();
	}
	// --------------------------------------------------------------------------------------------
	public void removeDuplicate() {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

}
