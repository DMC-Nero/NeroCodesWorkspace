package org.SinglyLinkedList;


public class InsertNodeAtGivenPosition {
	private ListNode head;
	
	private static class ListNode{
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
		InsertNodeAtGivenPosition sll = new InsertNodeAtGivenPosition();
			
		sll.insertData(3, 1);	// 3 -> null
		sll.insertData(5, 2);	// 3 -> 5 -> null
		sll.insertData(2, 1);	// 2 -> 3 -> 5 -> null
		sll.insertData(4, 2);	// 2 -> 4 -> 3 -> 5 -> null
		sll.insertData(7, 5);	// 2 -> 4 -> 3 -> 5 -> 7 -> null
		sll.display();
		
	
		
	}
	
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

}
