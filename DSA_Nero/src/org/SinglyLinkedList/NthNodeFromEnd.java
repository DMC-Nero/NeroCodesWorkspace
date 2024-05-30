package org.SinglyLinkedList;

public class NthNodeFromEnd {

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
	public void print() {
		if(head == null) {
			System.out.println("null");
		}
		ListNode current = head;
		while(null != current) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	// --------------------------------------------------------------------------------------------
	public void insertData(int data) {
		ListNode temp = new ListNode(data);
		temp.next = head;
		head = temp;
		
	}
	// --------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		NthNodeFromEnd sll = new NthNodeFromEnd();
		sll.insertData(10);
		sll.insertData(11);
		sll.insertData(12);
		sll.insertData(13);
		sll.insertData(14);
		sll.insertData(15);
		sll.insertData(16);
		sll.insertData(17);
		sll.print();
		
		System.out.println(sll.NthNode(10).data);
	}
	// --------------------------------------------------------------------------------------------
	ListNode NthNode(int n) {
		ListNode point1 = head;
		ListNode point2 = head;
		int count = 0;
		while(count < n) {
			if (point2 == null) {
				throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
			}
			point2 = point2.next;
			count++;
		}
		while(point2 != null) {
			point1 = point1.next;
			point2 = point2.next;
		}
		return point1;
	}

}
