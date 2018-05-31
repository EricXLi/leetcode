package lc.LC082.RemoveDuplicatesfromSortedListII;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		if(head == null){
			return null;
		}
		ListNode curr = head;
		while(curr != null){
			if (map.get(curr.val) != null) {
				map.put(curr.val, true);
			} else {
				map.put(curr.val, false);
			}            
            curr = curr.next;
		}		
		ListNode newHead = new ListNode(Integer.MAX_VALUE);
		newHead.next = head;
		ListNode prev = newHead;
		curr = head;
		while(curr != null){
			if(map.get(curr.val) == true){
				prev.next = curr.next;
			} else {
				prev = curr;
			}
			curr = curr.next;
		}
		return newHead.next;
    }
    

}