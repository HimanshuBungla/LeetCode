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

    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    int length;
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        length = list.size();
    }
    
    public int getRandom() {
        int n = random.nextInt(length);
        return list.get(n);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */