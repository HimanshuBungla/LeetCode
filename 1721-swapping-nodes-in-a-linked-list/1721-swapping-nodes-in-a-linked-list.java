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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode beg;
        beg=head;
        for(int i=1;i<k;i++){
            beg=beg.next;
            
        }
        ListNode cur=beg;
        ListNode end=head;
        while(cur.next!=null){
            cur=cur.next;
            end=end.next;
        }
        int temp = beg.val;
        beg.val=end.val;
        end.val=temp;
        return head;
    }
}