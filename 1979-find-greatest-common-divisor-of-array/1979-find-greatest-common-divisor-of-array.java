class Solution {
    public int gcd(int first, int last) {
        if (last== 0)
            return first;
        return gcd(last, first % last);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
}