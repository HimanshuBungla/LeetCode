class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int max = 0;
        int min = n+1;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2==0){
                min = Math.min(min,freq[i]);
            }else{
                max = Math.max(max,freq[i]);
            }
        }

        return max-min;
    }
}