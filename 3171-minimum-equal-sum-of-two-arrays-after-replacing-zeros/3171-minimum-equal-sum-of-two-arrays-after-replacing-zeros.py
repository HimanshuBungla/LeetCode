class Solution:
    def minSum(self, nums1: List[int], nums2: List[int]) -> int:
        zeros1,zeros2=nums1.count(0),nums2.count(0)
        s1,s2=sum(nums1),sum(nums2)
        if (zeros1==0 and s1+zeros1<s2+zeros2) or (zeros2==0 and s2<s1+zeros1):
            return -1
        return max(s2+zeros2,s1+zeros1)




        

