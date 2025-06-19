class Solution {
    public int partitionArray(int[] nums, int k) {
        if(nums.length==1){
            return 1;
        }
        Arrays.sort(nums);
        int count=0;
        int number = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-number>k){
                count++;
                number = nums[i];
            }
            if(i==nums.length-1){
                if(nums[i]-number<=k){
                    count++;
                }
            }
        }
        return count;
    }
}