class Solution:
    def countCompleteSubarrays(self, nums: List[int]) -> int:
        n = len(nums)
        distinct_ele = len(set(nums))

        left = 0
        count = 0
        window_count = collections.Counter()

        for right in range(n):
            window_count[nums[right]] += 1
            while len(window_count) == distinct_ele:
                count += (n-right)

                window_count[nums[left]] -= 1

                if(window_count[nums[left]]==0):
                    del window_count[nums[left]]
                left +=1
        return count
