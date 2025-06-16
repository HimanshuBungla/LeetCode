class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff = -1;
        int minele = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>minele){
                int diff = nums[i] - minele;
                if(diff>maxdiff){
                    maxdiff=diff;
                }
            }
            else{
                minele = nums[i];
            }
            
        }
        return maxdiff;
    }
}
