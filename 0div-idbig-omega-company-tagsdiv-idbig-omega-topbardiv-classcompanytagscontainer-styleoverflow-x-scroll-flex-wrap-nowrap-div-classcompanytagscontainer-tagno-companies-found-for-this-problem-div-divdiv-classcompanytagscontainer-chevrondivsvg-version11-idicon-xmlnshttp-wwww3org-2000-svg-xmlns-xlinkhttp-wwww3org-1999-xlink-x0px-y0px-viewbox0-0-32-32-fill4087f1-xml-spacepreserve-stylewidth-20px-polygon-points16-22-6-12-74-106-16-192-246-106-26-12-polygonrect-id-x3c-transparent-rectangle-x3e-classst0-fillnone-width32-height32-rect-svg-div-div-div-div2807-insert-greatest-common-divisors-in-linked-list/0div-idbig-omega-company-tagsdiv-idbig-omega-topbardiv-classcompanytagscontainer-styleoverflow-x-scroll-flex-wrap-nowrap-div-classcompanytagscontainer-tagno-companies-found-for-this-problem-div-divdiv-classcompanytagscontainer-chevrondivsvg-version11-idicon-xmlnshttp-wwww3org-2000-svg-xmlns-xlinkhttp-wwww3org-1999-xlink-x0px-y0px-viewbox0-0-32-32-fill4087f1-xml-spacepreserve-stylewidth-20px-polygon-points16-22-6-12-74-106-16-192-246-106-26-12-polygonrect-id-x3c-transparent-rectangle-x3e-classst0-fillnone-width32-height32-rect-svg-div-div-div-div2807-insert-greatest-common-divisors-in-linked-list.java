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
    public int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode curr = head;
        while(curr.next!=null){
            int a = curr.val;
            int b = curr.next.val;
            int c = gcd(a,b);
            ListNode newnode = new ListNode(c);
            ListNode temp = curr.next;
            curr.next = newnode;
            newnode.next = temp;
            curr = curr.next.next;
        }
        
        return head;
    }
}