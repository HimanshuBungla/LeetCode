class Solution {
    public String toLowerCase(String s) {
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<s.length();i++)
          if(s.charAt(i)>=65 && s.charAt(i)<=90)
              ans.append((char)(s.charAt(i) + (32)));
            else
              ans.append(s.charAt(i));
      return ans.toString();
    }
}