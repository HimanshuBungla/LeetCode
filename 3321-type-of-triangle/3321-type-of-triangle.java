class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();

        for(int i: nums){
            s1.add(i);
        }

        if(s1.size()==3){
            if(nums[0]+nums[1]>nums[2]){
                if(nums[1]+nums[2]>nums[0]){
                    if(nums[2]+nums[0]>nums[1]){
                        return "scalene";
                    }
                }
            }
            return "none";
        }
        else if(s1.size()==2){
            if(nums[0]+nums[1]>nums[2]){
                if(nums[1]+nums[2]>nums[0]){
                    if(nums[2]+nums[0]>nums[1]){
                        return "isosceles";
                    }
                }
            }
            return "none";
        }
        else{
            return "equilateral";
        }
    }
}