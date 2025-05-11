class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        if(len(arr)>3):
            for i in range(2,len(arr)):
                if(arr[i]%2!=0 and arr[i-1]%2!=0 and arr[i-2]%2!=0):
                    return True
        elif(len(arr)==3):
            if(arr[0]%2!=0 and arr[1]%2!=0 and arr[2]%2!=0):
                    return True
        else:
            return False
        return False
        