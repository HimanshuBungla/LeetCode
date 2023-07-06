class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum =0;
            leftsum = leftsum+nums[i];
            for(int j=nums.length-1;j>=i;j--){
                rightsum+= nums[j];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
}