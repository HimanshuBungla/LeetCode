class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq = 0
        ans = 0
        for i in nums:
            if(freq==0):
                ans = i
            if(ans==i):
                freq+=1
            else:
                freq-=1
        return ans