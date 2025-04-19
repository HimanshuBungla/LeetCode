class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for(int i=0;i+1<nums.length;i++){
            int nl = lower - nums[i];
            int nu = upper - nums[i];
            int low = lowerBound(nums, i + 1, nums.length, nl);
            int high = upperBound(nums, i + 1, nums.length, nu);
            ans += (high - low);
        }
        return ans;
    }

    private int lowerBound(int[] nums, int start, int end, int target) {
        int lo = start, hi = end;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private int upperBound(int[] nums, int start, int end, int target) {
        int lo = start, hi = end;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}