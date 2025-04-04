class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        freq = 1
        ans = nums[0]
        for i in range(1,len(nums)):
            if(ans==nums[i]):
                freq +=1
            else:
                freq=1
                ans = nums[i]
            if(freq > len(nums)/2):
                return ans
        return ans