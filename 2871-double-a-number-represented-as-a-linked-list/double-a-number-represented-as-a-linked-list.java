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
    static int carry;
    // ListNode reverse(ListNode head){
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     if(head.next==null) return head;
    //     while(head!=null){
    //         head=head.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=head;
    //     }
    //     return prev;
    // }

    void dub(ListNode head){
        if(head==null) return;
        dub(head.next);

        int mul = (head.val*2+carry);
        head.val=mul%10;
        carry=((mul)>9)?1:0;

    }
    public ListNode doubleIt(ListNode head) {
        carry=0;
        dub(head);
        if(carry==1){
            ListNode temp = new ListNode(1);
            temp.next=head;
            head=temp;
        }
        return head;
        
    }
}