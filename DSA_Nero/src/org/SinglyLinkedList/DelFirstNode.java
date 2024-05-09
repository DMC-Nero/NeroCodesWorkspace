package org.SinglyLinkedList;

public class DelFirstNode {
	private ListNode head;

	// --------------------------------------------------------------------------------------------
	// creating ListNode nested class .
	private static class ListNode {
		private int data;							 // non-static field
		private ListNode next;			 // non-static field

		public ListNode(int data) { // constructor with parameter
			this.data = data;
			this.next = null;
		}
	}
	// --------------------------------------------------------------------------------------------
	// method to display / print the data of a SinglyLinkedList
	public void display() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	// --------------------------------------------------------------------------------------------
	// method to insert Data to a Linked List with position
	public void insertData(int position, int data) {
		ListNode node = new ListNode(data);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			int count = 1; 						// 10 -> 11 -> 12 -> 13 -> null
			ListNode prev = head;
			while (count < position - 1) {
				prev = prev.next;
				count++;
			}
			ListNode adv = prev.next;
			node.next = adv;
			prev.next = node;

		}
	}
	// --------------------------------------------------------------------------------------------
	// method to delete first Node from the Linked List
	public ListNode delFirst() {		 // 1 -> 2 -> 3 -> 4 -> null
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	// --------------------------------------------------------------------------------------------
	// main method
	public static void main(String[] args) {
		DelFirstNode sll = new DelFirstNode(); 		// head -> null
		sll.insertData(1, 1);
		sll.insertData(2, 2);
		sll.insertData(3, 3);
		sll.insertData(4, 4);
		sll.display();
		System.out.println();
		System.out.println(sll.delFirst().data);

		sll.display();
	}

}
