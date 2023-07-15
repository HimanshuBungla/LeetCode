class Solution {
    public int findGCD(int[] nums) {
            Arrays.sort(nums);
            return getGcd(nums[0], nums[nums.length - 1]);
        }

        int getGcd(int a, int b) {
            return b == 0 ? a : getGcd(b, a % b);
        }
}