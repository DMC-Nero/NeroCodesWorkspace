package org.SinglyLinkedList;


public class SearchElementInSLL {
	private ListNode head;
//--------------------------------------------------------------------------------------------
	// creating ListNode nested class .
	private static class ListNode {
		private int data;										// non-static field
		private ListNode next;						// non-static field

		public ListNode(int data) {				// constructor with parameter
			this.data = data;
			this.next = null;
		}
	}
	//--------------------------------------------------------------------------------------------
	// method to display / print the data of a SinglyLinkedList
	public void display() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	//--------------------------------------------------------------------------------------------
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
	//--------------------------------------------------------------------------------------------
	// method to search a given value in the Linked List 
	public boolean SearchKey(int searchKey) {
		ListNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	//--------------------------------------------------------------------------------------------
	// main method
	public static void main(String[] args) {
		SearchElementInSLL sll = new SearchElementInSLL();
		sll.insertData(1, 11);		// 11 -> null
		sll.insertData(2, 12);	// 11 -> 12 -> null
		sll.insertData(3, 13); 	// 11 -> 12 -> 13 -> null
		sll.insertData(4, 14); 	// 11 -> 12 -> 13 -> 14 -> null
		sll.insertData(5, 15); 	// 11 -> 12 -> 13 -> 14 -> 15 -> null
		sll.display();
		System.out.println();
		if(sll.SearchKey(1)) {
			System.out.println("search Key found !!!");
		}else {
			System.out.println("search Key not found !!!");
		}

	}

}
