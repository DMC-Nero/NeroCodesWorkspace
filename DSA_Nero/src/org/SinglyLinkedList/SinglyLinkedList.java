package org.SinglyLinkedList;


public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
//		public static void main(String[] args) {
//			SinglyLinkedList sll = new SinglyLinkedList();
//			sll.head = new ListNode(10);
//			ListNode second = new ListNode(15);
//			ListNode third = new ListNode(13);
//			ListNode fourth = new ListNode(18);
//			
//			// Now we will connect them together to form a chain
//			
//			sll.head.next = second;		// 10 --> 15 --> null
//			second.next = third;		// 10 --> 15 --> 13 --> null
//			third.next = fourth;		// 10 --> 15 --> 13 --> 18 --> null
//			
//			
//		}	
	}
	//----------------------------------------------------------------------------------------------------------
	// printing Data from Linked List
	public void printData() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	//----------------------------------------------------------------------------------------------------------
	// length of a ListNode
	public int length() {
		int count = 0;
		ListNode li = head;
		while (li != null) {
			count++;
			li = li.next;
		}
		return count;
	}
	//----------------------------------------------------------------------------------------------------------
	// insert node at Given Position
	public void insertData(int data,int position) {
		ListNode node = new ListNode(data);
		// 1 -> 2 -> 4 -> null
		// 1 -> 2 -> 3-> 3 -> null
		
		if(position == 1) {
			node.next = head;
			head = node;
		} else {
			int count =1;
			ListNode pre = head;
			while(count < position -1) {
				pre = pre.next;
				count++;
			}
			ListNode adv = pre.next;
			node.next = adv;
			pre.next = node;
		}
	}
	//----------------------------------------------------------------------------------------------------------


	
	
}
