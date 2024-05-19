package org.SinglyLinkedList;

public class MiddleNode {

	private ListNode head;

	private static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = next;
		}
	}
	// --------------------------------------------------------------------------------------------
	public void print() {
		if(head == null) {
			System.out.println("null");
		}
		ListNode current = head;
		while(null != current) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// --------------------------------------------------------------------------------------------
	public void inserData(int data) {
		ListNode temp = new ListNode(data);
		temp.next = head;
		head = temp;
	}
	// --------------------------------------------------------------------------------------------

	public ListNode middleNode() { 		//  1 --> 2 --> 3 --> 4--> 5 --> 6 --> 7 --> 8 --> null
		if(head == null) {
			return null;
		}
		ListNode first = head;
		ListNode second = head;
		while(second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
		}
		return first;
	}
	// --------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		MiddleNode sll = new MiddleNode();
		sll.inserData(10);
		sll.inserData(9);
		sll.inserData(8);
		sll.inserData(7);
		sll.inserData(6);
		sll.inserData(5);
		sll.inserData(4);
		sll.inserData(3);
		sll.print();
		System.out.println("middle node of the Linked List is :- "+sll.middleNode().data);
	}

}
