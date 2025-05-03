class Solution:
    def minDominoRotations(self, tops: List[int], bottoms: List[int]) -> int:
        result = float('inf')
        for i in range(1,7):
            steps = self.find(tops,bottoms,i)
            if(steps != -1):
                result = min(result,steps)
        return -1 if result == float('inf') else result
    
    def find(self,top,bottom,i):
        top_swap = 0
        bottom_swap=0
        for j in range(len(top)):
            if(top[j]!=i and bottom[j]!=i):
                return -1
            elif (top[j] != i):
                top_swap +=1
            elif(bottom[j] != i):
                bottom_swap +=1
        return min(top_swap,bottom_swap)

