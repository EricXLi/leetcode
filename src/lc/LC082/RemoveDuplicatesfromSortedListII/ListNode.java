package lc.LC082.RemoveDuplicatesfromSortedListII;

public class ListNode {
   	 int val;
   	 ListNode next;
   	 public ListNode(int x) { 
   		 val = x; 
   	 }
	public void printList() {
		System.out.print(val + "->");
		next.printList();
	}
   
}
