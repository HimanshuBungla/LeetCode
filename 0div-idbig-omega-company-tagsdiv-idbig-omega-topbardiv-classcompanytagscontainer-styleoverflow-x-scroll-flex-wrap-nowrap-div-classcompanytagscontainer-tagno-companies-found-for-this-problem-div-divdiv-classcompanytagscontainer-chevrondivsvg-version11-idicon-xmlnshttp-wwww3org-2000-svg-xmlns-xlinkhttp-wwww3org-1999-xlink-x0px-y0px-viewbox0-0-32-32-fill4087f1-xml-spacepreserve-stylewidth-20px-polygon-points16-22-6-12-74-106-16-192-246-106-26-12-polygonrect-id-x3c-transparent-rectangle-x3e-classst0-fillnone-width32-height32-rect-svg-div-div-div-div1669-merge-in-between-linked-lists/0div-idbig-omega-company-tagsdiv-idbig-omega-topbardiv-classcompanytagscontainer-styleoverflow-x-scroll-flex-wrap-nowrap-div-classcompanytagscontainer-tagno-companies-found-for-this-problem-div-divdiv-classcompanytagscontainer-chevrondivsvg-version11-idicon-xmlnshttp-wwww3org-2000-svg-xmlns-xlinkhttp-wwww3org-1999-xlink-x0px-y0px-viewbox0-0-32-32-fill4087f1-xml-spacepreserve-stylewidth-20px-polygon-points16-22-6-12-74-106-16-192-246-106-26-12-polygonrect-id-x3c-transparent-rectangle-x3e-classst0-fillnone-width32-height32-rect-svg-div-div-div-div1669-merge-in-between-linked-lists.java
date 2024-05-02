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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int counta = 0;
        
        
        if(list1 == null && list2 == null){
            return null;
        }
        
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        
        ListNode head1 = list1;
        while(counta<a-1){
            counta++;
            head1 = head1.next;
        }
        int countb = 1;
        ListNode head2 = list1;
        while(countb<=b){
            countb++;
            head2 = head2.next ;
        }
        head2 = head2.next;
        head1.next = list2;
        while(head1.next!=null){
            head1 = head1.next;
        }
        
        head1.next = head2;
        
        return list1;
    }
}