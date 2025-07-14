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
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }

        int size=-1;
        ListNode s = head;
        while(s!=null){
            size++;
            s = s.next;
        }
        ListNode currnode = head;
        int digit = 0;
        for(int i=size;i>=0;i--){
            digit = digit + ((currnode.val)*(int)Math.pow(2,i));
            currnode = currnode.next;
        }

        return digit;
    }
}