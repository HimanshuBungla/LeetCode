class Solution {
    public boolean isPalindrome(String s) {
        int st = 0;
        int e = s.length() - 1;
        char stChar;
        char eChar;
        while(st < e)  {
                 
            stChar = s.charAt(st);
            eChar = s.charAt(e);
            if(!Character.isLetterOrDigit(stChar)){
                st++;
            }
            
             else if(!Character.isLetterOrDigit(eChar)){
                e--;
            }
            else if(Character.toLowerCase(stChar) != Character.toLowerCase(eChar)){
                return false;
            }
            else  {
                st++;
                e--;
            }
        }
        return true;
    }
}