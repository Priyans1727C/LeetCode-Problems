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
    static Set<Integer> del;
    static Set<Integer> che;
    static ListNode remove(ListNode head){
        if(head==null) return null;
        ListNode prev=new ListNode();
        prev.next=head;
        head=prev;
        ListNode curr =head;
        while(curr!=null){
            if(che.contains(curr.val)||del.contains(curr.val)){
                che.add(curr.val);
                prev.next=curr.next;
            }
            curr=curr.next;
            if(prev.next!=curr)
                prev=prev.next;
        }
        return head.next;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        del = new HashSet<>();
        che = new HashSet<>();
        for(int i: nums){
           del.add(i);
        }
        head=remove(head);
    
        return head;
    }
}