class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1){
            return word;
        }
        String res = "";
        int length = word.length() - numFriends + 1;
        for(int i=0;i<word.length();i++){
            String currString = word.substring(i,Math.min(word.length(),i+length));
            if(currString.compareTo(res)>0){
                res = currString;
            }
        }
        
        return res;
    }
}