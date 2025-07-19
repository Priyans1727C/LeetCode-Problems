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
    public ListNode partition(ListNode head, int x) {
        ListNode slow = new ListNode();
        slow.next=head;
        ListNode curr=head;
        ListNode gt=null;
        head=slow;
        while(curr!=null && curr.next!=null){
          if(curr.val>=x){
            gt=curr;
            ListNode prev = gt;
            while(curr!=null && curr.next!=null){
                curr=curr.next;
                if(curr.val<x){
                    prev.next=curr.next;
                    slow.next=curr;
                    slow=slow.next;
                    curr.next=gt;
                    curr = prev;
                    continue;
                }
                prev=prev.next;
            }
            break;
          }
            curr=curr.next;
            slow=slow.next;

        }
        return head.next;
    }
}