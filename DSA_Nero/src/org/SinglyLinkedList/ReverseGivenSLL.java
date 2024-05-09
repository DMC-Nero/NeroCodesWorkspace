package org.SinglyLinkedList;

public class ReverseGivenSLL {

	private ListNode head;

	// --------------------------------------------------------------------------------------------
	// creating ListNode nested class .
	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// --------------------------------------------------------------------------------------------
	// method to display / print the data of a SinglyLinkedList
	public void display(ListNode head) {
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
			int count = 1; // 10 -> 11 -> 12 -> 13 -> null
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
	// method to reverse the Given SLL
	public ListNode reverse(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;

		}

		return previous;
	}

	// --------------------------------------------------------------------------------------------
	// main method
	public static void main(String[] args) {
		ReverseGivenSLL sll = new ReverseGivenSLL();
		sll.insertData(1, 11); // 11 -> null
		sll.insertData(2, 12); // 11 -> 12 -> null
		sll.insertData(3, 13); // 11 -> 12 -> 13 -> null
		sll.insertData(4, 14); // 11 -> 12 -> 13 -> 14 -> null
		sll.insertData(5, 15); // 11 -> 12 -> 13 -> 14 -> 15 -> null
		sll.display(sll.head);
		System.out.println();
		ListNode reverseListHead = sll.reverse(sll.head);
		sll.display(reverseListHead);

	}
}
