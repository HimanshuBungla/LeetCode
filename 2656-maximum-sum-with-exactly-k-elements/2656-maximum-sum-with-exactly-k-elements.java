class Solution {
    public int maximizeSum(int[] nums, int k) {
        int a = 0;
        for (int i=0;i<nums.length;i++) {
            a = Math.max(a, nums[i]);
        }
        return k * a + k * (k - 1) / 2;
    }
}