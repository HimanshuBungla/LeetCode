class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> all = new HashSet<>();
        for (int x : nums) {
            all.add(x);
        }
        int ans = 0;
        for (int x : nums) {
            if (all.contains(x - diff) && all.contains(x + diff)) {
                ans++;
            }
        }
        return ans;
    }
}