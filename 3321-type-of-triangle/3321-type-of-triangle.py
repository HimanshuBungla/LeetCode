class Solution:
    def triangleType(self, nums: List[int]) -> str:
        s1 = set()
        for i in nums:
            s1.add(i)

        if(len(s1)==3):
            if(nums[0]+nums[1]>nums[2]):
                if(nums[1]+nums[2]>nums[0]):
                    if(nums[2]+nums[0]>nums[1]):
                        return "scalene"
            return "none"
        elif (len(s1)==2):
            if(nums[0]+nums[1]>nums[2]):
                if(nums[1]+nums[2]>nums[0]):
                    if(nums[2]+nums[0]>nums[1]):
                        return "isosceles"
            return "none"
        else:
            return "equilateral"