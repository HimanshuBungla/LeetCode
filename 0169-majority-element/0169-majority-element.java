class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int a:map.keySet()){
            if(map.get(a)>(nums.length/2)){
                ele = a;
            }
        }
        return ele;
    }
}