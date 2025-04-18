class Solution:
    def helper(self, s):
        sb = ""
        prev = s[0]
        count = 1
        for i in range(1,len(s)):
            if(s[i] == prev):
                count +=1
            else:
                sb += str(count)
                sb += prev
                prev = s[i]
                count = 1
        sb += str(count)
        sb += prev
        return sb
    def countAndSay(self, n: int) -> str:
        s = "1"
        for i in range(1,n):
            s = self.helper(s)
        return s
    
   