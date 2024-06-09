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
    List<Integer> arrList;
    int length;
    Random random;
    public Solution(ListNode head) {
        this.arrList = new ArrayList<>();
        for(; head != null ;){
            arrList.add(head.val);
            head = head.next;
        }
        length = arrList.size();
        this.random = new Random();
    }
    
    public int getRandom() {
        int num = random.nextInt(length);
        return arrList.get(num);
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */