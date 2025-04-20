class Solution:
    def numRabbits(self, answers: List[int]) -> int:
        c = Counter(answers)
        ans = 0
        for x,y in c.items():
            grp_size = x+1
            number_of_groups = (y+x)//grp_size
            ans += number_of_groups*grp_size
        return ans
        