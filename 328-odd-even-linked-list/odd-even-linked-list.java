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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        ListNode st = head;
        ListNode lt = head;
        int size = 0;
        while (lt.next != null) {
            ++size;
            lt = lt.next;
            if (lt.next == null)
                ++size;
        }
        if(size<3)return head;
        for (int i = 0; i < size / 2; i++) {
            if(st!=null){
            // System.out.println(st.val);
            lt.next = st.next;
            st.next = st.next.next;
            lt = lt.next;
            lt.next = null;
            st = st.next;
            }else{
                System.out.println("st is null");
            }

        }

        return head;
    }
}