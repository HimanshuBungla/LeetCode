class Solution {
    public void rotate(int[] nums, int k) {
   if (k==0) return;
   if (nums == null || nums.length == 0) return;
   
   int[] nums2 = new int[nums.length];
   for (int i=0; i<nums.length; i++) {
      int ni = (i + k) % nums.length;
      nums2[ni] = nums[i];
   }
   
   //assign back to original array
   for (int i=0; i<nums.length; i++) {
      nums[i] = nums2[i];
   }
}
}