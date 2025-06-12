class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int[] diff = new int[nums.length];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length){
                diff[i-1] = Math.abs(nums[i-1] - nums[0]);
                break; 
            }
            diff[i-1] = Math.abs(nums[i-1] - nums[i]);
        }

        int maxdiff = -1;
        for(int i:diff){
            if(i>maxdiff){
                maxdiff = i;
            }
        }
        return maxdiff;
    }
}