package org.SinglyLinkedList;


public class DelLastNode {
		private ListNode head;
	//--------------------------------------------------------------------------------------------
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
	public void display() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	// --------------------------------------------------------------------------------------------
	// method to insert Data to a Linked List with position
	public void insertData(int position, int data) {
		ListNode node = new ListNode(data);
		if(position == 1) {
			node.next = head;
			head = node;
		}else {
			int count = 1;		// 10 -> 11 -> 12 -> 13 -> null
			ListNode prev = head;
			while(count < position - 1) {
				prev = prev.next;
				count++;
			}
			ListNode adv = prev.next;
			node.next = adv;
			prev.next = node;
		}
	}
	//--------------------------------------------------------------------------------------------
	//  method to delete last Node from the Linked List
	public ListNode delLast() {		// 1 -> 2 -> 3 -> 4 -> null
		if(head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode pre = null;
		
		while(current.next != null) {
			pre = current;
			current = current.next;
		}
		pre.next = null;	//break the chain
		return current;
	}
	
	/**--------------------------------------------------------------------------------------------
	own logic
	public ListNode delLast() {	// 1 -> 2 -> 3 -> 4 -> null
		if(head == null || head.next == null) {
			return head;
		}
		ListNode temp = head;
		ListNode pre = null;
		while(temp.next != null){
		temp = temp.next;
			if(pre == null){
				pre = head;
			}else{
				pre = pre.next;
			}
		}
		pre.next = null;
		temp.next = null;
		return temp;
	}
**/
	// --------------------------------------------------------------------------------------------
	// main method
	public static void main(String[] args) {
		DelLastNode sll = new DelLastNode();	//head -> null
		sll.insertData(1, 1);
		sll.insertData(2, 2);
		sll.insertData(3, 3);
		sll.insertData(4, 4);
		sll.display(); 
		System.out.println();
		System.out.println(sll.delLast().data);
		sll.display();
		System.out.println();
		System.out.println(sll.delLast().data);
		
		sll.display();
	}

}
