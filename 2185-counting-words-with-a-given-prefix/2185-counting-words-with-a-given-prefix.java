class Solution {
    public int prefixCount(String[] words, String pref) {
        String a ="";
        int count=0;
        for(int i=0;i<words.length;i++){
            a = words[i];
            if(a.startsWith(pref)){
                count+=1;
            }
        }
        return count;
    }
}