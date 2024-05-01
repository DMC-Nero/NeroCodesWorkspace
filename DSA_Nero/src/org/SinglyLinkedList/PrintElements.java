package org.SinglyLinkedList;

public class PrintElements {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// method to print the elements 
	public void printData() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// main method
	public static void main(String[] args) {
		PrintElements sll = new PrintElements();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(15);
		ListNode third = new ListNode(13);
		ListNode fourth = new ListNode(18);

		// Now we will connect them together to form a chain

		sll.head.next = second; 	// 10 --> 15 --> null
		second.next = third; 		// 10 --> 15 --> 13 --> null
		third.next = fourth;		// 10 --> 15 --> 13 --> 18 --> null

		sll.printData();	// calling the printData method on object of ( sll )
	}

}
