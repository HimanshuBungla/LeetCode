class Solution {
    public int repeatedNTimes(int[] nums) {
        int a = nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count+=1;
            }
            if(count==a){
                    return nums[i];
                }
        }
        return 0;
    }
}