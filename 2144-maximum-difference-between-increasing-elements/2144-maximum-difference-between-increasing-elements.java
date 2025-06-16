class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff= 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff = nums[j] - nums[i];
                if(diff>maxdiff){
                    maxdiff=diff;
                }
            }
        }
        if(maxdiff<=0){
            return -1;
        }
        return maxdiff;
    }
}