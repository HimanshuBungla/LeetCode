import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> idx = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        // Find all indices where nums[i] == key
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                idx.add(i);
            }
        }

        // For each key index, check all j such that |j - i| <= k
        for (int i : idx) {
            int start = Math.max(0, i - k);
            int end = Math.min(nums.length - 1, i + k);
            for (int j = start; j <= end; j++) {
                if (!seen.contains(j)) {
                    ans.add(j);
                    seen.add(j);
                }
            }
        }
        return ans;
    }
}
