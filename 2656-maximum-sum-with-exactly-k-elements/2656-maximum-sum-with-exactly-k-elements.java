class Solution {
    public int maximizeSum(int[] nums, int k) {
        int x = 0;
        for (int v=0;v<nums.length;v++) {
            x = Math.max(x, nums[v]);
        }
        return k * x + k * (k - 1) / 2;
    }
}