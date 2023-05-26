class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ue = 1;
        
        for (int i = 1; i < nums.length; i++){
            
            if(nums[i] != nums[i-1]){
                nums[ue] = nums[i];
                ue += 1;
            }
        }
        
        return ue;
    }
}