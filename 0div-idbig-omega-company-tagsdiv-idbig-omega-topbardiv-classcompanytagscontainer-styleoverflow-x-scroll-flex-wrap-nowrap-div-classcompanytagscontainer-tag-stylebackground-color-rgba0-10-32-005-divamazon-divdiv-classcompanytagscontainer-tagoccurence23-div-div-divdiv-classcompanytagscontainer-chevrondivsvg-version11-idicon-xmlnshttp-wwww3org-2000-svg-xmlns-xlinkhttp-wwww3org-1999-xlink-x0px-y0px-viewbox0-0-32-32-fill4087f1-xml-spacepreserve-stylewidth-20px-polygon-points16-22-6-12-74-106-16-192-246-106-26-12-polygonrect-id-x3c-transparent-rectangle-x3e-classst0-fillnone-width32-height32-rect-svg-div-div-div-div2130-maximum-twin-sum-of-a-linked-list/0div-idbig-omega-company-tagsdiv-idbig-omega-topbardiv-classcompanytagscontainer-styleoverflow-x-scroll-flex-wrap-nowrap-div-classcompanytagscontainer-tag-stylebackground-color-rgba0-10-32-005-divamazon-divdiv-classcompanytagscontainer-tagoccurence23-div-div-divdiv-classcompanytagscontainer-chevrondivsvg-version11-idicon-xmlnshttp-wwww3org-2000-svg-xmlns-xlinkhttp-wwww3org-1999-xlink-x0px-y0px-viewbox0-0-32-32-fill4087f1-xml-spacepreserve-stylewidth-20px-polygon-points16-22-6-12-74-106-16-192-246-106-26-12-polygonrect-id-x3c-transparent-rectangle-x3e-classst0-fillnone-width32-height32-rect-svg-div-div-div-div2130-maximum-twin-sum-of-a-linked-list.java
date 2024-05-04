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
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode curr = head;
        int sz = 0;
        while(curr!=null){
            sz++;
            curr = curr.next;
        }
        int[] arr = new int[sz];
        int idx=0;
        curr = head;
        while(curr.next!=null){
            
            arr[idx] = curr.val;
            idx++;
            curr = curr.next;
        }
        arr[sz-1] = curr.val;
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=0;i<sz/2;i++){
            int c = arr[i] + arr[sz-1-i];
            if(c>sum){
                sum = c;
            }
        }
        
        return sum;
    }
}