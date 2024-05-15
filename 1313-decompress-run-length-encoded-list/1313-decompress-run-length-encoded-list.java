class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i+=2){
            int a = nums[i-1];
            for(int j=0;j<a;j++){
                list.add(nums[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int k=0;k<arr.length;k++){
            arr[k] = list.get(k);
        }
        return arr;
    }
}