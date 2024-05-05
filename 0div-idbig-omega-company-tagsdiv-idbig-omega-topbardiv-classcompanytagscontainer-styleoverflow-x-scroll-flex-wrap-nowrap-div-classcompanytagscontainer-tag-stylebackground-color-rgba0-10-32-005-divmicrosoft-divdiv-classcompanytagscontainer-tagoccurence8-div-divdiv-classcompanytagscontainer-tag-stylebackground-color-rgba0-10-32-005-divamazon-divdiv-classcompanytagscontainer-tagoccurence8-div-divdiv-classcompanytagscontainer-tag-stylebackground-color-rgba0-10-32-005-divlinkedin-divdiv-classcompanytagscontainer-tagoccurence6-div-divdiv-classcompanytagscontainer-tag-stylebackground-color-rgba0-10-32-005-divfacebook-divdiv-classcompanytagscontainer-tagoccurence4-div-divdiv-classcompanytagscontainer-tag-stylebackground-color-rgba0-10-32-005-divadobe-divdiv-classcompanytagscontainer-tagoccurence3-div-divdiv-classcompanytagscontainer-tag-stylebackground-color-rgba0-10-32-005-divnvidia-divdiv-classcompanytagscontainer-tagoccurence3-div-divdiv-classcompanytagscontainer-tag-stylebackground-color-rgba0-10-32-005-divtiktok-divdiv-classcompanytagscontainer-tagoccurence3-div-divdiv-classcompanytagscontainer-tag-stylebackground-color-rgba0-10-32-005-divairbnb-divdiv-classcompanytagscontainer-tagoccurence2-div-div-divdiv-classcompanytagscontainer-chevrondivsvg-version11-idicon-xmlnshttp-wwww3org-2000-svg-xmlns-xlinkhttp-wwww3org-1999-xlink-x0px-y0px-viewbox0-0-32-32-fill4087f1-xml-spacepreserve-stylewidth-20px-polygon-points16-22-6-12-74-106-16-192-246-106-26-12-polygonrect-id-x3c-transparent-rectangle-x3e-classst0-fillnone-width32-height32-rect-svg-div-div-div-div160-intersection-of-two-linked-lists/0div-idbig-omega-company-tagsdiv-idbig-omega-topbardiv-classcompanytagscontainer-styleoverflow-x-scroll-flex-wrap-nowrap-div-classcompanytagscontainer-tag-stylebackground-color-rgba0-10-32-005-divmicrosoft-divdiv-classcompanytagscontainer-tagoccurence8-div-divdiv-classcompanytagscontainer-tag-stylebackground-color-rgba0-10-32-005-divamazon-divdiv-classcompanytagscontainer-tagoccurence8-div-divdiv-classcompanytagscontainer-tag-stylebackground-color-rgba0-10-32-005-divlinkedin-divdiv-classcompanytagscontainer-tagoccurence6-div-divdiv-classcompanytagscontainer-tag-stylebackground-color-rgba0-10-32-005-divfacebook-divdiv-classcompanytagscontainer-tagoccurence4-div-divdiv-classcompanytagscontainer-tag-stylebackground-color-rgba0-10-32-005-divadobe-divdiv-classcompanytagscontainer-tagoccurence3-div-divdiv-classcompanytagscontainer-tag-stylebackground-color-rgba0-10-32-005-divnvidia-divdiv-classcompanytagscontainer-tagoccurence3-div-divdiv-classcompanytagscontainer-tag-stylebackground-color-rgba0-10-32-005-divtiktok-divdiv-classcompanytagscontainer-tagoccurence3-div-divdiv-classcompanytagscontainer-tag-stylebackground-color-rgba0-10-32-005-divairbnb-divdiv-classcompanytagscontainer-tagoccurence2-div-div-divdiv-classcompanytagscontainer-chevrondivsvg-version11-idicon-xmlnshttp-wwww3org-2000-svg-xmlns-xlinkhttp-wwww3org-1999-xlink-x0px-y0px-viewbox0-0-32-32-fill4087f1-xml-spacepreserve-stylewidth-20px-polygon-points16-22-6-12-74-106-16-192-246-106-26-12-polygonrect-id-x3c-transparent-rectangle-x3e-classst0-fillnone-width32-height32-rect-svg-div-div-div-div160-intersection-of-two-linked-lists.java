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
        ListNode temp=headA;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode tail=temp;
        temp.next=headA;

        ListNode slow=headB;
        ListNode fast=headB;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=headB;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                tail.next=null;
                return fast;
            }
        }
        
        tail.next=null;
        return null;
    }
}