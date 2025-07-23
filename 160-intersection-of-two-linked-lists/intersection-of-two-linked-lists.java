/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA;
        ListNode curr2=headB;
        while(headA.next!=null || headB.next!=null){
            if(headA.next!=null){
                headA=headA.next;
            }else{
                curr2=curr2.next;
            }
            if(headB.next!=null){
                headB=headB.next;
            }else{
                curr1=curr1.next;
            }
        }
        if(headA!=headB) return null;
        System.out.println(curr1.val+" "+curr2.val);

        while(curr1!=curr2){
           curr1=curr1.next;
           curr2=curr2.next;
        }
        return curr1;
       
    }
}