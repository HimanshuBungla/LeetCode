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
    public ListNode rev(ListNode root){
        ListNode prev = root;
        ListNode curr = root.next;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr= nxt;
        }
        root.next = null;
        root = prev;
        return root;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = rev(l1);
        l2 = rev(l2);
        ListNode dummy = new ListNode(1);
        ListNode tail = dummy;
        
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int num1 = (l1!=null)? l1.val:0;
            int num2 = (l2!=null)? l2.val:0;
            
            int sum = num1+num2+carry;
            int digit = sum%10;
            carry = sum/10;
            
            ListNode node = new ListNode(digit);
            tail.next = node;
            tail = node;
            
            l1 = (l1!=null)? l1.next: null;
            l2 = (l2!=null)? l2.next:null;
            
        }
        
        ListNode ans = rev(dummy.next);
        return ans;
    }
}