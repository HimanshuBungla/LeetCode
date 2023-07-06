class Solution {
    public int findMiddleIndex(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            int leftsum =0;
            int rightsum =0;
            for(int j=nums.length-1;j>i;j--){
                rightsum+= nums[j];
            }
            for(int k=0;k<i;k++){
                leftsum+= nums[k];
            }
            if(leftsum==rightsum){
                a=i;
                break;
            }
            else{
                a=-1;
            }
        }
        if(a==-1){
            return -1;
        }
        else{
         return a;   
        }
    }
}