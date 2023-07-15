class Solution {
    public int findGCD(int[] nums) {
        int GCD=0;
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        if(nums[0] == a){
            return a;
        }
        else{
            for(int i=1;i<a;i++){
            if((nums[0]%i==0) && (a%i==0)){
                GCD=i;
            }
        }
        
        }
        return GCD;
    }
}