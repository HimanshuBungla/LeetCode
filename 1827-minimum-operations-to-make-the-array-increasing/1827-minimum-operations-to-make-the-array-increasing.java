class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int max= Math.max(nums[i - 1] + 1, nums[i]);
            count += max - nums[i];
            nums[i] = max;
        }
        return count;
    }
}