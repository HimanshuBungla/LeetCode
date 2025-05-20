class Solution:
    def isZeroArray(self, nums, queries):
        n = len(nums)

        # Step 1: Make difference array using queries
        diff = [0] * n
        for query in queries:
            start, end = query
            x = 1
            diff[start] += x
            if end + 1 < n:
                diff[end + 1] -= x

        # Step 2: Compute cumulative effect on each index
        result = [0] * n
        cumSum = 0
        for i in range(n):
            cumSum += diff[i]
            result[i] = cumSum

        # Step 3: Check if each value can reach 0
        for i in range(n):
            if result[i] < nums[i]:
                return False

        return True
