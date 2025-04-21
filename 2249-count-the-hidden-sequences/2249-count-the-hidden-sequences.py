class Solution:
    def numberOfArrays(self, differences: List[int], lower: int, upper: int) -> int:
        sum1 = 0
        min1 = sum1
        max1 = sum1
        for i in differences:
            sum1 += i
            min1 = min(min1,sum1)
            max1 = max(max1,sum1)
        ub = upper - max1
        lb = lower - min1
        if( ub-lb+1>0):
            return ub-lb+1
        return 0