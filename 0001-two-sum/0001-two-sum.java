class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    a[0]=i;
                    a[1]=j;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        return a;
    }
}