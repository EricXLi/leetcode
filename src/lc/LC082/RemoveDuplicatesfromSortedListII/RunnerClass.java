package lc.LC082.RemoveDuplicatesfromSortedListII;

import lc.LC082.RemoveDuplicatesfromSortedListII.Solution;

public class RunnerClass {

	public static void run() {
		int[] arr = {1,2,2};
		
		ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
		ListNode curr = dummyHead;
		for(int i : arr) {
			ListNode newNode = new ListNode(i);
			curr.next = newNode;
			curr = curr.next;
		}
		
		ListNode head = dummyHead.next;

		Solution s = new Solution();
		s.deleteDuplicates(head);
		head.printList();
	}
}
