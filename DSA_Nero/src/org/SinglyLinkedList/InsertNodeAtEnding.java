package org.SinglyLinkedList;

public class InsertNodeAtEnding {
	private ListNode head;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
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
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		InsertNodeAtEnding sll = new InsertNodeAtEnding();
		
		sll.head = sll.new ListNode(10);
		sll.endNode(11);
		sll.endNode(12);
		
		sll.display();
	}
	public void endNode(int value) {
		ListNode temp = new ListNode(value);
		if(head == null) {
			head = temp;
			return;
		}
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = temp;
		
	}

	
}
