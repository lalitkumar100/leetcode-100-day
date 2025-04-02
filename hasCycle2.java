/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
     
     ListNode slow =head,fast =head;

        while(fast.next!=null||fast!=null){
            fast =fast.next;
            if(fast==null){
                return false;
            }
       fast =fast.next;
         
            slow =slow.next;
           if(fast==slow){
            return true;
           }
        }
        return false;
    }
}
