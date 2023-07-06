class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            int sum2=0;
            sum1=sum1+nums[i];
            for(int j=i;j<nums.length;j++){
                sum2 = sum2+nums[j];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}