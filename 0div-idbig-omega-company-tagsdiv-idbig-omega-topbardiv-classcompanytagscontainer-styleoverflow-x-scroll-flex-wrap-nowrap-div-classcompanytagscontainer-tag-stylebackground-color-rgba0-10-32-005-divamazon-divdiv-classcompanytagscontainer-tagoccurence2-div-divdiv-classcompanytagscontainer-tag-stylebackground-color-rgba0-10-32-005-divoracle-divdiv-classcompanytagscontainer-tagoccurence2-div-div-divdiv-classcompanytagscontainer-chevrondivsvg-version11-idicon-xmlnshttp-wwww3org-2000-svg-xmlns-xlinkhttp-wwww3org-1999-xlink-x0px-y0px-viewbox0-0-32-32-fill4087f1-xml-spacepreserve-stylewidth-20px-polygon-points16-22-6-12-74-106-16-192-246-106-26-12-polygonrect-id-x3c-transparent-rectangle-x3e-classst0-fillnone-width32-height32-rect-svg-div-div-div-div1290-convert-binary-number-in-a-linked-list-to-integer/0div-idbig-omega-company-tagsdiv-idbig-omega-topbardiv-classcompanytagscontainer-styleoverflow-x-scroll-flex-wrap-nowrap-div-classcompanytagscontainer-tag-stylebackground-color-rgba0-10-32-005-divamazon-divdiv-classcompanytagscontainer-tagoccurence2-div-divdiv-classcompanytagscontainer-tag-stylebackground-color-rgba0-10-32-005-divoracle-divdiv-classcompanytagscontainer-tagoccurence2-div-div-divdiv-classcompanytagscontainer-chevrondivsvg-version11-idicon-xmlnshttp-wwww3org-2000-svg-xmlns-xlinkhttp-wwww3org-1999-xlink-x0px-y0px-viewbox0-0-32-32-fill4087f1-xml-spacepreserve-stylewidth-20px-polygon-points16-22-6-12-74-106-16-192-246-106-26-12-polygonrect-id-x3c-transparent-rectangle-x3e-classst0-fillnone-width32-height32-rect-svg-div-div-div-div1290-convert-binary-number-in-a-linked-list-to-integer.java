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
        ListNode curr = head;
        int sz=0;
        while(curr.next!=null){
            sz++;
            curr = curr.next;
        }
        curr = head;
        int digit=0;
        while(sz>=0){
            digit = digit + (int)(curr.val*Math.pow(2,sz));
            curr = curr.next;
            sz--;
        }
        
        return digit;
    }
}