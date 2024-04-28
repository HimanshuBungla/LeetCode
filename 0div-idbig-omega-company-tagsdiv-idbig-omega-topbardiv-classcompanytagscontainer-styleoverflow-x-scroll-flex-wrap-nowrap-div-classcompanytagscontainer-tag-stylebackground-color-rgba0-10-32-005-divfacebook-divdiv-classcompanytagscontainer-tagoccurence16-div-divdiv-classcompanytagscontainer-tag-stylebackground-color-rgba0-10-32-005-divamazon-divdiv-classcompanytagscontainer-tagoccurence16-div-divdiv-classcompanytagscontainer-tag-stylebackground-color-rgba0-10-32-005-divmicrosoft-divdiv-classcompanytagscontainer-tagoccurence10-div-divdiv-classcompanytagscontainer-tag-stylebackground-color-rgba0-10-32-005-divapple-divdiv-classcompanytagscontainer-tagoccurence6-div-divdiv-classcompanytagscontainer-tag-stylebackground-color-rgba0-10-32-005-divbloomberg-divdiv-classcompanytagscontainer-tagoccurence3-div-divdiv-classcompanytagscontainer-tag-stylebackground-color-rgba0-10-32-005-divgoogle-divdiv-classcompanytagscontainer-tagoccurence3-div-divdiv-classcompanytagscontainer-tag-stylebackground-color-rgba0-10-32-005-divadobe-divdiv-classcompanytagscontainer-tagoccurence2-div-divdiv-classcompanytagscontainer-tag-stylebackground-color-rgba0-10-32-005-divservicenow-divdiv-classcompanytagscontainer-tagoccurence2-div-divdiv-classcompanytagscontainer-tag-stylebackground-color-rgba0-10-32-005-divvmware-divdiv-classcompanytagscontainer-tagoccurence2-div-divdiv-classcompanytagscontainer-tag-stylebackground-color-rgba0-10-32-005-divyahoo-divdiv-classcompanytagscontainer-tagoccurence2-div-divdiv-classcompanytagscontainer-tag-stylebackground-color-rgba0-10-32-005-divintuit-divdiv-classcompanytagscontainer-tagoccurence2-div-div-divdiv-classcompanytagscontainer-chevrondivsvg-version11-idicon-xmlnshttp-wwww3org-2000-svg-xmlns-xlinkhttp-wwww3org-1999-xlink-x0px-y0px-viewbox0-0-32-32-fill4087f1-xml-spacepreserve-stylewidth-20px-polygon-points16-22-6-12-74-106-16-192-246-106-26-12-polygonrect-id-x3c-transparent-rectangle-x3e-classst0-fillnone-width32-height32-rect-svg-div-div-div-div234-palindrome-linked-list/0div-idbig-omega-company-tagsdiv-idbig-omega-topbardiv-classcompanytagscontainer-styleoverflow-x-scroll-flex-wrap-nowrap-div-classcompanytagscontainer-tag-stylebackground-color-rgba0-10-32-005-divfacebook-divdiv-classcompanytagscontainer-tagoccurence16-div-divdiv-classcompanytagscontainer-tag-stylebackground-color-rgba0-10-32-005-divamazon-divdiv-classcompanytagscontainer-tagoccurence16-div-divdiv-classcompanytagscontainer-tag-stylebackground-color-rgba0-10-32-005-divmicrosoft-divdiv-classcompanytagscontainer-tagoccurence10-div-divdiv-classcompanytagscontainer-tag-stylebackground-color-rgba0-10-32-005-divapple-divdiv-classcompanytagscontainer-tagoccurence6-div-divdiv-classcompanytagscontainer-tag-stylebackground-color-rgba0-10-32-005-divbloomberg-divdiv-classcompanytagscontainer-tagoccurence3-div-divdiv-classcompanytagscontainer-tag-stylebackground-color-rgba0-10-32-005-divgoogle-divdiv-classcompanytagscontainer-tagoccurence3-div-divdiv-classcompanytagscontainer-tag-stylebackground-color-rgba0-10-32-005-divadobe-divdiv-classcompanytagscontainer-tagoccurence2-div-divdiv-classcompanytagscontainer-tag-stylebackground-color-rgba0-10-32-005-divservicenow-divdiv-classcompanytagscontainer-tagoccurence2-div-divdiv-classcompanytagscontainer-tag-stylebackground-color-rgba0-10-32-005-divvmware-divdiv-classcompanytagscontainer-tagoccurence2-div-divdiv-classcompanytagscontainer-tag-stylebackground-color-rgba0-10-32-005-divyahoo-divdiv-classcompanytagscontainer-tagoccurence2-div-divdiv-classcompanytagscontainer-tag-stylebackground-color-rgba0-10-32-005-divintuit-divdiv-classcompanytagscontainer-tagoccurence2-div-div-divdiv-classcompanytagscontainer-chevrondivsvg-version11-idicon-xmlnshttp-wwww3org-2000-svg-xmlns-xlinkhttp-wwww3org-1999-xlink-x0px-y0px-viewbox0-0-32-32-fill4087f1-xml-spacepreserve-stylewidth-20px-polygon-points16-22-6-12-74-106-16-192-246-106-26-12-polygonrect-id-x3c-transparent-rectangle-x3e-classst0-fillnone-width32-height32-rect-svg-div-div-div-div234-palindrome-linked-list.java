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
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prevnode = head;
        ListNode currnode = head.next;
        while(currnode!=null){
            ListNode nextnode = currnode.next;
            currnode.next = prevnode;
            
            prevnode = currnode;
            currnode = nextnode;
        }
        head.next = null;
        head = prevnode;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        ListNode firsthalf = head;  
        ListNode middle = middle(head);
        ListNode secondHalf = reverse(middle.next);
        
        while(secondHalf != null){
            if(secondHalf.val != firsthalf.val){
                return false;
            }
            secondHalf = secondHalf.next;
            firsthalf  = firsthalf.next;
        }
        return true;
    }
}