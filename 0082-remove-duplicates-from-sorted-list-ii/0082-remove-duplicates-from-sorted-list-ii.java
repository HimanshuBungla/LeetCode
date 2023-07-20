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
   public ListNode deleteDuplicates(ListNode head) {
    ListNode a = new ListNode(0);
    a.next = head;
 
    ListNode b = a;
    while(b.next!=null&&b.next.next!=null){
        if(b.next.val == b.next.next.val){
            int duplicate = b.next.val;
            while(b.next!=null&&b.next.val==duplicate){
                b.next = b.next.next;
            }
        }else{
            b=b.next;
        }
 
    }
 
    return a.next;
}
}