class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;
        while (i < n) {
            ans[k] = nums[i];
            k++;
            i++;
            ans[k] = nums[j];
            k++;
            j++;
        }
        return ans;
    }
}