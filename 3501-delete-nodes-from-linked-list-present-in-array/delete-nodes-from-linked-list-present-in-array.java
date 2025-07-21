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
    static ListNode remove(ListNode head,int[] nums){
        if(head==null) return null;
        ListNode prev=new ListNode();
        prev.next=head;
        head=prev;
        ListNode curr =head;
        while(curr!=null){
            if(Arrays.binarySearch(nums, curr.val)>-1){
            
                prev.next=curr.next;
            }
            curr=curr.next;
            if(prev.next!=curr)
                prev=prev.next;
        }
        return head.next;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        Arrays.sort(nums);
        head=remove(head,nums);

    
        return head;
    }
}