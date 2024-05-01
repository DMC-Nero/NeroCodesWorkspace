package org.SinglyLinkedList;

public class LengthOfSLL {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// function to find the length of the SLL
	public int length() {
		int count = 0;
		ListNode li = head;
		while (li != null) {
			count++;
			li = li.next;
		}
		return count;
	}

	public static void main(String[] args) {
		LengthOfSLL sll = new LengthOfSLL();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(15);
		ListNode third = new ListNode(13);
		ListNode fourth = new ListNode(18);

		// Now we will connect them together to form a chain
		sll.head.next = second; // 10 --> 15 --> null
		second.next = third; // 10 --> 15 --> 13 --> null
		third.next = fourth; // 10 --> 15 --> 13 --> 18 --> null
		
		// calling the length function on object sll.
		System.out.println(sll.length());
	}

}