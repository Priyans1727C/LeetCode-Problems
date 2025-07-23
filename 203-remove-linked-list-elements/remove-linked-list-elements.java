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
    void rmr(ListNode root,int val){
        if(root==null)return;
        rmr(root.next,val);
        if(root.next!=null && root.next.val==val)
            root.next = root.next.next;
    }
    public ListNode removeElements(ListNode head, int val) {
       if(head==null) return null;
       rmr(head,val);
       if(head.val==val) return head.next;
       return head;
    }
}