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
    static Set<Integer> node;
    static ListNode remove(ListNode head,int[] nums){

        if(head==null) return null;
        ListNode prev=new ListNode();
        prev.next=head;
        head=prev;
        ListNode curr =head;
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = head;
        node = new HashSet<>();
        del=new HashSet<>();
        while(temp!=null){
            node.add(temp.val);
            temp=temp.next;
        }
        for(int i:nums){
            if(node.contains(i)){
                del.add(i);
            }
        }
        head=remove(head,nums);

    
        return head;
    }
}