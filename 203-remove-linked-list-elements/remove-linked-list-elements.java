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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev =new ListNode();
        prev.next=head;
        ListNode curr=prev;
        while(head!=null){
            if(head.val==val){
                prev.next=head.next;
            }
            head=head.next;
            if(prev.next!=head)prev=prev.next;
        }
        return curr.next;
    }
}