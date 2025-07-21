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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode prev=new ListNode();
        prev.next=head;
        head=prev;
        ListNode curr =head;

        Set<Integer> del = new HashSet<>();
        for(int i: nums){
           del.add(i);
        }

        while(curr!=null){
            if(del.contains(curr.val)){
                prev.next=curr.next;
            }
            curr=curr.next;
            if(prev.next!=curr)
                prev=prev.next;
        }
        return head.next;
    }
}