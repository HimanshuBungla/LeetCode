class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        nums.sort()
        count = 0
        n = len(nums)

        for i in range(n):
            low_val = lower - nums[i]
            high_val = upper - nums[i]

            l = i + 1
            while l < n and nums[l] < low_val:
                l += 1

            r = l
            while r < n and nums[r] <= high_val:
                r += 1

            count += (r - l)

        return count
