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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode curr = head;
        ListNode next = curr.next;
        head = next;
        while (curr != null && curr.next != null) {
            prev.next = next;
            curr.next = next.next;
            next.next = curr;
            prev = curr;
            curr = prev.next;
            if (curr != null)
                next = curr.next;
        }

        return head;
    }
}