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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode curr = head;
        while(curr!=null){
            sz++;
            curr = curr.next;
        }
        
        int fn = sz-n;
        
        if(n==sz){
            head = head.next;
            return head;
        }
        
        if(head==null){
            return head;
        }
        
        curr = head;
        int count=1;
        while(count<fn){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        
        return head;
    }
}