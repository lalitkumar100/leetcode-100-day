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

    public int[] nextLargerNodes(ListNode head) {

        ListNode temp = head;
        ArrayList<Integer> values = new ArrayList<>();

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }
        int n = values.size();
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                res[stack.pop()] = values.get(i);
                System.out.println("hello");
            }
            stack.push(i);
        }

        return res;
    }
}
