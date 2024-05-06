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
    public ListNode mergeNodes(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.val==0 && head.next==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(1);
        ListNode tail = dummy;
        int sum=0;
        ListNode curr = head;
        curr = head;
        while(curr!=null){
            while(curr.val!=0 && curr!=null){
                sum = sum+curr.val;
                curr = curr.next;
            }
            if(sum!=0){
            ListNode newnode = new ListNode(sum);
            tail.next = newnode;
            tail = newnode;
            }
            curr = curr.next;
            sum=0;
        }
        return dummy.next;
    }
}