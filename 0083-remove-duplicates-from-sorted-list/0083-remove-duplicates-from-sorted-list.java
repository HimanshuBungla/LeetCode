class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode rm = head;

    while (rm != null) {
      while (rm.next != null && rm.val == rm.next.val)
        rm.next = rm.next.next;
      rm = rm.next;
    }

    return head;
  }
}
