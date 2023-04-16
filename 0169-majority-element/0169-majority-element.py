class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        maj = nums[0]
        count = 1
        for i in range(1,len(nums)):
            if(count==0):
                count=count+1
                maj = nums[i]
            elif(nums[i]==maj):
                count=count+1
            else:
                count = count-1
        return maj
                