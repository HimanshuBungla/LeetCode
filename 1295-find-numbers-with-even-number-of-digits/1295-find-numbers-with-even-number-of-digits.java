class Solution {
    public int findNumbers(int[] nums) {
        int counteve=0;
        for(int i=0;i<nums.length;i++){
            int countnum =1;
            int a= nums[i];
            while(a/10!=0){
                countnum+=1;
                a=a/10;
            }
            if(countnum%2==0){
                counteve+=1;
            }
        }
        return counteve;
    }
}