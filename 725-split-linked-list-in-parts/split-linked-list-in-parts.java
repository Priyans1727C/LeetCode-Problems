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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        if(head==null)return ans;
        else if(head.next==null){
            ans[0]=head;
            return ans;
        }
        ListNode st = head;
        ListNode last = head;
        int size = 0;
        while (last.next != null) {
            ++size;
            last = last.next;
            if (last.next == null)
                ++size;
        }
        
       
        for (int i = 0; i < k; i++) {
            if (head != null) {

                ans[i] = head;
                for (int j = 0; j < size/k; j++) {
                    st=head;
                    head = head.next;
                }
                if (size%k!=0) {
                    st=head;
                    head = head.next;
                    --size;
                }
                st.next=null;


            }

            else{
                ans[i]=null;
            }
        }
        return ans;

    }
}