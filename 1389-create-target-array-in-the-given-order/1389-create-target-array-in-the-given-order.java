class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target1 = new ArrayList<Integer>(5);
        int [] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target1.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i] = target1.get(i);
        }
        return target;
    }
}