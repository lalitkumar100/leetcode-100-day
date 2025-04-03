/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
       ListNode temp=head.next;
       ListNode point =new ListNode(-1,head);
       int count=0; 
       while(temp!=null){
        if(temp.val==0){
        
            point=point.next;
            point.val=count;
        
            count=0;
        }
        count+=temp.val;
        temp=temp.next;
       }
       point.next=null;
       return head;
        
    }
}
